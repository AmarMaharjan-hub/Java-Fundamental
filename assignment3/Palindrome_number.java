import java.util.Scanner;
class Palindrome_number{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int copy=num,rem,rev=0;
		while(num!=0){
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(copy==rev){
			System.out.println("The number is Palindrome.");
		}else{
			System.out.println("The number is not Palindrome.");
		}
	}
}