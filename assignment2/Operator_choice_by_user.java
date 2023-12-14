import java.util.Scanner;
class Operator_choice_by_user{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int result1;
		float result2;
		System.out.print("Enter the first number: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		int num2=scan.nextInt();
		System.out.println("Options:");
		System.out.println("c. Sum\nd. Difference\ne. Multipication\nf. Division");
		System.out.print("Choose an action from option above: ");

//		String data=scan.nextLine();
//		char action=data.charAT(0);

//		char action=scan.next.charAT(0);

//		char action = scan.findInLine(".").charAt(0);

		char action = scan.next(".").charAt(0);

		switch(action)
		{
			case 'c':
			{
				result1=num1+num2;
				System.out.println("Sum: "+result1);
				break;
			}
			case 'd':
			{
				result1=num1-num2;
				System.out.println("Difference: "+result1);
				break;
			}
			case 'e':
			{
				result1=num1*num2;
				System.out.println("Multipication: "+result1);
				break;
			}
			case 'f':
			{
				result2=(float)num1/num2;
				System.out.println("Division: "+result2);
				break;
			}
			default:
			{
				System.out.println("The input is out of option.");
			}
		}
	}
}