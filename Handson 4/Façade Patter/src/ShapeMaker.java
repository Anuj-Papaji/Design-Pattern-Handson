
public class ShapeMaker {
	private Shape circle;
	private Shape square;
	private Shape rectangle;

	public ShapeMaker() {
		super();
		circle = new Circle();
		square = new Square();
		rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	@Override
	public void finalize() {
		circle = null;
		square = null;
		rectangle = null;
	}

}
