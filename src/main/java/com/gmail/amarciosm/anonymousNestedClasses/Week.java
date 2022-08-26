package com.gmail.amarciosm.anonymousNestedClasses;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * Example static nested class
 */
public class Week {

	private Integer year;
	private Integer weeknr;
	
	public Week(Integer year, Integer weeknr) {
		super();
		this.year = year;
		this.weeknr = weeknr;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getWeeknr() {
		return weeknr;
	}
	public void setWeeknr(Integer weeknr) {
		this.weeknr = weeknr;
	}
	
	public WeekIterator getIterator() {
		return new WeekIterator(this);
	}
	
	public static class WeekIterator implements Iterator {
		int next = 1;
		Calendar calendar = null;
		
		public WeekIterator(Week aWeek) {
			calendar = new GregorianCalendar();
			calendar.clear();
			calendar.set(Calendar.YEAR, aWeek.getYear());
			calendar.set(Calendar.WEEK_OF_YEAR, aWeek.getWeeknr());
		}

		public boolean hasNext() {
			return next <= 7;
		}

		public Object next() {
			calendar.set(Calendar.DAY_OF_WEEK, next++);
			return calendar.getTime();
		}
		
		public static void main(String[] args) {
			int year = Integer.parseInt(args[0]);
			int weekNr = Integer.parseInt(args[1]);
			Week week = new Week(year, weekNr);
			
			for(Iterator i = week.getIterator() ; i.hasNext() ;) {
				System.out.println((Date)i.next());
			}
		}
	}
	
}
