package atividade;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	public static void main(String[] args) {
		try {
			
			Socket cliente = new Socket("localhost",1234);
			Scanner scan = new Scanner(cliente.getInputStream());
			System.out.println("Entre um número:");
			int num = scan.nextInt();
			PrintWriter pw = new PrintWriter(cliente.getOutputStream());
			pw.println(num);
			int temp = scan.nextInt();
			System.out.println(temp);
			cliente.close();
			scan.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
