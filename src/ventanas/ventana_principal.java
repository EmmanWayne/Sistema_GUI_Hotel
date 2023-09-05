package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ventana_principal extends JFrame {

	private JPanel contentPane;

	public ventana_principal() {
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

		JLabel lblNewLabel = new JLabel("PRINCIPAL \"HOTEL VILLA PALMA REAL\"");
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

		JLabel lblFotosHotel = new JLabel("");
		lblFotosHotel.setBackground(Color.WHITE);
		lblFotosHotel.setBounds(10, 51, 1146, 486);
		panel_1.add(lblFotosHotel);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/1.jpg"));
		final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
				lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
		lblFotosHotel.setIcon(icono1);

		JButton btnCreditos = new JButton("CREDITOS");
		btnCreditos.setBackground(Color.WHITE);
		btnCreditos.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnCreditos.setBounds(728, 547, 209, 29);
		panel_1.add(btnCreditos);
		btnCreditos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_creditos creditos = new ventana_creditos();
				creditos.setLocationRelativeTo(null);
				creditos.setVisible(true);
				dispose();
			}
		});

		JButton btnMenu = new JButton("MEN\u00DA");
		btnMenu.setBackground(new Color(102, 205, 170));
		btnMenu.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnMenu.setBounds(947, 547, 209, 29);
		panel_1.add(btnMenu);
		btnMenu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_menu menu = new ventana_menu();
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				dispose();
			}
		});

		JLabel lblMensajeHotel = new JLabel(
				"\u201CBienvenidos al HOTEL VILLA PALMA REAL, un lugar para hacer tus sue\u00F1os realidad\u201D.");
		lblMensajeHotel.setForeground(Color.BLACK);
		lblMensajeHotel.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensajeHotel.setFont(new Font("Segoe UI Black", Font.ITALIC, 18));
		lblMensajeHotel.setBounds(324, 10, 832, 31);
		panel_1.add(lblMensajeHotel);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1.\t Entrada al Hotel", "2.\t Piscinas Grandes",
				"3.\t Zona Privilegiada", "4.\t Deliciosa Comida", "5.\t Vistas Hermosas",
				"6.\t Habitaciones Sencillas", "7.\t Habitaciones Lujosas" }));
		comboBox.setBounds(10, 10, 304, 31);
		panel_1.add(comboBox);

		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(10, 547, 209, 29);
		panel_1.add(btnSalir);
		btnSalir.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnSalir.setBackground(new Color(240, 128, 128));

		JButton btnCerrarSesion = new JButton("CERRAR SESION");
		btnCerrarSesion.setBounds(229, 547, 209, 28);
		panel_1.add(btnCerrarSesion);
		btnCerrarSesion.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		btnCerrarSesion.setBackground(new Color(255, 222, 173));
		btnCerrarSesion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_login login = new ventana_login();
				login.setLocationRelativeTo(null);
				login.setVisible(true);
				dispose();
			}
		});
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("1.\t Entrada al Hotel")) {
					lblMensajeHotel.setText(
							"“Bienvenidos al HOTEL VILLA PALMA REAL un lugar para hacer tus sueños realidad”.");
					final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/1.jpg"));
					final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
							lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
					lblFotosHotel.setIcon(icono1);
				} else {
					if (comboBox.getSelectedItem().equals("2.\t Piscinas Grandes")) {
						lblMensajeHotel.setText(
								"Disfruta de nuestras piscinas gigantes y elegantes para toda tu familia y amigos.");
						final ImageIcon logo2 = new ImageIcon(getClass().getResource("/recursos/2.jpg"));
						final ImageIcon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(
								lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
						lblFotosHotel.setIcon(icono2);
					} else {
						if (comboBox.getSelectedItem().equals("3.\t Zona Privilegiada")) {
							lblMensajeHotel.setText(
									"Estamos ubicados en una zona muy elegante y segura de la ciudad.");
							final ImageIcon logo3 = new ImageIcon(getClass().getResource("/recursos/3.jpg"));
							final ImageIcon icono3 = new ImageIcon(logo3.getImage().getScaledInstance(
									lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
							lblFotosHotel.setIcon(icono3);
						} else {
							if (comboBox.getSelectedItem().equals("4.\t Deliciosa Comida")) {
								lblMensajeHotel
										.setText("Deléitate con nuestros banquetes y deliciosa comida gourmet. ");
								final ImageIcon logo4 = new ImageIcon(getClass().getResource("/recursos/4.jpg"));
								final ImageIcon icono4 = new ImageIcon(logo4.getImage().getScaledInstance(
										lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
								lblFotosHotel.setIcon(icono4);
							} else {
								if (comboBox.getSelectedItem().equals("5.\t Vistas Hermosas")) {
									lblMensajeHotel.setText(
											"Aprecia las hermosas vistas del mar pacifico y sus hermosas playas.");
									final ImageIcon logo5 = new ImageIcon(getClass().getResource("/recursos/5.png"));
									final ImageIcon icono5 = new ImageIcon(logo5.getImage().getScaledInstance(
											lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
									lblFotosHotel.setIcon(icono5);
								} else {
									if (comboBox.getSelectedItem().equals("6.\t Habitaciones Sencillas")) {
										lblMensajeHotel
												.setText("Reserva nuestras habitaciones sencillas y económicas.");
										final ImageIcon logo6 = new ImageIcon(
												getClass().getResource("/recursos/6.jpg"));
										final ImageIcon icono6 = new ImageIcon(
												logo6.getImage().getScaledInstance(lblFotosHotel.getWidth(),
														lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
										lblFotosHotel.setIcon(icono6);
									} else {
										if (comboBox.getSelectedItem().equals("7.\t Habitaciones Lujosas")) {
											lblMensajeHotel.setText(
													"Reserva nuestras habitaciones mas lujosas para eventos especiales.");
											final ImageIcon logo7 = new ImageIcon(
													getClass().getResource("/recursos/7.jpg"));
											final ImageIcon icono7 = new ImageIcon(
													logo7.getImage().getScaledInstance(lblFotosHotel.getWidth(),
															lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
											lblFotosHotel.setIcon(icono7);
										}

									}

								}

							}

						}

					}

				}
			}
		});
	}
}
