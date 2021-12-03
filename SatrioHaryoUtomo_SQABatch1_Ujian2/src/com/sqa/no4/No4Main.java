package com.sqa.no4;

import java.util.Scanner;

public class No4Main {
	public static void main(String[] args) {
		// Silakan isi bagian ini
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan sisa BBM dalam tangki (liter) = ");
		int sisa = sc.nextInt();

		System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		int jarakPerLiter = sc.nextInt();

		int sisaJarakKilometer = (int) hitungSisaJarak(sisa, jarakPerLiter);

		System.out.println("Kendaraan anda dapat menempuh jarak " + sisaJarakKilometer
				+ " kilometer dengan sisa BBM yang ada di tangki");
	}

	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		return sisaJarak;
	}
}
