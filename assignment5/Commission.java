import java.util.Scanner;
class Commission{
	long salesAmount;
	double commissionRate,commissionAmount;
	public static void main(String args[]){
		Commission c1=new Commission();
		c1.getData();
		c1.commission_rate();
		c1.calc_commission();
		System.out.println("Sales amount: "+c1.salesAmount+"\nCommission rate: "+(c1.commissionRate*100)+"%\nComission amount: "+c1.commissionAmount);
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the sales amount: ");
		salesAmount=scan.nextLong();
	}

	void commission_rate(){
		if(salesAmount>0){
			if(salesAmount<=100000){
				commissionRate=0.10;
			}else if(salesAmount<=250000){
				commissionRate=0.12;
			}else if(salesAmount<=500000){
				commissionRate=0.15;
			}else if(salesAmount<=750000){
				commissionRate=0.18;
			}else{
				commissionRate=0.20;
			}
		}
	}

	void calc_commission(){
		commissionAmount=salesAmount*commissionRate;
	}
}