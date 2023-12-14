 interface Arithmetic{
	void add();
	void subtract();
}
abstract class PartialImplementation implements Arithmetic{
	public void add(){
		System.out.println("Partially implementing method add but not subtract.");
	}
}
class FullImplementation extends PartialImplementation{
	public void subtract(){
		System.out.println("Implementing method subtract after extending class PartialImlementation.");
	}
	public static void main(String args[]){
		FullImplementation f1=new FullImplementation();
		f1.add();
		f1.subtract();
	}
}