package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginForm {
public static void main(String[] args) {
	JFrame ventana = new JFrame("UenosBus - Login");
	ventana.setSize(300, 200);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	ventana.setResizable(false); //no redimensionable 
	ventana.setLayout(new GridLayout(3, 1));
	
	JPanel panel = new JPanel();
	panel.setLayout(new GridLayout(3, 1));
	
	JLabel usuario =new JLabel();
	usuario.setText("User: ");
	JTextField tUsuario = new JTextField();
	
	JLabel contraseña =new JLabel();
	contraseña.setText("Password: ");
	JTextField tContraseña = new JTextField();
	
	
	JButton bIngresar = new JButton("Enter");
	
	bIngresar.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String usuario = tUsuario.getText();
			String password = tContraseña.getText();
			String mensaje = "";
			int tipo;
			if (usuario.equals("admin") && password.equals("12345")) {
				mensaje = "Acceso correcto";
				tipo = 2;
			}else {
				mensaje = "Acceso incorrecto";
				tipo = 0;
			}
			JOptionPane.showMessageDialog(ventana,  mensaje, "Mensaje: ", tipo);
			
		}
			
		
	} );
	
	
	panel.add(usuario);
	panel.add(tUsuario);
	panel.add(contraseña);
	panel.add(tContraseña);
	panel.add(bIngresar);
	
	
	
	
	
	ventana.add(panel);
	ventana.setVisible(true);

}
}
