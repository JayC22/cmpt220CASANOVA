import java.text.DecimalFormat;

public class Q9_1 {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		DecimalFormat ab = new DecimalFormat("##.##");
		
		// These is for the first Rectangle 
		System.out.println("The Details of the first rectangle");
		System.out.println("Width of Rectangle1 is: " + r1.width );
		System.out.println("Height of Rectangle1 is: " + r1.height );
		System.out.println("Area of Rectangle1 is: " + ab.format(r1.getArea()));
		System.out.println("Perimeter of Rectangle1 is: " + r1.getPerimeter());
		System.out.println();
		
		//These is for the second Rectangle
		System.out.println("The Details of the Second rectangle");
		System.out.println("Width of Rectangle2 is: " + r2.width );
		System.out.println("Height of Rectangle2 is: " + r2.height );
		System.out.println("Area of Rectangle2 is: " + ab.format(r2.getArea()));
		System.out.println("Perimeter of Rectangle2 is: " + r2.getPerimeter());
		
	
  }

}


