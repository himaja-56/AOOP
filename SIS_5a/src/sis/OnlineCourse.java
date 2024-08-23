package sis;

public class OnlineCourse extends Course{
	private String platform;

	public OnlineCourse(String courseId, String courseName) {
		super(courseId, courseName);
		this.platform = platform;
		// TODO Auto-generated constructor stub
	}
	
	public String getPlatform() {
		return platform;
	}

}
