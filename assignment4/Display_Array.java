import java.util.Scanner;
class Display_Array{
	public static void main(String args[]){
		int[] num;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term:");
		int n=scan.nextInt();
		num=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		System.out.println("Numbers you entered are:");
		for(int i=0;i<n;i++){
			System.out.println(num[i]);
		}
	}
}