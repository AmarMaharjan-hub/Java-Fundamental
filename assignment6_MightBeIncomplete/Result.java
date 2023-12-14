import java.util.Scanner;
class Student{
	int rollNo;
	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the roll no:");
		rollNo=scan.nextInt();
		}
	void display(){
		System.out.println("\nRoll no of the student:"+rollNo);
	}
}
class Test extends Student{
	int java,web;
	void getData(){
		Scanner scan=new Scanner(System.in);
		super.getData();
		System.out.println("Enter marks of Java and Web: ");
		java=scan.nextInt();
		web=scan.nextInt();
	}
	void display(){
		super.display();
		System.out.println("Marks obtained in:\nJava: "+java+"\nweb: "+web);
	}
}
class Result extends Test{
	int total;
	void calculateTotal(){
		total=java+web;
	}
	void displayTotal(){
		System.out.println("Total marks:"+total);
	}
	public static void main(String args[]){
		Result result=new Result();
		result.getData();
		result.calculateTotal();
		result.display();
		result.displayTotal();
	}
}