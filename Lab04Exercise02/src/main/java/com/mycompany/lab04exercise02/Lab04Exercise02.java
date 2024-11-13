package com.mycompany.lab04exercise02;
import java.util.Scanner;
import java.time.LocalDateTime;
public class Lab04Exercise02 {
 private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private int second;
    public Lab04Exercise02()
    {   LocalDateTime now = LocalDateTime.now();
        this.year=now.getYear();
            this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
        this.hour = now.getHour();
        this.minute = now.getMinute();
        this.second = now.getSecond();
    }
      public Lab04Exercise02(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = 0;   // Defaulting to midnight
        this.minute = 0;
        this.second = 0;
    }
       public Lab04Exercise02(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
        public void setDateTime(int year, int month, int day, int hour, int minute, int second) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void displayDateTime() {
        System.out.println("Current Date and Time: " + 
            String.format("%04d-%02d-%02d %02d:%02d:%02d", year, month, day, hour, minute, second));
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      Lab04Exercise02 obj1=new Lab04Exercise02();
      
        // Using the default constructor to display current system date and time
       
        System.out.println("Default Constructor (System Time):");
        obj1.displayDateTime();
        
         System.out.println("\nEnter a custom date (YEAR, MONTH, DAY):");
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        Lab04Exercise02 obj2 = new Lab04Exercise02(year, month, day);
        System.out.println("Custom Date (YEAR, MONTH, DAY):");
        obj2.displayDateTime();
        
        // Prompting the user to enter full date and time details
        System.out.println("\nEnter a custom date and time (YEAR, MONTH, DAY, HOUR, MINUTE, SECOND):");
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute = sc.nextInt();
        System.out.print("Enter second: ");
        int second = sc.nextInt();

        // Using overloaded constructor for full date and time details
        Lab04Exercise02 obj3 = new Lab04Exercise02(year, month, day, hour, minute, second);
        System.out.println("Custom Date and Time:");
       obj3.displayDateTime();}}

