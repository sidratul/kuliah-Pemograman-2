package belajar.string;

import org.junit.*;
import static org.junit.Assert.*;

public class StringDemoTest{
	@Test
	public void testPanjangString(){
		StringDemo sd = new StringDemo();
		String nama="sidratul";
		assertTrue(sd.jumlahHuruf(nama) == 8);
	}
	
	@Test
	public void testPotongString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sid";
		assertEquals("hammad ",sd.potong(nama,2,9));
		assertEquals("mad sid",sd.potong(nama,5));
	}
	
	@Test
	public void testCariString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sidratul muntaha";
		assertTrue(sd.ketemu(nama, "atul"));
		assertFalse(sd.ketemu(nama, "temu"));
	}*/
	
	@Test
	public void testGantiString(){
		StringDemo sd= new StringDemo();
		String nama= "muhammad sidratul muntaha";
		assertEquals("muhammad sid",sd.ganti(nama,"sidratul muntaha","sid"));
	}
}


