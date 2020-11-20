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
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        //Constants
        final int NUMBER_OF_OBJECTS = 3;
        final int MIN_YEARS = 2000;
        final int MAX_YEARS = 2099;
        final int MIN_TICKET_NUMBER = 1;

        //Variable Declarations
        int ticketNumber;
        String clientID;
        LocalDate workTicketDate;
        String issueDescription;
        boolean isValid =false;
        WorkTicket[] workticketObj = new WorkTicket [NUMBER_OF_OBJECTS];
        String date;

        //Input Section
        for (int i =0; i < NUMBER_OF_OBJECTS; i++)
        {
            System.out.println("\nWork Ticket #" + (i+1));
            while (isValid==false)
            {
                try
                {
                    System.out.print("\nEnter the work ticket number: ");
                    ticketNumber= keyboard.nextInt();
                    if (ticketNumber <=0)
                    {
                        throw new IllegalArgumentException("Ticket Number must be a whole positive number greater than 0");
                    }

                    System.out.print("Enter the Client ID: ");
                    clientID = keyboard.next();

                    System.out.print("Enter the date (dd/mm/yyy): ");
                    date= keyboard.next();
                    workTicketDate = LocalDate.parse(date, dateFormat);
                    if (workTicketDate.getYear() < 2000 || workTicketDate.getYear() > 2099)
                    {
                        throw new IllegalArgumentException(  "Year: " + workTicketDate.getYear()+ " is out of bounds. Year must be between 2000 and 2099");
                    }

                    System.out.print("Enter the description of the issue: ");
                    issueDescription = keyboard.next();
                    isValid=true;


                }
                catch(Exception e)
                {
                    System.out.println("Error: " + e);
                    keyboard.nextLine();
                    isValid=false;
                }

            }
            isValid=false;
        }



       /* System.out.println("Enter a date: ");
        String date = keyboard.nextLine();

        myObj = LocalDate.parse(date, dateFormat);
        if (myObj.getYear() > 2099)
        {
            System.out.println("Invaliud");
        }
        System.out.println(myObj);
        System.out.println(myObj.getYear());*/
       /*
        WorkTicket ticket = new WorkTicket();
        System.out.println(ticket.toString());
       */
    }
}
