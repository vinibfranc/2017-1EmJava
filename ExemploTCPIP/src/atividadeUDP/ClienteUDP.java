package atividadeUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;

public class ClienteUDP {
	public static void main(String[] args) {
		String mensagem = "Solicita o ip do servidor";
		byte[] data = mensagem.getBytes();
		int porta = 1234;
		String ip = "255.255.255.255";
		
		try {
			DatagramSocket cliente = new DatagramSocket();
			InetAddress addr = InetAddress.getByName(ip);
			DatagramPacket enviando = new DatagramPacket(data, data.length, addr, porta);
			cliente.send(enviando);
			
			byte[] receive = new byte[1024];
			DatagramPacket recebendo = new DatagramPacket(receive, receive.length, addr, porta);
			cliente.receive(recebendo);
			
			String ipServidor = recebendo.getAddress().toString();
			System.out.println("IP do servidor: "+ipServidor);
			
			cliente.close();
			
		} catch (Exception e) {
			
		}
	}
}
