package metodos2Threads;

public class ThreadMethods {
	public static void main(String[] args) {
		System.out.println("Start of the main");
		System.out.println("Thread named: "+Thread.currentThread().getName());
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Running inside the thread");
				}
				
			}
		});
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of the main");
		
	}
}
