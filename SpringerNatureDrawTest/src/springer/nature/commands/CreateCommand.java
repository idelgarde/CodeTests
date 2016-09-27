package springer.nature.commands;

import springer.nature.draw.DrawingTool;

public class CreateCommand implements Command
{
  private final int width;
  private final int height;

  public CreateCommand(int w,int h) {
    width = w;
    height = h;
  }

  @Override
  public void execute(DrawingTool drawingTool) {
    drawingTool.crateCanvas(width, height);
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }
}
