package atividade04;

public class MinhaThreadRunnable implements Runnable {
	private String nome;
	private int tempo;
	
	public MinhaThreadRunnable(String n, int t) {
		this.nome = n;
		this.tempo = t;
		//Thread th = new Thread(this);
		//th.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome+" contador "+i);
				Thread.sleep(tempo);
			}	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome+" finalizou a execução!");
	}

}
