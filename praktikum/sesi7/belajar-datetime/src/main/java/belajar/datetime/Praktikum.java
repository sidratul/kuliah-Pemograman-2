package belajar.datetime;

import java.text.DateFormat;
import java.util.Calendar;

public class Praktikum{
	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.MEDIUM);
		System.out.println(df.format(cal.getTime()));
	}
}