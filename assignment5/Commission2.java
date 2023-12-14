import java.util.Scanner;
class Commission2{
	long salesAmount;
	double commissionRate,commissionAmount;

	Commission2(){

	}

	public static void main(String args[]){
		Commission2 c1=new Commission2();
		double sum=0;
		for(int i=0;i<10;i++){
			c1.getData();
			c1.commission_rate();
			c1.calc_commission();
			sum+=c1.commissionAmount;
		}
		System.out.println("Total commission earned: "+sum);
		
	}

	void getData(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the sales amount: ");
		salesAmount=scan.nextLong();
	}

	void commission_rate(){
		if(salesAmount>0){
			if(salesAmount<=20000){
				commissionRate=0.10;
			}else if(salesAmount<=50000){
				commissionRate=0.15;
			}else{
				commissionRate=0.20;
			}
		}
	}

	void calc_commission(){
		commissionAmount=salesAmount*commissionRate;
	}
}