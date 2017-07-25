package atividade02UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServidorUDP {
	public static void main(String[] args) {
		try {
			DatagramSocket server = new DatagramSocket(1222);
			byte[] buffer = new byte[1024];
			while(true) {
				DatagramPacket peticao = new DatagramPacket(buffer, buffer.length);
				try {
					server.receive(peticao);
					System.out.println("IP: "+peticao.getAddress());
					System.out.println("Porta: "+peticao.getPort());
					System.out.println("Mensagem: "+new String(peticao.getData(),0,peticao.getLength()));
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
