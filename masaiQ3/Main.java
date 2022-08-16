package com.masaiQ3;

public class Main {

	public static boolean isPrime(int a) {
		if(a<2) {
			return false;
		}
		else {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
	
		int count=0;
		for(int i=0;i<inputArray.length;i++) {
			if(!isPrime(inputArray[i])) {
				inputArray[i]=0;
			}
			else
				count++;
		}
		int [] outputArray=new int [count];
		int upper =-1;
		for(int a:inputArray) {
			if(a!=0)
				outputArray[++upper]=a;
		}
		return outputArray;
	}
		
		public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		Main object= new Main();
		int [] ans =object.findAndReturnPrimeNumbers(arr);
		if(ans.length==0) {
			System.out.println("Prime number not found in the supplied Array");
		}
		else {
			for(int primeNo:ans) {
				System.out.println(primeNo+"   Is Your Prime Number");
			}
		}
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
		
		}
}
