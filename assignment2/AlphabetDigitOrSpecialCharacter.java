import java.util.Scanner;
class AlphabetDigitOrSpecialCharacter{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a character: ");
		char character=scan.next().charAT(0);
		if(character>=65&&character<=90 || character>=97&&character<=122)
		{
			System.out.println("It is an alphabet.");
		}else if(character>=48 && character<=57)
		{
			System.out.println("It is a digit.");
		}else
		{
			System.out.println("It is an special character.");
		}
	}
}