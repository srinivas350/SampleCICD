package com.srinivas.Fibonacci;

import java.util.Scanner;

public class Fibonacci {
	public int previous=0, current=1, result = 0;

	public void formFibonacci() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = Integer.parseInt(s.nextLine());
		int i = 0;
		while (result <= number) {
			result=previous+current;
			System.out.println(result+",");
			previous=current;
			current=result;
		}
	}

	public static void main(String[] args) {
		Fibonacci ff = new Fibonacci();
		ff.formFibonacci();

	}

}
