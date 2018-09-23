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
public class TT_GUI
    {
        public static void TT_GUI (String[]args)
        {
            TT_Logic UserStats = new TT_Logic();
            int UserHP = UserStats.HP;
            int UserHL = UserStats.HL;
            System.out.println("This is your current HP: "+UserHP);
        }

	

	}


