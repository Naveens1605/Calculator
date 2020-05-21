package com.company;
import java.util.*;
public class Main{
	static void func(int x) {
		System.out.println("Result after calculation is: " + x);
	}
	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter two numbers");
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Enter the Operation");
			sc.nextLine();
			char operation = sc.nextLine().charAt(0);
			int result = 0;
			switch (operation) {
				case '+':
					result = a + b;
					break;
				case '-':
					result = a > b ? a - b : b - a;
					break;
				case '*':
					result = a * b;
					break;
				case '/':
					result = a / b != 0 ? a / b : 0;
					break;
				case '%':
					result = a % b ;
					break;
				default:
					System.out.println("Invalid Key !");
			}
			func(result);
		}
	}
}
