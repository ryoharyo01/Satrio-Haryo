package com.sqa.no2;

import java.util.Scanner;

public class No2Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Masukkan merk kendaraan : ");
		String merkKendaraan = sc.nextLine();

		System.out.println("Masukkan tipe kendaraan : ");
		String tipe = sc.nextLine();

		System.out.println("Masukkan tahun produksi : ");
		int tahun = sc.nextInt();

		int pajak = hitungPajak(tahun);
		System.out.println(
				"Pajak tahunan untuk " + merkKendaraan + " " + tipe + " tahun " + tahun + " adalah Rp. " + pajak);

	}

	static int hitungPajak(int tahun) {
		if (tahun > 2020) {
			tahun = 4000000;
		} else if (tahun > 2010) {
			tahun = 2000000;
		} else if (tahun > 2000) {
			tahun = 1000000;
		} else if (tahun > 1990) {
			tahun = 750000;
		} else if (tahun > 1980) {
			tahun = 500000;
		} else {
			tahun = 250000;
		}
		return tahun;
	}
}


