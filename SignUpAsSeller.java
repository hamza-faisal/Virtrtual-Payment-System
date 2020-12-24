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
public class SignUpAsSeller extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    String IP;
    public SignUpAsSeller(String IP) {
        
        initComponents();
        this.IP=IP;
        this.setSize(1200,700);
        mainPanel.setBackground(new Color(70,70,70,200));
        loginPanel.setFocusable(true);
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

        mainPanel = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblCMS = new javax.swing.JLabel();
        txtCMS = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblPassword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblDept = new javax.swing.JLabel();
        txtDept = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lblShopId = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(null);

        mainPanel.setLayout(null);

        loginPanel.setBackground(new java.awt.Color(70, 70, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SignUp As Seller");

        lblCMS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCMS.setForeground(new java.awt.Color(153, 153, 153));
        lblCMS.setText("Shop's owner Name");

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

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Password");

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

        btnSignUp.setBackground(new java.awt.Color(70, 80, 95));
        btnSignUp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("SignUp");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSignUpFocusGained(evt);
            }
        });
        btnSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignUpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSignUpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSignUpMouseExited(evt);
            }
        });
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblFullName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFullName.setForeground(new java.awt.Color(153, 153, 153));
        lblFullName.setText("Shop Name");

        txtFullName.setBackground(new java.awt.Color(70, 70, 70));
        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtFullName.setForeground(new java.awt.Color(255, 255, 255));
        txtFullName.setBorder(null);
        txtFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFullNameFocusLost(evt);
            }
        });

        lblDept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDept.setForeground(new java.awt.Color(153, 153, 153));
        lblDept.setText("Shop Type");

        txtDept.setBackground(new java.awt.Color(70, 70, 70));
        txtDept.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDept.setForeground(new java.awt.Color(255, 255, 255));
        txtDept.setBorder(null);
        txtDept.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDeptFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeptFocusLost(evt);
            }
        });

        lblShopId.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblShopId.setForeground(new java.awt.Color(255, 255, 255));
        lblShopId.setText("Generate Shop ID");
        lblShopId.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShopId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShopIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblShopIdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblShopIdMouseExited(evt);
            }
        });

        lblLogin.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Log In");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblLoginMousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Already User?");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword)
                            .addComponent(lblDept)
                            .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCMS)
                            .addComponent(txtCMS, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFullName)
                            .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblShopId, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(32, 32, 32)
                .addComponent(lblCMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCMS, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShopId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        mainPanel.add(loginPanel);
        loginPanel.setBounds(640, 0, 550, 700);

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
    }//GEN-LAST:event_txtCMSFocusGained

    private void txtCMSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCMSFocusLost
        lblCMS.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtCMSFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
          lblPassword.setForeground(Color.white);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        lblPassword.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtPasswordFocusLost

    private void btnSignUpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSignUpFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpFocusGained

    private void btnSignUpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseEntered
        btnSignUp.setBackground(new Color(225,150,100));
        btnSignUp.setForeground(Color.black);
        
        
    }//GEN-LAST:event_btnSignUpMouseEntered

    private void btnSignUpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseExited
        btnSignUp.setBackground(new Color(70,80,95));
        btnSignUp.setForeground(Color.white);
    }//GEN-LAST:event_btnSignUpMouseExited

    private void txtFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusGained
       lblFullName.setForeground(Color.white);
    }//GEN-LAST:event_txtFullNameFocusGained

    private void txtFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFullNameFocusLost
        lblFullName.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtFullNameFocusLost

    private void txtDeptFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeptFocusGained
        lblDept.setForeground(Color.white);
    }//GEN-LAST:event_txtDeptFocusGained

    private void txtDeptFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeptFocusLost
        lblDept.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtDeptFocusLost

    private void btnSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignUpMouseClicked
        new LogIn(IP).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnSignUpMouseClicked

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        new LogIn(IP).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblLoginMouseClicked

    private void lblLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseEntered
        lblLogin.setForeground(new Color(231,158,109));
        Font f= new Font("Tahoma",Font.BOLD,24);
        lblLogin.setFont(f);
    }//GEN-LAST:event_lblLoginMouseEntered

    private void lblLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseExited
        Font f= new Font("Tahoma",Font.ITALIC+Font.BOLD,14);
        lblLogin.setFont(f);
        lblLogin.setForeground(Color.white);

    }//GEN-LAST:event_lblLoginMouseExited

    private void lblLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMousePressed

    }//GEN-LAST:event_lblLoginMousePressed

    private void lblShopIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShopIdMouseEntered
         lblShopId.setForeground(new Color(231,158,109));
        Font f= new Font("Tahoma",Font.BOLD,18);
        lblShopId.setFont(f);
    }//GEN-LAST:event_lblShopIdMouseEntered

    private void lblShopIdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShopIdMouseExited
       lblShopId.setForeground(Color.white);
        Font f= new Font("Tahoma",Font.BOLD+Font.ITALIC,18);
        lblShopId.setFont(f);
    }//GEN-LAST:event_lblShopIdMouseExited

    private void lblShopIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShopIdMouseClicked
        Connection con;
        Statement st;
        ResultSet rs;
        try
            {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
            
            String sql="Select Shop_ID.nextval as \"ID\" from dual";
             st=con.createStatement();
            rs=st.executeQuery(sql);
            rs.next();
            Shop_ID="081-89-"+Integer.toString(rs.getInt("ID"));
            
            con.close();
            
        JOptionPane.showMessageDialog(null, "Congrates !! Your Login ID is"+Shop_ID+"\nPlease don't share it with anyone!");
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        
        
        
        
    }//GEN-LAST:event_lblShopIdMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        Connection con;
        Statement st;
        ResultSet rs;
        if(!(txtCMS.getText().equals("") || txtFullName.getText().equals("") || txtDept.getText().equals("") || txtPassword.getText().equals("")))
        {
            try
            {
                 Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
            
            String sql="insert into Seller(UserKey,Shop_ID,Shop_Name,Owner_Name,Shop_Type,Password,Balance,Available) values("+2+",'"+Shop_ID+"','"+txtFullName.getText()+"','"+txtCMS.getText()+"','"+txtDept.getText()+"','"+txtPassword.getText()+"',"+00.00+","+0+")";
             st=con.createStatement();
            rs=st.executeQuery(sql);
                con.close();
            JOptionPane.showMessageDialog(null, "Your Account Has been Created");
            
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

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
                new SignUpAsSeller("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblCMS;
    private javax.swing.JLabel lblDept;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShopId;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField txtCMS;
    private javax.swing.JTextField txtDept;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
    String Shop_ID;
}