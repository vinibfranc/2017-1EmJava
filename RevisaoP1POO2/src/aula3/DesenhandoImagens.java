package aula3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DesenhandoImagens extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesenhandoImagens frame = new DesenhandoImagens();
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
	public DesenhandoImagens() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D)g;
		
		// retangulo
		Rectangle2D rect = new Rectangle2D.Double(80,90,240,170);
		g2.draw(rect);
		
		// preenchendo retangulo com verde
		g2.setColor(Color.GREEN);
		g2.fillRect(80, 90, 240, 170);
		
		// desenhando uma elipse
		Ellipse2D ellipse = new Ellipse2D.Double(100,104,200,150);
		g2.draw(ellipse);
		
		// preenchendo elipse de azul
		g2.setColor(Color.BLUE);
		g2.fill(ellipse);
		
		g2.dispose();
		
	}

}
