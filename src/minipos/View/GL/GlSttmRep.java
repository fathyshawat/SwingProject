/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipos.View.GL;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import minipos.Model.DBConnection;

/**
 *
 * @author ola
 */
public class GlSttmRep extends javax.swing.JFrame {
    
    List<Integer> accNoList = new ArrayList<>();

    /**
     * Creates new form GlSttmRep
     */
    public GlSttmRep() {
        initComponents();
        
        getAccountsLOV();
        
   } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        sttmTable = new javax.swing.JTable();
        query_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        InSum_tf = new javax.swing.JTextField();
        outSum_tf = new javax.swing.JTextField();
        balanceSum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxAcc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sttmTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(sttmTable);

        query_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        query_btn.setText("استعلام");
        query_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryAction(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("اجمالي الايرادات");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("اجمالي المصروفات");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("الصافي");

        InSum_tf.setEditable(false);
        InSum_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        InSum_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        InSum_tf.setText("0");
        InSum_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InSum_tfActionPerformed(evt);
            }
        });

        outSum_tf.setEditable(false);
        outSum_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        outSum_tf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outSum_tf.setText("0");

        balanceSum.setEditable(false);
        balanceSum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        balanceSum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        balanceSum.setText("0");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("رجوع");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("رقم الحساب");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(balanceSum, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outSum_tf))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(InSum_tf))
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(query_btn)
                        .addGap(240, 240, 240)
                        .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(query_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outSum_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(InSum_tf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(balanceSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void getAccountsLOV(){
       
        jComboBoxAcc.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ((JLabel)jComboBoxAcc.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
        jComboBoxAcc.setBackground(Color.WHITE);
        jComboBoxAcc.removeAllItems();
        jComboBoxAcc.addItem("جميع الحسابات");     
        //jComboBoxAcc.getSelectedIndex()
        
        
        accNoList.add(0);
        
        try {
        DBConnection dBConnection = new DBConnection();
        Connection con = dBConnection.createConnection();
        Statement stm = con.createStatement();
        String sql = "SELECT `account_no` ,`name_a` FROM `gl_accounts`";
        ResultSet rs = stm.executeQuery(sql);
        
        
        while (rs.next() ){
            
        int _accNo = rs.getInt("account_no");
        String _accName = rs.getString("name_a");
        
        jComboBoxAcc.addItem(_accName);
        accNoList.add(_accNo);
     
        }
              
        
        
        
        } catch (SQLException ex) {
            Logger.getLogger(GlSttmRep.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    
    private void queryAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryAction
        // TODO add your handling code here:
        
        jComboBoxAcc.getSelectedIndex();
        System.out.println("selected item index =  " + jComboBoxAcc.getSelectedIndex());
        int selectedAccNo = accNoList.get(jComboBoxAcc.getSelectedIndex());
        
        
        try {
            //initComponents();
            DefaultTableModel model = new DefaultTableModel(new String[]{"الرصيد", "المصروف.", "الايراد", "البيان", "تاريخ الفاتورة"}, 0);
            String sql ="";
            
            DBConnection dBConnection = new DBConnection();
            Connection con = dBConnection.createConnection();
            Statement stm = con.createStatement();
            if (selectedAccNo == 0 ){
             sql = " SELECT `trns_serial`,`trns_date` , `desc_a`,`value_type`,"
                    + "		(CASE "
                    + "        WHEN `value_type` = '1' THEN `value`   "
                    + "        ELSE 0 "
                    + "    	END) AS db_value ,"
                    + "        (CASE "
                    + "        WHEN `value_type` = '0' THEN `value`   "
                    + "        ELSE 0"
                    + "    	END) AS cr_value "  
                    
                    + "FROM gl_trns_mast  order by `trns_date`  ";
            }else {
            
            sql = " SELECT `trns_serial`,`trns_date` , `desc_a`,`value_type`,"
                    + "		(CASE "
                    + "        WHEN `value_type` = '1' THEN `value`   "
                    + "        ELSE 0 "
                    + "    	END) AS db_value ,"
                    + "        (CASE "
                    + "        WHEN `value_type` = '0' THEN `value`   "
                    + "        ELSE 0"
                    + "    	END) AS cr_value "  
                    
                    + "FROM gl_trns_mast WHERE account_no = "+selectedAccNo+" order by `trns_date`  ";
            
            }
            ResultSet rs = stm.executeQuery(sql);
            int _inSum = 0;
            int _outSum =0;
            
            int _currBalance = 0;
            while(rs.next())
            {
          
                String trnsDate = rs.getString("trns_date");
                String desc_a = rs.getString("desc_a");
                int dbValue = rs.getInt("db_value");
                int crValue = rs.getInt("cr_value");
                
                _currBalance = _currBalance +(1*dbValue)+(-1*crValue); 
                    
                model.addRow(new Object[]{_currBalance,crValue,dbValue,desc_a,trnsDate});
                
                _inSum = _inSum + dbValue;
                _outSum = _outSum + crValue;
            }
            sttmTable.setModel(model);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            sttmTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            sttmTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            sttmTable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            sttmTable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            sttmTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

            sttmTable.setEnabled(false);
            
            InSum_tf.setText(String.valueOf(_inSum));
            outSum_tf.setText(String.valueOf(_outSum));
            balanceSum.setText(String.valueOf(_currBalance));

        } catch (SQLException ex) {
            Logger.getLogger(GlSttmRep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_queryAction

    private void InSum_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InSum_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InSum_tfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:this.dispose();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InSum_tf;
    private javax.swing.JTextField balanceSum;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField outSum_tf;
    private javax.swing.JButton query_btn;
    private javax.swing.JTable sttmTable;
    // End of variables declaration//GEN-END:variables
}
