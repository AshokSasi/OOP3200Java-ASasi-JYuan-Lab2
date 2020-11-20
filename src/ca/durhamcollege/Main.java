/*
Title: OOP3200Java-ASasi-JYuan-Lab2
Name:Ashok Sasitharan 100745484, Jacky Yuan 100520106
Date: November 20 2020
Changes: N/A
 */
package ca.durhamcollege;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        LocalDate myObj;

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter a date: ");
        String date = keyboard.nextLine();

        myObj = LocalDate.parse(date, dateFormat);
        if (myObj.getYear() > 2099)
        {
            System.out.println("Invaliud");
        }
        System.out.println(myObj);
        System.out.println(myObj.getYear());
       // WorkTicket ticket = new WorkTicket();
       // System.out.println(ticket.toString());
    }
}
