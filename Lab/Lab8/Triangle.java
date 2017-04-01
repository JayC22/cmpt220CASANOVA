import java.util.Scanner;

public class Triangle extends problem11_1{
	
	private double side1;
	private double side2;
	private double side3;

	public static void main(String[] args) {
		double s1,s2,s3;
		String color;
		boolean fill;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter color: ");
		color = input.nextLine();
		
		System.out.println("Enter sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("Fill triangle or not: ");
		fill = input.nextBoolean();
		
		Triangle tt = new Triangle (s1,s2,s3);
		// JA tt.putcolor(color);
		tt.setColor(color);
		tt.setFill(fill);
		
		System.out.println("Sides of "+ tt.toString());
		System.out.println("Area of Triangle "+tt.getarea());
		System.out.println("Perimeter of Triangle " +tt.getperimeter());
		System.out.println("color of the Triangle is "+ tt.getColor());
		System.out.println("is Triangle filles " +tt.isFilled());
		
	}
	public Triangle (double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	public double getside1() {
		return side1;
	}
	public double getside2() {
		return side2;
	}
	public double getside3() {
		return side3;
	}
	public double getarea() {
		double s = (side1+side2+side3)/2;
		double area = s*(s-side1)*(s-side2)*(s-side3);
		return area;
	}
	public double getperimeter() {
		return (side1+side2+side3);
	}
	public String toString() {
		return "Triangle: side1="+side1+" side2= "+side2+ "side3=" +side3;
	}

}
