package JavaclassA;

import java.util.Scanner;

public class FindSmallnumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the Number1 ");
		int a = input.nextInt();
		System.out.println("Enter the Number2 ");
		int b = input.nextInt();
		System.out.println("Enter the Number3 ");
		int c = input.nextInt();
		if(a<b & a<c) {
			System.out.println("A is Small Number = "+ a);
			
		}else if(b<a & b<c) {
			
			System.out.println("B is Small Number = " + b);
		}else if (c<a & c<b) {
			System.out.println("C is Small Number = " + c);
		}
		
		System.out.println("Three number is "+a+","+b+","+c);
	}

}

