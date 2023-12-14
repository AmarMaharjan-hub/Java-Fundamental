import java.util.Scanner;
class Smallest_among_four_numbers_using_if_else{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.print("Enter the third number: ");
		int num3=scan.nextInt();
		System.out.print("Enter the fourth number: ");
		int num4=scan.nextInt();
		if(num1<num2){
			if(num3<num4){
				if(num1<num3){
					System.out.println(num1+" is the smallest number");
				}else{
					System.out.println(num3+" is the smallest number");
				}
			}else if(num1<num4){
				System.out.println(num1+" is the smallest number");
			}else{
				System.out.println(num4+" is the smallest number");
			}
		}else if(num3<num4){
			if(num2<num3){
				System.out.println(num2+" is the smallest number");
			}else{
				System.out.println(num3+" is the smallest number");
			}
		}else if(num2<num4){
			System.out.println(num2+" is the smallest number");
		}else{
			System.out.println(num4+" is the smallest number");
		}
	}
}