package com.cjc.manegment.model;

public class Faculty {
	
	private int facultyId;
	private String facultyName;
	private String facultyExperience;
	private Course course;
	
	
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultyExperience() {
		return facultyExperience;
	}
	public void setFacultyExperience(String facultyExperience) {
		this.facultyExperience = facultyExperience;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	

}
