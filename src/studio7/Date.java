package studio7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
private int day;
private int month;
private int year;
private boolean isHoliday;

public Date(int d, int m, int y, boolean h) {
	day = d;
	month = m;
	year = y;
	isHoliday = h;
}
@Override
public int hashCode() {
	return Objects.hash(day, isHoliday, month, year);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Date other = (Date) obj;
	return day == other.day && isHoliday == other.isHoliday && month == other.month && year == other.year;
}
public boolean sameDate(Date obj) {
	if(this.equals(obj)) {
		return true;
	}
	return false;
}

public String toString() {
	return month + ", " + day + ", " + year;
}
public static void main(String[] args) {
	Date d1 = new Date(12, 11, 2003, false);
	Date d2 = new Date(12, 20, 2003, false);
	Date d3 = new Date(12, 25, 2022, true);
	Date d4 = new Date(7, 4, 1776, true);
	Date d5 = new Date(1, 1, 2001, false);
	Date d6 = new Date(12, 12, 2012, false);
	LinkedList<Date> list = new LinkedList<Date>();
	list.add(d1);
	list.add(d2);
	list.add(d3);
	list.add(d4);
	list.add(d5);
	list.add(d6);
	list.add(d6);
	list.add(d2);
	list.add(d3);
	
	System.out.println(list);
	
	
	
	HashSet<Date> set = new HashSet<Date>();
	set.add(d1);
	set.add(d1);
	set.add(d1);
	set.add(d1);
	set.add(d1);
	set.add(d1);
	System.out.println(set);
}

}
