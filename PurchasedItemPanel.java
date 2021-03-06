/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpaysystem;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author SWHB
 */
public class PurchasedItemPanel extends javax.swing.JPanel implements ListCellRenderer<PurchasedItemObject>{

    /**
     * Creates new form ItemPanel
     */
    public PurchasedItemPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        lblItemName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lnl = new javax.swing.JLabel();
        lblShopName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        ll = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblTotalPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        panel.setBackground(new java.awt.Color(34, 33, 38));
        panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(52, 52, 60), 2, true));
        panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMouseExited(evt);
            }
        });
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblItemName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblItemName.setForeground(new java.awt.Color(255, 255, 255));
        panel.add(lblItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, 146, 27));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selected Quantity");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        lnl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lnl.setForeground(new java.awt.Color(255, 255, 255));
        lnl.setText("Total Price Rs.");
        panel.add(lnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 42, 90, -1));

        lblShopName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblShopName.setForeground(new java.awt.Color(255, 255, 255));
        lblShopName.setText("Syed Waqar Haider Bukhari");
        panel.add(lblShopName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 290, 30));

        lblPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblPrice.setText("200");
        panel.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 2, 60, 30));

        lblQuantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(255, 255, 255));
        lblQuantity.setText("100");
        panel.add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 50, -1));

        ll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ll.setForeground(new java.awt.Color(255, 255, 255));
        ll.setText("Item Price Rs.");
        panel.add(ll, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 12, 90, -1));

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("28-Nov-2018");
        panel.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPrice.setText("200");
        panel.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 32, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Shop Name :");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseExited
        panel.setBackground(new Color(34,33,38));
    }//GEN-LAST:event_panelMouseExited

    private void panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseEntered
        System.out.println("Mouse Entered");
        panel.setBackground(new Color(135,206,250));
    }//GEN-LAST:event_panelMouseEntered

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        
    }//GEN-LAST:event_panelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblShopName;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JLabel ll;
    private javax.swing.JLabel lnl;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

   

    @Override
    public Component getListCellRendererComponent(JList<? extends PurchasedItemObject> jlist, PurchasedItemObject e, int i, boolean bln, boolean bln1) {
        this.lblItemName.setText(e.ItemName);
        this.lblQuantity.setText(Integer.toString(e.quantity));
        this.lblPrice.setText(Integer.toString(e.price));
        this.lblTotalPrice.setText(Integer.toString(e.price*e.quantity));
        this.lblShopName.setText(e.ShopName);
        this.lblDate.setText(e.Date);
        return this;
    }

  
}
