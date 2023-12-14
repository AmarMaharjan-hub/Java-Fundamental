import java.util.Scanner;
class PercentageOfStudent{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter student's name:");
		String name=scan.nextLine();
		System.out.println("Enter marks of :");
		System.out.print("Stat:");
		float stat=scan.nextFloat();
		System.out.print("A/c:");
		float account=scan.nextFloat();
		System.out.print("Web:");
		float web=scan.nextFloat();
		System.out.print("Java:");
		float java=scan.nextFloat();
		System.out.print("Co:");
		float co=scan.nextFloat();
		float percentage=((stat+account+web+java+co)/500)*100;
		System.out.println("Percentage of "+name+" is "+percentage+"%");
	}
}