class Parent{
	int a=5;
	Parent(){
		System.out.println("Using super method to access parent class constructor");
	}
	void PMethod(){
		System.out.println("This is parent class.");
		System.out.println("Using super keyword to access parent class method.");
	}
}
class Child extends Parent{
	int a=10;
	Child(){
		super();
	}
	void CMethod(){
		System.out.println("This is child class.");
		System.out.println("Using keyword super to access parent variable\na: "+super.a);
		super.PMethod();
	}
	void PMethod(){
		System.out.println("This is child class.");
	}
	public static void main(String args[]){
		Child c=new Child();
		c.CMethod();		
	}
}