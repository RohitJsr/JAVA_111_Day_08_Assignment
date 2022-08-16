package com.masaiQ1;

import java.util.Scanner;

public class Main{
	public static String orignalString ;
		public static String reversString(String orignalString){
		//write the logic
			
			String reverse="";
			int strlength=orignalString.length();
			for(int i=strlength-1;i>=0;i--) {
				reverse= reverse+orignalString.charAt(i);
			}
			return reverse;
		}
		
		public static void main(String[] args){			
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");	
		String orignalString = sc.next();						
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);

		
		}
	}

