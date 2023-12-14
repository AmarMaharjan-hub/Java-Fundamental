import java.util.Scanner;
class Circle{
	int radius;
	double area;
	public static void main(String args[]){
		Circle c1=new Circle();
		c1.getData();
		c1.calcArea();
		c1.display();
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the radius: ");
		radius=scan.nextInt();
	}

	void calcArea(){
		double pi=3.1416;
		area=pi*radius*radius;
	}

	void display(){
		System.out.println("The area of the circle is: "+area);
	}
}