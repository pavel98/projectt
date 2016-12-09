import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class project {

	
	public static void main(String[] args) {
		
		JFrame jf; 
		
		JPanel AllProblems;
		
		jf = new JFrame();
		jf.setVisible(true);
		jf.setSize(1366, 768);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        AllProblems = new JPanel();
        AllProblems.setVisible(true);
        AllProblems.setSize(1366, 768);
        AllProblems.setLayout(null);
        AllProblems.setBackground(Color.BLUE);
        AllProblems.setOpaque(true);
		
		
		
		
		
		jf.add(AllProblems);
		
	}

}
