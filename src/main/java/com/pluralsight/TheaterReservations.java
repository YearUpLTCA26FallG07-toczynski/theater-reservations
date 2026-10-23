
package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for the customer's full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        // Split the name into first and last name
        String[] names = fullName.split("\\s+");
        String firstName = names[0];
        String lastName = names[names.length - 1];

        // Ask for the show date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String dateInput = scanner.nextLine();

        // Convert the date to yyyy-MM-dd format
        LocalDate showDate = LocalDate.parse(
                dateInput,
                DateTimeFormatter.ofPattern("MM/dd/yyyy")
        );

        // Ask how many tickets the customer wants
        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        // Choose the correct singular or plural word
        String ticketWord = (tickets == 1) ? "ticket" : "tickets";

        // Display the reservation confirmation
        System.out.println(
                tickets + " " + ticketWord
                        + " reserved for " + showDate
                        + " under " + lastName + ", " + firstName
        );

        scanner.close();
    }
}
