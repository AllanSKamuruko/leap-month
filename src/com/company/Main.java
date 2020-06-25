package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int month;
        int year;
        Scanner input = new Scanner(System.in);


            System.out.println(" Enter the year to check if it is a leap year");

            year= input.nextInt();
            if ((year%4==0 || year%400==0) && (year>=1 && year<=9999))
            {
                System.out.println(" year is a leap year");
            }

            else{
                System.out.println(" it is not a leap year");
            }

            System.out.println(" Enter number of the month");

            month = input.nextInt();

            if ((month % 2 == 0) && (month <= 6 && month!=2))
            {
                System.out.println("30 days");
            }
        else if(month==2 && year%4!=0)
        {
            System.out.println("28 days");
            }
            else if(month==2 && year%4==0)
            {
                System.out.println("29 days");
            }

            else if (month % 2 != 0 && month <= 6)
            {
                System.out.println("31 days");
            }
            else if ((month % 2 == 0) && (month <= 12 && month>=8)) {
                System.out.println("31 days");
            }
            else if (month == 7)
            {
                System.out.println("31 days");

            }
            else if ((month % 2 != 0) && (month <= 12 && month >= 8))
            {
                System.out.println("30 days");
            }
else {
                System.out.println(" invalid");
            }



            }
    }
