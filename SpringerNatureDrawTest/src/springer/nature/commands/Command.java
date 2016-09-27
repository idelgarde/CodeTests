package springer.nature.commands;

import springer.nature.draw.DrawingTool;

public interface Command{
  void execute(DrawingTool drawingTool);
}
