package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import static com.company.Main.input;

public class BooksFunc {
    static void GetBooks(List<Book> books) {
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-15s | %-15s | %-15s | %-15s | %-5s","Book Name","Author Name","Publisher","Publishing Year","Pages");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        for (Book book : books) {
            if(book.getAvailable()) {
                System.out.format("%-15s | %-15s | %-15s | %-15s | %-5s", book.getName(), book.getAuthor(),
                        book.getPublisher(), book.getYearOfPublishing().toString(), book.getPages().toString());
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    static List<Book> ChangeBook(List<Book> books) {
        System.out.println("Въведете ISBN номер: ");
        boolean isFound = false;
        String ISBN;
        ISBN = input.nextLine();
        for(var book:books) {
            if(book.getISBN().equals(ISBN)) {
                isFound = true;
                System.out.println("Избрахте да обновите информация за книга с ISBN номер: " + ISBN);
                System.out.println("Моля изберете какво искате да обновите:");
                System.out.println("1.наличност");
                System.out.println("2.дата, на която е взета книгата");
                System.out.println("3.дата, на която трябва да се върне книгата");
                System.out.println("4.период на вземане");
                System.out.println("5.колко пъти книгата е взимана от библиотеката");
                System.out.println("6.Изход");
                var menuOption = input.nextInt();
                input.nextLine();
                switch(menuOption) {
                    case 1:
                        while(true) {
                            System.out.println("Въведете наличност(true/false): ");
                            boolean isAvailable;
                            isAvailable = input.nextBoolean();
                            input.nextLine();
                            book.setAvailable(isAvailable);
                            break;
                        }
                        break;
                    case 2:
                        while(true) {
                            System.out.println("Въведете дата на взимане: (dd/mm/yyyy)");
                            SimpleDateFormat dateInput = new SimpleDateFormat("dd/mm/yyyy");
                            String strDate;
                            strDate = input.nextLine();
                            try{
                                var date = dateInput.parse(strDate);
                                book.setDateOfReturning(date);
                            } catch (Exception ex) {
                                System.out.println("Parse Exception");
                            }
                            break;
                        }
                        break;
                    case 3:
                        while(true) {
                            System.out.println("Въведете дата за връщане: (dd/mm/yyyy)");
                            SimpleDateFormat dateInput = new SimpleDateFormat("dd/mm/yyyy");
                            String strDate;
                            strDate = input.nextLine();
                            try{
                                var date = dateInput.parse(strDate);
                                book.setDateOfReturning(date);
                            } catch (Exception ex) {
                                System.out.println("Parse Exception");
                            }
                            break;
                        }
                        break;
                    case 4:
                        while(true) {
                            System.out.println("Въведете месеци за връщане: ");
                            int monthsToReturn;
                            monthsToReturn = input.nextInt();
                            input.nextLine();
                            if(monthsToReturn > 0) {
                                book.setMonthsToReturn(monthsToReturn);
                                break;
                            }
                            System.out.println("Броят на месеците за връщане трябва да е по-голям от 0! Моля опитайте отново!");
                        }
                        break;
                    case 5:
                        while(true) {
                            System.out.println("Въведете брой на взимания: ");
                            int timesTaken;
                            timesTaken = input.nextInt();
                            input.nextLine();
                            if(timesTaken >= 0) {
                                book.setTimesTaken(timesTaken);
                                break;
                            }
                            System.out.println("Броят на взимания трябва да е по-голям или равен на 0! Моля опитайте отново!");
                        }
                        break;
                }
                break;
            }
        }
        if(!isFound) {
            System.out.println("Книгата не е намерена!");
        }
        return books;
    }

    static void SearchBook(List<Book> books) {
        System.out.println("Моля изберете по какво искате да търсите:");
        System.out.println("1.наименование");
        System.out.println("2.автор");
        System.out.println("3.година на издаване");
        System.out.println("4.ISBN номер");
        String name;
        String author;
        Integer yearOfPublishing;
        String ISBN;
        var menuOption = input.nextInt();
        input.nextLine();
        switch(menuOption) {
            case 1:
                System.out.println("Въведете наименование: ");
                name = input.nextLine();
                books.removeIf(book -> !Objects.equals(book.getName(), name));
                GetBooks(books);
                break;
            case 2:
                System.out.println("Въведете автор: ");
                author = input.nextLine();
                books.removeIf(book -> !Objects.equals(book.getAuthor(), author));
                GetBooks(books);
                break;
            case 3:
                System.out.println("Въведете година на издаване: ");
                yearOfPublishing = input.nextInt();
                input.nextLine();
                books.removeIf(book -> !Objects.equals(book.getYearOfPublishing(), yearOfPublishing));
                GetBooks(books);
                break;
            case 4:
                System.out.println("Въведете ISBN номер: ");
                ISBN = input.nextLine();
                books.removeIf(book -> !Objects.equals(book.getISBN(), ISBN));
                GetBooks(books);
                break;
        }
    }

    static List<Book> RemoveBook(List<Book> books) {
        System.out.println("Въведете наименование или ISBN номер: ");
        String nameOrISBN;
        nameOrISBN = input.nextLine();
        books.removeIf(book ->
                book.getISBN().equals(nameOrISBN) || book.getName().toLowerCase().equals(nameOrISBN.toLowerCase()));
        System.out.println("Книгата е успешно премахната!");
        return books;
    }

    static List<Book> AddBook(List<Book> books) {
        String name;
        String author;
        String publisher;
        Integer yearOfPublishing;
        String ISBN;
        Integer pages;
        Boolean isAvailable;
        Integer timesTaken;
        while(true) {
            System.out.println("Въведете наименование: ");
            name = input.nextLine();
            if(name.length() < 100 && name.length() > 0) {
                break;
            }
            System.out.println("Наименованието на книгата не трябва да превишава 100 символа! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете автор: ");
            author = input.nextLine();
            if(author.length() < 50 && author.length() > 0) {
                break;
            }
            System.out.println("Името на автора не трябва да превишава 50 символа! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете издателство: ");
            publisher = input.nextLine();
            if(publisher.length() > 0 && publisher.length() < 50) {
                break;
            }
            System.out.println("Името на издателството не трябва да превишава 50 символа! Моля опитайте отново!");
        }
        while(true) {
            System.out.println("Въведете година на издаване: ");
            yearOfPublishing = input.nextInt();
            input.nextLine();
            if(yearOfPublishing <= LocalDate.now().getYear() && yearOfPublishing >= 0) {
                break;
            }
            System.out.println("Годината на издаване не трябва да е в бъдещето! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете ISBN номер: ");
            ISBN = input.nextLine();
            if(ISBN.length() <= 10 && ISBN.length() > 0) {
                break;
            }
            System.out.println("ISBN номерът не трябва да превишава 10 символа! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете брой страници: ");
            pages = input.nextInt();
            input.nextLine();
            if(pages > 0) {
                break;
            }
            System.out.println("Броят на страниците трябва да е по-голям от 0! Моля опитайте отново!");
        }
        while(true) {
            System.out.println("Въведете наличност(true/false): ");
            isAvailable = input.nextBoolean();
            break;
        }

        while(true) {
            System.out.println("Въведете брой на взимания: ");
            timesTaken = input.nextInt();
            input.nextLine();
            if(timesTaken >= 0) {
                break;
            }
            System.out.println("Броят на взимания трябва да е по-голям или равен на 0! Моля опитайте отново!");
        }

        var book = new Book(name, author, publisher, yearOfPublishing, ISBN, pages, isAvailable, timesTaken);
        books.add(book);
        System.out.println("Книгата е успешно добавена!");
        return books;
    }

}
