import java.util.Scanner;
class Ascending_array{
	public static void main(String args[]){
		int[] num=new int[10];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ten numbers:");
		for(int i=0;i<10;i++){
			num[i]=scan.nextInt();
		}
		System.out.println("Ascending order:");
		for(int i=0;i<10;i++){
			for(int j=i+1;j<10;j++){
				if(num[i]>num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for(int i=0;i<10;i++){
			System.out.println(num[i]);
		}
	}
}