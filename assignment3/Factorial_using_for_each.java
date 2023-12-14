import java.util.Scanner;
class Factorial_using_for_each{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term: ");
		int n=scan.nextInt();
		int fact=1;
		int[] a=new int[n];
		for(int i : a){
			fact*=n;
			n--;
		}
		System.out.println("Factoria:"+fact);
	}
}