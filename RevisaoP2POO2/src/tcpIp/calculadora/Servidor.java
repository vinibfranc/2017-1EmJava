package tcpIp.calculadora;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1234);
			while(true) {
				Socket con = server.accept();
				DataInputStream in = new DataInputStream(con.getInputStream());
				int n1 = in.readInt();
				int n2 = in.readInt();
				String op = in.readUTF();
				double result = calcula(n1,n2,op);
				System.out.println(result);
				
				DataOutputStream out = new DataOutputStream(con.getOutputStream());
				out.writeDouble(result);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static double calcula(int x, int y, String op) {
		double resp = 0;
		if(op.equals("*")) {
			resp = x*y;
		} else if(op.equals("/")) {
			resp = x/y;
		} else if(op.equals("-")) {
			resp = x-y;
		} else if(op.equals("+")) {
			resp = x+y;
		} else {
			System.out.println("Digite um operador válido!");
		}
		return resp;
	}
}
