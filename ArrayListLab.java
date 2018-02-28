import java.util.ArrayList;

import java.util.Scanner;


public class ArrayListLab {
	public static void main(String[] args) {
		int choice = 0;
		int n = 0;

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("Enter amount of operations: ");
		n = input.nextInt();

		for(int i = 0; i<n; i++) {
			System.out.println("Enter a choice: ");
			System.out.println("1) 1 X put X at the end of ArrayList.");
			System.out.println("2) 2 Y remove all Y's from ArrayList.");
			System.out.println("3) print the size of the ArrayList");

			choice = input.nextInt();

			switch(choice) {
			case(1):
				arrayList.add(input.nextInt());
				break;
			case(2):
				int temp = input.nextInt();
				for(int j = 0; j<arrayList.size(); j++){
					if(arrayList.get(j) == temp)
						arrayList.remove(j);
				}
				break;
			case(3):
				System.out.println(arrayList.size());
				break;
			default:
				System.out.println("Invalid choice.");
				i--;
			}	
		}
		input.close();
	}
}
