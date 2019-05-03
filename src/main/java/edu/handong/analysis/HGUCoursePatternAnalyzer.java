package edu.handong.analysis;

import edu.handong.analysis.datamodel.Course;
import edu.handong.analysis.datamodel.Student;

public class HGUCoursePatternAnalyzer {
	
	String[] lines = {	"1999-1, JC Nam, Java Programming",
						"1999-2, JC Nam, Programming Language Theory",
						"1999-1, JC Nam, Data Structures",
						"2001-1, JC Nam, Database Systems",
						"2018-1, SB Lim, Java Programming",
						"2018-2, SB Lim, Programming Language Theory",
						"2019-1, SB Lim, Data Structures",
						"2019-1, SB Lim, Algorithm Analysis",
						"2018-1, SJ Kim, Java Programming",
						"2018-2, SJ Kim, Programming Language Theory",
						"2019-1, SJ Kim, Logic Design",
						"2019-1, SJ Kim, Algorithm Analysis",
						};

	int numOfStudents;
	int numOfCourses;
	Student[] students;
	Course[] courses;
	
	/**
	 * This method runs our analysis logic to get the list of student and course names from lines.
	 * @param args
	 */
	public void run(String[] args) {
		
		numOfStudents = Integer.parseInt(args[0]);
		numOfCourses = Integer.parseInt(args[1]);
	
		students = initiateStudentArrayFromLines(lines);

		System.out.println("Number of All Students: " + numOfStudents);
		for(Student student: students) {
			System.out.println(student.getName());
		}
		
		courses = initiateCourseArrayFromLines(lines);
		System.out.println("Number of All Courses: " + numOfCourses);
		for(Course course: courses) {
			System.out.println(course.getCourseName());
		}
		
	}

	/**
	 * This method returns a Student array to initiate the field, students, from lines.
	 * @param lines
	 * @return
	 */
	private Student[] initiateStudentArrayFromLines(String[] lines) {
		Student[] s1 = new Student[numOfStudents];
		for(int k  = 0;k<numOfStudents;k++ )
			s1[k] = new Student("");
		
		String[] temp;
		int i=0;
		for(int j = 0; j<lines.length;j++) {
			temp = lines[j].split(",");
			Student t1 = new Student(temp[1].trim());
			if(!studentExist(s1,t1)) {
				s1[i] = t1;
				i++;
			}
		}
		return s1;
	}
	/**
	 * This method check if there is the same name of the second arugement in the array, students
	 * @param students
	 * @param student
	 * @return boolean
	 */
	private boolean studentExist(Student[] students, Student student) {
		// TODO: implement this method
		for(int i = 0; i<students.length;i++) {
			if(students[i].getName().equals(student.getName()))
				return true;
		}
		return false;
	}
	
	/**
	 * This method returns a Course array to initiate the field, courses, from lines.
	 * @param lines
	 * @return
	 */
	private Course[] initiateCourseArrayFromLines(String[] lines) {
		Course[] c1 = new Course[numOfCourses];
		for(int k = 0; k<numOfCourses;k++)
			c1[k]=new Course("");
		
		String[] temp;
		int i = 0;
		for(int j = 0; j<lines.length;j++) {
			temp = lines[j].split(",");
			Course	c2 = new Course(temp[2].trim());
			if(!courseExist(c1, c2)) {
				c1[i] = c2;
				i++;
			}
		}
		return c1;
	}

	/**
	 * This method check if there is the same name of the second argument in the array, courses.
	 * @param courses
	 * @param course
	 * @return boolean
	 */
	private boolean courseExist(Course[] courses, Course course) {
		
		// TODO: implement this method

		for(int i = 0; i<courses.length;i++) {
			if(courses[i].getCourseName().equals(course.getCourseName()))
				return true;
		}
		return false;
	}

}
