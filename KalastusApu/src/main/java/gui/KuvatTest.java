/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import kalalaji.kalat.Kalat;
import kalalaji.vieheet.Vieheet;
import saatila.logiikka.SaaNyt;
import saatila.saa.Pilvisyys;
import saatila.saa.Sade;
import saatila.saa.Tuuli;
import static saatila.vakiot.Sateet.POUTA;
import static saatila.vakiot.Taivas.AURINKOINEN;
import static saatila.vakiot.Tuulensuunta.ETELA;

/**
 *
 * @author mikko
 */
public final class KuvatTest extends javax.swing.JPanel {

    private Tuuli t = new Tuuli(ETELA, 5);
    private Pilvisyys p = new Pilvisyys(AURINKOINEN);
    private Sade s = new Sade(POUTA);
    private SaaNyt saanyt = new SaaNyt(p, s, t);
    private Kalat hauki = Kalat.Hauki;
    private Vieheet viehe = new Vieheet(hauki);

    /**
     * Creates new form KuvatTest
     */
    public KuvatTest() {
        initComponents();
    }
    int indeksi = 0;

    private String[] haeVieheKuvat() {
        File kansio = new File(getClass().getResource("/hauki").getFile());
        String[] vieheKuvat = kansio.list();
        return vieheKuvat;
    }

    public void naytaViehekuvat() {
        String[] kuvat = haeVieheKuvat();
        String kuvanNimi = kuvat[indeksi];
        ImageIcon kuva = new ImageIcon(getClass().getResource("/hauki/" + kuvanNimi));
        Image vieheKuva = kuva.getImage().getScaledInstance(jLabel_kuva.getWidth(), jLabel_kuva.getHeight(), Image.SCALE_SMOOTH);
        jLabel_kuva.setIcon(new ImageIcon(vieheKuva));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_kuva = new javax.swing.JLabel();
        edellinen = new javax.swing.JButton();
        seuraava = new javax.swing.JButton();

        setSize(new java.awt.Dimension(800, 1200));

        edellinen.setText("Edellinen");
        edellinen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edellinenActionPerformed(evt);
            }
        });

        seuraava.setText("Seuraava");
        seuraava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seuraavaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_kuva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(edellinen, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(seuraava, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_kuva, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edellinen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seuraava, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void edellinenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edellinenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edellinenActionPerformed

    private void seuraavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seuraavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seuraavaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edellinen;
    private javax.swing.JLabel jLabel_kuva;
    private javax.swing.JButton seuraava;
    // End of variables declaration//GEN-END:variables
}
