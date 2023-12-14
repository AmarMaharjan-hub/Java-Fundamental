class Sum_of_odd_and_even{
	public static void main(String args[]){
		int odd=0,even=0;
		for(int i=1;i<=100;i++){
			if(i%2==0){
				even+=i;
			}else{
				odd+=i;
			}
		}
		System.out.println("Sum of odd numbers(1-100): "+odd);
		System.out.println("Sum of even numbers(1-100): "+even);
	}
}