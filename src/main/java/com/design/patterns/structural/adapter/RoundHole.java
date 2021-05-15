package com.design.patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RoundHole {
    private double radius;

    public boolean fits(RoundedPeg roundedPeg){
        return radius >= roundedPeg.getRadius();
    }
}
