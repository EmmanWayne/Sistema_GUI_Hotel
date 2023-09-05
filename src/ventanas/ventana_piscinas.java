package ventanas;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class ventana_piscinas extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtIdentidad;
	private JTextField txtPersonas;
	private JTextField txtPago;
	private JTable tabla;
	private JComboBox cbxHabitacion = new JComboBox();
	private JComboBox cbxPiscina;
	private JLabel lblNumero;
	DefaultTableModel model;

	public ventana_piscinas() {
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

		JLabel lblNewLabel = new JLabel("RESERVACION DE PISCINAS \"HOTEL VILLA PALMA REAL\"");
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

				txtNombre.setText("");
				txtIdentidad.setText("");
				cbxHabitacion.setSelectedIndex(0);
				txtPersonas.setText("");
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

		JLabel lblIngreseSusCredenciales = new JLabel("PISCINAS");
		lblIngreseSusCredenciales.setBounds(10, 10, 269, 57);
		panel_2.add(lblIngreseSusCredenciales);
		lblIngreseSusCredenciales.setFont(new Font("Segoe UI", Font.BOLD, 20));

		JLabel lblUsuario = new JLabel("Nombre completo del responsable:");
		lblUsuario.setBounds(10, 59, 446, 27);
		panel_2.add(lblUsuario);
		lblUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		txtNombre = new JTextField();
		txtNombre.setBounds(10, 96, 446, 32);
		panel_2.add(txtNombre);
		txtNombre.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtNombre.setColumns(10);

		JLabel lblContrasea = new JLabel("Identidad del responsable:");
		lblContrasea.setBounds(10, 138, 446, 27);
		panel_2.add(lblContrasea);
		lblContrasea.setFont(new Font("Segoe UI", Font.PLAIN, 15));

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 466, 219, 32);
		panel_2.add(btnGuardar);
		btnGuardar.setBackground(new Color(102, 205, 170));
		btnGuardar.setFont(new Font("Segoe UI Black", Font.BOLD, 18));

		txtIdentidad = new JTextField();
		txtIdentidad.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtIdentidad.setColumns(10);
		txtIdentidad.setBounds(10, 175, 446, 32);
		panel_2.add(txtIdentidad);

		JLabel lblSeleccioneLaHabitacion = new JLabel("Seleccione la piscina:");
		lblSeleccioneLaHabitacion.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblSeleccioneLaHabitacion.setBounds(10, 219, 446, 27);
		panel_2.add(lblSeleccioneLaHabitacion);

		JLabel lblTiempoDeEstadia = new JLabel("Numero de personas:");
		lblTiempoDeEstadia.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTiempoDeEstadia.setBounds(10, 298, 446, 27);
		panel_2.add(lblTiempoDeEstadia);

		txtPersonas = new JTextField();
		txtPersonas.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPersonas.setColumns(10);
		txtPersonas.setBounds(10, 335, 446, 32);
		panel_2.add(txtPersonas);

		JLabel lblContrasea_1_1 = new JLabel("Pago total:");
		lblContrasea_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblContrasea_1_1.setBounds(10, 377, 446, 27);
		panel_2.add(lblContrasea_1_1);

		txtPago = new JTextField();
		txtPago.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		txtPago.setColumns(10);
		txtPago.setBounds(10, 414, 446, 32);
		panel_2.add(txtPago);

		cbxPiscina = new JComboBox();
		cbxPiscina.setModel(new DefaultComboBoxModel(new String[] {"Piscina 1 (ADULTOS)", "Piscina 2 (NI\u00D1OS)", "Piscina 3 (NATACION)", "Piscina 4 (RESERVACIONES)"}));
		cbxPiscina.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		cbxPiscina.setBounds(10, 256, 446, 32);
		panel_2.add(cbxPiscina);

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
								String nombre = tabla.getValueAt(filaseleccionada, 1).toString();
								String identidad = tabla.getValueAt(filaseleccionada, 2).toString();
								String habitacion = tabla.getValueAt(filaseleccionada, 3).toString();
								String estadia = tabla.getValueAt(filaseleccionada, 4).toString();
								String pago = tabla.getValueAt(filaseleccionada, 5).toString();

								lblNumero.setText(numero);
								txtNombre.setText(nombre);
								txtIdentidad.setText(identidad);
								cbxHabitacion.setSelectedItem(habitacion);
								txtPersonas.setText(estadia);
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

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(486, 10, 670, 555);
		panel_1.add(panel_3);
		panel_3.setLayout(null);

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("N°");
		model.addColumn("Responsable");
		model.addColumn("Identidad");
		model.addColumn("Piscina");
		model.addColumn("Personas");
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
	}

	public void guardarRegistro() {
		if (txtNombre.getText().toString().equals("") || txtIdentidad.getText().toString().equals("")
				|| txtPersonas.getText().toString().equals("") || txtPago.getText().toString().equals("")) {
			JOptionPane.showMessageDialog(null, "Nota: Antes de guardar el registro debe ingresar todos los datos.");
		} else {
			String numero, nombre, identidad, habitacion, personas, pago;
			numero = lblNumero.getText().toString();
			nombre = txtNombre.getText().toString();
			identidad = txtIdentidad.getText().toString();
			habitacion = cbxPiscina.getSelectedItem().toString();
			personas = txtPersonas.getText().toString();
			pago = txtPago.getText().toString();

			model = (DefaultTableModel) tabla.getModel();
			model.addRow(new Object[] { numero, nombre, identidad, habitacion, personas, pago });

			JOptionPane.showMessageDialog(null, "!REGISTRO GUARDADO!");
			int id = Integer.parseInt(lblNumero.getText().toString());
			int nuevo_id = id + 1;
			String numeroNuevo = String.valueOf(nuevo_id);
			lblNumero.setText(numeroNuevo);

			txtNombre.setText("");
			txtIdentidad.setText("");
			cbxPiscina.setSelectedIndex(0);
			txtPersonas.setText("");
			txtPago.setText("");

		}

	}

	public void actualizarRegistro() {

		int filaseleccionada;
		filaseleccionada = tabla.getSelectedRow();
		if (filaseleccionada == -1) {
			JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
		} else {

			String data[] = new String[6];
			data[0] = lblNumero.getText();
			data[1] = txtNombre.getText();
			data[2] = txtIdentidad.getText();
			data[3] = cbxPiscina.getSelectedItem().toString();
			data[4] = txtPersonas.getText();
			data[5] = txtPago.getText();

			for (int i = 0; i < tabla.getColumnCount(); i++) {
				model.setValueAt(data[i], filaseleccionada, i);
			}

			JOptionPane.showMessageDialog(null, "¡REGISTRO ACTUALIZADO!");
		}

	}
}
