package oop;

public class Sube {
	
	Personel personeller[];
	
	public Sube(Personel[] personeller) {
		
		this.personeller = personeller;
	}

	public void subeyePersonelEkle(Personel personel) {
		Personel[] personelTemp = new Personel[personeller.length +1];
		
		for(int i=0;i<personeller.length;i++) {
			personelTemp[i] = personeller[i];
		}
		
		personelTemp[personeller.length] = personel;
		personeller = personelTemp;
	}
	
	public void personelleriListele() {
		for(int i=0;i<personeller.length;i++) {
			System.out.println(personeller[i]);
		}
	}
	
	public void PersonelAra(int id){
		for(Personel p : personeller) {
			if(p.getId()==id) {
				System.out.println("Aradığınız "+p);
				return;
			}
		}
		System.err.println("Id bulunamadı...");
	}
	

}
