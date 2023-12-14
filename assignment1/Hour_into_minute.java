import java.util.Scanner;
class Hour_into_minute{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the hour:");
		float hour=scan.nextFloat();
		float minute=hour*60;
		System.out.println(hour+" hrs is equal to "+minute+" min");
	}
}