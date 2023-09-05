package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ventana_creditos extends JFrame {

	private JPanel contentPane;

	public ventana_creditos() {
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 1166, 54);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitulo = new JLabel("PROYECTO DE LENGUAJE DE PROGRAMACION II");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblTitulo.setBounds(10, 10, 1146, 33);
		panel.add(lblTitulo);

		JButton btnRegresar = new JButton("ATR\u00C1S");
		btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnRegresar.setBackground(Color.WHITE);
		btnRegresar.setBounds(1055, 10, 101, 33);
		panel.add(btnRegresar);
		btnRegresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_principal principal = new ventana_principal();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
				dispose();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 74, 1166, 579);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lbl1 = new JLabel("Universidad Nacional Aut\u00F3noma de Honduras");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbl1.setBounds(431, 10, 725, 36);
		panel_1.add(lbl1);

		JLabel lbl2 = new JLabel("UNAH-TEC Danl\u00ED, El Para\u00EDso 2022.");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbl2.setBounds(431, 39, 725, 36);
		panel_1.add(lbl2);

		JLabel lbl3 = new JLabel("Docente: ");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl3.setBounds(431, 71, 725, 24);
		panel_1.add(lbl3);

		JLabel lbl7 = new JLabel("\"Controlar la complejidad es la esencia de la programaci\u00F3n\"");
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbl7.setBounds(431, 475, 725, 36);
		panel_1.add(lbl7);

		JLabel lbl8 = new JLabel("Todos los cr\u00E9ditos al grupo de trabajo.");
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl8.setBounds(431, 505, 725, 36);
		panel_1.add(lbl8);

		JLabel lbl9 = new JLabel("Derechos reservados a los desarrolladores.");
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl9.setBounds(431, 536, 725, 36);
		panel_1.add(lbl9);

		JLabel lbl4 = new JLabel("Lic. Gladys Melissa Nolazco Padilla");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lbl4.setBounds(431, 96, 725, 36);
		panel_1.add(lbl4);

		JLabel lbl6 = new JLabel("\u00C1ngel Fernando Amador Garc\u00EDa");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lbl6.setBounds(431, 166, 235, 24);
		panel_1.add(lbl6);

		JLabel lbl5 = new JLabel("Integrantes:");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl5.setBounds(431, 127, 725, 36);
		panel_1.add(lbl5);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(431, 225, 235, 240);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblFoto1 = new JLabel("");
		lblFoto1.setBounds(10, 10, 215, 220);
		panel_2.add(lblFoto1);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/fernando.jpeg"));
		final ImageIcon icono1 = new ImageIcon(
				logo1.getImage().getScaledInstance(lblFoto1.getWidth(), lblFoto1.getHeight(), Image.SCALE_DEFAULT));
		lblFoto1.setIcon(icono1);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(676, 224, 235, 240);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);

		JLabel lblFoto2 = new JLabel("");
		lblFoto2.setBounds(10, 10, 215, 220);
		panel_2_1.add(lblFoto2);
		final ImageIcon logo2 = new ImageIcon(getClass().getResource("/recursos/alejandra.jpeg"));
		final ImageIcon icono2 = new ImageIcon(
				logo2.getImage().getScaledInstance(lblFoto2.getWidth(), lblFoto2.getHeight(), Image.SCALE_DEFAULT));
		lblFoto2.setIcon(icono2);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(921, 224, 235, 240);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);

		JLabel lblFoto3 = new JLabel("");
		lblFoto3.setBounds(10, 10, 215, 220);
		panel_2_2.add(lblFoto3);
		final ImageIcon logo3 = new ImageIcon(getClass().getResource("/recursos/axel.jpg"));
		final ImageIcon icono3 = new ImageIcon(
				logo3.getImage().getScaledInstance(lblFoto3.getWidth(), lblFoto3.getHeight(), Image.SCALE_DEFAULT));
		lblFoto3.setIcon(icono3);

		JLabel lbl6_1 = new JLabel("20202500172");
		lbl6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl6_1.setBounds(431, 191, 235, 24);
		panel_1.add(lbl6_1);

		JLabel lbl6_1_1 = new JLabel("20182530036");
		lbl6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl6_1_1.setBounds(676, 191, 235, 24);
		panel_1.add(lbl6_1_1);

		JLabel lblAlejandraMaraTrujillo = new JLabel("Alejandra Mar\u00EDa Trujillo Talavera");
		lblAlejandraMaraTrujillo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlejandraMaraTrujillo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAlejandraMaraTrujillo.setBounds(676, 166, 235, 24);
		panel_1.add(lblAlejandraMaraTrujillo);

		JLabel lbl6_1_2 = new JLabel("20192530105");
		lbl6_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		lbl6_1_2.setBounds(921, 191, 235, 24);
		panel_1.add(lbl6_1_2);

		JLabel lblAxelJairGarcia = new JLabel("Axel Jair Garcia Hernandez");
		lblAxelJairGarcia.setHorizontalAlignment(SwingConstants.CENTER);
		lblAxelJairGarcia.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblAxelJairGarcia.setBounds(921, 166, 235, 24);
		panel_1.add(lblAxelJairGarcia);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 10, 411, 559);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblinf = new JLabel("");
		lblinf.setBounds(83, 68, 247, 221);
		panel_3.add(lblinf);
		final ImageIcon logo6 = new ImageIcon(getClass().getResource("/recursos/informatica.jpg"));
		final ImageIcon icono6 = new ImageIcon(
				logo6.getImage().getScaledInstance(lblinf.getWidth(), lblinf.getHeight(), Image.SCALE_DEFAULT));
		lblinf.setIcon(icono6);

		JLabel lblUNAH = new JLabel("");
		lblUNAH.setBounds(44, 248, 319, 301);
		panel_3.add(lblUNAH);
		final ImageIcon logo5 = new ImageIcon(getClass().getResource("/recursos/logoUNAH1.png"));
		final ImageIcon icono5 = new ImageIcon(
				logo5.getImage().getScaledInstance(lblUNAH.getWidth(), lblUNAH.getHeight(), Image.SCALE_DEFAULT));
		lblUNAH.setIcon(icono5);

	}
}
