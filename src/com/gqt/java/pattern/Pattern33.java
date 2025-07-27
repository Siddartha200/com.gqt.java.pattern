package com.gqt.java.pattern;
import java.util.*;
public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            char start = (char) ('A' + 2 * (i - 1));

            for (char ch = start; ch >= 'A'; ch--) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();

	}

}
