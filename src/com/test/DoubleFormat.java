package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DoubleFormat {
	
	
	public static void main(String[] args) {
		
		
		double integer=1012456.0192598854;
		double doubleValue=1000/486.84;
		 BigDecimal.valueOf(doubleValue).setScale(2, RoundingMode.FLOOR);
//		float floatValue=1;
//		Locale locale = new Locale("en", "US");
//		NumberFormat n = NumberFormat.getCurrencyInstance(); 
//		String currencySymbol=n.getCurrency().getSymbol();
//		String moneyString = n.format(doubleValue);
//		moneyString.replace(currencySymbol, "€");
//		
//		System.out.println("Money String:"+""+moneyString);
//		
//		DecimalFormat d = new DecimalFormat("0.00");
//		 d.setGroupingUsed(true);
//	        d.setGroupingSize(3);

	
		System.out.println("Roundup Value :"+" "+BigDecimal.valueOf(doubleValue).setScale(2, RoundingMode.FLOOR ).doubleValue());
		
		
		/*
		 * NumberFormat nf = NumberFormat.getCurrencyInstance(); String pattern =
		 * ((DecimalFormat) nf).toPattern(); String newPattern =
		 * pattern.replace("\u00A4", "").trim(); NumberFormat newFormat = new
		 * DecimalFormat(newPattern); System.out.println(newFormat.format(12345.1));
		 */
		
		
//		 NumberFormat formatter = NumberFormat.getCurrencyInstance();
//		    String currencySymbol = formatter.getCurrency().getSymbol();
//		    String moneyString = formatter.format(doubleValue);
////		     moneyString.replace(currencySymbol, "");
//		     System.out.println("MoneyChanged: "+""+moneyString);
//		     String value= Double.toString(doubleValue);
//		     
//		     Pattern p = Pattern.compile("[\\.\\*\\+\\?\\^\\${}\\(\\)|\\]\\[\\\\]");
//				Matcher m = p.matcher(value);
//				String  value1=m.replaceFirst("\\\\$");
//				System.out.println("Replaced"+" "+value1);
		
	}

}
