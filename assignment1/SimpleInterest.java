import java.util.Scanner;
public class SimpleInterest{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the principle:");
		int principle=scan.nextInt();
		System.out.print("Enter the rate:");
		float rate=scan.nextFloat();
		System.out.print("Enter the time(in yrs):");
		int time=scan.nextInt();
		float SI=(float)((principle*rate*time)/100.0);
		System.out.println("The simple interest is:"+SI);
	}
}
