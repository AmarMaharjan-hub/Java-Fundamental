import java.util.Scanner;
class Box{
	int height,width,depth;
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		Box b1=new Box();
		System.out.print("Enter the height: ");
		b1.height=scan.nextInt();
		System.out.print("Enter the width: ");
		b1.width=scan.nextInt();
		System.out.print("Enter the depth: ");
		b1.depth=scan.nextInt();
		int area=b1.area();
		int volume=b1.volume();
		System.out.println("Area: "+area);
		System.out.println("Volume: "+volume);
	}

	int area(){
		int area=2*height*width+2*width*depth+2*depth*height;
		return(area);
	}

	int volume(){
		int volume=height*width*depth;
		return(volume);
	}
}