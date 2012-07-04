package regex;

import java.util.regex.*;

public class RegexCheckData{
	public static void main(String[] args){
		String text1 = "Matheas Jabs 50092 KA (021)-28946300 AA SA mjbs@yahoo.com";
		
		// mencari kata yang terdiri dari huruf A s/d Z atau a s/d z dan panjang antara 2 sampai 20 karakter
		cekRegex("\\w[A-Za-z]{2,20}\\w",text1);
	}
	
	public static void cekRegex(String regexp,String kata){
		Pattern p = Pattern.compile(regexp);
		Matcher m = p.matcher(kata);
		
		while(m.find()){
			if(m.group().length()!=0){
				System.out.println(m.group().trim());
			}
			System.out.println("indeks awal : "+m.start());
			System.out.println("indeks akhir : "+m.end());
		}
	}
}