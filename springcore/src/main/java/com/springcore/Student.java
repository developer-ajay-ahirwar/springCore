package com.springcore;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	public Student(int id, String studentName, String studentAddress) {
		super();
		this.studentId = id;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int id) {
		System.out.println("setting id");
		this.studentId = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		System.out.println("setting Name");
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("setting Address");
		this.studentAddress = studentAddress;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	
}
