package metodosThread;

public class MyThreadClass extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread name is: "+Thread.currentThread().getName()+" valor: "+i+" Prioridade:"+Thread.currentThread().getPriority()+" ID: "+Thread.currentThread().getId());
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}*/
		}
	}
}
