/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpaysystem;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SWHB
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    String IP;
    public LogIn(String IP) {
        initComponents();
        this.setSize(1200,700);
        this.IP=IP;
        mainPanel.setBackground(new Color(70,70,70,200));
        loginPanel.setFocusable(true);
        lblError.setVisible(false);
          this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCMS = new javax.swing.JLabel();
        txtCMS = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblSignUp = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        mainPanel.setLayout(null);

        loginPanel.setBackground(new java.awt.Color(70, 70, 70));
        loginPanel.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Please Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(101, 117, 0, 0);
        loginPanel.add(jLabel2, gridBagConstraints);

        lblCMS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCMS.setForeground(new java.awt.Color(153, 153, 153));
        lblCMS.setText("User ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 117, 0, 0);
        loginPanel.add(lblCMS, gridBagConstraints);

        txtCMS.setBackground(new java.awt.Color(70, 70, 70));
        txtCMS.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtCMS.setForeground(new java.awt.Color(255, 255, 255));
        txtCMS.setBorder(null);
        txtCMS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCMSFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCMSFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 117, 0, 0);
        loginPanel.add(txtCMS, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 0, 0);
        loginPanel.add(jSeparator1, gridBagConstraints);

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 117, 0, 0);
        loginPanel.add(lblPassword, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 0, 0);
        loginPanel.add(jSeparator2, gridBagConstraints);

        txtPassword.setBackground(new java.awt.Color(70, 70, 70));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 117, 0, 0);
        loginPanel.add(txtPassword, gridBagConstraints);

        btnLogin.setBackground(new java.awt.Color(70, 80, 95));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Sign In");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnLoginFocusGained(evt);
            }
        });
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 154, 0, 88);
        loginPanel.add(btnLogin, gridBagConstraints);

        lblSignUp.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lblSignUp.setText("SignUp or Register");
        lblSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSignUpMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(60, 179, 67, 0);
        loginPanel.add(lblSignUp, gridBagConstraints);

        lblError.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 102, 102));
        lblError.setText("User ID or Password is incorrect");
        lblError.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblError.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblErrorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblErrorMouseExited(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 51;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 117, 0, 88);
        loginPanel.add(lblError, gridBagConstraints);

        mainPanel.add(loginPanel);
        loginPanel.setBounds(640, 0, 540, 700);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Some Text Here");
        mainPanel.add(jLabel3);
        jLabel3.setBounds(150, 160, 250, 60);

        getContentPane().add(mainPanel);
        mainPanel.setBounds(0, 0, 1200, 700);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Image2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1190, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCMSFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMSFocusGained
       lblCMS.setForeground(Color.white);
       lblError.setVisible(false);
    }//GEN-LAST:event_txtCMSFocusGained

    private void txtCMSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMSFocusLost
        lblCMS.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtCMSFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
          lblPassword.setForeground(Color.white);
              lblError.setVisible(false);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        lblPassword.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnLoginFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginFocusGained

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(new Color(225,150,100));
        btnLogin.setForeground(Color.black);
        
        
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(new Color(70,80,95));
        btnLogin.setForeground(Color.white);
    }//GEN-LAST:event_btnLoginMouseExited

    private void lblSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseEntered
      lblSignUp.setForeground(new Color(231,158,109));
      
        Font f= new Font("Tahoma",Font.BOLD,20);
        lblSignUp.setFont(f);
    }//GEN-LAST:event_lblSignUpMouseEntered

    private void lblSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseExited
         lblSignUp.setForeground(Color.white);
      
        Font f= new Font("Tahoma",Font.BOLD+Font.ITALIC,20);
        lblSignUp.setFont(f);
    }//GEN-LAST:event_lblSignUpMouseExited

    private void lblErrorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErrorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorMouseEntered

    private void lblErrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblErrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblErrorMouseExited

    private void lblSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignUpMouseClicked
       this.setVisible(false);
       new Welcom().setVisible(true);
    }//GEN-LAST:event_lblSignUpMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       int admin=0,Customer=0,Seller=0;
        Connection con;
        Statement s;
        ResultSet rs;
        
        try
            {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
            s= con.createStatement();
            rs=s.executeQuery("Select * from Credentials");
            while(rs.next())
            {
            if(txtCMS.getText().equalsIgnoreCase("admin"))
            {
               if(txtPassword.getText().equals(rs.getString("Password")))
               {
                   admin++;
                   UserID=txtCMS.getText();
                   break;
               }
            }
            else if(txtCMS.getText().equals(rs.getString("CMS_ID")) && txtPassword.getText().equals(rs.getString("Password")) && 1==rs.getInt("UserKey"))
            {
                Customer++;
                UserID=txtCMS.getText();
                break;
            }
            else if(txtCMS.getText().equals(rs.getString("CMS_ID")) && txtPassword.getText().equals(rs.getString("Password")) && 2==rs.getInt("UserKey"))
            {
                Seller++;
                UserID=txtCMS.getText();
                break;
            }
         
            }
             
            if(admin>0)
            {
                this.setVisible(false);
                Admin a= new Admin(UserID,IP);
                a.setVisible(true);
            }
             else if(Customer>0)
              {
                  this.setVisible(false);
                CustomerDashboard  c= new CustomerDashboard(UserID,IP);
                c.setVisible(true);
              }
             else if(Seller>0)
             {
                 String sq="update Seller set Available=1 where Shop_ID='"+UserID+"'";
                   rs=s.executeQuery(sq);
                  this.setVisible(false);
                SellerDashboard  c= new SellerDashboard(UserID,IP);
                c.setVisible(true);
             }
            else
             {
                 lblError.setVisible(true);
                 txtCMS.setText("");
                 txtPassword.setText("");
             }
            
          con.close();
  
            }
                      catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCMS;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtCMS;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
   String UserID=null;
}
