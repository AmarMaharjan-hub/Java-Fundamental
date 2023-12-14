import java.util.Scanner;
class Remainder_and_quotient{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		int remainder=num1%num2;
		int quotient=num1/num2;
		System.out.println("After dividing:\nremainder: "+remainder+"\nquotient: "+quotient);
	}
}