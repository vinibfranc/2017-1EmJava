package aula5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJDialog extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JDialog diag;
	private JLabel lab,labelMensagem;
	private JButton btnUp, btnDown;
	private static ExemploJDialog frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ExemploJDialog();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExemploJDialog() {
		setTitle("JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		labelMensagem = new JLabel("Dire\u00E7\u00E3o Pendente");
		labelMensagem.setFont(new Font("Tahoma", Font.BOLD, 18));
		labelMensagem.setBounds(12, 13, 178, 16);
		contentPane.add(labelMensagem);
		
		JButton buttonMostrarDilogo = new JButton("Mostrar Di\u00E1logo");
		buttonMostrarDilogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diag.setVisible(true);
			}
		});
		buttonMostrarDilogo.setBounds(12, 51, 149, 25);
		contentPane.add(buttonMostrarDilogo);
		
		JButton buttonRedefinirDireo = new JButton("Redefinir Direção");
		buttonRedefinirDireo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				labelMensagem.setText("Direção Pendente");
				labelMensagem.setFont(new Font("Tahoma", Font.BOLD, 18));
			}
		});
		buttonRedefinirDireo.setBounds(163, 51, 149, 25);
		contentPane.add(buttonRedefinirDireo);
		
		diag= new JDialog(frame,"Direção", true);
		diag.setSize(200, 100);
		diag.getContentPane().setLayout(new FlowLayout());
		
		lab= new JLabel("Pressione um botão");
		btnUp= new JButton("Up");
		btnDown= new JButton("Down");
		btnUp.addActionListener(this);
		btnDown.addActionListener(this);
		
		
		diag.getContentPane().add(btnUp);
		diag.getContentPane().add(btnDown);
		diag.getContentPane().add(lab);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("Up"))
		{
			labelMensagem.setText("Direção para cima");
			diag.setVisible(false);
		}
		else if(e.getActionCommand().equals("Down"))
		{
			labelMensagem.setText("Direção para baixo");
			diag.setVisible(false);
		}
		else if(e.getActionCommand().equals("Redefinir Direção"))
		{
			labelMensagem.setText("Direção Pendente");
		}
		
	}
}

