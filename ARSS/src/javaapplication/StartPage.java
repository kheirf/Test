package javaapplication;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class StartPage extends JFrame implements ActionListener
{    
	private JButton admin; 
	private JButton clerk; 
	private JButton mech; 
	
    public StartPage() 
    {
        initComponents();
    }
                  
    public void initComponents() {
    	                    
        
        JLabel adminTitle;
        JLabel background;       
        JLabel clerkTitle;
        JLabel logo;
        JLabel mainTitle;
        JLabel mechTitle;
        // End of variables declaration    

        mainTitle = new JLabel();
        logo = new JLabel();
        clerkTitle = new JLabel();
        adminTitle = new JLabel();
        mechTitle = new JLabel();
        admin = new JButton();
        clerk = new JButton();
        mech = new JButton();
        background = new JLabel();
        admin.addActionListener(this);
        clerk.addActionListener(this);
        mech.addActionListener(this);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Repair Shop System");
        setBackground(new java.awt.Color(255, 255, 102));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(938, 580));
        getContentPane().setLayout(null);

        mainTitle.setFont(new Font("Tahoma", 0, 36)); // NOI18N
        mainTitle.setText("Auto Repair Shop System");
        getContentPane().add(mainTitle);
        mainTitle.setBounds(280, 0, 560, 40);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arss.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(820, 430, 170, 180);

        clerkTitle.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        clerkTitle.setText("Clerk");
        getContentPane().add(clerkTitle);
        clerkTitle.setBounds(430, 320, 170, 30);

        adminTitle.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        adminTitle.setText("Administrator");
        getContentPane().add(adminTitle);
        adminTitle.setBounds(100, 310, 200, 60);

        mechTitle.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        mechTitle.setText("Mechanic");
        getContentPane().add(mechTitle);
        mechTitle.setBounds(730, 310, 120, 50);

        admin.setIcon(new ImageIcon(getClass().getResource("/admin.png"))); // NOI18N
        getContentPane().add(admin);
        admin.setBounds(10, 100, 300, 250);

        clerk.setIcon(new ImageIcon(getClass().getResource("/clerk.png"))); // NOI18N
       
      
        getContentPane().add(clerk);
        clerk.setBounds(320, 100, 300, 250);

        mech.setIcon(new ImageIcon(getClass().getResource("/mechanic.png"))); // NOI18N
        
        getContentPane().add(mech);
        mech.setBounds(630, 100, 300, 250);

        background.setIcon(new ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 940, 580);

        setBounds(150, 70, 954, 618);        
        
    }                 
                                
    public static void main(String args[]) 
    {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    
    public void actionPerformed(ActionEvent e) 
    {                                      
    	 if (e.getSource() == admin) 
    	 {    
    		this.setVisible(false);
    		new AdminLogin().setVisible(true);    		 
    		 
    	 }
    	 if (e.getSource() == clerk) 
    	 {
    		 new ClerkLogin().setVisible(true); 
    	 }
    	 if (e.getSource() == mech) 
    	 {
    		 new MechanicLogin().setVisible(true); 
    	 }
    }
    public void exitPage()
    {
    	this.setVisible(false);
    	System.exit(0);
    }


                 
}
