package springer.nature.handler;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import springer.nature.commands.Command;
import springer.nature.commands.CreateCommand;
import springer.nature.handler.CreateConsoleCommandArgumentHandler;

public class CreateConsoleCommandHandlerTest
{
  private CreateConsoleCommandArgumentHandler createConsoleCommandHandlerTest;

  @Before
  public void init() {
    createConsoleCommandHandlerTest = new CreateConsoleCommandArgumentHandler();
  }

  @Test
  public void testCreateConsoleCommandHandler()  {
    byte[] data = "20 6".getBytes();
    InputStream input = new ByteArrayInputStream(data);
    Scanner scanner = new Scanner(input);
    Command command = createConsoleCommandHandlerTest.toCommandFrom(scanner);

    assertTrue(command.getClass().isAssignableFrom(CreateCommand.class));

    CreateCommand createCommand = (CreateCommand) command;

    assertEquals(20, createCommand.getWidth());
    assertEquals(6, createCommand.getHeight());
  }
}
