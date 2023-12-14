import java.util.Scanner;
class Reverse_of_four_digits{
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
		int reverse=digit1+digit2*10+digit3*100+digit4*1000;
		System.out.println("The reverse of four digit number is: "+reverse);
	}
}