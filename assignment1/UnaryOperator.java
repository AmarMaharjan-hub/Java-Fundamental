class UnaryOperator{
	public static void main(String args[]){
		int num1=10,num2=0;
		char character='m';
		System.out.println("Value of num1,num2 and character:"+num1+", "+num2+" and "+character);
		num2=num1++;
		character++;
		System.out.println("After  post-increment(num2=num1++)\nnum1:"+num1+"\nnum2:"+num2+"\ncharacter:"+character);
		num2=++num1;
		++character;
		System.out.println("After  pre-increment\nnum1:"+num1+"\nnum2:"+num2+"\ncharacter:"+character);
		num2=num1--;
		character--;
		System.out.println("After  post-decrement\nnum1:"+num1+"\nnum2:"+num2+"\ncharacter:"+character);
		num2=--num1;
		--character;
		System.out.println("After  pre-decrement\nnum1:"+num1+"\nnum2:"+num2+"\ncharacter:"+character);
	}
}