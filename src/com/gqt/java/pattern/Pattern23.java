package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		
		 for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }

	            // Print i value (2*i - 1 times)
	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(j);
	            }

	            System.out.println(); // Next line
	        }
sc.close();
	}

}
