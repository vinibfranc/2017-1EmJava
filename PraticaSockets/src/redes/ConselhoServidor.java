package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServidor {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			System.out.println("Esperando conexão...");
			while(true) {
				Socket socket = server.accept();
				System.out.println("Conexão aceita na porta"+socket.getPort()+" do servidor com IP: "+socket.getInetAddress());
				PrintWriter w = new PrintWriter(socket.getOutputStream());
				w.println("Aprenda Java e seja contratado!");
				w.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
