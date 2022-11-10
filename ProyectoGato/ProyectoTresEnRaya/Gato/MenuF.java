package Gato;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class  MenuF extends JPanel{
	   private Image imagen2;
	   public void paint(Graphics g) {
	    imagen2= new ImageIcon(getClass().getResource("S.png")).getImage();
	    g.drawImage(imagen2,0,0,getWidth(),getHeight(),this);
	    setOpaque(false);
	    super.paint(g);
	   }	
}