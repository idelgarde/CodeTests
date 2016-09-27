package springer.nature.handler;

import java.util.Scanner;

import springer.nature.commands.Command;

public interface ConsoleCommandArgumentHandler
{
	Command toCommandFrom(Scanner scanner);
}
