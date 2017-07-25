package tcpIpClienteServerBasico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import org.omg.CORBA.portable.OutputStream;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Iniciando cliente");
		System.out.println("Iniciando conexão");
		try {
			Socket con = new Socket("localhost", 2525);
			System.out.println("Conexão estabelecida");
			
			InputStream input = con.getInputStream();
			java.io.OutputStream output = con.getOutputStream();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			PrintStream out = new PrintStream(output);
			
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.println("Digite uma mensagem:");
				String mensagem = scan.nextLine();
				
				out.println(mensagem);
				if("FIM".equals(mensagem)) {
					break;
				}
				mensagem = in.readLine();
				System.out.println("Mensagem recebida do servidor "+mensagem);
			}
			
			System.out.println("Encerrando conexão");
			in.close();
			out.close();
			con.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
