import java.util.Scanner;
public class MathematicalOperation{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=scan.nextInt();
		System.out.print("Enter the second number:");
		int num2=scan.nextInt();
		int result1=num1+num2;
		System.out.println("Addition:"+result1);
		result1=num1-num2;
		System.out.println("Subtration:"+result1);
		result1=num1*num2;
		System.out.println("Multipication:"+result1);
		result1=num1%num2;
		System.out.println("Modulus:"+result1);
		float result2=(float)num1/num2;
		System.out.println("Division:"+result2);
	}
}