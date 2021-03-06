// JA: Always add comments to your code
// JA: There is no test class to test this
// JA: Your code is exactly the same as another student in the class
	class LinearEquation {
		private double a;
		private double b;
		private double c;
		private double d;
		private double e;
		private double f;
		
		LinearEquation( double A, double B, double C, 
				double D, double E, double F) {
			a = A;
			b = B;
			c = C;
			d = D;
			e = E;
			f = F;
		}
		public double getA() {
			return a;
		}
		public double getB() {
			return b;
		}
		public double getC() {
			return c;
		}
		public double getD() {
			return d;
		}
		public double getE() {
			return e;
		}
		public double getF() {
			return f;
		}
		
		public boolean isSolvable() {
			if(((a * d) - (b * c)) == 0)
				return false;
			else 
				return true;
		}
		public double getX() {
			double numerator  = ((e * d) -(b * f));
			double denominator = ((a * d) - (b * c));
			return numerator/denominator;
		}
		public double getY() {
			double numerator  = ((a * f) -(e * c));
			double denominator = ((a * d) - (b * c));
			return numerator/denominator;
		
	}
	

}
