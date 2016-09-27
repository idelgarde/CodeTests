package springer.nature.handler;

import java.util.Scanner;

import springer.nature.commands.Command;
import springer.nature.commands.RectangleCommand;

public class RectangleConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
	@Override
	public Command toCommandFrom(Scanner scanner) {
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		return new RectangleCommand(x1, y1, x2, y2);
	}
}
