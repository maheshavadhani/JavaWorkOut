package NewTest;

import java.util.Scanner;

public class DaysInMonth {
    static boolean Leapyear;
    static String result;
    static int year;
    static Scanner S = new Scanner(System.in);

    public static boolean isLeapYear() {
        System.out.println("Enter the year");
        year = S.nextInt();

        if (year >= 1 && year <= 9999) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                System.out.println("Leap year");
                Leapyear = true;
                result="Leap Year";

            } else {
                System.out.println("Not a Leap year");
                Leapyear = false;
            }
        } else {
            System.out.println("not an year");
            Leapyear = false;

        }
        return Leapyear ;
    }

    public static void main(String args[]){
        isLeapYear();
        getDaysInMonth();
    }

    public static void getDaysInMonth(){
        System.out.println("Enter the month");
        int month = S.nextInt();
        switch(month){
            case 1:
                System.out.println("There are 31 days in Jan");
                break;
            case 2:
                if(result=="Leap Year"){
                    System.out.println("There are 29 days in Feb");
                    break;
                }
                System.out.println("There are 28 days in Feb");
                break;
            case 3:
                System.out.println("There are 31 days in Mar");
                break;
            case 4:
                System.out.println("There are 30 days in April");
                break;
            case 5:
                System.out.println("There are 31 days in May");
                break;
            case 6:
                System.out.println("There are 30 days in June");
                break;
            case 7:
                System.out.println("There are 31 days in July");
                break;
            case 8:
                System.out.println("There are 31 days in Aug");
                break;
            case 9:
                System.out.println("There are 30 days in Sep");
                break;
            case 10:
                System.out.println("There are 31 days in Oct");
                break;
            case 11:
                System.out.println("There are 30 days in Nov");
                break;
            case 12:
                System.out.println("There are 31 days in Dec");
                break;
            default:
                System.out.println("There are No such month in calender");
        }

    }
}
