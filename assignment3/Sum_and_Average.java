import java.util.Scanner;
class Sum_and_Average{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term in series: ");
		int n=scan.nextInt();
		int sum=0,num;
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			num=scan.nextInt();
			sum+=num;
		}
		float avg=(float)sum/n;
		System.out.println("The sum is: "+sum+"\nThe average is: "+avg);
	}
}