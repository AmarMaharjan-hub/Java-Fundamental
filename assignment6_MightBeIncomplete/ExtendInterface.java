interface First{
	void firstMethod();	
}
interface Second extends First{
	void secondMethod();
}
class ExtendInterface implements Second{
	public static void main(String args[] ){
		ExtendInterface e1=new ExtendInterface();
		e1.firstMethod();
		e1.secondMethod();		
	}
	public void firstMethod(){
		System.out.println("This is the method of first interface.");
	}
	public void secondMethod(){
		System.out.println("This is the method of second interface.");
	}
}