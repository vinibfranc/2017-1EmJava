package tcpIp.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClienteChat {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost",1234);
			DataInputStream din = new DataInputStream(cliente.getInputStream());
			DataOutputStream dout = new DataOutputStream(cliente.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgIn="",msgOut="";
			while(!msgIn.equals("sair")) {
				System.out.println("Digite uma mensagem: ");
				msgOut = br.readLine();
				dout.writeUTF(msgOut);
				dout.flush();
				
				msgIn = din.readUTF();
				System.out.println("Servidor: "+msgIn); // imprime mensagem do servidor
			}
			cliente.close();
		} catch (IOException e) {
			System.out.println("Conexão finalizada!");
		}
	}
}
