import java.util.Scanner;
class Odd_even_using_if_else{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		if(num%2==0){
			System.out.println("The number is even.");
		}else{
			System.out.println("The number is odd.");
		}
	}
}