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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ventana_ver_comida extends JFrame {

	private JPanel contentPane;
	private JTextField txtPrecio;

	public ventana_ver_comida() {
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

		JLabel lblNewLabel = new JLabel("COMIDA \"HOTEL VILLA PALMA REAL\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 10, 1146, 33);
		panel.add(lblNewLabel);

		JButton btnRegresar = new JButton("ATR\u00C1S");
		btnRegresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_menu menu = new ventana_menu();
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				dispose();
			}
		});
		btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnRegresar.setBackground(Color.WHITE);
		btnRegresar.setBounds(1055, 10, 101, 33);
		panel.add(btnRegresar);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 67, 1166, 586);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblFotosHotel = new JLabel("");
		lblFotosHotel.setBackground(Color.WHITE);
		lblFotosHotel.setBounds(10, 51, 1146, 525);
		panel_1.add(lblFotosHotel);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/baleadas.jpg"));
		final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
				lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
		lblFotosHotel.setIcon(icono1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe UI", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "1.\t Comida Tipica", "2.\t Comida Gourmet" }));
		comboBox.setBounds(129, 10, 268, 31);
		panel_1.add(comboBox);

		JLabel lblComida = new JLabel("COMIDA:");
		lblComida.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblComida.setBounds(10, 10, 120, 31);
		panel_1.add(lblComida);

		JLabel lblPlatillo = new JLabel("PLATILLO:");
		lblPlatillo.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblPlatillo.setBounds(407, 10, 120, 31);
		panel_1.add(lblPlatillo);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox_1.getSelectedItem().equals("1. Baleadas")) {
					final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/baleadas.jpg"));
					final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
							lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
					lblFotosHotel.setIcon(icono1);
					txtPrecio.setText("30.00 Lempiras");
				} else {
					if (comboBox_1.getSelectedItem().equals("2. Pollo chuco")) {
						final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/pollochuco.png"));
						final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
								lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
						lblFotosHotel.setIcon(icono1);
						txtPrecio.setText("150.00 Lempiras");
					} else {
						if (comboBox_1.getSelectedItem().equals("3. Enchiladas")) {
							final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/enchiladas.png"));
							final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
									lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
							lblFotosHotel.setIcon(icono1);
							txtPrecio.setText("100.00 Lempiras");
						} else {
							if (comboBox_1.getSelectedItem().equals("4. Catrachas")) {
								final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/catrachas.jpg"));
								final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
										lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
								lblFotosHotel.setIcon(icono1);
								txtPrecio.setText("100.00 Lempiras");
							} else {
								if (comboBox_1.getSelectedItem().equals("5. Carne Asada")) {
									final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/carneasada.jpg"));
									final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
											lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
									lblFotosHotel.setIcon(icono1);
									txtPrecio.setText("500.00 Lempiras");
								} else {
									if (comboBox_1.getSelectedItem().equals("1. Camarones")) {
										final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/camarones.jpg"));
										final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
												lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
										lblFotosHotel.setIcon(icono1);
										txtPrecio.setText("850.00 Lempiras");
									} else {
										if (comboBox_1.getSelectedItem().equals("2. Langosta")) {
											final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/langosta.jpg"));
											final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
													lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
											lblFotosHotel.setIcon(icono1);
											txtPrecio.setText("1000.00 Lempiras");
										} else {
											if (comboBox_1.getSelectedItem().equals("3. Caviar")) {
												final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/caviar.jpg"));
												final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
														lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
												lblFotosHotel.setIcon(icono1);
												txtPrecio.setText("1500.00 Lempiras");
											} else {
												if (comboBox_1.getSelectedItem().equals("4. Filete de pescado")) {
													final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/filetedepescado.jpg"));
													final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
															lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
													lblFotosHotel.setIcon(icono1);
													txtPrecio.setText("750.00 Lempiras");
												} else {
													if (comboBox_1.getSelectedItem().equals("5. Postre de chocolate")) {
														final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/postre.jpg"));
														final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
																lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
														lblFotosHotel.setIcon(icono1);
														txtPrecio.setText("600.00 Lempiras");
													}
												}
											}
										}
									}
								}
							}
						}
					}


				}
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "1. Baleadas", "2. Pollo chuco", "3. Enchiladas", "4. Catrachas", "5. Carne Asada" }));
		comboBox_1.setFont(new Font("Segoe UI", Font.BOLD, 18));
		comboBox_1.setBounds(526, 10, 268, 31);
		panel_1.add(comboBox_1);

		JLabel lblComida_1_1 = new JLabel("PRECIO:");
		lblComida_1_1.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblComida_1_1.setBounds(804, 10, 120, 31);
		panel_1.add(lblComida_1_1);

		txtPrecio = new JTextField();
		txtPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecio.setFont(new Font("Segoe UI Black", Font.PLAIN, 18));
		txtPrecio.setText("30.00 Lempiras");
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(896, 10, 260, 31);
		panel_1.add(txtPrecio);
		txtPrecio.setColumns(10);
		comboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem().equals("1.\t Comida Tipica")) {
					comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1. Baleadas", "2. Pollo chuco",
							"3. Enchiladas", "4. Catrachas", "5. Carne Asada" }));
					final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/baleadas.jpg"));
					final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
							lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
					lblFotosHotel.setIcon(icono1);
				} else {
					if (comboBox.getSelectedItem().equals("2.\t Comida Gourmet")) {
						comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "1. Camarones", "2. Langosta",
								"3. Caviar", "4. Filete de pescado", "5. Postre de chocolate" }));
						final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/camarones.jpg"));
						final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(
								lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
						lblFotosHotel.setIcon(icono1);
					}
				}
			}
		});
	}
}
