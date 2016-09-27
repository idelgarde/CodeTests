package springer.nature.draw;

import java.io.PrintStream;

public class DrawingTool
{
	private Canvas canvas;

	public void crateCanvas(int width, int height) {
		if (width < 1 || height < 1)
			throw new IllegalArgumentException("Please insert positive values!");

		canvas = new Canvas(width, height);
	}

	public void addLine(int x1, int y1, int x2, int y2) {
		checkCanvas();

		Line line = new Line(x1, y1, x2, y2);
		line.addTo(canvas);
	}

	public void addRectangle(int x1, int y1, int x2, int y2) {
		checkCanvas();

		Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
		rectangle.addTo(canvas);
	}

	public void fill(int x, int y, char c){
		checkCanvas();
		if (x < 1 || y < 1){
			throw new IllegalArgumentException("Fill beginning must be on the canvas.");
		}
		canvas.fill(x, y, c);
	}

	public void draw(PrintStream printer) {
		checkCanvas();
		canvas.draw(printer);
	}

	private void checkCanvas(){
		if (canvas == null)
			throw new IllegalStateException("Canvas be created before drawing.");
	}
}
