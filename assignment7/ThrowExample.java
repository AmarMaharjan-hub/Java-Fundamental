class ThrowExample extends Throwable{
	public static void main(String args[]){
		throw new ArithmeticException("/ by zero.");
	}
}