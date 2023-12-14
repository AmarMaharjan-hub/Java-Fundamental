import java.util.Scanner;
class Triangle{
	int base,height;
	double area;
	public static void main(String args[]){
		Triangle t1=new Triangle();
		t1.getData();
		t1.calcArea();
		t1.display();
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the base: ");
		base=scan.nextInt();
		System.out.print("Enter the height: ");
		height=scan.nextInt();
	}

	void calcArea(){
		area=0.5*base*height;
	}

	void display(){
		System.out.println("The area of the triangle is: "+area);
	}
}