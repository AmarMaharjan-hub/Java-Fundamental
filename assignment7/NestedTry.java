class NestedTry{
	public static void main(String args[]){
		try{
			try{
				System.out.println(5/0);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("This block won't be exeuted.");
			}

		}catch(ArithmeticException e){
			System.out.println(10/1);
		}
	}
}