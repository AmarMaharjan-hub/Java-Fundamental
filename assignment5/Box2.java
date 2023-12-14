import java.util.Scanner;
class Box2{
	double height,depth,width;
	public Box2(double h,double d, double w){

	}

	public static void main(String args[]){
		Box2 b1=new Box2(6,7,9);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the height, depth, width:");
		b1.height=scan.nextDouble();
		b1.depth=scan.nextDouble();
		b1.width=scan.nextDouble();
		double area=b1.area();
		double volume=b1.volume();
		System.out.println("Area: "+area+"\nVolume: "+volume);
	}

	double area(){
		double area=2*height*width+2*width*depth+2*depth*height;
		return(area);
	}

	double volume(){
		double volume=height*width*depth;
		return(volume);
	}
}