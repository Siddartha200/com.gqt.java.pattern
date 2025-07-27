package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of rows: ");
	        int rows = sc.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            char ch = (char) ('A' + i - 1);

	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }

	            for (int j = 1; j <= 2 * i - 1; j++) {
	                System.out.print(ch);
	            }

	            System.out.println();
	        }

	        sc.close();
	}

}
