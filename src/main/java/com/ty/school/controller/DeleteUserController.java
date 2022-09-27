package com.ty.school.controller;

import java.util.Scanner;

import com.ty.school.dao.UserDao;

public class DeleteUserController {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		UserDao dao=new UserDao();
		System.out.println("enter user id");
		int id=scanner.nextInt();
		dao.deleteUser(id);


	}

}



