package com.srinivas.sorting;

public class Student {
	
	public int studentID;
	public String studentFName,studentLName;
	public String study;
	
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentFName() {
		return studentFName;
	}
	public void setStudentFName(String studentFName) {
		this.studentFName = studentFName;
	}
	public String getStudentLName() {
		return studentLName;
	}
	public void setStudentLName(String studentLName) {
		this.studentLName = studentLName;
	}
	public Student(int studentID, String studentFName, String studentLName, String study) {
		super();
		this.studentID = studentID;
		this.studentFName = studentFName;
		this.studentLName = studentLName;
		this.study = study;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentFName=" + studentFName + ", studentLName=" + studentLName
				+ ", study=" + study + "]";
	}
	

}
