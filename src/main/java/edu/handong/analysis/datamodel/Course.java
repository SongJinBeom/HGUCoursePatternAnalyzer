package edu.handong.analysis.datamodel;

public class Course {
	private String courseName;
	
	public Course(String name){
		this.courseName = name;
	}
	
	/**
	 *	This method returns the CourseName of Course object
	 * @return
	 */
	public String getCourseName() {
		return this.courseName;
	}
}