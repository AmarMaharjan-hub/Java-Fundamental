import java.util.Scanner;
class Sum_of_natural_numbers_using_for{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term: ");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}
}