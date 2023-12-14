import java.util.Scanner;
class Prime_number{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=scan.nextInt();
		int temp=1;
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				temp=0;
				break;
			}
		}
		if(temp==1){
			System.out.println("It is a prime number.");
		}else{
			System.out.println("It is not a prime number.");
		}
	}
}