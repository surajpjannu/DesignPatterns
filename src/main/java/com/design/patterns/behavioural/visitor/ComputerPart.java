package com.design.patterns.behavioural.visitor;

public interface ComputerPart {
   public void accept(ComputerPartVisitor computerPartVisitor);
}