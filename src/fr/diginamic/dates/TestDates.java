package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		//jour/mois/année
		Date dateMaintenant = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("'le 'dd/MM/yyyy");
		System.out.println(formatDate.format(dateMaintenant));
		
		//année/mois/jour heure:minute:seconde
		Date dateMai = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatDate2 = new SimpleDateFormat("'le 'yyyy/MM/dd HH:mm:ss");
		System.out.println(formatDate2.format(dateMai));
	}

}
