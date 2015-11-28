package disko;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Diese Klasse stellt eine Zelle der gesamten Flaeche dar. Sie wechselt zufaellig die Farbe.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Diskozelle extends JPanel {
	
	private Random rand = new Random();
	
	public Diskozelle() {
		this.setBorder(BorderFactory.createLineBorder(Color.black));
	}

	@Override
	protected void paintComponent(Graphics gr) {
		super.paintComponent(gr);
		this.setBackground(new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
	}
}