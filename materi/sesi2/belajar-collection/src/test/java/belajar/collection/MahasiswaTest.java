package belajar.collection;

import org.junit.*;
import.java.util.Set;

public class MahasiswaTest{
	@Test
	public void testList(){
		Mahasiswa m=new Mahasiswa();
		//sebelum diisi, listnya kosong

		Assert.assertTrue(m.daftarEmail.isEmpty());
		Assert.assertEquals(new Integer(0),
							new Integer(m.daftarEmail.size()));
		//isi satu data
		m.daftarEmail.add("sidratul.mochi@gmail.com");

		//setelah diisi
		Assert.assertEquals(new Integer(1),
							new Integer(m.daftarEmail.size()));

		//isi data ke dua
		m.daftarEmail.add("tear_ofregret@yahoo.co.id");

		//setelah diisi, isi list jumlahnya dua
		Assert.assertEquals(new Integer(2),
							new Integer(m.daftarEmail.size()));

		//isi data ke 3boleh sama(duplikat)
		m.daftarEmail.add("sidratul.mochi@gmail.com");

		//setelah diisi, isi list jumlahnya dua
		Assert.assertEquals(new Integer(3),
							new Integer(m.daftarEmail.size()));

		/*
		System.out.println("____________________________");
		for(String email:daftarEmail){
			System.out.println("Email : "+email);
		}
		System.out.println("____________________________");
		*/
	}
		//size(), data ada di indeks mana
		//Assert..: mencek 2 data apakah sama

	@Test
	public void testSet(){
		Mahasiswa m=new Mahasiswa();

		Assert.assertTrue(m.akun.isEmpty());
		Assert.assertEquals(new Integer(0),
							new Integer(m.akun.size()));

		m.akun.put("facebook","muhammad sidratul muntaha");
		Assert.assertEquals(new Integer(1),
							new Integer(m.akun.size()));

		m.akun.put("twitter","@sid__7");
		Assert.assertEquals(new Integer(2),
							new Integer(m.akun.size()));

		//key dalam map harus unique
		//kalau di put dgn key yang sama , value yang lama akan ditimpa
		m.akun.put("facebook","muhammad 7thsky ryu");
		Assert.assertEquals(new Integer(2),
							new Integer(m.akun.size()));

		Assert.assertEquals("muhammad 7thsky ryu",
							m.akun.get("facebook"));


	}

}