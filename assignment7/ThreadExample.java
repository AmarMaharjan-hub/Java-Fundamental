class CreationOfThread extends Thread{
	public void run(){
		System.out.println("This executes in the new thread.");
	}
}
class ThreadExample{
	public static void main(String args[]){
		CreationOfThread c1=new CreationOfThread();
		c1.start();
		System.out.println("This executes in the main thread.");
	}
}