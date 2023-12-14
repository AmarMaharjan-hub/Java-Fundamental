import java.util.Scanner;
public class Area_and_perimeter_of_rectangle{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		int length=scan.nextInt();
		System.out.print("Enter the breadth of rectangle:");
		int breadth=scan.nextInt();
		int area=length*breadth;
		int perimeter=2*(length+breadth);
		System.out.println("The area is:"+area);
		System.out.println("The perimeter is:"+perimeter);
	}
}