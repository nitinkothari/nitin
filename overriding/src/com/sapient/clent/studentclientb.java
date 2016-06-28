package com.sapient.clent;

import com.sapient.beans.student;

public class studentclientb {

	public static void main(String[] args) {
		student stu = new student(1001, "ram",89);
		student stu2 = new student(1001, "ram",89);
		stu = null;
		stu2 = null;
		System.gc();
		System.out.println("line3");
		System.out.println("line4");
	}
}
