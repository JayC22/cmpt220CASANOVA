import java.util.ArrayList;
import java.util.Scanner;

public class problem11_11 {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter 5 numbers: ");
		int i=0;
		while (i<5) {
			list.add(input.nextInt());
			i++;
		}
		sort(list);
		System.out.print("List after sorting: ");
		for(int j=0; j<list.size(); j++)
			System.out.print(list.get(j)+" ");
	}
	public static void sort (ArrayList<Integer> list) {
		int temp;
		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size()-1; j++) {
				if(list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

}
