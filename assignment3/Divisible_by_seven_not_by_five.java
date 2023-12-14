import java.util.Scanner;
class Divisible_by_seven_not_by_five{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Number divisible by 7 but not by 5: ");
		int count=0;
		for(int i=100;i<=200;i++){
			if(i%7==0 && i%5!=0){
				System.out.println(i);
				++count;
			}
		}
		System.out.println("There are "+count+"numbers from 100 to 200 divisible by 7 but not by 5");
	}
}