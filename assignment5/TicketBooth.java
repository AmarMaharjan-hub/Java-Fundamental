import java.util.Scanner;
class TicketBooth{
	int noOfPeopleVisited;
	double totalAmount,ticketPrice=2.50;
	
	TicketBooth(){

	}

	public static void main(String args[]){
		TicketBooth t1=new TicketBooth();
		Char breaker='n',peopleVisit;
		for(int i=1;breaker=='n';i++){
			System.out.print("Person: "+i+"\tTicket sold(y/n)?: ");
			peopleVisit=scan.next().charAT(0);
			if(peopleVisit=='y'){
				t1.ticketSold();
			}else{
				t1.ticketNotSold();
			}
			System.out.print("Close booth(y/n): ");
			breaker=scan.next().char(0);
			if(breaker=='y'){
				break;
			}else if(breaker=='n'){
				continue;
			}
			
		}
		t1.dispAllData();
		t1.
		
	}

	void ticketSold(){
		noOfPeopleVisited++;
		totalAmount+=ticketPrice;
	}

	void ticketNotSold(){
		noOfPeopleVisited++;
	}
}