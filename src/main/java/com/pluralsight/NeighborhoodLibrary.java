package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {

        Book[] books = new Book[5];
        books[0] = new Book(1, "63473427843273473", "Learning Java");
        books[1] = new Book(2, "347347298329438", "Think in Java");
        books[2] = new Book(3, "536473838348335", "Cook Java");
        books[3] = new Book(4, "8787979696969696", "I Love Java");
        books[4] = new Book(5, "46373728378473", "Travel in Java");

        Scanner scanner = new Scanner(System.in);

        // Home screen loop: This block of code presents the home screen options to the
        // user in a loop
        // It continuously displays the available options until the user chooses to exit
        // (3)
        // It prompts the user to input their choice and reads it using the Scanner
        // object
        while (true) {
            System.out.println("Welcome to the the Neighborhood Library. Please choose an option to continue");
            System.out.println("1 to Show Available Books");
            System.out.println("2 to Show Checked Out Books");
            System.out.println("3 to Exit");

            int response = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // This switch statement handles the user's choice. It calls different methods
            // based on the user's input:
            // If the user chooses option 1, it calls the showAvailableBooks method
            // If the user chooses option 2, it calls the showCheckedOutBooks method
            // If the user chooses option 3, it prints a message indicating that the program
            // is exiting and terminates the program using System.exit(0).
            // If the user enters any other number, it prints a message indicating an
            // invalid choice
            switch (response) {

                case 1:
                    showAvailableBooks(books, scanner);
                    break;
                case 2:
                    showCheckedOutBooks(books, scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;

            }
        }
    }

    // Method to show available books
    public static void showAvailableBooks(Book[] books, Scanner scanner) {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle());
            }
        }
        System.out.println("Select a book to check out (enter ID) or type 'exit' to go back to home screen:");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("exit")) {
            return;
        }
        int selectedId = Integer.parseInt(input);
        for (Book book : books) {
            if (book.getId() == selectedId) {
                System.out.println("Enter your name:");
                String name = scanner.nextLine();
                
            }
        }
    }

    // Method to show checked out books
    public static void showCheckedOutBooks(Book[] books, Scanner scanner) {
        System.out.println("Checked Out Books:");
        for (Book book : books) {
            if (book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + ", ISBN: " + book.getIsbn() + ", Title: " + book.getTitle()
                        + ", Checked Out To: " + book.getCheckedOutTo());
            }
        }
        System.out.println("C - Check In a book");
        System.out.println("X - Go back to home screen");
        String input = scanner.nextLine();
        switch (input.toUpperCase()) {
            case "C":
                checkInBook(books, scanner);
                break;
            case "X":
                return;
            default:
                System.out.println("Invalid choice.");
        }
    }

    // Method to check in a book
    public static void checkInBook(Book[] books, Scanner scanner) {
        System.out.println("Enter the ID of the book you want to check in:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Book book : books) {
            if (book.getId() == id) {
              // Book
                return;
            }
        }

        System.out.println("Book with ID " + id + " not found.");


    }
}

