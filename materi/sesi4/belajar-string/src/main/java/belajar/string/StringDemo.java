package belajar.string;

public class StringDemo{
	public int jumlahHuruf(String input){
		return input.length();
	}
	
	public String potong(String input, int mulai){
		return input.substring(mulai);
	}
	
	public String potong(String input, int mulai, int sampai){
		return input.substring(mulai,sampai);
	}
	
	public boolean ketemu(String sumber, String yangMauDiCari){
		return sumber.indexOf(yangMauDiCari) != -1;
	}
	
	public String ganti(String sumber, String yangMauDiGanti, String yangMengganti){
		return sumber.replaceAll(yangMauDiGanti, yangMengganti);
	}
}