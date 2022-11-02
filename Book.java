package com.company;

import java.util.Date;

public class Book {
    String name;
    Genre genre;
    String author;
    String publisher;
    Integer yearOfPublishing;
    String ISBN;
    Integer pages;
    Language language;
    Boolean isAvailable;
    Date dateOfCollection;
    Date dateOfReturning;
    Integer monthsToReturn;
    Integer timesTaken;

    public Book(String name, String author, String publisher, Integer yearOfPublishing,
                String isbn, Integer pages, Boolean isAvailable, Integer timesTaken) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.ISBN = isbn;
        this.pages = pages;
        this.isAvailable = isAvailable;
        this.timesTaken = timesTaken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(Integer yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Date getDateOfCollection() {
        return dateOfCollection;
    }

    public void setDateOfCollection(Date dateOfCollection) {
        this.dateOfCollection = dateOfCollection;
    }

    public Date getDateOfReturning() {
        return dateOfReturning;
    }

    public void setDateOfReturning(Date dateOfReturning) {
        this.dateOfReturning = dateOfReturning;
    }

    public Integer getMonthsToReturn() {
        return monthsToReturn;
    }

    public void setMonthsToReturn(Integer monthsToReturn) {
        this.monthsToReturn = monthsToReturn;
    }

    public Integer getTimesTaken() {
        return timesTaken;
    }

    public void setTimesTaken(Integer timesTaken) {
        this.timesTaken = timesTaken;
    }
}
