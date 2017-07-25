package dialogos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestandoJOptions extends JFrame {

	private JPanel contentPane;
	private Object[] array = {"Jo�o", "Maria", "Jos�"};
	private Object[] frutas = {"Abacaxi", "Mel�o", "Laranja"};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestandoJOptions frame = new TestandoJOptions();
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
	public TestandoJOptions() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmMostrarMessageDialog = new JMenuItem("MostrarMessageDialog");
		mntmMostrarMessageDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Parab�ns, voc� abriu a mensagem!","Mensagem",JOptionPane.INFORMATION_MESSAGE, new ImageIcon(TestandoJOptions.class.getResource("/figuras/ok1.png")));
			}
		});
		mnMenu.add(mntmMostrarMessageDialog);
		
		JMenuItem mntmMostrarConfirmDialog = new JMenuItem("MostrarConfirmDialog");
		mntmMostrarConfirmDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(contentPane, "Voc� tem certeza da sua escolha?", "Confirma��o dos dados", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.OK_CANCEL_OPTION, new ImageIcon(TestandoJOptions.class.getResource("/figuras/ok1.png")));
				/*int opcao = 8;
				if (opcao == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(contentPane, "Est� tudo certo!");
				} else if (opcao == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(contentPane, "Voc� ter� que refazer o processo!");
				} else {
					JOptionPane.showMessageDialog(contentPane, "Voc� cancelou a op��o!");
				}*/
			}
		});
		mnMenu.add(mntmMostrarConfirmDialog);
		
		JMenuItem mntmMostrarInputDialog = new JMenuItem("MostrarInputDialog");
		mntmMostrarInputDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(contentPane, "Selecione uma op��o", "Sele��o", JOptionPane.DEFAULT_OPTION, null, array, array[0]);
			}
		});
		mnMenu.add(mntmMostrarInputDialog);
		
		JMenuItem mntmMostrarOptionDialog = new JMenuItem("MostrarOptionDialog");
		mntmMostrarOptionDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showOptionDialog(contentPane, "Selecione a fruta preferida", "Sele��o", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, frutas, frutas[0]);
			}
		});
		mnMenu.add(mntmMostrarOptionDialog);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
