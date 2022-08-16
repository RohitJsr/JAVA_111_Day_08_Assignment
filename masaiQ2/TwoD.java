package com.masaiQ2;

import java.util.Scanner;

public class TwoD {
    

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of row");
		
		int N=sc.nextInt();
		
		System.out.println("Enter no of columns");
		
		int M= sc.nextInt();
		
		int[][] arr= new int[N][M];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Even Sum in Columns 2d array");
		
		
			int sum=0;
			for(int i=0;i<M;i++) {
				sum=0;
				for(int j=0;j<N;j++) {
					if(arr[j][i]%2==0) {
						sum= sum+arr[j][i];
					}
				}
				System.out.println(sum);
			}

			}

}
