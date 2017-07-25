package atividade09;

public class ThreadSemaforo implements Runnable {
	private CorSemaforo cor;
	private boolean parar;
	private boolean corMudou;

	public ThreadSemaforo() {
		this.cor = CorSemaforo.VERMELHO;
		this.parar = false;
		this.corMudou = false;
		new Thread(this).start();
	}

	@Override
	public void run() {
		try {
			while(!parar) {
				/*switch(this.cor) {
				case VERMELHO:
					Thread.sleep(2000);
					break;	
				case AMARELO:
					Thread.sleep(300);
					break;
				case VERDE:
					Thread.sleep(1000);
					break;
				default:
					break;
				}*/
				Thread.sleep(this.cor.getTempoEspera());
				this.mudarCor();
				
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private synchronized void mudarCor() throws InterruptedException {
		switch (this.cor) {
		case VERMELHO:
			this.cor = CorSemaforo.VERDE;
			break;
		case AMARELO:
			this.cor = CorSemaforo.VERMELHO;
			break;
		case VERDE:
			this.cor = CorSemaforo.AMARELO;
			break;
		default:
			break;
		}
		this.corMudou = true;
		notify();
	}

	public synchronized void esperaCorMudar() throws InterruptedException {
		while(!this.corMudou) {
			wait();
		}
		this.corMudou = false;
	}
	
	public synchronized void desligarSemaforo() {
		this.parar = true;
	}
	
	public CorSemaforo getCor() {
		return cor;
	}

	public void setCor(CorSemaforo cor) {
		this.cor = cor;
	}
	
	
}
