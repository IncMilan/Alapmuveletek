/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csoportmunka;

import java.util.Random;

/**
 *
 * @author Milan
 */
public class Alapmuveletek extends javax.swing.JFrame {

    /**
     * Creates new form Alapmuveletek
     */
    public Alapmuveletek() {
        initComponents();
    }
    
    
    Random rnd = new Random();
    int szam1;
    int szam2;
    int eredmeny;
    int Sorszamok;


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        LbSzamolas = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnUjFeladat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Osszeadas = new javax.swing.JMenuItem();
        Kivonas = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMOsztas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbSzamolas.setText("Számok itt");

        jTextField1.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ellenőrzés");

        jButton2.setText("Megoldás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        BtnUjFeladat.setText("Új feladat");
        BtnUjFeladat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUjFeladatActionPerformed(evt);
            }
        });

        jMenu1.setText("Műveletek");

        Osszeadas.setText("Összeadás");
        Osszeadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OsszeadasActionPerformed(evt);
            }
        });
        jMenu1.add(Osszeadas);

        Kivonas.setText("Kivonás");
        Kivonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KivonasActionPerformed(evt);
            }
        });
        jMenu1.add(Kivonas);

        jMenuItem5.setText("Szorzás");
        jMenu1.add(jMenuItem5);

        jMOsztas.setText("Osztás");
        jMOsztas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMOsztasActionPerformed(evt);
            }
        });
        jMenu1.add(jMOsztas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnUjFeladat)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LbSzamolas)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbSzamolas)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(BtnUjFeladat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_jMOsztasActionPerformed


    private void BtnUjFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUjFeladatActionPerformed
        //Sorszámok IDE JÖNNEK: 
        
        if(Sorszamok == 1){
            osszeadas();
        }
        else if(Sorszamok == 2){
            kivonas();
        }
        else if(Sorszamok == 4){
            osztas();
        }
    }//GEN-LAST:event_BtnUjFeladatActionPerformed

    private void OsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsszeadasActionPerformed
        osszeadas();
    }//GEN-LAST:event_OsszeadasActionPerformed

    private void KivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KivonasActionPerformed
        
        kivonas();
    }//GEN-LAST:event_KivonasActionPerformed
    private void osszeadas(){
        eredmeny = 0;
        Sorszamok = 1;
        szam1 = rnd.nextInt(50);
        szam2 = rnd.nextInt(50);
        eredmeny = szam1 + szam2;
        LbSzamolas.setText(szam1 + " + " + szam2);
    }
    
    
    private void kivonas(){
    
        Sorszamok = 2;
        
        szam1 = rnd.nextInt(50);
        szam2 = rnd.nextInt(50);
    
        LbSzamolas.setText(szam1 + " - " + szam2);
        
        eredmeny = szam1 - szam2;
    }
    
    private void osztas(){
        eredmeny = 0;
        Sorszamok = 4;
        szam1 = rnd.nextInt(99)+1;
        szam2 = rnd.nextInt(99)+1;
        eredmeny = szam1 / szam2;
        LbSzamolas.setText(szam1 + " / " + szam2);
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
            java.util.logging.Logger.getLogger(Alapmuveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alapmuveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alapmuveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alapmuveletek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alapmuveletek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUjFeladat;
    private javax.swing.JMenuItem Kivonas;
    private javax.swing.JLabel LbSzamolas;
    private javax.swing.JMenuItem Osszeadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuItem jMOsztas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
