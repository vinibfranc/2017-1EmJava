package tcpIp.codigoFacilito1;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Conector {
	ServerSocket server;
	Socket socket;
	int porta = 9000;
	DataOutputStream saida;
	BufferedReader entrada;
	
	public void iniciar() {
		try {
			server = new ServerSocket(porta);
			socket = server.accept();
			
			entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String mensagem = entrada.readLine();
			System.out.println(mensagem);
			
			saida = new DataOutputStream(socket.getOutputStream());
			saida.writeUTF("Adeus, mundo!");
			socket.close();
		} catch (Exception e) {
			
		}
	}
}
