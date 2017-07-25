package udpIp.revisao2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClienteUDP {
	public static void main(String[] args) throws UnknownHostException {
		try {
			DatagramSocket cliente = new DatagramSocket();
			byte[] dadosRecebidos = new byte[1024];
			byte[] dadosEnviados = new byte[1024];
			System.out.println("Digite uma mensagem para o servidor: ");
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			String mensagem = bw.readLine();
			dadosEnviados = mensagem.getBytes();
			// enviando
			InetAddress end = InetAddress.getLocalHost();
			int porta = 1234;
			DatagramPacket pacoteEnviado = new DatagramPacket(dadosEnviados, dadosEnviados.length, end, porta);
			cliente.send(pacoteEnviado);
			
			// recebendo 
			DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length);
			cliente.receive(pacoteRecebido);
			System.out.println("Mensagem enviada pelo servidor: "+new String(pacoteRecebido.getData()));
			
			cliente.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
