import java.util.Scanner;
class IntAmount{
	double principle,interest,amount;
	float rate;
	int time;
	public static void main(String args[]){
		IntAmount i1=new IntAmount();
		i1.getData();
		i1.interest();
		i1.amount();
		System.out.println("Interest: "+i1.interest+"\nAmount: "+i1.amount);
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the principle: ");
		principle=scan.nextDouble();
		System.out.print("Enter the rate: ");
		rate=scan.nextFloat();
		System.out.print("Enter the time: ");
		time=scan.nextInt();
	}

	void interest(){
		interest=(principle*rate*time)/100;
	}

	void amount(){
		amount=principle*(1+rate*time);
	}
}