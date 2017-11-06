package study_object1;

public class MyFigure {
	int width;
	int height;
	
	public void init(int aWidth, int aHeight) {
		width=aWidth;
		height=aHeight;
	}
	
	public int areaSize() {
		return width * height;
	}
}

class MyRectangle extends MyFigure{
	
}

class MySquare1 extends MyRectangle{
	public void init(int aWidth) {
		width = aWidth;
		height = width;
	}
}

class MySquare2 extends MyRectangle{
	public void init(int anEdge) {
		super.init(anEdge, anEdge);
	}
}

class MyTriangle1 extends MyFigure{
	public int areasize() {
		return width * height / 2;
	}
}

class MyTriangle2 extends MyFigure{
	public int areaSize() {
		return super.areaSize() / 2;
		
	}
}

class MyTriangle3 extends MyFigure{
	public void init(int aBase, int aHeight) {
		super.init(aBase / 2,  aHeight);
	}
}