import java.util.Scanner;
class Tax_on_annual_salary{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your salary: ");
		int salary=scan.nextInt();
		float tax,endSalary;
		salary*=12;
		if(salary<100000)
		{
			tax=(float)(salary*0)/100;
			endSalary=salary-tax;
		}else if(salary<150000)
		{
			tax=(float)(salary*15)/100;
			endSalary=salary-tax;
		}else
		{
			tax=(float)(salary*25)/100;
			endSalary=salary-tax;
		}
		System.out.print("The final amount received is:"+endSalary);
	}
}