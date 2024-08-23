package sis;

public class EnrollmentManager {
	public void enroll(Student student,Course course) {
		student.enrollCourse(course);
		course.enrollStudent(student);
	}

}
