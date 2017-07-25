package ex02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pergunta extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JRadioButton rdbtnJamesGosling;
	private JRadioButton rdbtnDennisRitchie;
	private JRadioButton rdbtnGuidoVanRossum;
	private JRadioButton rdbtnAlanCooper;
	private JRadioButton rdbtnRichardStallman;
	private JButton btnConferir;
	

	public static void main(String[] args) {
		try {
			Pergunta dialog = new Pergunta();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Pergunta() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblPergunta = new JLabel("Quem criou a Linguagem Java (antes chamada Oak)?");
		lblPergunta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPergunta.setBounds(48, 11, 336, 52);
		contentPanel.add(lblPergunta);
		
		rdbtnJamesGosling = new JRadioButton("James Gosling");
		rdbtnJamesGosling.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnJamesGosling.setBounds(24, 70, 182, 23);
		contentPanel.add(rdbtnJamesGosling);
		
		rdbtnDennisRitchie = new JRadioButton("Dennis Ritchie");
		rdbtnDennisRitchie.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnDennisRitchie.setBounds(24, 96, 182, 23);
		contentPanel.add(rdbtnDennisRitchie);
		
		rdbtnGuidoVanRossum = new JRadioButton("Guido van Rossum");
		rdbtnGuidoVanRossum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnGuidoVanRossum.setBounds(24, 124, 182, 23);
		contentPanel.add(rdbtnGuidoVanRossum);
		
		rdbtnAlanCooper = new JRadioButton("Alan Cooper");
		rdbtnAlanCooper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnAlanCooper.setBounds(24, 150, 182, 23);
		contentPanel.add(rdbtnAlanCooper);
		
		rdbtnRichardStallman = new JRadioButton("Richard Stallman");
		rdbtnRichardStallman.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnRichardStallman.setBounds(24, 176, 182, 23);
		contentPanel.add(rdbtnRichardStallman);
		
		ButtonGroup radioGroup = new ButtonGroup();
		
		radioGroup.add(rdbtnJamesGosling);
		radioGroup.add(rdbtnDennisRitchie);
		radioGroup.add(rdbtnGuidoVanRossum);
		radioGroup.add(rdbtnAlanCooper);
		radioGroup.add(rdbtnRichardStallman);
		
		btnConferir = new JButton("Conferir");
		btnConferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnJamesGosling.isSelected()) {
					JOptionPane.showMessageDialog(contentPanel, "Você acertou!", "Parabéns", JOptionPane.OK_OPTION, new ImageIcon(Pergunta.class.getResource("/figuras/ok1.png")));
				} else {
					JOptionPane.showMessageDialog(contentPanel, "Você errou!", "Que pena", JOptionPane.ERROR_MESSAGE);
				}
				System.exit(0);
			}
		});
		btnConferir.setBounds(24, 206, 84, 23);
		contentPanel.add(btnConferir);
	}
}
