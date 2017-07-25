package tcpIp.helloWorld;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost",1234);
			// cliente recebe mensagem do servidor (hello world)
			DataInputStream in = new DataInputStream(cliente.getInputStream());
			String msgServer = in.readUTF();
			System.out.println(msgServer);
			// cliente manda mensagem ao servidor (rand)
			DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
			double rand = Math.random();
			out.writeDouble(rand);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
