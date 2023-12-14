import java.util.Scanner;
public class Swap_two_numbers{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int num1=scan.nextInt();
		System.out.print("Enter the second number:");
		int num2=scan.nextInt();
		int temp=num2;
		num2=num1;
		num1=temp;
		System.out.println("After swap the first number is "+num1+" and the second number is "+num2);
	}
}