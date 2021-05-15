package com.design.patterns.creational.prototype.example2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public void loadBooksFromDatabase() {
        for (int i = 1; i < 10; i++) {
            books.add(new Book("book " + i));
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for (Book book : this.getBooks()) {
            bookShop.getBooks().add((Book) book.clone());
        }
        return bookShop;
    }
}
