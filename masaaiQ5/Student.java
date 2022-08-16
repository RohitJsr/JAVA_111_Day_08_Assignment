package com.masaaiQ5;

import java.util.Scanner;

public class Student {

	private Integer roll;
	private String name;
	private String address;
	private Integer marks;
	public Student(Integer roll, String name, String address, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Name: "+this.name+
				"   Roll No: "+this.roll+
				"   Marks: "+this.marks
								;
	}
  public void display() {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Student foll name");
	  this.name=sc.nextLine();
	  
	  System.out.println("Enter student rol num");
	   this.roll=sc.nextInt();
	  
	   System.out.println("Enter Student Marks ");
	   this.marks=sc.nextInt();
	   
	   System.out.println("Enter student address");
	   this.address=sc.nextLine();		 
  }
}


class Demo{
	public Demo() {
		
	}
		public static void main(String[] args) {

		Student s1=new Student();
		Student s2=new Student();
		s1.display();
		s2.display();
		System.out.println(s1);
		System.out.println(s2);
	}
}
