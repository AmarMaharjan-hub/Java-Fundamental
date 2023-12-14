import myPackage.ArithmeticOperations;
import java.util.Scanner;
public class UsePackage{
	public static void main(String args[]){
		ArithmeticOperations a1=new ArithmeticOperations();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		System.out.println("\nDifference: "+a1.sub(num1,num2)+"\nProduct: "+a1.multiply(num1,num2)+"\nDivision: "+a1.division(num1,num2)+"\nFactorial: "+a1.factorial(num1)+"\nSquare: "+a1.square(num1,num2));
	}
}