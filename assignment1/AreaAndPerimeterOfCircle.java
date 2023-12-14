import java.util.Scanner;
public class AreaAndPerimeterOfCircle{
	final static float PI=3.1416f;
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the radius:");
		int radius=scan.nextInt();
		float perimeter=(float)(2*PI*radius);
		float area=(float)(PI*radius*radius);
		System.out.println("The perimeter is:"+perimeter);
		System.out.println("The area is:"+area);	
	}
}
