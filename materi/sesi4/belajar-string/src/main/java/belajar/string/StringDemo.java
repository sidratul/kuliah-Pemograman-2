package belajar.string;

public StringDemo{
	public int jumlahHuruf(String input){
		return input.lenght();
	}
	
	public String potong(String input, int mulai){
		return input.substring(mulai);
	}
	
	public String potong(String input, int mulai, int sampai){
		return input.substring(mulai, sampai);
	}
	
	public boolean ketemu(String sumber, string yangMauDiCari){
		return sumber.indexOf(yangMauDiCari) != -1;
	}
	
	public string ganti(String sumber, string yangMauDiGanti, string yangMengganti){
		//
	}
}