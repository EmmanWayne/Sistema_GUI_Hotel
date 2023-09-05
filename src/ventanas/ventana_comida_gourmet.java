package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class ventana_comida_gourmet extends JFrame {

	private JPanel contentPane;
	private JComboBox cbxPlatillo;
	private JTextField txtPrecio;
	private JTextField txtMesa;
	private JTextField txtPago;
	private JTable tabla;
	private JComboBox cbxHabitacion = new JComboBox();
	private JLabel lblNumero;
	DefaultTableModel model;
	private JTextField txtCantidad;

	public ventana_comida_gourmet() {
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

		JLabel lblNewLabel = new JLabel("COMIDA GOURMET \"HOTEL VILLA PALMA REAL\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 10, 1146, 33);
		panel.add(lblNewLabel);

		JButton btnRegresar = new JButton("ATR\u00C1S");
		btnRegresar.setFont(new Font("Segoe UI", Font.BOLD, 18));
		btnRegresar.setBackground(Color.WHITE);
		btnRegresar.setBounds(1055, 10, 101, 33);
		panel.add(btnRegresar);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(lblNumero.getText().toString());
				int nuevo_id = id + 1;
				String numeroNuevo = String.valueOf(nuevo_id);
				lblNumero.setText(numeroNuevo);

				cbxPlatillo.setSelectedIndex(0);
				txtPrecio.setText("");
				cbxHabitacion.setSelectedIndex(0);
				txtMesa.setText("");
				txtPago.setText("");
			}
		});
		btnNuevo.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnNuevo.setBackground(Color.WHITE);
		btnNuevo.setBounds(10, 10, 140, 32);
		panel.add(btnNuevo);
		btnRegresar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_menu menu = new ventana_menu();
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
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
		panel_2.setBounds(10, 10, 466, 555);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblIngreseSusCredenciales = new JLabel("COMIDA GOURMET");
		lblIngreseSusCredenciales.setBounds(10, 10, 269, 57);
		panel_2.add(lblIngreseSusCredenciales);
		lblIngreseSusCredenciales.setFont(new Font("Segoe UI", Font.BOLD, 20));

		JLabel lblPlatillo = new JLabel("Platillo Especial:");
		lblPlatillo.setBounds(10, 59, 446, 27);
		panel_2.add(lblPlatillo);
		lblPlatillo.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		cbxPlatillo = new JComboBox();
		cbxPlatillo.setModel(new DefaultComboBoxModel(new String[] { "1. Camarones", "2. Langosta", "3. Caviar",
				"4. Filete de pescado", "5. Postre de chocolate" }));
		cbxPlatillo.setBounds(10, 96, 446, 32);
		panel_2.add(cbxPlatillo);
		cbxPlatillo.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(10, 138, 219, 27);
		panel_2.add(lblPrecio);
		lblPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 466, 219, 32);
		panel_2.add(btnGuardar);
		btnGuardar.setBackground(new Color(102, 205, 170));
		btnGuardar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));

		txtPrecio = new JTextField();
		txtPrecio.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(10, 175, 219, 32);
		panel_2.add(txtPrecio);
		txtPrecio.setText("30.00");

		JLabel lblSeleccioneLaHabitacion = new JLabel("Seleccione lugar de consumo:");
		lblSeleccioneLaHabitacion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblSeleccioneLaHabitacion.setBounds(10, 219, 446, 27);
		panel_2.add(lblSeleccioneLaHabitacion);

		JLabel lbl = new JLabel("Mesa para cuantas personas:");
		lbl.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lbl.setBounds(10, 298, 446, 27);
		panel_2.add(lbl);

		txtMesa = new JTextField();
		txtMesa.setHorizontalAlignment(SwingConstants.CENTER);
		txtMesa.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtMesa.setColumns(10);
		txtMesa.setBounds(10, 335, 219, 32);
		panel_2.add(txtMesa);

		JLabel lblContrasea_1_1 = new JLabel("Pago total:");
		lblContrasea_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblContrasea_1_1.setBounds(237, 298, 219, 27);
		panel_2.add(lblContrasea_1_1);

		txtPago = new JTextField();
		txtPago.setEditable(false);
		txtPago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPago.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPago.setColumns(10);
		txtPago.setBounds(237, 335, 219, 32);
		panel_2.add(txtPago);

		cbxHabitacion = new JComboBox();
		cbxHabitacion.setModel(new DefaultComboBoxModel(new String[] { "Mesa del restaurante", "Habitacion 500",
				"Habitacion 501", "Habitacion 502", "Habitacion 503", "Habitacion 504", "Habitacion 505",
				"Habitacion 506", "Habitacion 507", "Habitacion 508", "Habitacion 509", "Habitacion 510" }));
		cbxHabitacion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cbxHabitacion.setBounds(10, 256, 446, 32);
		panel_2.add(cbxHabitacion);

		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarRegistro();
			}
		});
		btnActualizar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnActualizar.setBackground(new Color(100, 149, 237));
		btnActualizar.setBounds(10, 508, 219, 32);
		panel_2.add(btnActualizar);

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btnEditar.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						int filaseleccionada;
						try {
							filaseleccionada = tabla.getSelectedRow();
							if (filaseleccionada == -1) {
								JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
							} else {
								String numero = tabla.getValueAt(filaseleccionada, 0).toString();
								String platillo = tabla.getValueAt(filaseleccionada, 1).toString();
								String precio = tabla.getValueAt(filaseleccionada, 2).toString();
								String cantidad = tabla.getValueAt(filaseleccionada, 3).toString();
								String lugar = tabla.getValueAt(filaseleccionada, 4).toString();
								String mesa = tabla.getValueAt(filaseleccionada, 5).toString();
								String pago = tabla.getValueAt(filaseleccionada, 6).toString();

								lblNumero.setText(numero);
								cbxPlatillo.setSelectedItem(platillo);
								txtPrecio.setText(precio);
								txtCantidad.setText(cantidad);
								cbxHabitacion.setSelectedItem(lugar);
								txtMesa.setText(mesa);
								txtPago.setText(pago);

							}

						} catch (HeadlessException ex) {
							JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente",
									" .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
						}
					}

				});
			}
		});
		btnEditar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnEditar.setBackground(new Color(255, 250, 205));
		btnEditar.setBounds(237, 466, 219, 32);
		panel_2.add(btnEditar);

		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int filaseleccionada;
				filaseleccionada = tabla.getSelectedRow();
				if (filaseleccionada == -1) {
					JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
				} else {

					DefaultTableModel dtm = (DefaultTableModel) tabla.getModel();
					dtm.removeRow(tabla.getSelectedRow());
					JOptionPane.showMessageDialog(null, "¡REGISTRO ELIMINADO!");

				}
			}
		});
		btnEliminar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnEliminar.setBackground(new Color(240, 128, 128));
		btnEliminar.setBounds(237, 508, 219, 32);
		panel_2.add(btnEliminar);

		lblNumero = new JLabel("1");
		lblNumero.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumero.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNumero.setBounds(391, 10, 65, 57);
		panel_2.add(lblNumero);

		JButton btnVerPlatillos = new JButton("Ver Platillos");
		btnVerPlatillos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana_ver_comida comida = new ventana_ver_comida();
				comida.setLocationRelativeTo(null);
				comida.setVisible(true);
				dispose();
			}
		});
		btnVerPlatillos.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnVerPlatillos.setBackground(new Color(102, 205, 170));
		btnVerPlatillos.setBounds(219, 24, 162, 32);
		panel_2.add(btnVerPlatillos);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblCantidad.setBounds(237, 138, 219, 27);
		panel_2.add(lblCantidad);

		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String precio = txtPrecio.getText().toString();
				String cantidad = txtCantidad.getText().toString();
				double precioDato = Double.parseDouble(precio);
				int CantidadDato = Integer.valueOf(cantidad);
				Double pagoTotal = (precioDato * CantidadDato);
				String resultado = String.valueOf(pagoTotal);
				txtPago.setText(resultado);
			}
		});
		txtCantidad.setHorizontalAlignment(SwingConstants.TRAILING);
		txtCantidad.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(237, 175, 219, 32);
		panel_2.add(txtCantidad);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(486, 10, 670, 555);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("N°");
		model.addColumn("Platillo");
		model.addColumn("Precio");
		model.addColumn("Cantidad");
		model.addColumn("Lugar de consumo");
		model.addColumn("Mesa");
		model.addColumn("Total Pago");

		JScrollPane barra = new JScrollPane();
		barra = new JScrollPane(tabla, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		barra.setBounds(10, 10, 650, 535);
		panel_3.add(barra);
		tabla = new JTable(model);
		tabla.setBorder(new LineBorder(new Color(0, 0, 0)));
		barra.setViewportView(tabla);

		btnGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarRegistro();
			}
		});

		cbxPlatillo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				asignarPrecios();
			}

		});
	}

	public void guardarRegistro() {
		if (txtPrecio.getText().toString().equals("") || txtMesa.getText().toString().equals("")
				|| txtPago.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "Nota: Antes de guardar el registro debe ingresar todos los datos.");
		} else {
			String numero, platillo, precio, cantidad, habitacion, mesa, pago;
			numero = lblNumero.getText().toString();
			platillo = cbxPlatillo.getSelectedItem().toString();
			precio = txtPrecio.getText().toString();
			cantidad = txtCantidad.getText().toString();
			habitacion = cbxHabitacion.getSelectedItem().toString();
			mesa = txtMesa.getText().toString();
			pago = txtPago.getText().toString();

			model = (DefaultTableModel) tabla.getModel();
			model.addRow(new Object[] { numero, platillo, precio, cantidad, habitacion, mesa, pago });

			JOptionPane.showMessageDialog(null, "!REGISTRO GUARDADO!");
			int id = Integer.parseInt(lblNumero.getText().toString());
			int nuevo_id = id + 1;
			String numeroNuevo = String.valueOf(nuevo_id);
			lblNumero.setText(numeroNuevo);

			cbxPlatillo.setSelectedIndex(0);
			txtPrecio.setText("");
			txtCantidad.setText("");
			cbxHabitacion.setSelectedIndex(0);
			txtMesa.setText("");
			txtPago.setText("");

		}

	}

	public void asignarPrecios() {
		if (cbxPlatillo.getSelectedItem().equals("1. Camarones")) {
			txtPrecio.setText("850.00");
		} else {
			if (cbxPlatillo.getSelectedItem().equals("2. Langosta")) {
				txtPrecio.setText("1000.00");
			} else {
				if (cbxPlatillo.getSelectedItem().equals("3. Caviar")) {
					txtPrecio.setText("1500.00");
				} else {
					if (cbxPlatillo.getSelectedItem().equals("4. Filete de pescado")) {
						txtPrecio.setText("750.00");
					} else {
						if (cbxPlatillo.getSelectedItem().equals("5. Postre de chocolate")) {
							txtPrecio.setText("600.00");
						}
					}
				}
			}
		}
	}

	public void actualizarRegistro() {

		int filaseleccionada;
		filaseleccionada = tabla.getSelectedRow();
		if (filaseleccionada == -1) {
			JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
		} else {

			String data[] = new String[7];
			data[0] = lblNumero.getText();
			data[1] = cbxPlatillo.getSelectedItem().toString();
			data[2] = txtPrecio.getText();
			data[3] = txtCantidad.getText();
			data[4] = cbxHabitacion.getSelectedItem().toString();
			data[5] = txtMesa.getText();
			data[6] = txtPago.getText();

			for (int i = 0; i < tabla.getColumnCount(); i++) {
				model.setValueAt(data[i], filaseleccionada, i);
			}

			JOptionPane.showMessageDialog(null, "¡REGISTRO ACTUALIZADO!");
		}

	}
}
