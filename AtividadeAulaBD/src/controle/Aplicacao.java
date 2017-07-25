package controle;

import java.awt.EventQueue;

import modelo.Empregado;
import visao.TelaEmpregado;

public class Aplicacao {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEmpregado telaE = new TelaEmpregado();
					Empregado e = new Empregado();
					EmpregadoControle empC = new EmpregadoControle(telaE, e);
					telaE.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
