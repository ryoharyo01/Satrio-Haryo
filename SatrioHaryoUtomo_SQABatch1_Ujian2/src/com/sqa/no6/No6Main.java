package com.sqa.no6;
import java.util.Scanner;

class BebasException extends Pajak {
	public BebasException(String s) {
		super(s);
	}
}

public class No6Main {
	public static void main(String[] args) throws BebasException {
		Scanner scan = new Scanner(System.in);
		System.out.print("masukan jenis kelamin (pria/wanita) : ");
		String gender = scan.nextLine();
		System.out.print("masukan status pernikanan (lajang/menikah) : ");
		String status = scan.nextLine();

		if (gender.equalsIgnoreCase("pria")) {
			if (status.equalsIgnoreCase("menikah")) {
				System.out.println("pria sudah menikah, pajak 5%");
			} else if (status.equalsIgnoreCase("lajang")) {
				System.out.println("pria belum menikah, pajak 10%");
			} else {
				try {
					throw new BebasException("data " + status + " tidak ditemukan");
				} catch (BebasException bebas) {

					System.out.println(bebas.getMessage());
				}
			}
		} else if (gender.equalsIgnoreCase("wanita")) {
			if (status.equalsIgnoreCase("menikah")) {
				System.out.println("wanita sudah menikah, pajak 3%");
			} else if (status.equalsIgnoreCase("lajang")) {
				System.out.println("wanita belum menikah, pajak 7%");
			} else {
				try {
					throw new BebasException("data " + status + " tidak ditemukan");
				} catch (BebasException bebas) {
					// TODO: handle exception

					System.out.println(bebas.getMessage());
				}
			}
		} else {
			throw new BebasException("data " + gender + " tidak ditemukan");

		}

	}

}
