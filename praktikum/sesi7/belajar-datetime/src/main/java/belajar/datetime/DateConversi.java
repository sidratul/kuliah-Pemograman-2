package belajar.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateConversi{

	private static void stringToDate(){
		try{
			Date dat1;
			dat1 = new SimpleDateFormat("MM/dd/yy").parse("07/06/01");
			System.out.println(dat1);
			
			Date dat2 = new SimpleDateFormat("MM/dd/yyyy").parse("07/06/2001");
			System.out.println(dat2);
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
	
	private void calcDate(long msec){
		SimpleDateFormat simDatFor= new SimpleDateFormat("MMM dd.yyy HH:mm");
		Date hasilDat = new Date(msec);
		System.out.println(simDatFor.format(hasilDat));		
	}
	
	private void writeActualDate(){
		Calendar cal=new GregorianCalendar();
		Date creationDat = cal.getTime();
		SimpleDateFormat simDatFor = new SimpleDateFormat("MMM dd,yyyy hh:mm");
		System.out.println(simDatFor.format(creationDat));
	}
	
	public static void main(String[] args){
		DateConversi dc = new DateConversi();
		dc.stringToDate();
		dc.calcDate(System.currentTimeMillis());
		dc.writeActualDate();
	}
}