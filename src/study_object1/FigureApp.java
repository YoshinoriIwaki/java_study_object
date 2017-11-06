package study_object1;
import java.applet.*;
import java.awt.*;

public class FigureApp extends Applet {
	
	MyRectangle aRectangle;
	MySquare1 aSquare1;
	MySquare2 aSquare2;
	MyTriangle1 aTriangle1;
	MyTriangle2 aTriangle2;
	MyTriangle3 aTriangle3;
	
	public void init() {
		aRectangle = new MyRectangle();
		aRectangle.init(10, 5);
		aSquare1 = new MySquare1();
		aSquare1.init(8);
		aSquare2 = new MySquare2();
		aSquare2.init(8);
		aTriangle1 = new MyTriangle1();
		aTriangle1.init(10,5);
		aTriangle2 = new MyTriangle2();
		aTriangle2.init(10,5);
		aTriangle3 = new MyTriangle3();
		aTriangle3.init(10,5);
	}
	
	public void paint(Graphics g) {
		g.drawString("Rectangle size =" + aRectangle.areaSize(), 10, 20);
		g.drawString("Square1 size =" + aSquare1.areaSize(), 10, 40);
		g.drawString("Square2 size =" + aSquare2.areaSize(), 10, 60);
		g.drawString("Triangle1 size =" + aTriangle1.areaSize(), 10, 80);
		g.drawString("Triangle2 size =" + aTriangle2.areaSize(), 10, 100);
		g.drawString("Triangle3 size =" + aTriangle3.areaSize(), 10, 120);
	}

}
