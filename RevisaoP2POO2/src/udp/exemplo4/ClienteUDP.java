package udp.exemplo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ClienteUDP implements Runnable {
	private final int porta;
	
	
	public ClienteUDP(int porta) {
		super();
		this.porta = porta;
	}


	@Override
	public void run() {
		try {
			DatagramSocket cliente = new DatagramSocket(porta);
			byte[] buffer = new byte[2048];
			cliente.setSoTimeout(3000);
			while(true) {
				DatagramPacket dataPack = new DatagramPacket(buffer, buffer.length);
				cliente.receive(dataPack);
				
				String mensagemRecebida = new String(dataPack.getData());
				System.out.println(mensagemRecebida);
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Timeout. Cliente está fechando!");
		}
		
	}

}
