package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class SaveStudentController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDao dao=new StudentDao();
		Student student=new Student();
		System.out.println("enter student id");
		int id=scanner.nextInt();
		System.out.println("enter student name");
		String name=scanner.next();
		System.out.println("enter age");
		int age=scanner.nextInt();
		System.out.println("enter phone");
		long phone=scanner.nextLong();
		student.setName(name);
		student.setId(id);
		student.setName(name);
		student.setAge(age);
		student.setPhone(phone);
		
		
		dao.saveStudent(student);
		
	}

}



