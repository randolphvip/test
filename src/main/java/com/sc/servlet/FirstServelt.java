package com.sc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServelt extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
		int a;
		a=0;
		int b=a/0;
		String ab;
		int cc=100/0;
		System.out.println(cc);
	}
	

	public static void main(String[] args) {
		int a =0;
		a=100;
		int b=0;
		int c =100/0;

	}

}
