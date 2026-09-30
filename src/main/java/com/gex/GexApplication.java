package com.gex;

import com.gex.cli.CommandParser;

public class GexApplication {

  public static void main(String[] args) {

    CommandParser parser = new CommandParser();

    String command = parser.parse(args);

    if (command == null) {
      System.out.println("Gex");
      return;
    }

    System.out.println("Command: " + command);
  }
}
