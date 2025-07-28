package com.gqt.java.pattern;
import java.util.Scanner;
public class My_Name {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter size ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            // M
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // Y
		            for (int j = 0; j < n; j++) {
		                if ((i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2) || (j == n / 2 && i >= n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // N
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || i == j) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // A
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == n / 2 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // M
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || (i == j && j <= n / 2) || (i + j == n - 1 && j >= n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // E
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n / 2 || i == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == n / 2 || i == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // S
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || i == n / 2 || (j == 0 && i <= n / 2) || (j == n - 1 && i >= n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // S
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == n - 1 || i == n / 2 || (j == 0 && i <= n / 2) || (j == n - 1 && i >= n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == n / 2 || i == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // D
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // D
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // A
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == n / 2 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // R
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n / 2 || (j == n - 1 && i <= n / 2) || (i == j && i > n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // H
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == n - 1 || i == n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // A
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == n / 2 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            System.out.println();
		        }

		        sc.close();
		    }
		}

	
