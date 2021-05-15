package com.design.patterns.behavioural.memento;

public class Main {
   public static void main(String[] args) {
   
      Originator originator = new Originator();
      CareTaker careTaker = new CareTaker();
      
      originator.setState("State #1");
      originator.setState("State #2");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #3");
      careTaker.add(originator.saveStateToMemento());
      
      originator.setState("State #4");
      System.out.println("Current State: " + originator.getState());		
      
      originator.getStateFromMemento(careTaker.undo());
      System.out.println("Last saved State: " + originator.getState());
      originator.getStateFromMemento(careTaker.undo());
      System.out.println("Last saved State: " + originator.getState());
   }
}