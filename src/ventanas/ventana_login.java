package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ventana_login extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;

	public ventana_login() {
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
		panel.setBounds(10, 10, 1166, 47);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("BIENVENIDO AL SISTEMA \"HOTEL VILLA PALMA REAL\".");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 10, 1146, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 67, 1166, 586);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/1.jpg"));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 10, 496, 566);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblIngreseSusCredenciales = new JLabel("INICIO DE SESI\u00D3N");
		lblIngreseSusCredenciales.setForeground(new Color(100, 149, 237));
		lblIngreseSusCredenciales.setBackground(Color.WHITE);
		lblIngreseSusCredenciales.setBounds(10, 84, 474, 78);
		panel_2.add(lblIngreseSusCredenciales);
		lblIngreseSusCredenciales.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSusCredenciales.setFont(new Font("Segoe UI Black", Font.BOLD, 40));

		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(10, 209, 474, 27);
		panel_2.add(lblUsuario);
		lblUsuario.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 246, 474, 46);
		panel_2.add(txtUsuario);
		txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(10, 302, 348, 27);
		panel_2.add(lblContrasea);
		lblContrasea.setFont(new Font("Segoe UI Black", Font.BOLD, 20));

		JLabel lblMostrar = new JLabel("Mostrar");
		lblMostrar.setBounds(236, 302, 248, 27);
		panel_2.add(lblMostrar);
		lblMostrar.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMostrar.setFont(new Font("Segoe UI Black", Font.BOLD, 15));
		lblMostrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lblMostrar.getText().toString().equals("Mostrar")) {
					txtContrasena.setEchoChar((char) 0);
					lblMostrar.setText("Ocultar");
				} else {
					txtContrasena.setEchoChar('*');
					lblMostrar.setText("Mostrar");
				}
			}
		});

		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(10, 339, 474, 46);
		panel_2.add(txtContrasena);
		txtContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(10, 432, 474, 35);
		panel_2.add(btnIngresar);
		btnIngresar.setBackground(new Color(102, 205, 170));
		btnIngresar.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnIngresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().toString().equals("") || txtContrasena.getText().toString().equals("")) {
					JOptionPane.showMessageDialog(null, "¡Atención! ingrese el usuario y la contraseña."
							+ "\n Para Ingresar al sistema");
				} else {
					ventana_principal principal = new ventana_principal();
					principal.setLocationRelativeTo(null);
					principal.setVisible(true);
					dispose();
				}

			}
		});

		JButton btnRegistrarse = new JButton("REGISTRARSE");
		btnRegistrarse.setBounds(10, 476, 474, 35);
		panel_2.add(btnRegistrarse);
		btnRegistrarse.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnRegistrarse.setBackground(new Color(100, 149, 237));
		btnRegistrarse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_usuarios usuarios = new ventana_usuarios();
				usuarios.setLocationRelativeTo(null);
				usuarios.setVisible(true);
				dispose();
			}
		});

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(10, 521, 474, 35);
		panel_2.add(btnSalir);
		btnSalir.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnSalir.setBackground(new Color(240, 128, 128));

		JLabel lblbienvenidoEstimadoUsuario = new JLabel("\u00A1Bienvenido Estimado Usuario!");
		lblbienvenidoEstimadoUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblbienvenidoEstimadoUsuario.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblbienvenidoEstimadoUsuario.setBounds(10, 395, 474, 27);
		panel_2.add(lblbienvenidoEstimadoUsuario);

		JLabel lblIngreseSusCredenciales_1 = new JLabel("Instrucciones: Ingrese sus credenciales para continuar.");
		lblIngreseSusCredenciales_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSusCredenciales_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 15));
		lblIngreseSusCredenciales_1.setBounds(10, 172, 474, 27);
		panel_2.add(lblIngreseSusCredenciales_1);

		JLabel lblHotelVillaPalma = new JLabel("HOTEL VILLA PALMA REAL");
		lblHotelVillaPalma.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelVillaPalma.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblHotelVillaPalma.setBounds(10, 10, 474, 78);
		panel_2.add(lblHotelVillaPalma);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(516, 10, 640, 566);
		panel_1.add(panel_2_1);

		JLabel lblHotel = new JLabel("");
		lblHotel.setBounds(10, 10, 620, 546);
		panel_2_1.add(lblHotel);
		final ImageIcon logo = new ImageIcon(getClass().getResource("/recursos/1.jpg"));
		final ImageIcon icono = new ImageIcon(
				logo.getImage().getScaledInstance(lblHotel.getWidth(), lblHotel.getHeight(), Image.SCALE_DEFAULT));
		lblHotel.setIcon(icono);
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}
}
