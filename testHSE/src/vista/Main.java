package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		marcoInicio marco1 = new marcoInicio();
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class marcoInicio extends JFrame{
	
	public marcoInicio() {
		
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamano = pantalla.getScreenSize();
		
		int altura = tamano.height;
		
		int ancho = tamano.width;
		
		setSize(ancho/3, altura/2);
		
		setLocation(ancho/3, altura/4);
		
		setTitle("Test HSE");

		setVisible(true);
		
		Lamina lamina = new Lamina();
		
		add(lamina);
		
		lamina.setBackground(Color.WHITE);
		
				
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("INICIO", 150, 50);
		
	}
	
}
