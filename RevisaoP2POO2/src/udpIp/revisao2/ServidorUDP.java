package udpIp.revisao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServidorUDP {
	public static void main(String[] args) throws SocketException {
		try {
			while(true) {
				DatagramSocket server = new DatagramSocket(1234);
				byte[] dadosRecebidos = new byte[1024];
				byte[] dadosEnviados = new byte[1024];
				
				// recebendo
				DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
				server.receive(pacoteRecebido);
				System.out.println("Mensagem mandada pelo cliente: "+new String(pacoteRecebido.getData()));
				
				// enviando
				String ok = "Mensagem enviada com sucesso!";
				dadosEnviados = ok.getBytes();
				InetAddress end = pacoteRecebido.getAddress();
				int porta = 1234;
				DatagramPacket pacoteEnviado = new DatagramPacket(dadosEnviados, dadosEnviados.length, end, porta);
				server.send(pacoteEnviado);
				
				server.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
