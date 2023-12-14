class FinallyExample{
	public static void main(String args[]){
		try{
			System.out.println(10/0);
		}catch(NullPointerException e){
			System.out.println("This block won't be executed.");
		}finally{
			System.out.println("This finally block will always be executed.");
		}
	}
}