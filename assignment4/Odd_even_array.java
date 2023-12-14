import java.util.Scanner;
class Odd_even_array{
	public static void main(String args[]){
		int[] num;
		int odd=0,even=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=scan.nextInt();
		num=new int[size];
		System.out.println("Enter the numbers:");
		for(int i=0;i<size;i++){
			num[i]=scan.nextInt();
			if(num[i]%2==0){
				even++;
			}else{
				odd++;
			}
		}
		System.out.println("Odd:"+odd+"\nEven:"+even);
	}
}