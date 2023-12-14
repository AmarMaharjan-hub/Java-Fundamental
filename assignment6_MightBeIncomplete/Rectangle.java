import java.util.Scanner;
class Square{
	Scanner scan=new Scanner(System.in);
	double length;
	double area(){
		double area=length*length;
		return area;
	}
	double perimeter(){
		double perimeter=4*length;
		return perimeter;
	}
	void display(){
		System.out.print("Enter length of Square: ");
		length=scan.nextDouble();
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter());
	}
}

class Rectangle extends Square{
	double length,breadth;
	double area(){
		double area=length*breadth;
		return area;
	}

	double perimeter(){
		double perimeter=2*(length+breadth);
		return perimeter;
	}
	void display(){
		super.display();
		System.out.println("Enter length and breadth of rectangle:");
		length=scan.nextDouble();
		breadth=scan.nextDouble();
		System.out.println("Area: "+area()+"\nPerimeter: "+perimeter());
	}
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
//		super.display();
		r1.display();
	}
}