package tcpIpEjemploBasico;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(4500);
			Socket con = server.accept();
			// recebendo
			ObjectInputStream input = new ObjectInputStream(con.getInputStream());
			System.out.println("Objeto chegou do cliente ao servidor");
			String msg = (String)input.readObject();
			System.out.println(msg);
			// enviando
			ObjectOutputStream output = new ObjectOutputStream(con.getOutputStream());
			output.writeObject("Olá, cliente!");
			System.out.println("Mensagem enviada!");
			con.close();
			server.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
