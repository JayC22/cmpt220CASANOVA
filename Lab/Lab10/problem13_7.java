
interface Colorable {
	
	public void howToColor ();
	
}
    class GeometricObject4 {
    	public GeometricObject4 () {
    		
    	}

}
    class Square extends GeometricObject4 implements Colorable {
    	public Square () {
    		
    	}
    	public void howToColor() {
    		System.out.println("Colorable all four sides");
    	}
    }