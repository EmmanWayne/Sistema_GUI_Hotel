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

public class ventana_menu extends JFrame {

	private JPanel contentPane;

	public ventana_menu() {
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
		panel.setBounds(10, 10, 1166, 51);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("MENU PRINCIPAL \"HOTEL VILLA PALMA REAL\"");
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
				ventana_principal principal = new ventana_principal();
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
				dispose();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 71, 1166, 582);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblMenDeProductos = new JLabel("MEN\u00DA DE RESERVACIONES, PRODUCTOS Y SERVICIOS.");
		lblMenDeProductos.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenDeProductos.setFont(new Font("Segoe UI Black", Font.BOLD, 25));
		lblMenDeProductos.setBounds(10, 77, 1146, 41);
		panel_1.add(lblMenDeProductos);

		JLabel lblHabitaciones = new JLabel("Habitaciones");
		lblHabitaciones.setHorizontalAlignment(SwingConstants.CENTER);
		lblHabitaciones.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblHabitaciones.setBounds(51, 128, 239, 27);
		panel_1.add(lblHabitaciones);

		JLabel lblMenDeProductos_1_1 = new JLabel("Comida");
		lblMenDeProductos_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenDeProductos_1_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblMenDeProductos_1_1.setBounds(330, 128, 239, 27);
		panel_1.add(lblMenDeProductos_1_1);

		JLabel lblMenDeProductos_1_2 = new JLabel("Piscinas");
		lblMenDeProductos_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenDeProductos_1_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblMenDeProductos_1_2.setBounds(603, 128, 239, 27);
		panel_1.add(lblMenDeProductos_1_2);

		JLabel lblMenDeProductos_1_3 = new JLabel("Otros Servicios");
		lblMenDeProductos_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenDeProductos_1_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblMenDeProductos_1_3.setBounds(875, 128, 239, 27);
		panel_1.add(lblMenDeProductos_1_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBackground(new Color(32, 178, 170));
		panel_2.setBounds(51, 165, 239, 220);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(10, 10, 219, 200);
		panel_2.add(lbl1);
		final ImageIcon logo1 = new ImageIcon(getClass().getResource("/recursos/habitacion.png"));
		final ImageIcon icono1 = new ImageIcon(
				logo1.getImage().getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_DEFAULT));
		lbl1.setIcon(icono1);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBackground(new Color(255, 182, 193));
		panel_3.setBounds(329, 165, 239, 220);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(10, 10, 219, 200);
		panel_3.add(lbl2);
		final ImageIcon logo2 = new ImageIcon(getClass().getResource("/recursos/comida.png"));
		final ImageIcon icono2 = new ImageIcon(
				logo2.getImage().getScaledInstance(lbl2.getWidth(), lbl2.getHeight(), Image.SCALE_DEFAULT));
		lbl2.setIcon(icono2);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBackground(new Color(100, 149, 237));
		panel_4.setBounds(602, 165, 239, 220);
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(10, 10, 219, 200);
		panel_4.add(lbl3);
		final ImageIcon logo3 = new ImageIcon(getClass().getResource("/recursos/piscina.png"));
		final ImageIcon icono3 = new ImageIcon(
				logo3.getImage().getScaledInstance(lbl3.getWidth(), lbl3.getHeight(), Image.SCALE_DEFAULT));
		lbl3.setIcon(icono3);

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBackground(new Color(255, 160, 122));
		panel_5.setBounds(874, 165, 239, 220);
		panel_1.add(panel_5);
		panel_5.setLayout(null);

		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(10, 10, 219, 200);
		panel_5.add(lbl4);
		final ImageIcon logo4 = new ImageIcon(getClass().getResource("/recursos/servicios.png"));
		final ImageIcon icono4 = new ImageIcon(
				logo4.getImage().getScaledInstance(lbl4.getWidth(), lbl4.getHeight(), Image.SCALE_DEFAULT));
		lbl4.setIcon(icono4);

