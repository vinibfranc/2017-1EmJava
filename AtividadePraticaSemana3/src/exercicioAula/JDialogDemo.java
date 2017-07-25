package exercicioAula;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JDialogDemo extends JFrame {
	private JPanel contentPane;
	private JLabel lblDirecaoPendente;
	private JButton btnMostrarDialogo;
	private JButton btnRedefinirDirecao;
	private JDialog diag;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogDemo frame = new JDialogDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public JDialogDemo() {
		setTitle("JDialog Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDirecaoPendente = new JLabel("Dire\u00E7\u00E3o Pendente");
		lblDirecaoPendente.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDirecaoPendente.setBounds(87, 11, 211, 34);
		contentPane.add(lblDirecaoPendente);
		
		btnMostrarDialogo = new JButton("Mostrar Di\u00E1logo");
		btnMostrarDialogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diag.setVisible(true);
			}
		});
		btnMostrarDialogo.setBounds(24, 71, 141, 23);
		contentPane.add(btnMostrarDialogo);
		
		btnRedefinirDirecao = new JButton("Redefinir Dire\u00E7\u00E3o");
		btnRedefinirDirecao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDirecaoPendente.setText("Direção Pendente");
			}
		});
		btnRedefinirDirecao.setBounds(175, 71, 161, 23);
		contentPane.add(btnRedefinirDirecao);
		
		diag = new JDialog(this, false);
		diag.setTitle("Direção");
		diag.setSize(190, 100);
		diag.getContentPane().setLayout(new FlowLayout());
		
		JButton btnUp = new JButton("Up");
		JButton btnDown = new JButton("Down");
		JLabel lblMes = new JLabel("Pressione um botão:");
		diag.getContentPane().add(btnUp);
		diag.getContentPane().add(btnDown);
		diag.getContentPane().add(lblMes);
		
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDirecaoPendente.setText("Up!");
				diag.setVisible(false);
			}
		});
		
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblDirecaoPendente.setText("Down!");
				diag.setVisible(false);
			}
		});
	}
}