package sis;

public class Main {

	public static void main(String[] args) {
		Student student = new Student("ARUN","101");
		Course course = new Course("J101","JAVA");
		
		EnrollmentManager enrollmentManager = new EnrollmentManager();
		SIS sis = new SIS(enrollmentManager);
		
		sis.enrollStudentCourse(student, course);
		System.out.println(student.getName()+" enrolled in "+course.getCourseName());
		// TODO Auto-generated method stub

	}

}
