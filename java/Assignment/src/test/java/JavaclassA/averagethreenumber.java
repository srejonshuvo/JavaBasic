package JavaclassA;

import java.util.Scanner;

public class averagethreenumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        
        System.out.print("Enter the third number: ");
        double c = input.nextDouble();
        
        double d = (a+b+c)/3;
        
        System.out.println("This the Average Number = "+d);
//        +avr(a,b,c)
	}
//	public static double avr(double a, double b, double c)
//    {
//        return (a + b + c) / 3;
//    }

}