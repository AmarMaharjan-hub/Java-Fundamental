import java.util.Scanner;
class Leapyear_between{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Leap year from 1800-2000: ");
		for(int i=1800;i<=2000;i++){
			if(i%4==0 && i%100!=0 || i%400==0){
				System.out.println(i);
			}
		}
	}
}