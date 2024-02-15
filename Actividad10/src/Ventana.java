import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	/*Constructor que define los atributos base
	 * de mi ventana */
	public Ventana() {
		this.setTitle("ASd");
		
		this.setVisible(true);
		
		//tamaño de la ventana
		this.setSize(200, 200);
		
		//cerrar ventana por defecto
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//titulo
		this.setTitle("Mi ventana");
		
		//tamaños de la ventana
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(270,270));
		this.setResizable(true);
		
		//ubicacion en la pantalla
		this.setLocation(200,200);
		
		//centrar
		this.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		
		JPanel login = new JPanel();
		login.setSize(this.getWidth(), this.getHeight());
		login.setBackground(Color.red);
		this.add(login);
		
	}
}
