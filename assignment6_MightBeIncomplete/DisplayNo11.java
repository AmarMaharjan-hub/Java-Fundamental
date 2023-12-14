import java.util.Scanner;
abstract class College{
	int college_id;
	String college_name;
	abstract void get();
	abstract void put();
}
class Student extends College{
	int roll;
	String name,address;
	void get(){
		Scanner scan=new Scanner(System.in);
		Scanner input=new Scanner(System.in);
		System.out.print("Enter college name: ");
		college_name=input.nextLine();
		System.out.print("Enter college id: ");
		college_id=scan.nextInt();
		System.out.print("Enter student name: ");
		name=input.nextLine();
		System.out.print("Enter roll no: ");
		roll=scan.nextInt();
		System.out.print("Enter address: ");
		address=input.nextLine();
	}
	void put(){
		System.out.println("\n\nCollege: "+college_name+"\nCollege Id: "+college_id+"\nStudent: "+name+"\nRoll no: "+roll+"\nAddress: "+address);
	}
}
class DisplayNo11{
	public static void main(String args[]){
		Student s1=new Student();
		s1.get();
		s1.put();
	}
}