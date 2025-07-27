package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int rows = s.nextInt();;  // number of lines to print
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2);  // print 1 if j is odd, 0 if even
            }
            System.out.println();  // move to next line
            s.close();
        }

	}

}
