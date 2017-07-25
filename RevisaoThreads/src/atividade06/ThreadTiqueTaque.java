package atividade06;

public class ThreadTiqueTaque implements Runnable {
	TiqueTaque tt;
	Thread t;
	final int NUM = 5;

	public ThreadTiqueTaque(String nome, TiqueTaque tt) {
		super();
		this.tt = tt;
		t = new Thread(nome);
		t.start();
	}
	
	@Override
	public void run() {
		if(t.getName().equals("Tique")) {
			for(int i=0; i<NUM; i++) {
				tt.tique(true);
			}
			tt.tique(false);
		} else {
			for(int i=0; i<NUM; i++) {
				tt.taque(true);
			}
			tt.tique(false);
		}
		
	}
	
}
