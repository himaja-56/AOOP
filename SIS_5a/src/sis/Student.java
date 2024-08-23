package sis;

import java.util.*;

public class Student {
	private String name;
	private String id;
	private List<Course> courses;
	
	public Student(String name,String id) {
		this.name = name;
		this.id = id;
		this.courses = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getid() {
		return id;
	}
	
	public List<Course> getCourses() {
		return courses;
	}
	
	public void enrollCourse(Course course) {
		courses.add(course);
	}

}
