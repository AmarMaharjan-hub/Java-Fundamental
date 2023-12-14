import java.util.Scanner;
public class Days_to_year_month_and_days{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the days(as years):");
		int DaysAsYears=scan.nextInt();
		int temp=DaysAsYears%365;
		int year=DaysAsYears/365;
		int month=temp/30;
		int day=temp%30;
		System.out.println(DaysAsYears+" days is equal to "+year+"years "+month+"month "+day+"days");
	}
}