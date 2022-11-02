package com.company;

import java.util.ArrayList;
import java.util.List;

public class Library {
    String name;
    String address;
    Integer employees;
    List<Book> books = new ArrayList<Book>(){};

    public Library(String name, String address, Integer employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public Library(String name, String address, Integer employees, List<Book> books) {
        this.name = name;
        this.address = address;
        this.employees = employees;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
