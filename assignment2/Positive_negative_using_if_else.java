import java.util.Scanner;
class Positive_negative_using_if_else{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		if(num>0){
			System.out.println("The number is positve.");
		}else{
			System.out.println("The number is negative.");
		}
	}
}