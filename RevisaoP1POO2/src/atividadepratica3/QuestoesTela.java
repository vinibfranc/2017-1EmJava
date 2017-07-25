package atividadepratica3;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.BevelBorder;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class QuestoesTela extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JPanel buttonPane= new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Questoes q= new Questoes();
			QuestoesTela dialog = new QuestoesTela(q);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public QuestoesTela(Questoes q) {
		setTitle("Jogo de Perguntas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.CYAN);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel labelPergunta = new JLabel("");
		labelPergunta.setBackground(Color.WHITE);
		labelPergunta.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelPergunta.setBounds(12, 13, 408, 36);
		labelPergunta.setText(q.getPergunta());
		contentPanel.add(labelPergunta);
		
		ButtonGroup g= new ButtonGroup();
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(12, 55, 408, 146);
		
		JRadioButton op1= new JRadioButton(q.getOpcoes()[0]);
		op1.setBackground(Color.WHITE);
		op1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op1.setActionCommand(q.getOpcoes()[0]);
		JRadioButton op2= new JRadioButton(q.getOpcoes()[1]);
		op2.setBackground(Color.WHITE);
		op2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op2.setActionCommand(q.getOpcoes()[1]);
		JRadioButton op3= new JRadioButton(q.getOpcoes()[2]);
		op3.setBackground(Color.WHITE);
		op3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op3.setActionCommand(q.getOpcoes()[2]);
		JRadioButton op4= new JRadioButton(q.getOpcoes()[3]);
		op4.setBackground(Color.WHITE);
		op4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op4.setActionCommand(q.getOpcoes()[3]);
		JRadioButton op5= new JRadioButton(q.getOpcoes()[4]);
		op5.setBackground(Color.WHITE);
		op5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		op5.setActionCommand(q.getOpcoes()[4]);
		
		panel.setLayout(new GridLayout(5, 0, 0, 0));
		
		panel.add(op1);
		panel.add(op2);
		panel.add(op3);
		panel.add(op4);
		panel.add(op5);
		
		g.add(op1);
		g.add(op2);
		g.add(op3);
		g.add(op4);
		g.add(op5);
		
		
		contentPanel.add(panel);
		buttonPane.setBackground(Color.CYAN);
		
		buttonPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JButton buttonValidar = new JButton("Validar");
		buttonValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					if(q.getResposta().equals(g.getSelection().getActionCommand()))
					{
						JOptionPane.showMessageDialog(panel, "Resposta Correta", "Aviso", JOptionPane.INFORMATION_MESSAGE, new ImageIcon(QuestoesTela.class.getResource("/figuras/ok1.png")));
					}
						
					else
					{
						JOptionPane.showMessageDialog(panel, "Resposta Incorreta", "Aviso", JOptionPane.ERROR_MESSAGE, null);
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(panel, "Escolha uma opção", "Aviso", JOptionPane.ERROR_MESSAGE, null);
				}
				
				
			}
		});
		buttonValidar.setActionCommand("OK");
		buttonPane.add(buttonValidar);
					
		JButton buttonLimpar = new JButton("Limpar");
		buttonLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.clearSelection();
			}
		});
		buttonLimpar.setActionCommand("Cancel");
		buttonPane.add(buttonLimpar);
			
	}
}