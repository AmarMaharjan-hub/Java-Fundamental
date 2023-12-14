import java.util.Scanner;
class Factorial_using_do_while{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=scan.nextInt();
		int fact=1;
		do{
			fact*=num;
			num--;
		}while(num!=0);
		System.out.println("Factorial: "+fact);
	}
}