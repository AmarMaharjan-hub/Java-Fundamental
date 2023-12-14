import java.util.Scanner;
interface Shape{
	void getData();
	void displayArea();
}
class Rectangle implements Shape{
	Scanner scan=new Scanner(System.in);
	double length,breadth;
	public void getData(){
		System.out.println("Enter length and breadth: ");
		length=scan.nextDouble();
		breadth=scan.nextDouble();
	}
	public void displayArea(){
		System.out.println("Area: "+(length*breadth));
	}
	
}
class Triangle implements Shape{
	Scanner scan=new Scanner(System.in);
	double area,height,base;
	public void getData(){
		System.out.println("\n Enter the base and height: ");
		base=scan.nextDouble();
		height=scan.nextDouble();
	}
	public void displayArea(){
		area=0.5*base*height;
		System.out.println("Area: "+area);
	}
}
class DisplayNo12{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		Triangle t1=new Triangle();
		r1.getData();
		r1.displayArea();
		t1.getData();
		t1.displayArea();
	}
}