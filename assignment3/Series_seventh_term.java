class Series_seventh_term{
	public static void main(String args[]){
		int fact=1;
		float sum=0;
		for(int i=1;i<=7;i++){
			fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
			}
			sum+=(float)i/fact;
		}
		System.out.println("Sum: "+sum);
	}
}