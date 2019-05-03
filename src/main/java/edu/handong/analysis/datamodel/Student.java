package edu.handong.analysis.datamodel;

public class Student {
	private String studentName;
	
	public Student(String name){
		this.studentName = name;
	}
	/**
	 * this method the Name of Student object
	 * @return
	 */
	public String getName() {
		return this.studentName;
	}
}