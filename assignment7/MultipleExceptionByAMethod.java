class MultipleExceptionByAMethod{
	public static void main(String args[])throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int[] arr={2,3,2,6,7};
		try{
			System.out.println(10/0);
			System.out.println(arr[10]);
		}catch(ArithmeticException e){
			System.out.println(10/1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(arr[3]);
		}
	}
}