package atividadeUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServidorUDP {

	public static void main(String[] args) {
		try {
			DatagramSocket server = new DatagramSocket(1234);
			byte[] receivedData = new byte[1024];
			
			DatagramPacket bufRecebimento = new DatagramPacket(receivedData, receivedData.length);
			server.receive(bufRecebimento);
			
			String msg = new String(bufRecebimento.getData());
			System.out.println(msg);
			
			DatagramPacket bufEnvio = new DatagramPacket(receivedData, receivedData.length, bufRecebimento.getAddress(), bufRecebimento.getPort());
			server.send(bufEnvio);
			
			server.close();
		} catch (Exception e) {
			
		}
	}

}
