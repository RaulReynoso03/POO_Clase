package Gato;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Creditos extends JFrame {
	
	imagenfondo ejemplo=new imagenfondo();
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creditos frame = new Creditos();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Creditos() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Creditos.class.getResource("/Gato/images (2).jpg")));
		this.contentPane(ejemplo);
		setTitle("Salud en raya");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new imagenfondo();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 684, 361);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CREDITOS");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 54, 684, 66);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 65));
		
		JLabel lblNewLabel_3 = new JLabel("CREADORES");
		lblNewLabel_3.setBounds(0, 131, 684, 22);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Programador1 = new JLabel("Martinez Zamora Uriel");
		Programador1.setBounds(0, 180, 684, 22);
		panel.add(Programador1);
		Programador1.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		Programador1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel Programador2 = new JLabel("Reynoso Santana Raul");
		Programador2.setBounds(0, 213, 684, 22);
		panel.add(Programador2);
		Programador2.setHorizontalAlignment(SwingConstants.CENTER);
		Programador2.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		
		JLabel Programador3 = new JLabel("Varela Mejia Edgar");
		Programador3.setBounds(0, 246, 684, 22);
		panel.add(Programador3);
		Programador3.setHorizontalAlignment(SwingConstants.CENTER);
		Programador3.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 21));
		
		JButton RegresarDeCreditos_MenuPrincipal = new JButton("Regresar");
		RegresarDeCreditos_MenuPrincipal.setBackground(new Color(173, 216, 230));
		RegresarDeCreditos_MenuPrincipal.setVerticalAlignment(SwingConstants.TOP);
		RegresarDeCreditos_MenuPrincipal.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 14));
		RegresarDeCreditos_MenuPrincipal.setFocusPainted(false);
		RegresarDeCreditos_MenuPrincipal.setBorderPainted(false);
		RegresarDeCreditos_MenuPrincipal.setContentAreaFilled(true);
		RegresarDeCreditos_MenuPrincipal.setBounds(10, 327, 115, 23);
		panel.add(RegresarDeCreditos_MenuPrincipal);
		
		}

	private void contentPane(imagenfondo ejemplo2) {	
	}
}