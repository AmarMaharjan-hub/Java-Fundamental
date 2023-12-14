interface Outside{
	void outsideMethod();
	interface Inside{
		void insideMethod();
	}
}
class NestedInterface implements Outside.Inside{
	public static void main(String args[]){
		NestedInterface n1=new NestedInterface();
		n1.insideMethod();
		n1.outsideMethod();
	}
	public void insideMethod(){
		System.out.println("This is the method of nested interface.");
	}
	public void outsideMethod(){
		System.out.println("This is the method of outside interface.");
	}
}