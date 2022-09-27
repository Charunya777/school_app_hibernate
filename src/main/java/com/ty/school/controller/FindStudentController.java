package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.StudentDao;
import com.ty.school.dto.Student;

public class FindStudentController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		StudentDao dao=new StudentDao();
		System.out.println("enter student id ");
		int id=scanner.nextInt();
		Student student=dao.findStudent(id);
		System.out.println("id="+student.getId());
		System.out.println("name="+student.getName());
		System.out.println("age="+student.getAge());
		System.out.println("phone="+student.getPhone());
	}
}
