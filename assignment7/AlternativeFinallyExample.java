class AlternativeFinallyExample{
	public static void main(String args[]){
		try{
			System.out.println(10/0);
		}finally{
			System.out.println("finaly used as an alternative for catch block.");
		}
	}
}