package TicTacToe;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;

public class ScreenCapture {
	public ScreenCapture(int x, int y, int width, int height) throws IOException, HeadlessException, AWTException {
		// TODO Auto-generated constructor stub
		 // capture the whole screen
	     BufferedImage screencapture = new Robot().createScreenCapture(
	           new Rectangle(x, y, width, height));

	     // Save as JPEG
	     File file = new File("screencapture.jpg");
	     ImageIO.write(screencapture, "jpg", file);

	     // Save as PNG
	     // File file = new File("screencapture.png");
	     // ImageIO.write(screencapture, "png", file);
	}
 
}