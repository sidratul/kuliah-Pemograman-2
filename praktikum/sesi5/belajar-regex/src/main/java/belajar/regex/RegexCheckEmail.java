package regex;

import java.util.regex.*;

public class RegexCheckEmail{
	public static void main(String[] args){
		String text1 ="Matheas Jabs 50092 KA (021)-28946300 AA SA mjbs@yahoo.com";
		
		//mencari format email
		regexChecker("[A-Za-z0-9._%+-]+@[A-Za-z0-9._%+-]+\\.[A-Za-z]{2,4}",text1);
	}
	
	public static void regexChecker(String regExp,String isi){
		Pattern regexP = Pattern.compile(regExp);
		Matcher regexM = regexP.matcher(isi);
		
		while(regexM.find()){
			if(regexM.group().length() != 0){
				System.out.println(regexM.group().trim());
			}
			
			System.out.println("start index :"+regexM.start());
			System.out.println("End index :"+regexM.end());
		}
	}
}