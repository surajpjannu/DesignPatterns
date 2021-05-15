package com.design.patterns.creational.prototype.example1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Vidya");
        bookShop.loadBooksFromDatabase();

        System.out.println(bookShop);
        System.out.println(bookShop.hashCode());
        System.out.println(bookShop.getBooks().hashCode());
        System.out.println("=============================");

        BookShop clonedBookShop = (BookShop) bookShop.clone();
        System.out.println(clonedBookShop);
        System.out.println(clonedBookShop.hashCode());
        System.out.println(clonedBookShop.getBooks().hashCode());
        System.out.println("=============================");

    }
}
