package com.design.patterns.creational.prototype.example2;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Cloneable {
    private String bookName;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
