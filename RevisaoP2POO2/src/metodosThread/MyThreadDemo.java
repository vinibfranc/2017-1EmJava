package metodosThread;

public class MyThreadDemo {
	public static void main(String[] args) {
		MyThreadClass t1 = new MyThreadClass();
		MyThreadClass t2 = new MyThreadClass();
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY); // NORM_PRIORITY e LOW_PRIORITY
		t1.setName("MyThread 1");
		t2.setName("MyThread 2");
		try {
			t1.setDaemon(true);
		} catch (Exception e) {
			//e.printStackTrace();
		}
		//t1.yield();
		/* try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} */
		t2.start();
	}
}
