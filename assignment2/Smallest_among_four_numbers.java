import java.util.Scanner;
class Smallest_among_four_numbers{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.print("Enter the third number: ");
		int num3=scan.nextInt();
		System.out.print("Enter the fourth number: ");
		int num4=scan.nextInt();
		int smallest=num1<num2? num3<num4?  num1<num3? num1 : num3 : num1<num4? num1 : num4  : num3<num4?  num2<num3?  num2 : num3 :  num2<num4?  num2  :  num4;
		System.out.println("The smallest number is: "+smallest);
	}
}