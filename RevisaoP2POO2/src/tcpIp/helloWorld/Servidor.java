package tcpIp.helloWorld;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(1234);
			while(true) {
				Socket conexao = servidor.accept();
				// servidor envia mensagem ao cliente (hello world)
				DataOutputStream out = new DataOutputStream(conexao.getOutputStream());
				out.writeUTF("hello world");
				// servidor recebe mensagem do cliente (rand)
				DataInputStream in = new DataInputStream(conexao.getInputStream());
				double msgCliente = in.readDouble();
				System.out.println(msgCliente);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
