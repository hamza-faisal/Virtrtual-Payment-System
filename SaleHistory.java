/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpaysystem;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author SWHB
 */
public class SaleHistory extends javax.swing.JPanel {

    /**
     * Creates new form ShowShops
     */
    
    String myID;
    String IP;
    public SaleHistory(String myID,String IP) {
        initComponents();
        this.myID=myID;
        this.IP=IP;
       loadData();
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

        txtSearch = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList();
        lblSearch = new javax.swing.JLabel();

        setBackground(new java.awt.Color(52, 52, 60));
        setLayout(new java.awt.GridBagLayout());

        txtSearch.setBackground(new java.awt.Color(52, 52, 60));
        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(null);
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 279;
        gridBagConstraints.ipady = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 180, 0, 0);
        add(txtSearch, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 278;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 180, 0, 0);
        add(jSeparator1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Sale History");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 200, 0, 0);
        add(jLabel1, gridBagConstraints);

        historyList.setBackground(new java.awt.Color(52, 52, 60));
        historyList.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        historyList.setForeground(new java.awt.Color(255, 255, 255));
        historyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyListMouseClicked(evt);
            }
        });
        historyList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                historyListKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(historyList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 627;
        gridBagConstraints.ipady = 357;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(40, 30, 16, 35);
        add(jScrollPane2, gridBagConstraints);

        lblSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(153, 153, 153));
        lblSearch.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(43, 180, 0, 0);
        add(lblSearch, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        lblSearch.setForeground(Color.white);
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        lblSearch.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_txtSearchFocusLost

    private void historyListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_historyListKeyReleased
         
         
//               for(int o=0; o<makeIndex; o++)
//             {
//                 System.out.println(searchedItemName[o]);
//             }
//            
    }//GEN-LAST:event_historyListKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
             ItemFiltered=0;  
        filteredItemIndex=0;
        makeIndex=0;
       
       
        Items.removeAllElements();
        for(int p=0; p<noOfItems; p++)
               {
                   if(searchItem[p].toLowerCase().contains(txtSearch.getText().toLowerCase()))
                   {
                       
                       ItemFiltered++;
                   }
               }
               filteredIndexes= new int[ItemFiltered];
               for(int p=0; p<noOfItems; p++)
               {
                   if(searchItem[p].toLowerCase().contains(txtSearch.getText().toLowerCase()))
                   {
                       filteredIndexes[filteredItemIndex]=p;
                       
                        searchAddItem(p);
                       filteredItemIndex++;
                   }
               }
               //searchAddItem(filteredItemIndex,filteredIndexes,ItemName,ItemPrice,ItemQuantity);
                historyList.setModel(Items);
        historyList.setCellRenderer(new SaleItemPanel());
    
    }//GEN-LAST:event_txtSearchKeyReleased

    private void historyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyListMouseClicked
       
    }//GEN-LAST:event_historyListMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList historyList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
   DefaultListModel<SaleItemObject> Items= new DefaultListModel<SaleItemObject>();
    String[] CustomerName;
      String[] searchItem;
      String[] ItemName;
      String[] ItemQuantity;
      String[] ItemPrice;
      String[] ItemTotalPrice;
      int filteredIndexes[];
      int ItemIndex=0;
      int noOfItems=0;
      int ItemFiltered=0;
       int filteredItemIndex=0;
      String[] ItemDate;
       int makeIndex=0;
   
       
        String[] searchedItemName;
      String[] searchedItemQuantity;
      String[] searchedItemPrice;
      String[] searchedItemTotalPrice;
    String[] searchedItemDate;
         String[] searchedCustomerName;
    
    public void loadData()
    {
         Connection con;
        Statement st;
        ResultSet rs;
         try
            {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
            
            String sq2="Select Count(Item_Name) as \"Number\" from SellerSale where Shop_ID='"+myID+"'";
               
             st=con.createStatement();
            rs=st.executeQuery(sq2);
            rs.next();
            noOfItems=rs.getInt("Number");
                System.out.println("No Of Items : "+noOfItems);           
            String sql="Select * from SellerSale Where Shop_ID='"+myID+"'";
             st=con.createStatement();
            rs=st.executeQuery(sql);
             AddItems(rs); 
            
            con.close();
            }
            catch(Exception e)
            {
                System.out.println("in Load Data");
                System.out.println(e.getMessage());
            }
    }
    public void AddItems(ResultSet rs)
   {
        ItemIndex=0;
       searchItem=new String[noOfItems];
        ItemName= new String[noOfItems];
        ItemPrice= new String[noOfItems];
        ItemQuantity= new String[noOfItems];
         ItemDate= new String[noOfItems];
        ItemTotalPrice= new String[noOfItems];
        CustomerName=new String[noOfItems];
        searchedItemName= new String[noOfItems];
        searchedItemPrice= new String[noOfItems];
        searchedItemQuantity= new String[noOfItems];
        searchedItemDate= new String[noOfItems];
        searchedCustomerName= new String[noOfItems];
        searchedItemTotalPrice= new String[noOfItems];
       
       try
       {
       while(rs.next())
       {
           Items.addElement(new SaleItemObject(rs.getString("Item_Name"),rs.getInt("Quantity"),rs.getInt("Price"),rs.getString("Customer_Name"),rs.getDate("Purchase_Date").toString()));
           searchItem[ItemIndex]=rs.getString("Item_Name")+" "+Integer.toString(rs.getInt("Quantity"))+" "+Integer.toString(rs.getInt("Price"))+" "+rs.getString("Customer_Name")+" "+rs.getDate("Purchase_Date").toString();
        ItemName[ItemIndex]=rs.getString("Item_Name");
        ItemQuantity[ItemIndex]=Integer.toString(rs.getInt("Quantity"));
        ItemPrice[ItemIndex]=Integer.toString(rs.getInt("Price"));
        CustomerName[ItemIndex]=rs.getString("Customer_Name");
        ItemDate[ItemIndex]=rs.getDate("Purchase_Date").toString();
        ItemIndex++;
       }
       historyList.setModel(Items);
       historyList.setCellRenderer(new SaleItemPanel());
       }
       catch(Exception e)
       {
           System.out.println("In Add Item Method");
           System.out.println(e.getMessage());
       }
       for(int j=0; j<noOfItems; j++)
        {
        searchedItemName[j]=ItemName[j];
        searchedItemQuantity[j]=ItemQuantity[j];
        searchedItemPrice[j]=ItemPrice[j];
        searchedCustomerName[j]=CustomerName[j];
        searchedItemDate[j]=ItemDate[j];
        }
   }
       public void searchAddItem(int index)//int noOfFilteredItem, int[] filteredIndexes, String[] ItemName, String[] ItemPrice, String[] ItemQuantity)
    {
        
        
        
        
        //System.out.println(ItemName[index]+ItemPrice[index]);
        searchedItemName[makeIndex]=ItemName[index];
        searchedItemQuantity[makeIndex]=ItemQuantity[index];
        searchedItemPrice[makeIndex]=ItemPrice[index];
    
         searchedCustomerName[makeIndex]=CustomerName[index];
         searchedItemDate[makeIndex]=ItemDate[index];
        Items.addElement(new SaleItemObject(ItemName[index],Integer.parseInt(ItemQuantity[index]),Integer.parseInt(ItemPrice[index]),CustomerName[index],ItemDate[index]));
        makeIndex++;
    } 
    

}
