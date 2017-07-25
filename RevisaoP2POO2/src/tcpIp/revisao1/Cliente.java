package tcpIp.revisao1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost",5555);
			/*DataInputStream entrada = new DataInputStream(cliente.getInputStream());
			entrada.readUTF();
			ObjectInputStream ois = new ObjectInputStream(cliente.getInputStream());
			ois.readUTF();*/
			BufferedReader bw = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			String msg = bw.readLine();
			System.out.println("Mensagem mandada pelo servidor: "+msg);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
