import java.util.Scanner;
abstract class Lecturer{
	Scanner scan=new Scanner(System.in);
	int id;
	String name;
	abstract void getData();
	abstract void putData();
}
class PartTime extends Lecturer{
	float payPerHour;
	void getData(){
		System.out.print("Enter name:");
		name=scan.nextLine();
		System.out.print("Enter your Id:");
		id=scan.nextInt();
		System.out.print("Enter pay per hour:");
		payPerHour=scan.nextFloat();
	}
	void putData(){
		System.out.println("Name:"+name+"\nID:"+id+"\nPay per hour:"+payPerHour);
	}
}
class FullTime extends Lecturer{
	float payPerMonth;
	void getData(){
		System.out.print("Enter name:");
		name=scan.nextLine();
		System.out.print("Enter your Id:");
		id=scan.nextInt();
		System.out.print("Enter pay per month:");
		payPerMonth=scan.nextFloat();
	}
	void putData(){
		System.out.println("Name:"+name+"\nID:"+id+"\nPay per month:"+payPerMonth);
	}
}
class DisplayNo6{
	public static void main(String args[]){
		PartTime pt=new PartTime();
		FullTime ft=new FullTime();
		pt.getData();
		pt.putData();
		ft.getData();
		ft.putData();
	}
}