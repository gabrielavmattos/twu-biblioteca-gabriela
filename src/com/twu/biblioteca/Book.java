package com.twu.biblioteca;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean avaliable;

    public Book(String title, String author, int year) {

        this.title = title;
        this.author = author;
        this.year = year;
        this.avaliable = true;

    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Book) {

            Book book = (Book) obj;

            return book.title.equals(this.title) && book.author.equals(this.author) && book.year == this.year;
        }

        return false;
    }



    public String toString() {

        return this.title + " - " + this.author + " - " + this.year;
    }

    public boolean checkout() {

        if (avaliable) {
            this.avaliable = false;
            return true;
        }

        return false;
    }

    public boolean getAvaliable() {
        return this.avaliable;
    }
}
