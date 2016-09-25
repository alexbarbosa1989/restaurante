package co.restaurante.utils;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RestauranteUtils {
	
	public static Date convertStringToDate(String date) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date parsed = format.parse(date);
        Date sqlDate = new Date(parsed.getTime());
        return sqlDate;
	}
	
	public static String convertDateToString(Date date) throws ParseException {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		String strDate = format.format(date);
		return strDate;
	}

}
