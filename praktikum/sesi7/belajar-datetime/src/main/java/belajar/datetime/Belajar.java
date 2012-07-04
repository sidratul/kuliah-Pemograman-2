package belajar.datetime;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Belajar{
	public static void main(String[] args){
		DateFormat datFor = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date dat= new Date();
		System.out.println(datFor.format(dat));
		
		Calendar cal = Calendar.getInstance();
		System.out.println(datFor.format(cal.getTime()));
	}
}
