import java.util.Scanner;
class Discount{
	double purchaseAmount,discountRate,discountAmount;
	public static void main(String args[]){
		Discount d1=new Discount();
		System.out.print("Enter the purchase amount: ");
		d1.getData();
		d1.discountRate();
		d1.calcDiscount();
		d1.dispData();
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		purchaseAmount=scan.nextDouble();		
	}

	void discountRate(){
		if(purchaseAmount>0){
			if(purchaseAmount<=10000){
				discountRate=0.10;
			}else if(purchaseAmount<=25000){
				discountRate=0.12;
			}else if(purchaseAmount<=50000){
				discountRate=0.15;
			}else if(purchaseAmount<=75000){
				discountRate=0.20;
			}
		}
	}

	void calcDiscount(){
		discountAmount=discountRate*purchaseAmount;
	}

	void dispData(){
		System.out.println("Purchase amount: "+purchaseAmount+"\nDiscount rate: "+(discountRate*100)+"%\nDiscount amount: "+discountAmount);
	}
}