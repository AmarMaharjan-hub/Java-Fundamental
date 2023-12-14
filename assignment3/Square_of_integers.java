import java.util.Scanner;
class Square_of_integers{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int sq;
		System.out.println("Square of integers from 1-100 except number divisible by 11: ");
		for(int i=1;i<=100;i++){
			if(i%11==0){
				continue;
			}
			sq=i*i;
			System.out.println(sq);
		}
	}
}