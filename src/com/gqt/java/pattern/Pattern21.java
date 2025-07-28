package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int rows = s.nextInt();;  
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);  
            }
            System.out.println();            
            s.close();
        }

	}

}
