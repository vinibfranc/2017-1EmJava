package redes;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ConselhoCliente {
	public static void main(String[] args) {
		try {
			// 0 - 1023 não devem ser usadas (são reservadas)
			Socket socket = new Socket("localhost", 5000);
			Scanner scan = new Scanner(socket.getInputStream());
			System.out.println("Mensagem: "+scan.nextLine());
			scan.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
