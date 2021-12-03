package com.sqa.no1;

import java.util.Scanner;

public class No1Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Masukkan nilai maksimal deret = ");
		int batas = sc.nextInt();
		cetakFibonacci(batas);
	}

	static void cetakFibonacci(int batas) {
		// silakan isi bagian ini
		int first = 0;
		int second = 1;
		int result = 0;

		for (int i = 0; i < batas; i++) {
			if (result > batas) {
				break;
			}
			result = first + second;
			if (result > batas) {

			} else {
				System.out.print(result + " ");
			}
			second = first;
			first = result;
		}
	}
}
