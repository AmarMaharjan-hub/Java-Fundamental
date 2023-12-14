import java.util.Scanner;
class Account{
	Scanner scan=new Scanner(System.in);
	String customer_name,account_type;
	int account_number=101;
	double balance;
}
class SavingAccount extends Account{
	
	public static void main(String args[]){
		SavingAccount s=new SavingAccount();
		System.out.print("Enter your name: ");
		s.customer_name=s.scan.nextLine();
		System.out.print("Enter account type: ");
		s.account_type=s.scan.nextLine();
		s.deposit();
		s.displayBalance();
		s.withdraw();
	}
	void displayBalance(){
		System.out.println("\nDisplaying Balance\nUser: "+customer_name+"\nBalance: "+balance);
	}
	void withdraw(){
		System.out.print("\nEnter withdraw amount:");
		double withdraw=scan.nextFloat();
		balance-=withdraw;
		System.out.println("Updated balance: "+balance);
	}
	void deposit(){
		System.out.println("Enter your deposit amount: ");
		double amount=scan.nextFloat();
		balance+=amount;
		System.out.println("Updated balance: "+balance);
	}
}