import java.util.Scanner;
class Display_four_digit_searately{
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
		System.out.println("The four digits of the number are:\n"+digit1+"\n"+digit2+"\n"+digit3+"\n"+digit4);
	}
}