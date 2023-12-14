import java.util.Scanner;
class Sphere{
	double r,a,v;
	public static void main(String args[]){
		Sphere s1=new Sphere();
		s1.getData();	
		s1.area();
		s1.volume();
		s1.dispData();
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the r: ");
		r=scan.nextDouble();
	}

	void area(){
		double pi=3.1416;
		a=4*pi*r*r;
	}

	void volume(){
		double pi=3.1416;
		v=1.3333*pi*r*r*r;
	}

	void dispData(){
		System.out.println("radius: "+r+"\nArea: "+a+"\nVolume: "+v);
	}
}