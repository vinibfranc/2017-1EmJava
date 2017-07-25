package atividade;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	public static void main(String[] args) {
		try {
			while(true) {
				ServerSocket server = new ServerSocket(1234);
				Socket ss = server.accept();
				Scanner in = new Scanner(ss.getInputStream());
				int n = in.nextInt();
				int temp = n*2;
				PrintWriter pw = new PrintWriter(ss.getOutputStream());
				pw.println(temp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
