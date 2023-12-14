import java.util.Scanner;
class Fibonacci_tenth_term{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Fibonacci series upto 10th term: ");
		int num1=1,num2=0,temp;
		for(int i=0;i<10;i++){
			num1+=num2;
			System.out.println(num1);
			temp=num2;
			num2=num1;
			num1=temp;
		}
	}
}