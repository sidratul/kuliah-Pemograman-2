package regex;

import java.util.regex.*;

public class RegexCheckNumber{
	public static void main(String[] args){
		String text1 ="Matheas Jabs 50092 KA (021)-28946300 AA SA mjbs@yahoo.com";
		//mencari angka yang terdiri dari 5 digit misalnya utuk mencari kode post
		regexChecker("\\s\\d{5}\\s",text1);
	}
	
	public static void regexChecker(String regExp,String isi){
		Pattern regexP = Pattern.compile(regExp);
		Matcher regexM = regexP.matcher(isi);
		
		while(regexM.find()){
			if(regexM.group().lenght()!=0){
				System.out.println(regexM.group().trim());
			}
			
			System.out.ptintln("start indekx : "+regexM.start());
			System.out.ptintln("end indekx : "+regexM.end());
		}
	}
}