package com.gqt.java.pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of rows:");
	int n=s.nextInt();
	int c=1;
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			
			System.out.print(c+"	");
			c++;
		
	}
		System.out.println();
	}
	s.close();

}
}