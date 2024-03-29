/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

/**
 *
 * @author Dinda Ahsana
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmdata extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.koneksidatabase.Bukakoneksi();
    public frmdata() {
        initComponents();
        TampilData();
    }

    private void Bersih(){
        txtNIK.setText("");
        txtnama.setText("");
        txttlp.setText("");
        txthobi.setText("");
        
        btnsimpan.setText("Simpan");
        txtNIK.setEditable(true);
    }
    private void CariData() {
       try {
           st = cn.createStatement();
           rs = st.executeQuery("SELECT * FROM biodata WHERE " + cmbcari.getSelectedItem().toString () + " LIKE '%" + txtcari.getText()+ "%");
           
            
           DefaultTableModel model = new DefaultTableModel();
           model.addColumn("No.");
           model.addColumn("NIK");
           model.addColumn("nama");
           model.addColumn("telepon");
           model.addColumn("hobi");
           
           int no = 1;
           
           model.getDataVector().removeAllElements();
           model.fireTableDataChanged();
           model.setRowCount(0);
           
           while (rs.next()) {
            Object[] data = {
                no++,
                rs.getString("NIK"),
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("hobi")
             };
             model.addRow(data);
             tabledata.setModel (model);
            }
       } catch (Exception e) {
           
       }
       private void TampilData() {
       try {
           st = cn.createStatement();
           rs = st.executeQuery("SELECT * FROM biodata");
            
           DefaultTableModel model = new DefaultTableModel();
           model.addColumn("No.");
           model.addColumn("NIK");
           model.addColumn("nama");
           model.addColumn("telepon");
           model.addColumn("hobi");
           
           int no = 1;
           
           model.getDataVector().removeAllElements();
           model.fireTableDataChanged();
           model.setRowCount(0);
           
           while (rs.next()) {
            Object[] data = {
                no++,
                rs.getString("NIK"),
                rs.getString("nama"),
                rs.getString("telepon"),
                rs.getString("hobi")
             };
             model.addRow(data);
             tabledata.setModel (model);
            }
       } catch (Exception e) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNIK = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txttlp = new javax.swing.JTextField();
        txthobi = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabledata = new javax.swing.JTable();
        txtcaridata = new javax.swing.JLabel();
        cmbcari = new javax.swing.JComboBox<>();
        txtcari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NIK");

        jLabel2.setText("Nama");

        jLabel3.setText("Telepon");

        jLabel4.setText("Hobi");

        txtNIK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIKActionPerformed(evt);
            }
        });

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });

        txttlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttlpActionPerformed(evt);
            }
        });

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setText("Batal");
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        tabledata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIK", "Nama", "Telepon", "Hobi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabledata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabledata);

        txtcaridata.setText("Cari data");

        cmbcari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nama", "asal", "telepon", "hobi" }));
        cmbcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcariActionPerformed(evt);
            }
        });

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsimpan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnhapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnbatal))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNIK)
                                .addComponent(txtnama)
                                .addComponent(txttlp)
                                .addComponent(txthobi, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtcaridata)
                        .addGap(29, 29, 29)
                        .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcari)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNIK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txthobi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus)
                    .addComponent(btnbatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcaridata)
                    .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNIKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIKActionPerformed

    private void txttlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttlpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttlpActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void cmbcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcariActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            st = cn.createStatement ();
            if (txtNIK.getText().equals("") || txtnama.getText().equals("") || txttlp.getText().equals("") || txthobi.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong", "Validasi Data", JOptionPane.INFORMATION_MESSAGE); 
                return;
            }
            // aksi simpan data
            if (btnsimpan.getText()== "Simpan"){
                String cek = "SELECT * FROM biodata WHERE NIK = '" + txtNIK.getText()+ "'";
                rs = st.executeQuery(cek);
                if(rs.next()) {
                   JOptionPane.showMessageDialog(null,"Ups..NIK ini sudah ada");
                }else{
                    String sql = "INSERT INTO biodata VALUES ('" + txtNIK.getText() +
                            "','" + txtnama.getText() +
                            "','" + txttlp.getText() +
                            "','" + txthobi.getText() + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                    Bersih();
                    TampilData();
                   
                }
            }else{
               // aksi ubah data 
                String update = "UPDATE biodata SET nama = '" +txtnama.getText() +
                        "', telepon = '" + txttlp.getText() +
                        "', hobi = '" + txthobi.getText() + 
                        "' WHERE NIK = '" + txtNIK.getText() + "'"; 
                st.executeUpdate(update);
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
                Bersih();
                TampilData();
                
            }
        } catch (Exception e){    
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void tabledataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledataMouseClicked
        // TODO add your handling code here:
        txtNIK.setText(tabledata.getValueAt(tabledata.getSelectedRow(),1).toString());
        txtnama.setText(tabledata.getValueAt(tabledata.getSelectedRow(),2).toString());
        txttlp.setText(tabledata.getValueAt(tabledata.getSelectedRow(),3).toString());
        txthobi.setText(tabledata.getValueAt(tabledata.getSelectedRow(),4).toString());
        
        txtNIK.setEditable(false);
        btnsimpan.setText("Ubah");
    }//GEN-LAST:event_tabledataMouseClicked

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
         // TODO add your handling code here:
         if (txtNIK.getText().equals("")){
             JOptionPane.showMessageDialog(this, "silahkan pilih data yang akan dihapus!");
         }else{
             int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus, lanjutkan?", "konfirmasi", JOptionPane.YES_NO_OPTION);
             if (jawab == 0) {
                 try {
                     st = cn.createStatement();
                     String sql = "DELETE FROM biodata WHERE NIK ='" + txtNIK.getText() + "'";
                     st.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                     TampilData();
                     Bersih();
                             
                 }catch (Exception e) {
                 JOptionPane.showMessageDialog(null,e);
                 }
             }
         }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
        CariData();
    }//GEN-LAST:event_txtcariKeyPressed

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
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JComboBox<String> cmbcari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabledata;
    private javax.swing.JTextField txtNIK;
    private javax.swing.JTextField txtcari;
    private javax.swing.JLabel txtcaridata;
    private javax.swing.JTextField txthobi;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttlp;
    // End of variables declaration//GEN-END:variables
}
