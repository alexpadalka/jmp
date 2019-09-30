package com.epam.jmp.model;

public class Dog extends Pet {

  @Override
  public void play() {
    System.out.println("Dog '" + getName() + "' is playing");
  }

  @Override
  public void voice() {
    System.out.println("Dog '" + getName() + "' say 'R-r-r-r'");
  }

}
