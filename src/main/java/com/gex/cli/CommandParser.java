package com.gex.cli;

public class CommandParser {

  public String parse(String[] args) {

    if (args.length == 0) {
      return null;
    }

    return args[0];
  }
}
