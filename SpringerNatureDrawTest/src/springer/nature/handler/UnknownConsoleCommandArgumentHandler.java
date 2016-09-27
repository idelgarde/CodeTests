package springer.nature.handler;

import java.util.Scanner;

import springer.nature.commands.Command;

public class UnknownConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
  @Override
  public Command toCommandFrom(Scanner scanner)
  {
    scanner.nextLine();
    throw new IllegalArgumentException("Unsupported command");
  }
}
