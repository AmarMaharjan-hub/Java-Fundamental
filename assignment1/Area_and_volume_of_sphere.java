import java.util.Scanner;
class Area_and_volume_of_sphere{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		float pi=3.1416f;
		System.out.print("Enter the radius of the sphere:");
		float radius=scan.nextFloat();
		float volume=(float)(4*pi*radius*radius*radius)/3;
		float area=4*pi*radius*radius;
		System.out.println("The volume of the sphere is: "+volume+" and the area of the sphere is: "+area);
	}
}