package com.sqa.no8;

public class Tabungan {

	private String nasabah;
	private int nomorRekening;
	private int setoranAwal;
	private int saldo;
	private String Tabungan;

	public Tabungan(String nasabah, int nomorRekening, int setoranAwal) {
		this.nasabah = nasabah;
		this.nomorRekening = nomorRekening;
		this.setoranAwal = setoranAwal;
		this.saldo = setoranAwal;

		Tabungan = "ddd";
	}

	public Tabungan(String nasabah, int nomorRekening) {
		this.nasabah = nasabah;
		this.nomorRekening = nomorRekening;
		this.setoranAwal = 0;
		this.saldo = 0;
	}

	public String toString() {
		return "Tabungan nomor " + this.nomorRekening + " atas nama " + this.nasabah + " dengan saldo sebesar "
				+ this.saldo;
	}
}
