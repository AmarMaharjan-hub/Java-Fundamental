import java.util.Scanner;
import java.lang.Math;

class ThreeSideTriangleArea{
	
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		int side1,side2,side3;
		float perimeter,area;
		
		System.out.println("Enter the 1st side of triangle: ");
		side1=scan.nextInt();
		
		System.out.println("Enter the 2nd side of triangle: ");
		side2=scan.nextInt();
		
		System.out.println("Enter the 3rd side of triangle: ");
		side3=scan.nextInt();
		
		perimeter=(float)(side1+side2+side3)/2;
		area=(float)Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
		
		
		System.out.println("The area of the triangle is: "+area);
	}
}