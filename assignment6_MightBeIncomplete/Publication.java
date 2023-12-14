import java.util.Scanner;
class Publication{
	String title;
	float price;
	Scanner scan=new Scanner(System.in);
	public static void main(String args[]){

	}	
}
class Book extends Publication{
	int page;
	void getData(){

		System.out.print("Enter page.no: ");
		page=scan.nextInt();
	}
	void putData(){
		System.out.println("Page no: "+page);
	}
}
class CDROM extends Publication{
	int playTime;
	void getData(){
		System.out.print("Enter the play time : ");
		playTime=scan.nextInt();
	}
	void putData(){
		System.out.println("Play time: "+playTime);
	}
}