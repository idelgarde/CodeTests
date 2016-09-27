package springer.nature.handler;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import springer.nature.handler.ConsoleCommandArgumentHandlerFactory;
import springer.nature.main.ConsoleCommand;

public class ConsoleCommandHandlerFactoryTest
{
  private ConsoleCommandArgumentHandlerFactory consoleCommandHandlerFactory;

  @Before
  public void init() {
    consoleCommandHandlerFactory = new ConsoleCommandArgumentHandlerFactory();
  }

  @Test
  public void testConsoleCommandHandlers() {
    for (ConsoleCommand command : ConsoleCommand.values()) {
      assertNotNull(consoleCommandHandlerFactory.handlerFor(command));
    }
  }
}
