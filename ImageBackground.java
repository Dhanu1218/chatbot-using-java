//PACKAGE THAT DEFINES METHODS TO SET BACKGROUND IMAGE

package Image;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ImageBackground extends JTextArea
{
	Image image;
	
	public  void setImage(ImageIcon icon)
	{
		this.image = icon.getImage();
		setOpaque(false);
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawImage(image, 0, 0, 1350, 610, null);
		super.paint(g);
	}
}


