package myPackage;

public class ArithmeticOperations{
	public int sub(int a,int b){
		int sub=a-b;
		return sub;
	}
	public int multiply(int a,int b){
		int product=a*b;
		return product;
	}
	public float division(int a,int b){
		float div=(float)a/b;
		return div;
	}
	public int factorial(int a){
		int fact=1;
		for(int i=1;i<=a;i++){
			fact*=i;
		}
		return fact;
	}
	public int square(int a,int b){
		int square=1;
		for(int i=0;i<b;i++){
			square*=a;
		}
		return square;
	}
}