/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Briggita
 */
public class Kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bil2 = new javax.swing.JTextField();
        Bil1 = new javax.swing.JTextField();
        Btn4 = new javax.swing.JButton();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Hasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kalkulator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        jLabel2.setText("Bilangan 1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel3.setText("Bilangan 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));
        getContentPane().add(Bil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 80, 40));

        Bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bil1ActionPerformed(evt);
            }
        });
        getContentPane().add(Bil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 80, 40));

        Btn4.setText("-");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 90, 60));

        Btn1.setText("x");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 90, 60));

        Btn2.setText(":");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 60));

        Btn3.setText("+");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(Btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, 90, 60));

        jLabel4.setText("Hasil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        Hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HasilActionPerformed(evt);
            }
        });
        getContentPane().add(Hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 120, 60));

        setBounds(0, 0, 652, 449);
    }// </editor-fold>//GEN-END:initComponents

    private void Bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bil1ActionPerformed

    private void HasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HasilActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText());
        int bil2 = Integer.parseInt(Bil2.getText());
        int hasilkali = bil1 * bil2;
        
        Hasil.setText(String.valueOf(hasilkali));
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText());
        int bil2 = Integer.parseInt(Bil2.getText());
        int hasiltambah = bil1 + bil2;
        
        Hasil.setText(String.valueOf(hasiltambah));
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        // TODO add your handling code here:
        double bil1 = Double.parseDouble(Bil1.getText());
        double bil2 = Double.parseDouble(Bil2.getText());
        double hasilbagi = bil1 / bil2;
        
        Hasil.setText(String.valueOf(hasilbagi));
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        // TODO add your handling code here:
        int bil1 = Integer.parseInt(Bil1.getText());
        int bil2 = Integer.parseInt(Bil2.getText());
        int hasilkurang = bil1 - bil2;
        
        Hasil.setText(String.valueOf(hasilkurang));
    }//GEN-LAST:event_Btn4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bil1;
    private javax.swing.JTextField Bil2;
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JTextField Hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
