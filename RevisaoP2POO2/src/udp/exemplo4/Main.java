package udp.exemplo4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		int port = 5000;
		ServidorUDP server = new ServidorUDP(port);
		ClienteUDP cliente = new ClienteUDP(port);
		
		ExecutorService exec = Executors.newFixedThreadPool(2);
		exec.submit(cliente);
		exec.submit(server);
	}
}
