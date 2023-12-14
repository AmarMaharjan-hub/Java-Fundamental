import java.util.Scanner;
abstract class Fmachine{
	abstract void getData();
	abstract void putData();
}
class Airplane extends Fmachine{
//	Scanner scan=new Scanner(System.in);
	int code,capacity;
	String name;
	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter name:");
		name=scan.nextLine();
		System.out.print("Enter code:");
		code=scan.nextInt();
		System.out.print("Enter capacity:");
		capacity=scan.nextInt();
	}
	void putData(){
		System.out.println("\nName: "+name+"\nCode: "+code+"\nCapacity: "+capacity);
	}
}
class DisplayNo10{
	public static void main(String args[]){
		Airplane a1=new Airplane();
		a1.getData();
		a1.putData();
	}
}