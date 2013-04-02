package javaapplication;

public class ClerkLogin extends javax.swing.JFrame 

{

    
    public ClerkLogin() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Main_Title = new javax.swing.JLabel();
        Clerk_Title = new javax.swing.JLabel();
        clerkLabel = new javax.swing.JLabel();
        clerkPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        User_ID = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        switchUser = new javax.swing.JButton();
        icon = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Repair Shop System");
        setBackground(new java.awt.Color(255, 255, 102));
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(938, 580));
        getContentPane().setLayout(null);

        Main_Title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Main_Title.setText("Auto Repair Shop System");
        getContentPane().add(Main_Title);
        Main_Title.setBounds(250, 0, 560, 40);
        Main_Title.getAccessibleContext().setAccessibleName("Main_Title\n");

        Clerk_Title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Clerk_Title.setText("Clerk");
        getContentPane().add(Clerk_Title);
        Clerk_Title.setBounds(440, 280, 100, 20);

        clerkLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clerkLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clerk.png"))); // NOI18N
        clerkLabel.setToolTipText("Login as Mechanic");
        getContentPane().add(clerkLabel);
        clerkLabel.setBounds(330, 80, 330, 240);
        getContentPane().add(clerkPassword);
        clerkPassword.setBounds(430, 370, 110, 30);

        password.setText("Password:");
        getContentPane().add(password);
        password.setBounds(370, 370, 80, 40);

        ID.setText("ID:");
        getContentPane().add(ID);
        ID.setBounds(410, 340, 15, 14);

        User_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                User_IDActionPerformed(evt);
            }
        });
        getContentPane().add(User_ID);
        User_ID.setBounds(430, 330, 110, 30);

        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(360, 410, 80, 30);

        switchUser.setText("Switch User");
        getContentPane().add(switchUser);
        switchUser.setBounds(440, 410, 150, 30);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arss.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(820, 420, 170, 180);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 970, 580);

        setBounds(150, 70, 954, 618);
    }// </editor-fold>                        

    private void User_IDActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClerkLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClerkLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClerkLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClerkLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClerkLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel ID;
    private javax.swing.JButton Login;
    private javax.swing.JLabel Main_Title;
    private javax.swing.JLabel Clerk_Title;
    private javax.swing.JTextField User_ID;
    private javax.swing.JLabel background;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel clerkLabel;
    private javax.swing.JPasswordField clerkPassword;
    private javax.swing.JLabel password;
    private javax.swing.JButton switchUser;
    // End of variables declaration                   
}
