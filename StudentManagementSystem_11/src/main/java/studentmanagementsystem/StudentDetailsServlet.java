package studentmanagementsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentDetailsServlet")
public class StudentDetailsServlet extends HttpServlet {
    
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/student";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "1234";
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");
            
            // Establish the connection
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                switch (action) {
                    case "insert":
                        if (insertStudent(conn, request)) {
                            response.getWriter().println("Student inserted successfully.");
                        } else {
                            response.getWriter().println("Failed to insert student.");
                        }
                        break;
                    case "update":
                        if (updateStudent(conn, request)) {
                            response.getWriter().println("Student updated successfully.");
                        } else {
                            response.getWriter().println("Failed to update student.");
                        }
                        break;
                    case "delete":
                        if (deleteStudent(conn, request)) {
                            response.getWriter().println("Student deleted successfully.");
                        } else {
                            response.getWriter().println("Failed to delete student.");
                        }
                        break;
                    default:
                        response.getWriter().println("Invalid action.");
                        break;
                }
            }
        } catch (ClassNotFoundException e) {
            response.getWriter().println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            response.getWriter().println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            response.getWriter().println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private boolean insertStudent(Connection conn, HttpServletRequest request) throws SQLException {
        String sql = "INSERT INTO registration (id, name, address, program) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(request.getParameter("id")));
            pstmt.setString(2, request.getParameter("name"));
            pstmt.setString(3, request.getParameter("address"));
            pstmt.setString(4, request.getParameter("program"));
            return pstmt.executeUpdate() > 0;
        }
    }

    private boolean updateStudent(Connection conn, HttpServletRequest request) throws SQLException {
        String sql = "UPDATE registration SET program = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, request.getParameter("program"));
            pstmt.setInt(2, Integer.parseInt(request.getParameter("id")));
            return pstmt.executeUpdate() > 0;
        }
    }

    private boolean deleteStudent(Connection conn, HttpServletRequest request) throws SQLException {
        String sql = "DELETE FROM registration WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, Integer.parseInt(request.getParameter("id")));
            return pstmt.executeUpdate() > 0;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            // Load PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT * FROM registration")) {

                PrintWriter out = response.getWriter();
                out.println("<h2>Student Records</h2>");
                out.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Address</th><th>Program</th></tr>");
                while (rs.next()) {
                    out.println("<tr><td>" + rs.getInt("id") + "</td><td>" + rs.getString("name") +
                                "</td><td>" + rs.getString("address") + "</td><td>" + rs.getString("program") + "</td></tr>");
                }
                out.println("</table>");
            }
        } catch (ClassNotFoundException e) {
            response.getWriter().println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            response.getWriter().println("Error retrieving student records: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
