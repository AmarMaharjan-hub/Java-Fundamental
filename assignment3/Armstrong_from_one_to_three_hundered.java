class Armstrong_from_one_to_three_hundered{
	public static void main(String args[]){
		System.out.println("Armstrong numbers from 1-300: ");
		int sum=0;
		for(int i=1;i<=300;i++){
			sum=0;
			int rem,copy=i;
			while(copy!=0){
				rem=copy%10;
				copy/=10;
				sum+=(rem*rem*rem);
			}
			if(sum==i){
				System.out.println(sum);
			}
		}
	}
}