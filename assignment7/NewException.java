class NewException extends Throwable{
	public static void main(String args[]){
		try{
			throw new NewException();
		}catch(NewException e){
			System.out.println("Catching new user defined exception.");
		}

	}
}