
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gshal
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public login() {
        super("Login");
        initComponents();
        conn = (Connection) databaseConnection.connection();
        if (conn == null) {
        // Handle the case when database connection is not successful
        JOptionPane.showMessageDialog(null, "Failed to establish database connection.");
        System.exit(1); // Exit the program gracefully
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JPanel();
        Email = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jButton = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        email.setBackground(new java.awt.Color(0, 0, 0));
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        Email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("Email");

        Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password");

        jButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\gshal\\OneDrive\\Documents\\NetBeansProjects\\project Image\\login1.png")); // NOI18N
        jButton.setText("Login");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        cancel.setIcon(new javax.swing.ImageIcon("C:\\Users\\gshal\\OneDrive\\Documents\\NetBeansProjects\\project Image\\cancel1.png")); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\gshal\\OneDrive\\Documents\\NetBeansProjects\\project Image\\login.png")); // NOI18N

        javax.swing.GroupLayout emailLayout = new javax.swing.GroupLayout(email);
        email.setLayout(emailLayout);
        emailLayout.setHorizontalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(emailLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mail)
                            .addComponent(password)))
                    .addGroup(emailLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton)
                        .addGap(71, 71, 71)
                        .addComponent(cancel)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emailLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(132, 132, 132))
        );
        emailLayout.setVerticalGroup(
            emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emailLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(emailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
        loginActionPerformed(evt);
    }//GEN-LAST:event_jButtonActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

            // TODO add your handling code here:
            System.exit(0);
    }//GEN-LAST:event_cancelActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                       
              try{
                   stmt = conn.createStatement();
                   String userEmail;
                   userEmail = mail.getText();
                   String userPass = password.getText();
            
                  String sql ="SELECT * FROM admin WHERE email='"+userEmail+"' && password = '"+userPass+"'";
                  
                  rs = stmt.executeQuery(sql);
                  if(rs.next()){
                      setVisible(false);
                      home object = new home();
                      object.setVisible(true);
                  }else{
                      JOptionPane.showMessageDialog(null,"Password or mail is invalid");
                  }
              
                  
              }catch(HeadlessException | SQLException e){JOptionPane.showMessageDialog(null,e);
            
    }
}
              private void passwordActionPerformed(java.awt.event.ActionEvent evt) {  
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Password;
    private javax.swing.JButton cancel;
    private javax.swing.JPanel email;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}