import java.util.Scanner;
class Search_array{
	public static void main(String args[]){
		int[] num;
		int temp=1;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term:");
		int n=scan.nextInt();
		num=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		System.out.print("Search number:");
		int search=scan.nextInt();
		for(int i=0;i<n;i++){
			if(search==num[i]){
				System.out.println("Search found on index "+i);
				temp=0;
				break;
			}
		}
		if(temp==1){
			System.out.println("Search not found.");
		}
	}
}