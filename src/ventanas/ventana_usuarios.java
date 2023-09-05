package ventanas;

import java.awt.Color;
import java.awt.Font;
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

public class ventana_usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JTextField textField;
	private JTextField textField_1;

	public ventana_usuarios() {
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
		panel.setBounds(10, 10, 1166, 53);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("REGISTRO DE USUARIOS \"HOTEL VILLA PALMA REAL\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 1146, 33);
		panel.add(lblNewLabel);

		JButton btnRegresar = new JButton("ATR\u00C1S");
		btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnRegresar.setBackground(Color.WHITE);
		btnRegresar.setBounds(1055, 10, 101, 33);
		panel.add(btnRegresar);
		btnRegresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_login login = new ventana_login();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
				dispose();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 78, 1166, 575);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/1.jpg"));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(282, 24, 582, 529);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblIngreseSusCredenciales = new JLabel("USUARIOS");
		lblIngreseSusCredenciales.setBounds(46, 10, 488, 66);
		panel_2.add(lblIngreseSusCredenciales);
		lblIngreseSusCredenciales.setFont(new Font("Segoe UI", Font.BOLD, 25));

		JLabel lblUsuario = new JLabel("USUARIO:");
		lblUsuario.setBounds(46, 74, 488, 27);
		panel_2.add(lblUsuario);
		lblUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		txtUsuario = new JTextField();
		txtUsuario.setBounds(46, 111, 488, 34);
		panel_2.add(txtUsuario);
		txtUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setBounds(46, 167, 488, 27);
		panel_2.add(lblContrasea);
		lblContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JLabel lblMostrar = new JLabel("Mostrar");
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
		lblMostrar.setBounds(286, 168, 248, 27);
		panel_2.add(lblMostrar);
		lblMostrar.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMostrar.setFont(new Font("Segoe UI Black", Font.BOLD, 15));

		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(46, 204, 488, 34);
		panel_2.add(txtContrasena);
		txtContrasena.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JButton btnLogin = new JButton("GUARDAR");
		btnLogin.setBounds(46, 446, 488, 34);
		panel_2.add(btnLogin);
		btnLogin.setBackground(new Color(102, 205, 170));
		btnLogin.setFont(new Font("Segoe UI", Font.BOLD, 20));

		JLabel lblIdentidad = new JLabel("IDENTIDAD:");
		lblIdentidad.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblIdentidad.setBounds(46, 262, 488, 27);
		panel_2.add(lblIdentidad);

		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBounds(46, 299, 488, 34);
		panel_2.add(textField);

		JLabel lblNombreCompleto = new JLabel("NOMBRE COMPLETO:");
		lblNombreCompleto.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNombreCompleto.setBounds(46, 355, 488, 27);
		panel_2.add(lblNombreCompleto);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(46, 390, 488, 34);
		panel_2.add(textField_1);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "!REGISTRO EXITOSO!");
				ventana_login login = new ventana_login();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
				dispose();
			}
		});
	}
}
