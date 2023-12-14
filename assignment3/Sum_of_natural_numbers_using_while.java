import java.util.Scanner;
class Sum_of_natural_numbers_using_while{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term: ");
		int n=scan.nextInt();
		int sum=0,i=1;
		while(i<=n){
			sum+=i;
			i++;
		}
		System.out.println("Sum: "+sum);
	}
}