package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern29 {
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	        int rows = sc.nextInt();
	        for (int i = 1; i <= rows; i++) {
	            for (int s = 1; s <= rows - i; s++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            for (int j = i - 1; j >= 1; j--) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	        } 
	        sc.close();
	    }
	}


