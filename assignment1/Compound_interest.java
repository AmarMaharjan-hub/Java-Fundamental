import java.util.Scanner;
import java.lang.Math;
class Compound_interest{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the principal (P) (in Rs):");
		int principal=scan.nextInt();
		System.out.print("Enter the rate (R) (in percentage):");
		float rate=scan.nextFloat();
		rate=rate/100;
		System.out.print("Enter the time (T) (in yrs):");
		int time=scan.nextInt();
		System.out.print("Enter the number of times interest compounded yearly (n):");
		int interestCompoundedYearly=scan.nextInt();
		double compoundInterest=principal*Math.pow(1+rate/interestCompoundedYearly,interestCompoundedYearly*time);
		System.out.println("The compound interest is: "+compoundInterest);
	}
}