import java.util.Scanner;
class Calculator{
	int a,b;
	public static void main(String args[]){
		Calculator c1=new Calculator();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		c1.a=scan.nextInt();
		c1.b=scan.nextInt();
		int sum=c1.addition();
		int difference=c1.subtraction();
		int product=c1.multipication();
		float division=c1.division();
		System.out.println("Sum: "+sum+"\nDifference: "+difference+"\nProduct: "+product+"\ndivision: "+division);
	}

	int addition(){
		int sum=a+b;
		return sum;
	}

	int subtraction(){
		int difference=a-b;
		return difference;
	}

	int multipication(){
		int product=a*b;
		return product;
	}

	float division(){
		float division=(float)a/b;
		return division;
	}
}