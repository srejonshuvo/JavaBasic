package JavaclassA;

import java.util.Scanner;

public class Comparetwotext {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first Text ");
		String text1 = input.nextLine();
		
		System.out.println("Enter the Second Text ");
		String text2 = input.nextLine();		
		
		if (text1.equals(text2)) {
			System.out.println(text1 + " is Equal to " + text2);
			
		}else{
			System.out.println("Not Equal");
		}

	}

}
