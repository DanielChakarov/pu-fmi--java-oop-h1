package com.company;

import static com.company.Main.input;

public class LibraryFunc {

    static Library enterLibrary() {
        String name;
        String address;
        Integer employees;
        while(true) {
            System.out.println("Въведете наименование: ");
            name = input.nextLine();
            if(name.length() < 100 && name.length() > 0) {
                break;
            }
            System.out.println("Наименованието на библитеоката не трябва да превишава 100 символа! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете адрес: ");
            address = input.nextLine();
            if(address.length() < 500 && address.length() > 0) {
                break;
            }
            System.out.println("Адресът на библиотеката не трябва да превишава 500 символа! Моля опитайте отново!");
        }

        while(true) {
            System.out.println("Въведете брой служители: ");
            employees = input.nextInt();
            if(employees > 0 && employees < 50) {
                break;
            }
            System.out.println("Броят на служителите в библиотеката трябва да е по-голям от 0 и по-малък от 50! Моля опитайте отново!");
        }
        var library = new Library(name, address, employees);
        return library;
    }
}
