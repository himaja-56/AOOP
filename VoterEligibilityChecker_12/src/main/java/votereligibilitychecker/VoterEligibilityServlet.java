package votereligibilitychecker;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/VoterEligibilityServlet")
public class VoterEligibilityServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Setting content type for the response
        response.setContentType("text/html");
        
        // Retrieving form parameters
        String name = request.getParameter("name");
        String ageString = request.getParameter("age");
        PrintWriter out = response.getWriter();

        try {
            // Parsing the age value from the form
            int age = Integer.parseInt(ageString);
            out.println("<html><body>");
            out.println("<h1>Voter Eligibility Result</h1>");
            
            // Checking eligibility based on age
            if (age >= 18) {
                out.println("<p>Hello " + name + ", you are eligible to vote!</p>");
            } else {
                out.println("<p>Hello " + name + ", you are not eligible to vote yet.</p>");
            }
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            // Handle invalid input for age
            out.println("<html><body>");
            out.println("<h1>Error</h1>");
            out.println("<p>Invalid input: Please enter a valid number for age.</p>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Redirecting to the index.html page
        response.sendRedirect("index.html");
    }
}
