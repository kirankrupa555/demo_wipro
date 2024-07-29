package assignments;

public class Rectangle {
    double length = 11;
    double width  = 5;
    public double calculateArea() {
    	return length*width;
    }
    public double calculatePerimeter() {
    	return 2*(length+width);
    }
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		System.out.println(obj.calculateArea());
		System.out.println(obj.calculatePerimeter());
	}

}
