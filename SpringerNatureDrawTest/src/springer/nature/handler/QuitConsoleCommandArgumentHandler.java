package springer.nature.handler;

import java.util.Scanner;

import springer.nature.commands.Command;
import springer.nature.commands.QuitCommand;

public class QuitConsoleCommandArgumentHandler implements ConsoleCommandArgumentHandler
{
	@Override
	public Command toCommandFrom(Scanner scanner)
	{
		return new QuitCommand();
	}
}