		JButton btnReservarHabitacion = new JButton("Reservaciones");
		btnReservarHabitacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_habitaciones habitaciones = new ventana_habitaciones();
				habitaciones.setLocationRelativeTo(null);
				habitaciones.setVisible(true);
				dispose();
			}
		});
		btnReservarHabitacion.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnReservarHabitacion.setBackground(new Color(32, 178, 170));
		btnReservarHabitacion.setBounds(51, 395, 238, 41);
		panel_1.add(btnReservarHabitacion);

		JButton btnTipica = new JButton("Comida Tipica");
		btnTipica.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_comida_tipica tipica = new ventana_comida_tipica();
				tipica.setLocationRelativeTo(null);
				tipica.setVisible(true);
				dispose();
			}
		});
		btnTipica.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnTipica.setBackground(new Color(255, 182, 193));
		btnTipica.setBounds(330, 395, 238, 41);
		panel_1.add(btnTipica);

		JButton btnGourmet = new JButton("Comida Gourmet");
		btnGourmet.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_comida_gourmet especial = new ventana_comida_gourmet();
				especial.setLocationRelativeTo(null);
				especial.setVisible(true);
				dispose();
			}
		});
		btnGourmet.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnGourmet.setBackground(new Color(255, 182, 193));
		btnGourmet.setBounds(330, 446, 238, 41);
		panel_1.add(btnGourmet);

		JButton btnServicioAHabitacion = new JButton("Servicio a la habitaci\u00F3n ");
		btnServicioAHabitacion.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_servicio_habitacion servicios = new ventana_servicio_habitacion();
				servicios.setLocationRelativeTo(null);
				servicios.setVisible(true);
				dispose();
			}
		});
		btnServicioAHabitacion.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnServicioAHabitacion.setBackground(new Color(32, 178, 170));
		btnServicioAHabitacion.setBounds(51, 446, 238, 41);
		panel_1.add(btnServicioAHabitacion);

		JButton btnPiscina = new JButton("Uso de piscina");
		btnPiscina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_ver_piscinas piscinas = new ventana_ver_piscinas();
				piscinas.setLocationRelativeTo(null);
				piscinas.setVisible(true);
				dispose();
			}
		});
		btnPiscina.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnPiscina.setBackground(new Color(100, 149, 237));
		btnPiscina.setBounds(604, 395, 238, 41);
		panel_1.add(btnPiscina);

		JButton btnReservarPiscina = new JButton("Reservaciones");
		btnReservarPiscina.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_piscinas piscinas = new ventana_piscinas();
				piscinas.setLocationRelativeTo(null);
				piscinas.setVisible(true);
				dispose();
			}
		});
		btnReservarPiscina.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnReservarPiscina.setBackground(new Color(100, 149, 237));
		btnReservarPiscina.setBounds(604, 446, 238, 41);
		panel_1.add(btnReservarPiscina);

		JButton btnServicios = new JButton("Servicios varios");
		btnServicios.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_servicios_varios servicios = new ventana_servicios_varios();
				servicios.setLocationRelativeTo(null);
				servicios.setVisible(true);
				dispose();
			}
		});
		btnServicios.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnServicios.setBackground(new Color(255, 160, 122));
		btnServicios.setBounds(875, 395, 238, 41);
		panel_1.add(btnServicios);

		JLabel lblHotelVillaPalma = new JLabel("HOTEL VILLA PALMA REAL");
		lblHotelVillaPalma.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelVillaPalma.setFont(new Font("Segoe UI Black", Font.BOLD, 30));
		lblHotelVillaPalma.setBounds(10, 37, 1146, 41);
		panel_1.add(lblHotelVillaPalma);

		JButton btnVerComida = new JButton("Ver Platillos");
		btnVerComida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_ver_comida comida = new ventana_ver_comida();
				comida.setLocationRelativeTo(null);
				comida.setVisible(true);
				dispose();
			}
		});
		btnVerComida.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnVerComida.setBackground(new Color(255, 182, 193));
		btnVerComida.setBounds(331, 497, 238, 41);
		panel_1.add(btnVerComida);
	}
}
