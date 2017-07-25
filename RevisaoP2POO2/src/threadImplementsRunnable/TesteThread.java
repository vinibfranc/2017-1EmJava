package threadImplementsRunnable;

public class TesteThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadImplements());
		Thread t2 = new Thread(new ThreadImplements());
		t1.start();
		t2.start();
	}
}
