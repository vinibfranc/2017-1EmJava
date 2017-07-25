package PrintWriterEBuffReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Cliente {
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 1234);
			BufferedReader br = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
			br.read();
			System.out.println("Data: "+br.read());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
