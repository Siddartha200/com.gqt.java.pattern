package com.gqt.java.pattern;
import java.util.Scanner;
public class Message {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the size: ");
		        int n = sc.nextInt();

		        for (int i = 0; i < n; i++) {
		            // G
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || (i == n - 1 && j <= n / 2) || j == n / 2 && i >= n / 2 || i == n / 2 && j >= n / 2 || j == n - 1 && i >= n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // Q
		            for (int j = 0; j < n; j++) {
		                if (i == 0 && j <= (3 * n) / 4 || j == (3 * n) / 4 && i <= (3 * n) / 4 || j == 0 && i <= (3 * n) / 4 || i == (3 * n) / 4 && j <= (3 * n) / 4 || i == j && i >= n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // S
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == (n - 1) || (j == (n - 1) && i >= n / 2) || j == 0 && i <= n / 2 || i == n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // H
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || j == (n - 1) || i == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // E
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // B
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == (n / 2) || i == (n - 1) || j == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // E
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // S
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == (n - 1) || (j == (n - 1) && i >= n / 2) || j == 0 && i <= n / 2 || i == n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // N
		            for (int j = 0; j < n; j++) {
		                if (i == j || j == 0 || j == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // S
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || i == (n - 1) || (j == (n - 1) && i >= n / 2) || j == 0 && i <= n / 2 || i == n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // U
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == (n - 1) || j == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // E
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == 0 || i == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // T
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // O
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // J
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2) || i == (n - 1) && j <= n / 2 || j == 0 && i >= n / 2) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // O
		            for (int j = 0; j < n; j++) {
		                if (j == 0 || i == 0 || i == n - 1 || j == n - 1) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // I
		            for (int j = 0; j < n; j++) {
		                if (i == 0 || j == (n / 2) || i == (n - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }
		            System.out.print("    ");

		            // N
		            for (int j = 0; j < n; j++) {
		                if (i == j || j == 0 || j == (n - 1)) {
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

