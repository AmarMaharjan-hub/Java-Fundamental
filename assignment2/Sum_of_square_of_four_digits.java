import java.util.Scanner;
class Sum_of_square_of_four_digits{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a four digit number: ");
		int num=scan.nextInt();
		int digit4=num%10;
		num/=10;
		int digit3=num%10;
		num/=10;
		int digit2=num%10;
		num/=10;
		int digit1=num%10;
		num/=10;
		int sum=digit1*digit1+digit2*digit2+digit3*digit3+digit4*digit4;
		System.out.println("The sum of square of four digit number is: "+sum);
	}
}