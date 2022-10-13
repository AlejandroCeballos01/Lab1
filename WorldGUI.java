
import java.awt.*;
import javax.swing.*;

public class WorldGUI extends JPanel {

	// define a world attribute here
	
	public WorldGUI() {
		// initialize the world here

		// Place the GUI inside a window and show it on the screen
		JFrame frame = new JFrame("World");
		setPreferredSize(new Dimension(800, 600));
		frame.add(this);
		frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		// Perform 1000 simulation steps
		try { simulate(1000); }
		catch (Exception e) {}
	}
	
	public void simulate(int steps) throws Exception {
		for (int i = 0; i < steps; ++i) {
			// sleep for 10 milliseconds
			Thread.sleep(10);
			
			// perform a simulation step of the world
			
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		// paint the world
	}

}
