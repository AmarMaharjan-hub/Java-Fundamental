import java.util.Scanner;
class Odd_even_using_termary_operator{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int result=num%2==0? 1:0;
		if(result==1)
		{
			System.out.println("The number is even");
		}else{
			System.out.println("The number is odd");
		}
		
	}
}