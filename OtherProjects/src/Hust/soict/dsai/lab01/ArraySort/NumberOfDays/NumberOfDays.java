package Hust.soict.dsai.lab01.ArraySort.NumberOfDays;

import java.util.Scanner;
public class NumberOfDays {
	public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int Month = 0;
        System.out.println("Please enter the month: ");
    	String StrMonth = keyboard.next();
    	Month = Month(StrMonth);
        while (Month == 0){
            System.out.println("It seem like you have made a typo. Please try again!");
        	StrMonth = keyboard.next();
        	Month = Month(StrMonth);
        }
        System.out.println("Alright! Please enter the year: ");
        int year = keyboard.nextInt();
        while (year <= 0) {
            System.out.println("It seem like you have made a typo. Please try again!");
            year = keyboard.nextInt();
        }
        
        int result = 0;
        switch(Month) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	result = 31;
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	result = 30;
        	break;
        case 2:
        	result = 28;
            if (isLeapYear(year)) {
            	result = 29;
            }
            break;
        }

        System.out.println("There are " + result + " days in " + StrMonth + ", " + year);
        
    }
        
    private static boolean isLeapYear(int year) {
    	return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
    private static int Month(String StrMonth) {
        switch (StrMonth) {
        case "1":
        case "Jan":
        case "Jan.":
        case "January":
            return 1;
        case "2":
        case "Feb":
        case "Feb.":
        case "February":
            return 2;
        case "3":
        case "Mar":
        case "Mar.":
        case "March":
            return 3;
        case "4":
        case "Apr":
        case "Apr.":
        case "April":
            return 4;
        case "5":
        case "May":
            return 5;
        case "6":
        case "Jun":
        case "June":
            return 6;
        case "7":
        case "Jul":
        case "July":
            return 7;
        case "8":
        case "Aug":
        case "Aug.":
        case "August":
            return 8;
        case "9":
        case "Sep":
        case "Sept.":
        case "September":
            return 9;
        case "10":
        case "Oct":
        case "Oct.":
        case "October":
            return 10;
        case "11":
        case "Nov":
        case "Nov.":
        case "November":
            return 11;
        case "12":
        case "Dec":
        case "Dec.":
        case "December":
            return 12;
        default:
            return 0;
        }
    }
}


