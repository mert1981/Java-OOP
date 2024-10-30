package oop;

public class IdariMemur extends Personel {

	private String idariKonu;
	
	public IdariMemur(int id, String ad, String soyad, int maas,String idariKonu) {
		super(id, ad, soyad, maas);
		this.idariKonu = idariKonu;
	}

	
	public String getIdariKonu() {
		return idariKonu;
	}

	public void setIdariKonu(String idariKonu) {
		this.idariKonu = idariKonu;
	}
	
	
}
