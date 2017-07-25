package tcpIp.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorChat {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1234);
			Socket conexao = server.accept();
			
			DataInputStream din = new DataInputStream(conexao.getInputStream());
			DataOutputStream dout = new DataOutputStream(conexao.getOutputStream());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String msgIn="", msgOut="";
			
			while(!msgIn.equals("sair")) {
				msgIn = din.readUTF();
				System.out.println("Cliente: "+msgIn); // imprime mensagem do cliente
				
				System.out.println("Digite uma mensagem: ");
				msgOut = br.readLine();
				dout.writeUTF(msgOut);
				dout.flush();
			}
			conexao.close();
			server.close();
		} catch (IOException e) {
			System.out.println("Conexão finalizada!");
		}
		
	}
}
