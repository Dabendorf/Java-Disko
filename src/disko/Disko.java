package disko;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;

/**
 * Dies ist die Hauptklasse des Diskoprogrammes. Sie generiert die gesamte graphische Oberflaeche.
 * 
 * @author Lukas Schramm
 * @version 1.0
 *
 */
public class Disko {

	private JFrame frame1 = new JFrame("Disko");
	private int breite = 1000;
	private int hoehe = 500;
	private int faktor = breite/(breite/25);
	private int x=breite/faktor,y=hoehe/faktor;
	private Diskozelle zelle[][] = new Diskozelle[x][y];
	
	public Disko() {
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setPreferredSize(new Dimension(breite,hoehe));
        frame1.setMinimumSize(new Dimension(200,200));
		frame1.setResizable(true);
		
		GridLayout gridlayout = new GridLayout(y,x);
		Container cp = frame1.getContentPane();
		cp.setLayout(gridlayout);
		
		for(int b=0;b<x;b++) {
			for(int h=0;h<y;h++) {
				zelle[b][h] = new Diskozelle();
				zelle[b][h].setOpaque(true);
				frame1.add(zelle[b][h]);
			}
		}
		
		frame1.pack();
		frame1.setLocationRelativeTo(null);
		frame1.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Disko();
	}

}