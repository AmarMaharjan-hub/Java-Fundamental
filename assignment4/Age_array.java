import java.util.Scanner;
class Age_array{
	public static void main(String args[]){
		int[] num;
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term:");
		int n=scan.nextInt();
		num=new int[n];
		System.out.println("Enter the age:");
		for(int i=0;i<n;i++){
			num[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			if(num[i]>=25 && num[i]<=40){
				count++;
			}
		}
		System.out.println("There are "+count+" people of age(25-40).");
	}
}