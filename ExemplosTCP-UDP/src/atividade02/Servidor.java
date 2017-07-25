package atividade02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345);
		
		// recebendo
		Socket conexao = server.accept();
		InputStream is = conexao.getInputStream();
		System.out.println("Recebido do cliente: "+(char) is.read());
		
		// enviando
		OutputStream os = conexao.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.write(66);
		
		server.close();
		conexao.close();
	}
}
