package com.sqa.no3;
import java.util.Scanner;
public class No3Main  {
public static void main(String[]args) {
	// Silakan isi bagian ini
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Masukkan jarak (kilometer) = ");
		double kilometer = sc.nextDouble();
		
		System.out.println("Masukkan waktu (jam) = ");
		double waktu = sc.nextDouble();
		
		double hasilKecepatan = (double) hitungKecepatan(kilometer, waktu);
		System.out.println("Kecepatan rata-rata anda adalah " + hasilKecepatan + " km/jam");
	}
	
	static double hitungKecepatan(double jarak, double waktu) {
		//Silakan isi bagian ini dan ganti “anu” dengan kode yang tepat
		
		double kecepatan = jarak / waktu;
		return kecepatan;

	}

}