import java.util.Scanner;
class Area_of_triangle{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the height of triangle:");
		int height=scan.nextInt();
		System.out.print("Enter the base of triangle:");
		int base=scan.nextInt();
		float area=(float)(height*base)/2;
		System.out.println("The area of triangle is: "+area);
	}
}