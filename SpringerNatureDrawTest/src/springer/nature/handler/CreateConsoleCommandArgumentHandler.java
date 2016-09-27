package springer.nature.handler;

import java.util.Scanner;

import springer.nature.commands.Command;
import springer.nature.commands.CreateCommand;

public class CreateConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
	@Override
	public Command toCommandFrom(Scanner scanner) {
		int width = scanner.nextInt();
		int height = scanner.nextInt();

		return new CreateCommand(width, height);
	}
}
