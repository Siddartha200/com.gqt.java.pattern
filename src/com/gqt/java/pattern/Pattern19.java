package com.gqt.java.pattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int count=1;
			for(int j=1;j<=i;j++) {
				
				System.out.print(count);
			count++;
			
		}
			System.out.println();
		}
		s.close();

	}

}
