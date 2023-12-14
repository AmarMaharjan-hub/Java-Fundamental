import java.util.Scanner;
public class Celcuis_to_farenheit{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the temperature in Celcuis:");
		float celcuis=scan.nextFloat();
		float farenheit=(celcuis*1.8f)+32;
		System.out.println("The degree in farenheit is:"+farenheit);
	}
}