package Gato;

import java.applet.AudioClip;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JButton;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.EtchedBorder;

public class Menu extends JFrame {
	MenuF fondoMenu = new MenuF();
	private JPanel contentPane;
	public Clip clip;
	public String ruta = "/Sonidos/";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void sonido(String archivo) {
		try {
			clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream(ruta + archivo + ".wav")));
			clip.start();
		} catch (LineUnavailableException | UnsupportedAudioFileException | IOException e) {

		}

	}

	public Menu() {
		setTitle("Salud en raya");
		this.ContentPane(fondoMenu);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Gato/sonriendo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new MenuF();
		panel.setBounds(0, 0, 686, 363);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton Salir = new JButton("Salir");
		Salir.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Salir.setFocusPainted(false);
		Salir.setContentAreaFilled(true);
		Salir.setBackground(new Color(255, 204, 0));
		Salir.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 16));
		Salir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Salir.setBounds(10, 329, 110, 23);
		panel.add(Salir);

		JButton Historia = new JButton("Historia");
		Historia.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Historia.setFocusPainted(false);
		Historia.setContentAreaFilled(true);
		Historia.setBackground(new Color(51, 153, 255));
		Historia.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 16));
		Historia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Historia.setBounds(50, 195, 110, 38);
		panel.add(Historia);

		JButton Reglas = new JButton("Reglas");
		Reglas.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Reglas.setFocusPainted(false);
		Reglas.setContentAreaFilled(true);
		Reglas.setBackground(new Color(51, 153, 255));
		Reglas.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 16));
		Reglas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Reglas.setBounds(164, 195, 121, 38);
		panel.add(Reglas);

		JButton Opciones = new JButton("Opciones");
		Opciones.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Opciones.setFocusPainted(false);
		Opciones.setContentAreaFilled(true);
		Opciones.setBackground(new Color(255, 51, 51));
		Opciones.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 16));
		Opciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Opciones.setBounds(50, 237, 235, 35);
		panel.add(Opciones);

		JButton Creditos = new JButton("Creditos");
		Creditos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Creditos.setBackground(new Color(51, 153, 51));
		Creditos.setFocusPainted(false);
		Creditos.setContentAreaFilled(true);
		Creditos.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 14));
		Creditos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Creditos.setBounds(118, 275, 89, 23);
		panel.add(Creditos);

		JButton Play = new JButton("Play");
		Play.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		Play.setBackground(new Color(255, 102, 0));
		Play.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 16));
		Play.setFocusPainted(false);
		Play.setContentAreaFilled(true);
		Play.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				sonido("sonidoseleccion");
			}
		});
		Play.setBounds(50, 150, 235, 41);
		panel.add(Play);

	}

	private void ContentPane(MenuF fondoMenu2) {
	}

}
