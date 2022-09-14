package com.bridgelab;

import java.util.Scanner;

public class BasicCorePrograms {

	public static void main(String[] args) {
		System.out.println("Welcome to basic core program");
		int h = 0;
		int t = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of times to flip a coin:");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			double flip = Math.floor(Math.random() * 10) % 2;
			if (flip < 0.5) {
				h++;
			} else {
				t++;

			}
		}
		double headpersentage = (h * 100) / n;
		System.out.println("The percentage of head flips:" + headpersentage);
		double tailpersentage = (t * 100) / n;
		System.out.println("The percentage of tail flips:" + tailpersentage);

	}

}
