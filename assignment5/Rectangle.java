import java.util.Scanner;
class Rectangle{
	int length,breadth,area,perimeter;
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		r1.readData();
		r1.area();
		r1.perimeter();
		r1.display();
	}

	void readData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length: ");
		length=scan.nextInt();
		System.out.print("Enter the breadth: ");
		breadth=scan.nextInt();
	}

	void area(){
		area=length*breadth;
	}

	void perimeter(){
		perimeter=2*(length+breadth);
	}

	void display(){
		System.out.println("The area is "+area);
		System.out.println("The Perimeter is "+perimeter);
	}
}