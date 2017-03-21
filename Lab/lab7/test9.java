public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mystring2 s = new mystring2(new char[] {'a', 'b', 'c'});
		char[] chars = mystring2.valueOf(true).toChars();
		for (int i=0; i<chars.length; i++) {
			System.out.print(chars[i]);
		}

	}

}
