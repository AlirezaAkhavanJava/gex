package com.gex;

public class GexApplication {

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("Gex");
      return;
    }

    String command = args[0];

    System.out.println("Command: " + command);
  }
}
