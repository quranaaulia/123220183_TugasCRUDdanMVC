/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.damovcontroller;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
/**
 *
 * @author quranaaulia
 */
public class mainview extends javax.swing.JFrame {

    /*
     * Creates new form mainview
     */
   damovcontroller data;
    public mainview() {
        initComponents();
        data = new damovcontroller(this);
        data.isitabel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelDatamovie = new javax.swing.JTable();
        FJudul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FAlur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FPenokohan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        FAkting = new javax.swing.JTextField();
        BTambah = new javax.swing.JButton();
        BUpdate = new javax.swing.JButton();
        BDelete = new javax.swing.JButton();
        BClear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelDatamovie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Judul", "Alur", "Penokohan", "Akting", "Nilai"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelDatamovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDatamovieMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelDatamovie);

        FJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FJudulActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Alur");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Penokohan");

        FPenokohan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPenokohanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Akting");

        FAkting.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FAkting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAktingActionPerformed(evt);
            }
        });

        BTambah.setBackground(new java.awt.Color(204, 204, 255));
        BTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTambah.setText("Tambah");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        BUpdate.setBackground(new java.awt.Color(204, 204, 255));
        BUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUpdate.setText("Update");
        BUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUpdateActionPerformed(evt);
            }
        });

        BDelete.setBackground(new java.awt.Color(204, 204, 255));
        BDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BDelete.setText("Delete");
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });

        BClear.setBackground(new java.awt.Color(204, 204, 255));
        BClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BClear.setText("Clear");
        BClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClearActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Judul");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(FAlur, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BClear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTambah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addComponent(FAkting))
                    .addComponent(FJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(FJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAlur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FPenokohan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAkting, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(BTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BClear))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void FJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FJudulActionPerformed

    private void FPenokohanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPenokohanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FPenokohanActionPerformed

    private void FAktingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAktingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAktingActionPerformed

    private void BUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUpdateActionPerformed
        // TODO add your handling code here:
         // Panggil metode update dari damovcontroller
    data.update();
    // Panggil metode isitabel untuk memperbarui tampilan tabel setelah pembaruan data
    data.isitabel();
    JOptionPane.showMessageDialog(this, "Data Movie berhasil diupdate", "Update Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BUpdateActionPerformed

    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        // TODO add your handling code here:
         // Panggil metode delete dari damovcontroller
    data.delete();
    // Panggil metode isitabel untuk memperbarui tampilan tabel setelah penghapusan data
    data.isitabel();
    // Kosongkan inputan setelah data berhasil dihapus
    FJudul.setText("");
    FAlur.setText("");
    FPenokohan.setText("");
    FAkting.setText("");
    JOptionPane.showMessageDialog(this, "Data Movie berhasil didelete", "Delete Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BDeleteActionPerformed

    private void BClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClearActionPerformed
        // TODO add your handling code here:
        FJudul.setText("");
    FAlur.setText("");
    FPenokohan.setText("");
    FAkting.setText("");
    }//GEN-LAST:event_BClearActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        data.insert();
    data.isitabel();
    
    FJudul.setText("");
    FAlur.setText("");
    FPenokohan.setText("");
    FAkting.setText("");
    JOptionPane.showMessageDialog(this, "Data Movie berhasil ditambah", "Tambah Data Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BTambahActionPerformed

    private void tabelDatamovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDatamovieMouseClicked
        // TODO add your handling code here:
          int baris = tabelDatamovie.getSelectedRow();
    
    // Cek apakah pengguna benar-benar mengklik baris
    if (baris != -1) {
        // Ambil data dari baris yang diklik dan tampilkan pada inputan pengguna
        FJudul.setText(tabelDatamovie.getValueAt(baris, 0).toString());
        FAlur.setText(tabelDatamovie.getValueAt(baris, 1).toString());
        FPenokohan.setText(tabelDatamovie.getValueAt(baris, 2).toString());
        FAkting.setText(tabelDatamovie.getValueAt(baris, 3).toString());
    } else {
        // Jika pengguna mengklik di luar baris tabel, kosongkan inputan
        FJudul.setText("");
        FAlur.setText("");
        FPenokohan.setText("");
        FAkting.setText("");
    }//GEN-LAST:event_tabelDatamovieMouseClicked
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
            java.util.logging.Logger.getLogger(mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BClear;
    private javax.swing.JButton BDelete;
    private javax.swing.JButton BTambah;
    private javax.swing.JButton BUpdate;
    private javax.swing.JTextField FAkting;
    private javax.swing.JTextField FAlur;
    private javax.swing.JTextField FJudul;
    private javax.swing.JTextField FPenokohan;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelDatamovie;
    // End of variables declaration//GEN-END:variables
public JTable getTabelDatamovie(){
        return tabelDatamovie;
    }
    
    public void setTabelDatamovie(JTable tabelDatamovie) {
        this.tabelDatamovie = tabelDatamovie;
    }
    
    public JTextField getFJudul() {
        return FJudul;
    }
    
    public void setFJudul(JTextField FJudul) {
        this.FJudul = FJudul;
    }
    
    public JTextField getFAkting() {
        return FAkting;
    }
    
    public void setFAkting(JTextField FAkting) {
        this.FAkting = FAkting;
    }
    
    public JTextField getFAlur() {
        return FAlur;
    }
    
    public void setFAlur(JTextField FAlur) {
        this.FAlur = FAlur;
    }
    
    public JTextField getFPenokohan() {
        return FPenokohan;
    }
    
    public void setFPenokohan(JTextField FPenokohan) {
        this.FPenokohan = FPenokohan;
    }

}

