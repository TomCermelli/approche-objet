package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// date de 2016
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		SimpleDateFormat formatDate = new SimpleDateFormat("'le 'dd/MM/yyyy");
		Date date = cal.getTime();
		System.out.println(formatDate.format(date));
		
		
		Calendar cal2 = Calendar.getInstance();
		//date du jour FR
		SimpleDateFormat formatDate2 = new SimpleDateFormat("'le 'EEEE dd MMMM yyyy HH:mm:ss", Locale.FRENCH);
		System.out.println(formatDate2.format(cal2.getTime()));
		
		//date du jour RU
		SimpleDateFormat formatDate3 = new SimpleDateFormat("'le 'EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		System.out.println(formatDate3.format(cal2.getTime()));
		
		
		//date du jour CH
		SimpleDateFormat formatDate4 = new SimpleDateFormat("'le 'EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINESE);
		System.out.println(formatDate4.format(cal2.getTime()));
		
		
		//date du jour Al
		SimpleDateFormat formatDate5 = new SimpleDateFormat("'le 'EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		System.out.println(formatDate5.format(cal2.getTime()));
		
		

	}

}
