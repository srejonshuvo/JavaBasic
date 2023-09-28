package JavaclassA;

public class MethodReminder {
	public void sum(int a, int b) {
		System.out.println("Summation : " +(a+b));
		
	}
	
	public void multiply(int a, int b) {
		System.out.println("Multiplication : " +(a*b));
		
	}
	
	public void subtract(int a, int b) {
		System.out.println("Subtraction : " +(a-b));
		
	}
	
	public void quotient(int a, int b) {
		System.out.println("Quotient : " +(a/b));
		
	}
	public void remainder(int a, int b) {
		System.out.println("Remainder : " +(a%b));
		
	}
	
	public static void main(String[] args) {
		MethodReminder example = new MethodReminder();
		
		example.sum(10,10 );
		example.multiply(20,30);
		example.subtract(40, 20);
		example.quotient(40, 2);
		example.remainder(9,2);
		

	}

}
