package atividade02;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente {
	public static void main(String[] args) {
		byte[] data = null;
		
		try {
			Socket cliente = new Socket("localhost",12345);
			// enviando
			OutputStream os = cliente.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.write(65);
			
			// recebendo
			InputStream is = cliente.getInputStream();
			System.out.println("Recebendo de servidor: "+(char)is.read());
			
			cliente.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
