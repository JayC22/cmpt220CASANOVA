import java.util.ArrayList;

public class TestC {

	public static void main(String[] args) {
		Course c1 = new Course ("Software Devepolment1");
		Course c2 = new Course ("Software Devepolment2");
		
		c1.addStudent("Theodore Higgins");
		c1.addStudent("Eileen Hayes");
		c1.addStudent("Bertha King");
		c1.addStudent("Julia Bell");
		
		c2.addStudent("Lyle Brady");
		c2.addStudent("Bennie Franklin");
		c2.addStudent("Dustin Colon");
		
		System.out.println("Number of students in course1: " + c1.getNumberOfStudents());
		ArrayList a1 = c1.getStudents();
		for(int i = 0; i <c1.getNumberOfStudents(); i++) 
			System.out.print(a1.get(i)+ ", ");
		System.out.println();
		System.out.print("Number of Students in course2:" + c2.getNumberOfStudents());
		System.out.println();
		ArrayList a2 = c2.getStudents();
		for (int i=0; i < c2.getNumberOfStudents(); i++) 
			System.out.print(a2.get(i) + ", ");
		System.out.println();
		c1.dropStudent("Julia Bell");
		System.out.println("\nNew list of course 1 after drop a student Julia Bell: " + c1);
		c2.clear();
		System.out.println("\nNew Course2 list after using clear() method: " + c2);
	}

}
