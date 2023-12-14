import java.util.Scanner;
class Greatest_among_three_numbers{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.print("Enter the third number: ");
		int num3=scan.nextInt();
		int greatest=num1>num2? num1>num3? num1:num3 : num2>num3? num2:num3;
		System.out.println("The greatest number is: "+greatest);
	}
}