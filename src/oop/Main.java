package oop;

public class Main {
	
	public static void maasiGoster(Personel personel) {
		System.out.println(personel.getMaas());
	}
	
	public static void yoneticiMi(Personel personel) {
		if(personel instanceof Mudur) {
			System.out.println(personel+" bir yöneticidir.");
		}
		else {
			System.out.println(personel.getAd()+ " bir yönetici değildir.");
		}
	}

	public static void main(String[] args) {
		
		Mudur mudur = new Mudur(0, "Gökhan", "Er", 50000, 2);
		
		Muhendis muh = new Muhendis(2, "Mert", "Koç", 30000, "Yazılım");
		Muhendis muh1 = new Muhendis(3, "Berkay", "Üstün", 27000, "Mekatronik");

		Sekreter sek = new Sekreter(4, "Figen", "Yılmaz", 25000, 5);
		
		IdariMemur im = new IdariMemur(5, "Serhat", "Bayar", 35000, "Lojistik");
		
		/*
		Personel[] personeller = new Personel[5];
		personeller[0] = mudur;
		personeller[1] = muh;
		personeller[2] = muh1;
		personeller[3] = sek ;
		personeller[4] = im;
		*/
		Personel[] personeller = {mudur,muh,muh1,sek,im};
		
		Sube teknikSube = new Sube(personeller);
		teknikSube.personelleriListele();
		System.out.println("----------------------------");
		Muhendis muh2 = new Muhendis(6, "Mehmet", "Varol", 28000, "Yazılımcı" );
		teknikSube.subeyePersonelEkle(muh2);
		teknikSube.personelleriListele();
		
		System.out.println("--------------");
		
		teknikSube.PersonelAra(8);
		
		System.out.println("---------------");
		maasiGoster(mudur);
		 
		yoneticiMi(mudur);
		
	}

}
