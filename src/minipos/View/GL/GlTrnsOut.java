/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minipos.View.GL;

import datechooser.events.SelectionChangedEvent;
import datechooser.events.SelectionChangedListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import minipos.Model.DBConnection;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author ola
 */
public class GlTrnsOut extends javax.swing.JFrame {

    List<Integer> accNoList = new ArrayList<>();

    /**
     * Creates new form GlTrns
     */
    public GlTrnsOut() {
        initComponents();
        getAccountsLOV();
        UtilDateModel model = new UtilDateModel();
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        dateChooserDialog1 = new datechooser.beans.DateChooserDialog();
        trnsDesc_tf = new javax.swing.JTextField();
        docNo_tf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        value_tf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxAcc = new javax.swing.JComboBox<>();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        trnsDesc_tf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trnsDesc_tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        trnsDesc_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trnsDesc_tfActionPerformed(evt);
            }
        });

        docNo_tf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        docNo_tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        docNo_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docNo_tfActionPerformed(evt);
            }
        });

        jLabel2.setText("الشرح");

        jLabel3.setText("رقم الحساب");

        jLabel4.setText("التاريخ");

        jLabel5.setText("رقم المستند");

        value_tf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        value_tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel7.setText("القيمة");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("فاتورة صادرة");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("حفظ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAction(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("إلغاء");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxAcc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAccActionPerformed(evt);
            }
        });

        dateChooserCombo1.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserCombo1OnSelectionChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(201, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(docNo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(value_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(trnsDesc_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(229, 397, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(trnsDesc_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(docNo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(value_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void getAccountsLOV() {

        jComboBoxAcc.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        ((JLabel) jComboBoxAcc.getRenderer()).setHorizontalAlignment(SwingConstants.RIGHT);
        jComboBoxAcc.setBackground(Color.WHITE);
        jComboBoxAcc.removeAllItems();
        jComboBoxAcc.addItem("");
        //jComboBoxAcc.getSelectedIndex()
        accNoList.add(0);
        
        try {
            DBConnection dBConnection = new DBConnection();
            Connection con = dBConnection.createConnection();
            Statement stm = con.createStatement();
            String sql = "SELECT `account_no` ,`name_a` FROM `gl_accounts`";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                int _accNo = rs.getInt("account_no");
                String _accName = rs.getString("name_a");

                jComboBoxAcc.addItem(_accName);
                accNoList.add(_accNo);

            }
        } catch (SQLException ex) {
            Logger.getLogger(GlSttmRep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void saveAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAction
        // TODO add your handling code here:

        if (trnsDesc_tf.getText().equals("")
                || jComboBoxAcc.getSelectedItem().equals("")
                //|| trnsDate_tf.getText().equals("") 
                || value_tf.getText().equals("")) {

            JOptionPane.showMessageDialog(rootPane, "توجد بيانات مفقودة ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jComboBoxAcc.getSelectedIndex();
            System.out.println("selected item index =  " + jComboBoxAcc.getSelectedIndex());
            int selectedAccNo = accNoList.get(jComboBoxAcc.getSelectedIndex());

            String trnsDesc = trnsDesc_tf.getText();
            //String accName = accName_tf.getText();
            String trnsDate = "";//trnsDate_tf.getText();
            String docNo = docNo_tf.getText();
            int value = Integer.parseInt(value_tf.getText());

            try {
                DBConnection dBConnection = new DBConnection();
                Connection con = dBConnection.createConnection();
                Statement stm = con.createStatement();
                String sql = "INSERT INTO `gl_trns_mast`(`desc_a`, "
                        + " `value_type`, `trns_date`, `account_no`, `doc_no`,"
                        + " `value`) " + "VALUES ('" + trnsDesc + "','1','"
                        + trnsDate + "','" + selectedAccNo + "','" + docNo + "','" + value + "')";
                stm.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,
                        "تم حفظ الفاتورة بنجاح",
                        "A plain message",
                        JOptionPane.PLAIN_MESSAGE);

                this.dispose();

            } catch (SQLException ex) {
                Logger.getLogger(GlTrnsOut.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_saveAction

    private void trnsDesc_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trnsDesc_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_trnsDesc_tfActionPerformed

    private void docNo_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docNo_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docNo_tfActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAccActionPerformed

    private void dateChooserCombo1OnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserCombo1OnSelectionChange
        // TODO add your handling code here:
        
        System.out.println( dateChooserCombo1.getSelectedDate().getTimeInMillis()+"");
        

    }//GEN-LAST:event_dateChooserCombo1OnSelectionChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserDialog dateChooserDialog1;
    private javax.swing.JTextField docNo_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxAcc;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField trnsDesc_tf;
    private javax.swing.JTextField value_tf;
    // End of variables declaration//GEN-END:variables

  
    /*
        String[] monthStrings = { "January", "February", "March", "April" };
    SpinnerListModel spinnerListModel = new SpinnerListModel(monthStrings);
    JSpinner listSpinner = new JSpinner(spinnerListModel);
    listSpinner.setName("months-names");
    return listSpinner;
        
     */
 /*
    
    String[] bookTitles = new String[] {"Effective Java", "Head First Java",
                                    "Thinking in Java", "Java for Dummies"};
 
JComboBox<String> bookList = new JComboBox<>(bookTitles);
 
// add to the parent container (e.g. a JFrame):
add(bookList);
 
// get the selected item:
String selectedBook = (String) bookList.getSelectedItem();
System.out.println("You seleted the book: " + selectedBook);
    
     */
}
