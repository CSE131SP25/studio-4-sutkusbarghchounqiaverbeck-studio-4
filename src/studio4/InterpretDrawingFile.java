package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean filled = in.nextBoolean();
		
		if (shapeType .equals ("rectangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfHeight = in.nextDouble();
			double halfWidth = in.nextDouble();
			Color shapeColor = new Color(red, green, blue);
			StdDraw.setPenColor(shapeColor);
			if (filled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}

		}
		if (shapeType .equals ("triangle")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double y2 = in.nextDouble();
			double x2 = in.nextDouble();
			
			double[] xCoord = {x, x1, x2};
			double[] yCoord = {y, y1, y2};
			
			Color shapeColor = new Color(red, green, blue);
			StdDraw.setPenColor(shapeColor);
			if (filled) {
				StdDraw.filledPolygon(xCoord, yCoord);
			}
			else {
				StdDraw.polygon(xCoord, yCoord);
			}
			
		}
		if (shapeType .equals ("ellipse")) {
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfHeight = in.nextDouble();
			double halfWidth = in.nextDouble();
			Color shapeColor = new Color(red, green, blue);
			StdDraw.setPenColor(shapeColor);
			if (filled) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}

		}
		
	}
}
