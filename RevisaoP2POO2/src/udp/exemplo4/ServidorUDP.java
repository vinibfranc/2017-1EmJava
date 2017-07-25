package udp.exemplo4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ServidorUDP implements Runnable{
	private final int clientPort;

	public ServidorUDP(int clientPort) {
		super();
		this.clientPort = clientPort;
	}
	@Override
	public void run() {
		try {
			DatagramSocket ds = new DatagramSocket(5000);
			for (int i = 0; i < 3; i++) {
				String mensagem = "Número da mensagem: "+i;
				DatagramPacket dataPack = new DatagramPacket(mensagem.getBytes(), mensagem.length(), InetAddress.getLocalHost(),clientPort);
				ds.send(dataPack);
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
