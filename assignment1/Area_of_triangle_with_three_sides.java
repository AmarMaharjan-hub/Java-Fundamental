import java.util.Scanner;
import java.lang.Math;
class Area_of_triangle_with_three_sides{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first  side of triangle: ");
		int sideA=scan.nextInt();
		System.out.print("Enter the second  side of triangle: ");
		int sideB=scan.nextInt();
		System.out.print("Enter the third  side of triangle: ");
		int sideC=scan.nextInt();
		float perimeter=(float)(sideA+sideB+sideC)/2;
		float area=(float)Math.sqrt(perimeter*(perimeter-sideA)*(perimeter-sideB)*(perimeter-sideC));
		System.out.println("The area of the triangle is: "+area);
	}
}