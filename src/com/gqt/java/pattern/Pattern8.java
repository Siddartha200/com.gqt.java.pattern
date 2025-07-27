package com.gqt.java.pattern;
import java.util.*;
public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int n=s.nextInt();
		System.out.println("Enter no of Coloums:");
		int m=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print("*");
			
		}
			System.out.println();
		}
		s.close();

	}

}
