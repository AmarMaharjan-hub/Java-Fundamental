import java.util.Scanner;
import java.lang.Math;
class Series_of_nth_order_one{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term: ");
		int n=scan.nextInt();
		System.out.print("Enter the number: ");
		int num=scan.nextInt();
		int fact=1;
		double sum=0,power;
		for(int i=0;i<n;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
			}
			power=Math.pow(num,i);
			sum+=(double)(power/fact);
		}
		System.out.println("Sum= "+sum);
	}
}