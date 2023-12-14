import java.util.Scanner;
public class Volume_of_cuboid{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of rectangle:");
		int length=scan.nextInt();
		System.out.print("Enter the breadth of cuboid:");
		int breadth=scan.nextInt();
		System.out.print("Enter the height of cuboid:");
		int height=scan.nextInt();
		int volume=length*breadth*height;
		System.out.println("The volume is:"+volume);
	}
}