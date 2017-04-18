
public class ColorableTest{
	public static void main(String[] args) {
		GeometricObject4[] obj = new GeometricObject4[5];
		
		obj[0] = new GeometricObject4();
		obj[1] = new Square();
		obj[2] = new Square();
		obj[3] = new GeometricObject4();
		obj[4] = new Square();
		
		for (int i=0; i<obj.length;i++) {
			GeometricObject4 object = obj[i];
			System.out.print("Object["+i+ "] ");
			if (object instanceof Colorable) {
				Colorable colorable = (Colorable) object;
				colorable.howToColor();
			} else {
				System.out.println("Not colorable");
			}
		}
		
	}

}
