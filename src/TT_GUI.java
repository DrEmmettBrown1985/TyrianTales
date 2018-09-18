import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class TT_GUI extends JFrame implements ActionListener {

	
	private static final long serialVersionUID = 1L;

	 public TT_GUI() {	//Creates Buttons for class selection
	        super("Class Selection");
	        setLayout(new BorderLayout());
	        
	       
	        setSize(1920,1080);// sets the size of the frame in pixels, will be smaller if the resolution is unsupported
	        setResizable(true);// lets the user change the size of the window
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	setBackground(Color.BLACK);
	        setLayout(new FlowLayout());
	        
	 }
	public void actionPerformed(ActionEvent arg0) {//What it does upon clicking on something
		
		
	}

}
