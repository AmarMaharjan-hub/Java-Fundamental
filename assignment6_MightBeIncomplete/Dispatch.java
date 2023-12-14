class A{
	void show(){
		System.out.println("This is super class A.");
	}
}
class B extends A{
	void show(){
		System.out.println("This is subclass B.");
	}
}
class Dispatch{
	public static void main(String args[]){
		A a1=new B();
		a1.show();
	}
}