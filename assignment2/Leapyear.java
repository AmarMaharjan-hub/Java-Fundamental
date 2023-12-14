import java.util.Scanner;
class Leapyear{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=scan.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("The year is a leapyear.");
				}else
				{
					System.out.println("The year is not a leapyear.");
				}
			}else
			{
				System.out.println("The year is a leapyear.");
			}
		}else
		{
			System.out.println("The year is not a leapyear.");
		}
	}
}