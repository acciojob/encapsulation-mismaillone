package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj = new RWOnly();

    // The field RWOnly.name is not visible

    obj.setName("name");

    System.out.println(obj.getName());

  }
}
