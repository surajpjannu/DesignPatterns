package com.design.patterns.creational.prototype.example1;

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
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
