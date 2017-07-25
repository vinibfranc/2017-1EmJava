package tcpIp.calculadora;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost",1234);
			System.out.println("Digite um número inteiro:");
			Scanner scan = new Scanner(System.in);
			DataOutputStream out = new DataOutputStream(cliente.getOutputStream());
			int x = scan.nextInt();
			out.writeInt(x);
			System.out.println("Digite outro número inteiro:");
			int y = scan.nextInt();
			out.writeInt(y);
			System.out.println("Digite a operação entre os números: ");
			String op = scan.next();
			out.writeUTF(op);
		
			DataInputStream in = new DataInputStream(cliente.getInputStream());
			double resposta = in.readDouble();
			System.out.println("Resultado: "+resposta);
			scan.close();
			cliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
