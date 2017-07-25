package atividadepratica2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Composite;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

import javax.sound.sampled.Line;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Hexagono extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hexagono frame = new Hexagono();
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
	public Hexagono() {
		setTitle("Desenhando um Hex\u00E1gono");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public void paint(Graphics g) {
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		// Desenhando as linhas do Hexágono
		/* Sei que hexágonos tem 6 lados iguais, mas os lados não horizonatais ficavam
		 * desproporcionais caso colocasse a variação de 100 estabelecida no primeiro traço.
		 */
		Line2D linha1 = new Line2D.Double(100,100,200,100);
		g2.draw(linha1);
		Line2D linha2 = new Line2D.Double(200,100,250,150);
		g2.draw(linha2);
		Line2D linha3 = new Line2D.Double(250,150,200,200);
		g2.draw(linha3);
		Line2D linha4 = new Line2D.Double(200,200,100,200);
		g2.draw(linha4);
		Line2D linha5 = new Line2D.Double(100,200,50,150);
		g2.draw(linha5);
		Line2D linha6 = new Line2D.Double(50,150,100,100);
		g2.draw(linha6);
		
		g2.dispose();
		
	}
}
