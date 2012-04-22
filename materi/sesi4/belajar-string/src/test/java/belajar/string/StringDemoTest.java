package belajar.string;

import org.junit.*;
import static org.junit.Assert.*;

public StringDemoTest{
	@Test
	public void testPanjangString(){
		StringDemo sd = new StringDemo();
		String nama="sidratul";
		assertTrue(sd.jumlahHuruf(nama) == 8);
	}
	
	@Test
	public void testPotongString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sidratul muntaha";
		assertEquals("ammad sid",sd.potong(nama,3,11));
		assertEquals("untaha",sd.potong(nama,20));
	}
	
	@Test
	public void testCariString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sidratul muntaha";
		assertTrue(sd.ketemu(nama, "atul"));
		assertFalse(sd.ketemu(nama, "temu"));
	}
	
	@Test
	public void testGantiString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sidratul muntaha";
		assertTrue(sd.ketemu(nama, "atul"));
		assertFalse(sd.ketemu(nama, "temu"));
	}
}


