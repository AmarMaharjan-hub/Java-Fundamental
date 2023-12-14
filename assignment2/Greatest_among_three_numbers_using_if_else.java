import java.util.Scanner;
class Greatest_among_three_numbers_using_if_else{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.print("Enter the third number: ");
		int num3=scan.nextInt();
		if(num1>num2){
			if(num1>num3){
				System.out.println(num1+" is the greatest number");
			}else{
				System.out.println(num3+" is the greatest number");
			}
		}else if(num2>num3){
				System.out.println(num2+" is the greatest number");
			}else{
				System.out.println(num3+" is the greatest number");
			}
	}
}