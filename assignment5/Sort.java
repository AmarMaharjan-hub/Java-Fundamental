import java.util.Scanner;
class Sort{
	int[] numbers;
	int n;
	public static void main(String args[]){
		Sort s1=new Sort();
		s1.getData();
		s1.sorting();
		s1.dispData();
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the nth term of the series: ");
		n=scan.nextInt();
		numbers=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++){
			numbers[i]=scan.nextInt();
		}
	}

	void sorting(){
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(numbers[i]>numbers[j]){
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
	}

	void dispData(){
		System.out.println("Ascending order:");
		for(int i=0;i<n;i++){
			System.out.print(numbers[i]+"\t");
		}
	}
}