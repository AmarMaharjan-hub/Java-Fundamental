import java.util.Scanner;
class Math{
	int num1,num2;
	void input(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter num1 and num2:");
		num1=scan.nextInt();
		num2=scan.nextInt();
	}
}
class Add extends Math{
	int sum;
	void sum(){
		input();
		sum=num1+num2;
	}
	void display(){
		System.out.println("Sum: "+sum);
	}
}
class Sub extends Math{
	int diff;
	void diff(){
		input();
		diff=num1-num2;
	}
	void display(){
		System.out.println("Difference: "+diff);
	}
}
class Mul extends Math{
	int mul;
	void mul(){
		input();
		mul=num1*num2;
	}
	void display(){
		System.out.println("Product: "+mul);
	}
}
class Div extends Math{
	float div;
	void div(){
		input();
		div=(float)num1/num2;
	}
	void display(){
		System.out.println("Division: "+div);
	}
}
class Rem extends Math{
	int rem;
	void rem(){
		input();
		rem=num1%num2;
	}
	void display(){
		System.out.println("Remainder: "+rem);
	}
}
class Display{
	public static void main(String args[]){
		Add a=new Add();
		a.sum();
		a.display();
		Sub s=new Sub();
		s.diff();
		s.display();
		Mul m=new Mul();
		m.mul();
		m.display();
		Div d=new Div();
		d.div();
		d.display();
		Rem r=new Rem();
		r.rem();
		r.display();
	}
}