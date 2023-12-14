class CreateThread implements Runnable{
	public void run(){
		System.out.println("This executes in the new thread.");
	}
}
class ThreadExample2{
	public static void main(String args[]){
		CreateThread c1=new CreateThread();
		Thread t1=new Thread(c1);
		t1.start();
		System.out.println("This executes in the thread main.");
	}
}