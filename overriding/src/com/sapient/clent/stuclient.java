package com.sapient.clent;

import com.sapient.beans.student;

public class stuclient {

	public static void main(String[] args) {
		student stu = new student(1001, "ram",89);
		student stu2 = new student(1001, "ram",89);
		System.out.println(stu);
		//System.out.println(stu.toString());
		System.out.println(stu2);
		System.out.println(stu.equals(stu2));;
	//	System.out.println("line 2");
		//System.out.println("line 3");
	}
}
