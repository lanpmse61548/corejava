package DateTimeDemi;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainDate {

	public static void main(String[] args) throws ParseException {
		 long millis=0;//System.currentTimeMillis();  
	        java.sql.Date date=new java.sql.Date(millis);  
	    
	        System.out.println(millis); 
	        System.out.println(date);  
	        
	        java.util.Date date2=new java.util.Date();  
	        
	        System.out.println(date2); 

	        String dateString = "23/12/2005 23:11:59";
	        
	        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	         
	        Date utildate = df.parse(dateString);
	        
	        
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(utildate );
	        int month = cal.get(Calendar.MONTH);
	        int year =  cal.get(Calendar.YEAR);
	        System.out.println(month + "  year "+year);  
	        
	        
	        
	        
           String date1String = "23/12/2000 23:11:45";
	        
	        
	         
	        Date date1cp = df.parse(date1String);
	        
	        
	        
	        
	           String date2String = "23/12/2016 6:32:59";
		        
		        
		         
		        Date date2cp = df.parse(date2String);
	      /*  long a=  getDateDiff(date1cp,date2cp,TimeUnit.DAYS);
	        long b =TimeUnit.MILLISECONDS.toDays(a);
	        
	        System.out.println(b); 
	        */
	           
	           
	           
	           long diff = date2cp.getTime() - date1cp.getTime();

	           long diffSeconds = diff / 1000 % 60;
	           long diffMinutes = diff / (60 * 1000) % 60;
	           long diffHours = diff / (60 * 60 * 1000) % 24;
	           long diffDays = diff / (24 * 60 * 60 * 1000);

	           System.out.print(diffDays + " days, ");
	           System.out.print(diffHours + " hours, ");
	           System.out.print(diffMinutes + " minutes, ");
	           System.out.println(diffSeconds + " seconds.");   
	           
	           
	           String belowDate0= "1/1/1980 00:00:00";
		        
		        
		         
		        Date bDate0 = df.parse(belowDate0);
	           
		        System.out.print(bDate0.getTime() + " day 0 "); 
	           
	}

	
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
}
