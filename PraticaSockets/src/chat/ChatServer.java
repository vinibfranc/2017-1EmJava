package chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {
	private Socket socket;
	
	public ChatServer() {
		
		ServerSocket server;
		try {
			server = new ServerSocket(5000);
			while(true) {
				socket = server.accept();
				new Thread (new EscutaCliente(socket)).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private class EscutaCliente implements Runnable {
		Scanner leitor;
		public EscutaCliente(Socket s) throws IOException {
			try {
				leitor = new Scanner(s.getInputStream());
			} catch (Exception e) {}
		}
		@Override
		public void run() {
			try {
				String texto;
				while((texto = leitor.nextLine()) != null) {
					System.out.println(texto);
				}
			} catch (Exception e) {}
			
		}
		
	}

	public static void main(String[] args) {
		new ChatServer();
	}

}
