package com.dayaexpress.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
	
	public static java.sql.Timestamp currentTimestamp()
	{
		java.util.Date d = new java.util.Date(System.currentTimeMillis()); 
		java.sql.Timestamp ts = new java.sql.Timestamp(d.getTime());    	
    	return ts;		
	}
	
	public static java.sql.Date today()
	{
		java.sql.Date d = new java.sql.Date(System.currentTimeMillis());
		return d;
	}
	
	public static String formatDate(java.sql.Date d, String format)
	{
		java.text.DateFormat df = new java.text.SimpleDateFormat(format);
		String s = df.format(d);
		return s;
	}
	
	public static String formatDate(java.sql.Date d)
	{
		java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy");
		String s = df.format(d);
		return s;
	}
	
	public static String formatDateTime(java.sql.Timestamp t)
	{
		java.text.DateFormat df = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm");
		String s = df.format(t);
		return s;
	}
	
	public static java.sql.Date parse(String date, String format)
	{
		java.text.DateFormat df = new java.text.SimpleDateFormat(format);
		java.util.Date utilDate;
		java.sql.Date sqlDate = null;
		try {
			utilDate = df.parse(date);
			sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return sqlDate;
	}
	
    public static Date addDays(Date date, int days)
    {
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        java.sql.Date d = new java.sql.Date(cal.getTimeInMillis());
        return d;
    }
    
    public static String dayOfWeek(Date d)
    {
        DateFormat df = new SimpleDateFormat("EEEE"); 
        String day = df.format(d);        
        return day;
    }    
	
    public static Date addBusinessDays(Date d, Integer daysToAdd)
    {
        Integer holidays = 0;
        for (Integer i = 1; i <= daysToAdd; i++)
        {   
            d = DateUtil.addDays(d, 1);
            String day = DateUtil.dayOfWeek(d);
            if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday"))
                holidays++;
        }
        d = DateUtil.addDays(d, holidays);
        String day = DateUtil.dayOfWeek(d);
        if (day.equalsIgnoreCase("Saturday"))
            d = DateUtil.addDays(d, 2);
        else if (day.equalsIgnoreCase("Sunday"))
        	d = DateUtil.addDays(d, 1);
        return d;
    }
    
    public static java.sql.Date timestampToDate(java.sql.Timestamp t)
    {
    	java.sql.Date d = new java.sql.Date(t.getTime());
    	return d;
    }
    
    public static int calculateDays(Date startDate, Date endDate)
    {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(startDate);
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(endDate);
        return daysBetween(cal1, cal2);
    }    
    
    public static int daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        int daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }    
}
