import java.util.Scanner;
class PercentageOfStudentWithDivision{
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
		System.out.print(name+"'s division: ");
		if(percentage>=0){
			if(percentage<=31){
				System.out.println("Fail");
			}else if(percentage<=44){
				System.out.println("Third Division");
			}else if(percentage<=59){
				System.out.println("Second Division");
			}else if(percentage<=79){
				System.out.println("First Division");
			}else if(percentage<=100){
				System.out.println("Distinction");
			}
		}
	}
}