package conexionbd;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductoGUI extends JFrame{
	public static void main(String[] args) {
		new ProductoGUI().setVisible(true);
	}
	private JTextField nameField, priceField;
	private JTable table;
	private DefaultTableModel model;
	
	public ProductoGUI() {
		setTitle("Gestion de Productos");
		setSize(500, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new FlowLayout());
		formPanel.add(new JLabel("nombre"));
		nameField = new JTextField(10);
		formPanel.add(nameField);
		formPanel.add(new JLabel("Precio: "));
		priceField = new JTextField(5);
		formPanel.add(priceField);
		JButton addButton = new JButton("Agregar");
		formPanel.add(addButton);
		add(formPanel, BorderLayout.NORTH);
		
		model = new DefaultTableModel(new String[] {"codigo",
				"Nombre", "Precio"}, 0);
		table = new JTable(model);
		add(new JScrollPane(table), BorderLayout.CENTER);
		
		cargarProducto();
		addButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				agregarProducto();
				
			}
		});
	}
	private void cargarProducto() {
		Conexion c = new Conexion();
		Statement stmt;
		try {
			stmt = c.conexion.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM productos");
			model.setRowCount(0);
			while(rs.next()) {
				model.addRow(new Object[] {rs.getInt("codigo"),
						rs.getString("nombre"), rs.getDouble("precio")});
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	private void agregarProducto() {
		String nombre = nameField.getText();
		String precio = priceField.getText();
		if (nombre.isEmpty() || precio.isEmpty()) {
		JOptionPane.showMessageDialog(this, "Todos los campos"
				+ "Son obligatorios.", "ERROR",
				JOptionPane.ERROR_MESSAGE);
			return;
		}
		Conexion c = new Conexion();
		PreparedStatement stmt;
		try {
			stmt = c.conexion.prepareStatement("INSERT "
					+ "INTO productos (nombre, precio) VALUES (?, ?)");
			
			stmt.setString(1, nombre);
			stmt.setDouble(2, Double.parseDouble(precio));
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cargarProducto();
		nameField.setText("");
		priceField.setText("");
	}
}


