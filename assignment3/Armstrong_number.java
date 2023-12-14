import java.util.Scanner;
class Armstrong_number{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int copy=num,rem,sum=0;
		while(num!=0){
			rem=num%10;
			sum+=(rem*rem*rem);
			num/=10;
		}
		if(copy==sum){
			System.out.println("The number is armstrong.");
		}else{
			System.out.println("The number is not armstrong.");
		}
	}
}