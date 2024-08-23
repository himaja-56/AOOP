package sis;

public class SIS {
	private EnrollmentManager enrollmentManager;
	
	public SIS(EnrollmentManager enrollmentManager) {
		this.enrollmentManager = enrollmentManager;
	}
	
	public void enrollStudentCourse(Student student,Course course) {
		enrollmentManager.enroll(student, course);
	}

}
