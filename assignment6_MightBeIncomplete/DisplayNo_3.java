class Square{
	int length=10;
	double area(){
		double area=length*length;
		return area;
	}
	double perimeter(){
		double perimeter=4*length;
		return perimeter;
	}
}
class Rectangle extends Square{
	int length=5,breadth=6;
	double area(){
		double area=length*breadth;
		return area;
	}
	double perimeter(){
		double perimeter=2*(length+breadth);
		return perimeter;
	}
}
class DisplayNo_3{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		System.out.println("Area: "+r1.area());
		System.out.println("Perimeter: "+r1.perimeter());
	}
}