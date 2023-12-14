import java.util.Scanner;
class Sum_of_digit{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int rem,sum=0;
		while(num!=0){
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("Sum: "+sum);
	}
}