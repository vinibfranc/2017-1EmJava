package tcpIpClienteServerBasico;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class Servidor {
	public static void main(String[] args) {
		System.out.println("[Iniciando o servidor]");
		try {
			ServerSocket server = new ServerSocket(2525);
			System.out.println("[Aguardando conexão]");
			Socket cliente = server.accept();
			System.out.println("[Conexão estabelecida]");
			InputStream input = cliente.getInputStream();
			java.io.OutputStream output = cliente.getOutputStream();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(input));
			PrintStream out = new PrintStream(output);
			
			while(true) {
				String mensagem = in.readLine();
				System.out.println("Mensagem recebida do cliente ["+cliente.getInetAddress().getHostName()+"]"+mensagem);
				
				if("FIM".equals(mensagem)) {
					break;
				}
				out.println("[Encerrando conexão!]");
				in.close();
				out.close();
				cliente.close();
				System.out.println("[Encerrando servidor]");
				server.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
