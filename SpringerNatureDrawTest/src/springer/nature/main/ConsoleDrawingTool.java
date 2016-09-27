package springer.nature.main;

import java.util.Scanner;

import springer.nature.commands.Command;
import springer.nature.draw.DrawingTool;
import springer.nature.handler.ConsoleCommandArgumentHandlerFactory;

/**
 */
public class ConsoleDrawingTool
{
  private final static ConsoleCommandArgumentHandlerFactory handlerFactory = new ConsoleCommandArgumentHandlerFactory();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DrawingTool drawingTool = new DrawingTool();
    ConsoleCommand consoleCommand = ConsoleCommand.UNKNOWN;

    do {
      System.out.print("enter command:");
      try {
        consoleCommand = ConsoleCommand.parse(scanner.next());
        Command command = handlerFactory.handlerFor(consoleCommand).toCommandFrom(scanner);
        command.execute(drawingTool);

        drawingTool.draw(System.out);
      }
      catch (Exception ex) {
        System.out.println(ex.getMessage());
      }
    }
    while (consoleCommand != ConsoleCommand.QUIT);

    scanner.close();
    System.exit(0);
  }
}
