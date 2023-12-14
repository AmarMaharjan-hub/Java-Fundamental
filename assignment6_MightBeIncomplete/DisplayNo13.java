import java.util.Scanner;
interface College{
	int college_id=101;
	String college_name="NCCS";
	void get();
	void put();
}
class Student1 implements College{
	int roll,collegeId;
	String name,address,collegeName;
	public void get(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter student name: ");
		name=scan.nextLine();
		System.out.print("Enter address: ");
		address=scan.nextLine();
		System.out.print("Enter roll no: ");
		roll=scan.nextInt();
	}
	public void put(){
		System.out.println("\nCollege name: "+college_name+"\nCollege id: "+college_id+"\nStudent name: "+name+"\nRoll no: "+roll+"Address: "+address);
	}
}
class DisplayNo13{
	public static void main(String args[]){
		Student1 s1=new Student1();
		s1.get();
		s1.put();
	}
}