import java.util.Scanner;
class Sum_of_natural_numbers_using_for_each{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term: ");
		int n=scan.nextInt();
		int sum=0,count=1;

		int[] a=new int[n];
		for(int i:a){
			sum+=count;
			count++;
		}
		
		System.out.println("Sum: "+sum);
	}
}