import java.util.Scanner;
class Prime_number_form_hundered_to_five_hundered{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Prime numbers from 100 to 500 are:");
		int temp=1;
		for(int i=100;i<=500;i++){
			temp=1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					temp=0;
					break;
				}
			}
			if(temp==1){
				System.out.println(i);
			}
		}
	}
}