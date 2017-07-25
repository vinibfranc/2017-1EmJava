package PrintWriterEBuffReader;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Servidor {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(1234);
			while(true) {
				Socket con = server.accept();
				PrintWriter pw = new PrintWriter(con.getOutputStream());
				Date data = new Date();
				//SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
				//formatador.format(data);
				pw.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
