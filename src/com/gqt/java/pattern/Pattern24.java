package com.gqt.java.pattern;
import java.util.Scanner;
public class Pattern24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            // Print ascending numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print descending numbers from i-1 to 1
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println(); // Next line
        }
        sc.close();

}
}
