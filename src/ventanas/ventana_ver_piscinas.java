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

public class ventana_ver_piscinas extends JFrame {

	private JPanel contentPane;
	private JTextField txtCapacidad;
	private JTextField txtPrecio;
	private JTextField txtPersonas;
	private JTextField txtCupos;

	public ventana_ver_piscinas() {
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

		JLabel lblNewLabel = new JLabel("USO DE PISCINAS \"HOTEL VILLA PALMA REAL\"");
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
		lblFotosHotel.setBounds(589, 51, 567, 525);
		panel_1.add(lblFotosHotel);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/p_niños.jpg"));
		final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
				lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
		lblFotosHotel.setIcon(icono1);

		JComboBox cbxPiscinas = new JComboBox();
		cbxPiscinas.setFont(new Font("Segoe UI", Font.BOLD, 18));
		cbxPiscinas.setModel(new DefaultComboBoxModel(new String[] { "1. Piscina para ni\u00F1os",
				"2. Piscina para adultos", "3. Piscina para natacion", "4. Piscina para reservaciones" }));
		cbxPiscinas.setBounds(129, 10, 448, 31);
		panel_1.add(cbxPiscinas);

		JLabel lblComida = new JLabel("PISCINAS:");
		lblComida.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblComida.setBounds(10, 10, 120, 31);
		panel_1.add(lblComida);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 50, 567, 526);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblInformacionDeLa = new JLabel("Informacion de la piscina:");
		lblInformacionDeLa.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblInformacionDeLa.setBounds(10, 50, 547, 31);
		panel_2.add(lblInformacionDeLa);

		JLabel lblCapacidadDeLa = new JLabel("Capacidad de la piscina:");
		lblCapacidadDeLa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblCapacidadDeLa.setBounds(10, 91, 547, 27);
		panel_2.add(lblCapacidadDeLa);

		txtCapacidad = new JTextField();
		txtCapacidad.setText("20 personas");
		txtCapacidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCapacidad.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCapacidad.setEditable(false);
		txtCapacidad.setColumns(10);
		txtCapacidad.setBounds(10, 128, 547, 32);
		panel_2.add(txtCapacidad);

		JLabel lblPrecioPorUsar = new JLabel("Precio por usar la piscina:");
		lblPrecioPorUsar.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPrecioPorUsar.setBounds(10, 170, 547, 27);
		panel_2.add(lblPrecioPorUsar);

		txtPrecio = new JTextField();
		txtPrecio.setText("100.00 / persona");
		txtPrecio.setHorizontalAlignment(SwingConstants.CENTER);
		txtPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPrecio.setEditable(false);
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(10, 207, 547, 32);
		panel_2.add(txtPrecio);

		JLabel lblPersonasOcupandoLa = new JLabel("Personas ocupando la piscina:");
		lblPersonasOcupandoLa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPersonasOcupandoLa.setBounds(10, 249, 547, 27);
		panel_2.add(lblPersonasOcupandoLa);

		txtPersonas = new JTextField();
		txtPersonas.setText("15/20");
		txtPersonas.setHorizontalAlignment(SwingConstants.CENTER);
		txtPersonas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPersonas.setEditable(false);
		txtPersonas.setColumns(10);
		txtPersonas.setBounds(10, 286, 547, 32);
		panel_2.add(txtPersonas);

		JLabel lblCuposLibresPara = new JLabel("Cupos libres para usar piscina:");
		lblCuposLibresPara.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblCuposLibresPara.setBounds(10, 328, 547, 27);
		panel_2.add(lblCuposLibresPara);

		txtCupos = new JTextField();
		txtCupos.setText("5");
		txtCupos.setHorizontalAlignment(SwingConstants.CENTER);
		txtCupos.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCupos.setEditable(false);
		txtCupos.setColumns(10);
		txtCupos.setBounds(10, 365, 547, 32);
		panel_2.add(txtCupos);

		JButton btnReservarPiscina = new JButton("Reservar Piscina");
		btnReservarPiscina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_piscinas piscinas = new ventana_piscinas();
				piscinas.setLocationRelativeTo(null);
				piscinas.setVisible(true);
				dispose();
			}
		});
		btnReservarPiscina.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnReservarPiscina.setBackground(new Color(102, 205, 170));
		btnReservarPiscina.setBounds(10, 422, 547, 32);
		panel_2.add(btnReservarPiscina);

		JLabel lblPiscina = new JLabel("PISCINA PARA NI\u00D1OS");
		lblPiscina.setHorizontalAlignment(SwingConstants.CENTER);
		lblPiscina.setFont(new Font("Segoe UI Black", Font.BOLD | Font.ITALIC, 20));
		lblPiscina.setBounds(589, 10, 567, 33);
		panel_1.add(lblPiscina);

		cbxPiscinas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (cbxPiscinas.getSelectedItem().equals("1. Piscina para ni\\u00F1os")) {
					final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/p_niños.jpg"));
					final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(lblFotosHotel.getWidth(),
							lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
					lblFotosHotel.setIcon(icono1);
					txtCapacidad.setText("20 personas");
					txtPersonas.setText("15/20");
					txtPrecio.setText("100.00");
					txtCupos.setText("5");
					lblPiscina.setText("PISCINA PARA NIÑOS");

				} else {
					if (cbxPiscinas.getSelectedItem().equals("2. Piscina para adultos")) {
						final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/p_adultos.jpg"));
						final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(
								lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
						lblFotosHotel.setIcon(icono1);
						txtCapacidad.setText("50 personas");
						txtPersonas.setText("25/50");
						txtPrecio.setText("150.00");
						txtCupos.setText("25");
						lblPiscina.setText("PISCINA PARA ADULTOS");

					} else {
						if (cbxPiscinas.getSelectedItem().equals("3. Piscina para natacion")) {
							final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/p_natacion.jpg"));
							final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(
									lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
							lblFotosHotel.setIcon(icono1);
							txtCapacidad.setText("100 personas");
							txtPersonas.setText("10/100");
							txtPrecio.setText("500.00");
							txtCupos.setText("90");
							lblPiscina.setText("PISCINA PARA NATACION");

						} else {
							if (cbxPiscinas.getSelectedItem().equals("4. Piscina para reservaciones")) {
								final ImageIcon logo1 = new ImageIcon(
										getClass().getResource("/recursos/p_reservacion.jpg"));
								final ImageIcon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(
										lblFotosHotel.getWidth(), lblFotosHotel.getHeight(), Image.SCALE_DEFAULT));
								lblFotosHotel.setIcon(icono1);
								txtCapacidad.setText("50 personas");
								txtPersonas.setText("0/50");
								txtPrecio.setText("500.00");
								txtCupos.setText("50");
								lblPiscina.setText("PISCINA PARA RESERVACIONES");
							}
						}
					}
				}
			}
		});
	}
}
