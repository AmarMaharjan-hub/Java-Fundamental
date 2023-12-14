import java.util.Scanner;
class Square{
	static int num;
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		num=scan.nextInt();
		square();
		System.out.println("Square: "+num);
	}

	static void square(){
		num*=num;
	}
}