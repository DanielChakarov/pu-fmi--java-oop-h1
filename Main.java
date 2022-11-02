package com.company;
import java.util.*;

public class Main {

    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Здравейте, моля въведете информация за библиотека");
        var currLibrary = LibraryFunc.enterLibrary();
        menu(currLibrary);
    }

    static void menu(Library library) {
        var isLooping = true;
        while(isLooping) {
            System.out.println("1.Добавяне на книга");
            System.out.println("2.Премахване на книга");
            System.out.println("3.Търсене на книга");
            System.out.println("4.Обновяване на книга");
            System.out.println("5.Пълен списък с книги");
            System.out.println("6.Изход");
            var menuOption = input.nextInt();
            input.nextLine();
            switch(menuOption) {
                case 6:
                    isLooping = false;
                    System.out.println("Довиждане! До нови срещи!");
                    break;
                case 1:
                    library.books = BooksFunc.AddBook(library.books);
                    break;
                case 2:
                    library.books = BooksFunc.RemoveBook(library.books);
                    break;
                case 3:
                    BooksFunc.SearchBook(library.books);
                    break;
                case 4:
                    library.books = BooksFunc.ChangeBook(library.books);
                    break;
                case 5:
                    BooksFunc.GetBooks(library.books);
                    break;
                default:

                    break;
            }
        }

    }





}
