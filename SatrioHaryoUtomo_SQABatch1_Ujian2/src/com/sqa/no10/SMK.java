package com.sqa.no10;

public class SMK extends Sekolah{
	private String nama;
	private String jenjang;
	private String alamat;

	public SMK() {	
	}
	public String getjenjang() {
		return jenjang;
	}


	public void setjenjang(String jenjang) {
		this.jenjang = jenjang;
	}

	public String getnama() {
		return nama;
	}


	public void setnama(String nama) {
		this.nama = nama;
	}
	
	public String getalamat() {
		return alamat;
	}


	public void setalamat(String alamat) {
		this.alamat = alamat;
	}
}