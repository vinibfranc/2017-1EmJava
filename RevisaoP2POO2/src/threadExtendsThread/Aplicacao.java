package threadExtendsThread;

public class Aplicacao {
	public static void main(String[] args) {
		ThreadComExtends t = new ThreadComExtends();
		t.start();
		ThreadComExtends t2 = new ThreadComExtends();
		t2.start();
	}
}
