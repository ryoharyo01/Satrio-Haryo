package com.sqa.no10;

public class Sekolah {
	public static void main(String[] args) {
		SMA sma = new SMA();
		SMK smk = new SMK();
		System.out.println(sma.getnama());
		System.out.println(sma.getalamat());
		System.out.println(sma.getjenjang());
		
		System.out.println(smk.getnama());
		System.out.println(smk.getalamat());
		System.out.println(smk.getjenjang());
	}
	}


