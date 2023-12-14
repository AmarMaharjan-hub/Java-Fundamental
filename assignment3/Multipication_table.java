import java.util.Scanner;
class Multipication_table{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Displaying the multipication table of: ");
		int num=scan.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}