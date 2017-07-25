package tcpIpEjemploBasico;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 4500);
			// enviando
			ObjectOutputStream output = new ObjectOutputStream(cliente.getOutputStream());
			output.writeObject("Ol� servidor!");
			// recebendo
			ObjectInputStream input = new ObjectInputStream(cliente.getInputStream());
			System.out.println("Recebendo mensagem do servidor");
			String msg = (String)input.readObject();
			System.out.println(msg);
			cliente.close();
			System.out.println("Conex�o encerrada!");
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
