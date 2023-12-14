import java.util.Scanner;
class Power{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers x and y: ");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int power=1;
		for(int i=0;i<num2;i++){
			power*=num1;
		}
		System.out.println("value of x^y: "+ power);
	}
}