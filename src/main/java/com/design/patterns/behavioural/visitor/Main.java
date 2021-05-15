package com.design.patterns.behavioural.visitor;

public class Main {
   public static void main(String[] args) {
      ComputerPartDisplayVisitor computerPartVisitor = new ComputerPartDisplayVisitor();

      ComputerPart computerPart = new Keyboard();
      computerPart.accept(computerPartVisitor);

      System.out.println("===============");
      ComputerPart computer = new Computer();
      computer.accept(computerPartVisitor);
   }
}