import java.util.Scanner;
class Dollar_in_rupees{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the dollar: ");
		float dollar=scan.nextFloat();
		float rupees=dollar*113.90f;
		System.out.println("$ "+dollar+" is equal to Rs "+rupees);
	}
}