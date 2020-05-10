
public class FacadePatternDemo {
	public static void main(String[] args) {
		ShapeMaker shapes = new ShapeMaker();
		shapes.drawCircle();
		shapes.drawSquare();
		shapes.drawRectangle();
	}
}
