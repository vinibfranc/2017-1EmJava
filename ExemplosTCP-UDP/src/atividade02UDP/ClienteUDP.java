package atividade02UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class ClienteUDP {
	public static void main(String[] args) throws IOException {
		String msg = JOptionPane.showInputDialog("Entre a mensagem a enviar");
		DatagramSocket cliente = new DatagramSocket();
		byte[] enviando = msg.getBytes();
		InetAddress endereco = InetAddress.getByName("127.0.0.1");
		int porta = 1222;
		DatagramPacket pacoteEnviado = new DatagramPacket(enviando, enviando.length, endereco, porta);
		cliente.send(pacoteEnviado);
		
		
	}
}
