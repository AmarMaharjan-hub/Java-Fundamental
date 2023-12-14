import java.util.Scanner;
public class Area_and_perimeter_of_square{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of square:");
		int length=scan.nextInt();
		int area=length*length;
		int perimeter=4*length;
		System.out.println("The area is:"+area);
		System.out.println("The perimeter is:"+perimeter);
	}
}