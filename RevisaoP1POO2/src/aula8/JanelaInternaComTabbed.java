package aula8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JanelaInternaComTabbed extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInternaComTabbed frame = new JanelaInternaComTabbed();
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
	public JanelaInternaComTabbed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		menuBar.add(mnMenu);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mntmAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JInternalFrame intern= new JInternalFrame("janela interna");
				intern.setBounds(0, 0, 200, 200);
				intern.setClosable(true);
				intern.setMaximizable(true);
				
				JTabbedPane tab= new JTabbedPane();
				JPanel p1= new JPanel();
				JLabel l1= new JLabel("Texto 1");
				p1.add(l1);
				tab.addTab("Aba 1", p1);
				
				JPanel p2= new JPanel();
				JLabel l2= new JLabel("Texto 2");
				p2.add(l2);
				tab.addTab("Aba 2", p2);
				
				JPanel p3= new JPanel();
				JLabel l3= new JLabel("Texto 3");
				p3.add(l3);
				tab.addTab("Aba 3", p3);
				
				intern.add(tab);
				getContentPane().setLayout(null);
				getContentPane().add(intern);
				intern.validate();
				intern.setVisible(true);
			}
		});
		mnMenu.add(mntmAdd);	
	}
}
