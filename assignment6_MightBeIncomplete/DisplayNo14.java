import java.util.Scanner;
interface Publication{
	int price=1200;
	String title="Printers";
	void getData();
	void display();
}
interface Sale{
	int publishSales=12;
	void getData();
	void display();
}
class Book implements Sale,Publication{
	Scanner scan=new Scanner(System.in);
	int pages;
	public void getData(){
		System.out.print("Enter pages in a book:");
		pages=scan.nextInt();
	}
	public void display(){
		System.out.println("Title: "+title+"\nPrice: "+price+"\nPublish sales: "+publishSales+"\nPages:"+pages);
	}
}
class DisplayNo14{
	public static void main(String args[]){
		Book b1=new Book();
		b1.getData();
		b1.display();
	}
}