import java.util.Scanner;
class Centimeter_into_meter{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the centimeter:");
		float centimeter=scan.nextFloat();
		float meter=centimeter/100;
		System.out.println(centimeter+" centimeters is equal to "+meter+" meters");
	}
}