package com.pluralsight;

// attributes of the Book class
public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;  // name of the person the book is checked out to

    // constructor: indicating that the book is initially available and not checked out to anyone

    public Book(int id, String isbn, String title) {

        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public boolean isCheckedOut() {

        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {

        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {

        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {

        this.checkedOutTo = checkedOutTo;

       /*
        // Method to check out a book:This method allows a user to check out a book
        // If the book is not already checked out (isCheckedOut is false), it sets isCheckedOut to true,
        // assigns the name of the person checking out the book to checkedOutTo,
        // and prints a message confirming the checkout
        // If the book is already checked out, it prints a message indicating that the book is not available
        public void checkOut(String name) {

          if (!isCheckedOut) {
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println(title + " has been checked out to " + name);
        } else {
            System.out.println(title + " is already checked out.");
        }

    }

    // Method to check in a book: This method allows a user to check in a book
    // If the book is currently checked out (isCheckedOut is true), it sets isCheckedOut to false,
    // sets checkedOutTo to null (indicating that the book is no longer checked out to anyone),
    // and prints a message confirming the check-in
    //
    // If the book is already checked in, it prints a message indicating that the book is already in the library
    public void checkIn() {
        if (isCheckedOut) {
            isCheckedOut = false;
            checkedOutTo = null;
            System.out.println(title + " has been checked in.");
        } else {
            System.out.println(title + " is already checked in.");
        }
    }


}
        */



    }
}



