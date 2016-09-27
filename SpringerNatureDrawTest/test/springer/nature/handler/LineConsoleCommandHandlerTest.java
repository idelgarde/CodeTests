package springer.nature.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import springer.nature.commands.Command;
import springer.nature.commands.LineCommand;
import springer.nature.handler.LineConsoleCommandArgumentHandler;

public class LineConsoleCommandHandlerTest
{
	private LineConsoleCommandArgumentHandler lineConsoleCommandHandlerTest;

	@Before
	public void init() {
		lineConsoleCommandHandlerTest = new LineConsoleCommandArgumentHandler();
	}

	@Test
	public void testFillConsoleCommandHandler()	{
		byte[] data = "2 6 2 10".getBytes();
		InputStream input = new ByteArrayInputStream(data);
		Scanner scanner = new Scanner(input);
		Command command = lineConsoleCommandHandlerTest.toCommandFrom(scanner);

		assertTrue(command.getClass().isAssignableFrom(LineCommand.class));

		LineCommand lineCommand = (LineCommand) command;

		assertEquals(2, lineCommand.getX1());
		assertEquals(6, lineCommand.getY1());
		assertEquals(2, lineCommand.getX2());
		assertEquals(10, lineCommand.getY2());
	}
}
