package formview;

import model.NasabahModel;
import model.NasabahInitAkun;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Config;

public class loginAtm extends javax.swing.JFrame {
    private NasabahInitAkun nasabah;
    NasabahModel data;
    Connection conn;
    Statement stmt;
    ResultSet rs;
    String sql;

       
    public loginAtm(NasabahInitAkun nasabah) {
        initComponents();
        
        Config db = new Config();
        db.configDB();
        
        this.getContentPane().setBackground(new java.awt.Color(11,189,189));
        this.nasabah = nasabah;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vusername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vpassword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vusernameActionPerformed(evt);
            }
        });
        getContentPane().add(vusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 260, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/bitcoin-text.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(140, 180));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 210, 70));
        getContentPane().add(vpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 260, 40));

        login.setBackground(new java.awt.Color(204, 204, 204));
        login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login.setText("MASUK");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 260, 37));

        jLabel1.setText("Masuk ke ATM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Pin Atm :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, 20));

        jLabel5.setFont(new java.awt.Font("SF Pro Text", 0, 12)); // NOI18N
        jLabel5.setText("PT. BANK BITCOIN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 240, 60));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nomor Rekening");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Untitled-1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 340, 300));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Password :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null,vusername.getText());
//        try{
//            sql = "SELECT * FROM nasabah WHERE norek='"+vusername.getText()+"' AND pin='"+vpassword.getText()+"'";
//            rs = stmt.executeQuery(sql);
//            if(rs.next()){
//                if(vusername.getText().equals(rs.getString("norek")) && vpassword.getText().equals(rs.getString("pin"))){
//                    NasabahModel datanya = (NasabahModel) nasabah.getAkun(vusername.getText());
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Nomor Rekening Anda Salah");
//            }
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
        
        if(nasabah.isNoRekening(vusername.getText()) == true) {
            JOptionPane.showMessageDialog(null, "Nomor Rekening Anda Salah");
        } else {
            NasabahModel datanya = (NasabahModel) nasabah.getAkun(vusername.getText());
            if(data.getPinNasabah().equals(vpassword.getText())){
                JOptionPane.showMessageDialog(rootPane, "Harusnya loginnya udah sukses.");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Nomor Pin Salah.");
            }
        }
//        vusername.getText();
//        vpassword.setText();
        
//        if (vusername.getText().equals("admin")) {
//            if (vpassword.getText().equals("admin")) {
//                new antrian().show();
//                this.dispose();
//            }
//            else {
//                JOptionPane.showMessageDialog(rootPane, "Password Salah, Silahkan Coba Lagi");
//                vpassword.setText("");
//                vpassword.requestFocus();
//            }
//        }
//        else {
//            JOptionPane.showMessageDialog(rootPane, "Username Salah, Silahkan Coba Lagi");
//            vusername.setText("");
//            vpassword.setText("");
//            vusername.requestFocus();
//        }
    }//GEN-LAST:event_loginActionPerformed

    private void vusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vusernameActionPerformed

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
            java.util.logging.Logger.getLogger(loginAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginAtm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new loginAtm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField vpassword;
    private javax.swing.JTextField vusername;
    // End of variables declaration//GEN-END:variables
}
