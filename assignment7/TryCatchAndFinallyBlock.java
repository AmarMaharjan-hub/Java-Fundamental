class TryCatchAndFinallyBlock{
	public static void main(String args[]){
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println(10/1);
		}finally{
			System.out.println("Handling arithmetic exception");
		}
	}
}