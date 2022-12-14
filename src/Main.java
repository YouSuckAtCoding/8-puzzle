import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {
	 public static void main(String[] args) {
		    SwingUtilities.invokeLater(() -> {
		      JFrame frame = new JFrame();
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setTitle("Game of Fifteen");
		      frame.setResizable(false);
		      frame.add(new Puzzle(3, 550, 30), BorderLayout.CENTER);
		      frame.pack();
		      // center on the screen
		      frame.setLocationRelativeTo(null);
		      frame.setVisible(true);
		    });
		  }
}
