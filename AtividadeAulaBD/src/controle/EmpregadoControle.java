package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dao.EmpregadoDAO;
import modelo.Empregado;
import visao.TelaEmpregado;

public class EmpregadoControle implements ActionListener {
	private TelaEmpregado telaEmp;
	private Empregado emp;
	private EmpregadoDAO empDAO;
	
	public EmpregadoControle(TelaEmpregado telaEmp, Empregado emp) {
		super();
		this.telaEmp = telaEmp;
		this.emp = emp;
		registraListeners();
	}

	public void registraListeners() {
		this.telaEmp.getBtnConsultar().addActionListener(this);
	}
	
	public String consultarEmpregado(Empregado e) {
		empDAO = new EmpregadoDAO();
		String nome = empDAO.consultarNomeEmpregadoBanco(e.getCodigo());
		return nome;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Consultar")) {
			emp.setCodigo(Integer.parseInt(this.telaEmp.getTxtCodigo().getText()));
			String nome = consultarEmpregado(emp);
			System.out.println(nome);
			this.telaEmp.getLabelEmp().setText(nome);
			this.telaEmp.setVisible(true);
		}
		
	}
}
