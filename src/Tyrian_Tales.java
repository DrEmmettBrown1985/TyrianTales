/*import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;*/
import javax.swing.*;
/*import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;*/
import java.awt.*;
import java.awt.event.*;

public class Tyrian_Tales extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	public int c;
	public static void main(String[] args) {
		
	new Tyrian_Tales().setVisible(true);

	
	}


	public Tyrian_Tales() //Creates Buttons for class selection
        {
	        super("Class Selection");
	        setLayout(new BorderLayout());

	        //Specifies the parameters for the Class Selection GUI, 800x600 pixels and centered on the user's screen
	        setSize(800,600);
	        setResizable(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	    	setBackground(Color.GRAY);
	        setLayout(new FlowLayout());
            setLocationRelativeTo(null);

	        //Makes a button for each class

            JButton button0 = new JButton(new ImageIcon("bt/0.jpg"));
            JButton button1 = new JButton(new ImageIcon("bt/1.jpg"));
            JButton button2 = new JButton(new ImageIcon("bt/2.jpg"));
            JButton button3 = new JButton(new ImageIcon("bt/3.jpg"));
            JButton button4 = new JButton(new ImageIcon("bt/4.jpg"));
	        	add(button0);
	 	        add(button1);
	 	        add(button2);
	 	        add(button3);
	 	        add(button4);

	 	        button0.addActionListener(this);
	 	        button0.setName("Mage");
	 	        button0.setText("Mage");
                button0.setBorder(null);
                button0.setPreferredSize(new Dimension(80, 40));


	 	        button1.addActionListener(this);
	 	        button1.setName("Archer");
                button1.setText("Archer");
                button1.setBorder(null);
                button1.setPreferredSize(new Dimension(80, 40));

	 	        button2.addActionListener(this);
	 	        button2.setName("Warrior");
                button2.setText("Warrior");
                button2.setBorder(null);
	 	        button2.setPreferredSize(new Dimension(80, 40));

	 	        button3.addActionListener(this);
	 	        button3.setName("Knight");
                button3.setText("Knight");

                button3.setBorder(null);
                button3.setPreferredSize(new Dimension(80, 40));

	 	        button4.addActionListener(this);
	 	        button4.setName("Paladin");
                button4.setText("Paladin");
                button4.setBorder(null);
                button4.setPreferredSize(new Dimension(80, 40));
	 	        
        }
	    

	public void actionPerformed(ActionEvent e) {//Class descriptions/ selection
		int n=1;
		c=0;
		JButton o = (JButton)e.getSource();
		   String name = o.getName();
		   String acc_mesg = "\n Do you want to play this class?";
		   String description ="You picked " +name;
		   JTextArea outputArea = new JTextArea(10, 40);
			JScrollPane scroller = new JScrollPane(outputArea);
			if(name=="Mage")
			{
				c=1;
				description=description+"\nMages have light armour and can wield Staffs, Scepters, Swords, and Foci" +acc_mesg;
			}
			if(name=="Archer")
			{
				c=2;
				description=description+"\nArchers have medium armour and can weild Longbows, Shortbows,\n Crossbows, and Daggers"+acc_mesg;
			}
			if(name=="Warrior")
			{
				c=3;
				description=description+"\nWarriors wear good armour and can wield Shortbows, Axes, Swords, Greatswords,\n Daggers, and Warhammers "+acc_mesg;
			}
			if(name=="Knight")
			{
				c=4;
				description=description+"\nKnights wear heavy armour and can wield Swords, Sheilds, \nLongbows, and Greatswords"+acc_mesg;
			}
			if(name=="Paladin")
			{
				c=5;
				description=description+"\nPaladins don the heaviest armour and can wield Scepters, Sheilds, \nWarhammers, Swords, Greatswords, and Banners"+acc_mesg;
			}
			outputArea.setText(description);
			
			n=JOptionPane.showOptionDialog(scroller, scroller, "Class Selection", JOptionPane.YES_NO_OPTION,
					0, null, null, null);
			if(n==0)
			{
				JOptionPane.showMessageDialog(null, ("You chose "+name ), null, 0);
			setVisible(false);

	        
			}
			/*int c is ID for classes
			  Class ID's are as follows
			  Mage=1
			  Archer=2
			  Warrior=3
			  Knight=4
			  Paladin=5
			 */
			
	
	 
	
	
}

      
	 
	}// end*/

