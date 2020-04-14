package practice;

public class Thread_Demo implements Runnable{
	public String name;
	Thread myThread;
	Thread_Demo(String name1){
		this.name = name1;
	}
	
	@Override
	public void run() {
		for( int i = 0 ; i<4; i++) {
			System.out.println("Thread name: " + name + "count "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void start() {
		System.out.println("Thread started: " + name );
		if (myThread == null) {
			myThread = new Thread(this,name);
			myThread.start();
		}
	}	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Demo td = new Thread_Demo("1st Thread is running");
		Thread_Demo td1 = new Thread_Demo ("2nd thread is running");
		td.start();
		td1.start();

	}













	

}
