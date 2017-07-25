package threadImplementsRunnable;

public class ThreadImplements implements Runnable {

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getId()+" Valor: "+i);
				Thread.sleep(100);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
