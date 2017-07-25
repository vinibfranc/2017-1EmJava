package tcpIp.revisao1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		ServerSocket server;
		Socket socket;
		try {
			server = new ServerSocket(5555);
			while(true) {
				socket = server.accept();
				/*DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
				saida.writeUTF("hello world");
				saida.flush();*/
				/*ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeUTF("hello world");
				oos.flush();*/
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				pw.println("hello world");
				pw.flush();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
