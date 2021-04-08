/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csoportmunka;

import java.util.Random;
import javax.swing.JOptionPane;

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
    int kerdesDb=0;
    int probalkozasDb=0;
    
    int kerdesOsszDb=0;
    int kerdesKivonDb=0;
    int kerdesSzorzasDb=0;
    int kerdesOsztasDb=0;
    
    int probalkozasOsszDb=0;
    int probalkozasKivonDb=0;
    int probalkozasSzorzasDb=0;
    int probalkozasOsztasDb=0;
    
    double joValaszDb=0;
    double rosszValaszDb=0;
    double osszValaszDb=0;
    double szazalek=0;

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        LbSzamolas = new javax.swing.JLabel();
        eredmenyTextFild = new javax.swing.JTextField();
        ellenorzes = new javax.swing.JButton();
        megoldas = new javax.swing.JButton();
        BtnUjFeladat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Osszeadas = new javax.swing.JMenuItem();
        Kivonas = new javax.swing.JMenuItem();
        szorzas = new javax.swing.JMenuItem();
        jMOsztas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbSzamolas.setText("Számok itt");

        eredmenyTextFild.setMinimumSize(new java.awt.Dimension(100, 20));
        eredmenyTextFild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eredmenyTextFildActionPerformed(evt);
            }
        });

        ellenorzes.setText("Ellenőrzés");
        ellenorzes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ellenorzesActionPerformed(evt);
            }
        });

        megoldas.setText("Megoldás");
        megoldas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                megoldasActionPerformed(evt);
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

        szorzas.setText("Szorzás");
        szorzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                szorzasActionPerformed(evt);
            }
        });
        jMenu1.add(szorzas);

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
                .addComponent(eredmenyTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ellenorzes, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(megoldas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LbSzamolas)
                    .addComponent(eredmenyTextFild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ellenorzes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(megoldas)
                    .addComponent(BtnUjFeladat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void eredmenyTextFildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eredmenyTextFildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eredmenyTextFildActionPerformed

    private void megoldasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_megoldasActionPerformed
        
        
        String szoveg="";
   
        szoveg +="A helyes megoldás: "+eredmeny;
        szoveg +="\nKérdések száma összesen: "+kerdesDb;
        szoveg +="\nPróbálkozások száma összesen: "+probalkozasDb;
        szoveg +="\nÖsszeadások kérdéseinek száma összesen: "+kerdesOsszDb;
        szoveg +="\nKivonások kérdéseinek száma összesen: "+kerdesKivonDb;
        szoveg +="\nSzorzások kérdéseinek száma összesen: "+kerdesSzorzasDb;
        szoveg +="\nOsztások kérdéseinek száma összesen: "+kerdesOsztasDb;
        
        szoveg +="\nÖsszeadások próbálkozásainak száma összesen: "+probalkozasOsszDb;
        szoveg +="\nKivonások próbálkozásainak száma összesen: "+probalkozasKivonDb;
        szoveg +="\nSzorzások próbálkozásainak száma összesen: "+probalkozasSzorzasDb;
        szoveg +="\nOsztások próbálkozásainak száma összesen: "+probalkozasOsztasDb;
        szoveg +="\nA jó válaszok aránya százalékosan: "+szazalek+"%";
        
        
        
        JOptionPane.showMessageDialog(this,  szoveg, "Megoldás", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_megoldasActionPerformed

    private void jMOsztasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMOsztasActionPerformed
        osztas();
    }//GEN-LAST:event_jMOsztasActionPerformed


    private void BtnUjFeladatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUjFeladatActionPerformed
        //Sorszámok IDE JÖNNEK: 
        
        if (Sorszamok == 1) {
            osszeadas();
        } else if (Sorszamok == 2) {
            kivonas();
        } else if (Sorszamok == 3) {
            szorzas();
        } else if (Sorszamok == 4) {
            osztas();
        }
    }//GEN-LAST:event_BtnUjFeladatActionPerformed

    private void OsszeadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OsszeadasActionPerformed
        osszeadas();
    }//GEN-LAST:event_OsszeadasActionPerformed

    private void KivonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KivonasActionPerformed
        
        kivonas();
    }//GEN-LAST:event_KivonasActionPerformed

    private void szorzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_szorzasActionPerformed
        szorzas();
    }//GEN-LAST:event_szorzasActionPerformed

    private void ellenorzesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ellenorzesActionPerformed
         
        int BekertErtek = Integer.parseInt(eredmenyTextFild.getText());
        if (BekertErtek == eredmeny) {
            joValaszDb+=1;
            JOptionPane.showMessageDialog(this, "Helyes megoldás!", "Ellenőrzés", JOptionPane.INFORMATION_MESSAGE);
        } else {
            rosszValaszDb+=1;
            JOptionPane.showMessageDialog(this, "Helytelen megoldás!\nPróbáld újra!", "Ellenőrzés", JOptionPane.ERROR_MESSAGE);
        }
        probalkozasDb+=1;
        osszValaszDb=joValaszDb+rosszValaszDb;
        szazalek=(joValaszDb/osszValaszDb)*100;
        
        
          if (Sorszamok == 1) {
            probalkozasOsszDb+=1;
            
        } else if (Sorszamok == 2) {
            probalkozasKivonDb+=1;
        } else if (Sorszamok == 3) {
            probalkozasSzorzasDb+=1;
        } else if (Sorszamok == 4) {
            probalkozasOsztasDb+=1;
        }
    }//GEN-LAST:event_ellenorzesActionPerformed
    private void osszeadas(){
        eredmeny = 0;
        Sorszamok = 1;
        szam1 = rnd.nextInt(50);
        szam2 = rnd.nextInt(50);
        eredmeny = szam1 + szam2;
        LbSzamolas.setText(szam1 + " + " + szam2);
        kerdesDb+=1;
        kerdesOsszDb+=1;
    }
    
    
    private void kivonas(){
    
        Sorszamok = 2;
        
        szam1 = rnd.nextInt(50);
        szam2 = rnd.nextInt(50);
    
        LbSzamolas.setText(szam1 + " - " + szam2);
        
        eredmeny = szam1 - szam2;
        kerdesDb+=1;
        kerdesKivonDb+=1;
    }
    
    private void szorzas() {
        eredmeny = 0;
        Sorszamok = 3;
        szam1 = rnd.nextInt(9) + 1;
        szam2 = rnd.nextInt(9) + 1;
        eredmeny = szam1 * szam2;
        LbSzamolas.setText(szam1 + " * " + szam2);
        kerdesDb+=1;
        kerdesSzorzasDb+=1;
    }
    
    private void osztas(){
        eredmeny = 0;
        Sorszamok = 4;
        szam1 = rnd.nextInt(99)+1;
        szam2 = rnd.nextInt(99)+1;
        eredmeny = szam1 / szam2;
        LbSzamolas.setText(szam1 + " / " + szam2);
        kerdesDb+=1;
        kerdesOsztasDb+=1;
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
    private javax.swing.JButton ellenorzes;
    private javax.swing.JTextField eredmenyTextFild;
    private javax.swing.JMenuItem jMOsztas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton megoldas;
    private javax.swing.JMenuItem szorzas;
    // End of variables declaration//GEN-END:variables
}
