//download junit terlebih dahulu
import org.junit.Assert;
import .org.junit.Test;

public class KalkulatorTest{

	@Test
	public void testTambah(){
		Kalkulator k= new Kalkulator();
		int hasil = k.tambah(10,5);
		int seharusnya = 15;

		Assert.assertEquals(seharusnya, hasil);
	}
}