package ControlFlow;

import java.util.Scanner;

public class DrawTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("number of lines:");
		int lines = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= lines; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}
}
