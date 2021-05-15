package com.design.patterns.creational.prototype.example2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Vidya");
        bookShop.loadBooksFromDatabase();

        System.out.println(bookShop);
        System.out.println(bookShop.hashCode());
        System.out.println(bookShop.getBooks().hashCode());
        System.out.println("=============================");

        BookShop clonedBookShop = bookShop.clone();
        System.out.println(clonedBookShop);
        System.out.println(clonedBookShop.hashCode());
        System.out.println(clonedBookShop.getBooks().hashCode());
        System.out.println("=============================");

        clonedBookShop.getBooks().add(new Book("Extra"));
        System.out.println(bookShop.getBooks().hashCode());
        System.out.println(clonedBookShop.getBooks().hashCode());



    }
}
