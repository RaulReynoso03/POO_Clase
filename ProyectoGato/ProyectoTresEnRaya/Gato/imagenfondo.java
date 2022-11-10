package Gato;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public  class imagenfondo extends JPanel{
		   private Image imagen;
		   public void paint(Graphics g) {
		    imagen= new ImageIcon(getClass().getResource("2.png")).getImage();
		    g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
		    setOpaque(false);
		    super.paint(g);
		   }	 

}
