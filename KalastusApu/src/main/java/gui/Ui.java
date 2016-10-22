/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import alue.AlueValinta;
import kalalaji.kalat.Kalat;
import kalalaji.vieheet.Vieheet;
import saatila.saa.Tuuli;
import saatila.vakiot.Tuulensuunta;

/**
 *
 * @author mikko
 */
public class Ui extends javax.swing.JFrame {

    /**
     * Ohjelman graafinen käyttöjärjestelmä. Ohjelma kaatuu väärästä syötteestä.
     * Viehe kuva sään mukaan ei palauta oikeita kuvia. Sisältää tässä vaiheessa
     * vain Hauki arvot.
     */
    private int tuulenNopeus;
    private int kuvaIndeksi = 0;
    private Kalat kala;
    private final Tuuli tuuli;
    private final AlueValinta alueVa;
    private final Vieheet viehe;

    /**
     * Konstruktori.
     */
    public Ui() {
        initComponents();
        this.viehe = new Vieheet(kala);
        this.alueVa = new AlueValinta(alueValitsin1.getSelectedItem().toString(),
                "",
                getVedenLampo(),
                getVedenLampo());
        this.tuuli = new Tuuli(Tuulensuunta.valueOf(tuulensuuntaValitsin.getSelectedItem().toString().toUpperCase()),
                getTuulenNopeus());
        this.kala = Kalat.valueOf(kalaLajiValitsin.getSelectedItem().toString().toUpperCase());
    }

    /**
     * Metodi tarkistaa ja muuntaa käyttäjän syöttmän vedenkorkeuden int
     * tyyppiseksi tai asettaa oletus arvon.
     *
     * @return vedenkorkeus int tyyppisenä.
     */
    public int getVedenKorkeus() {
        if (vedenKorkeusValitsin1.getText().isEmpty()) {
            vedenKorkeusValitsin1.setText("0");
        }
        return Integer.parseInt(vedenKorkeusValitsin1.getText());
    }

    /**
     * Metodi tarkistaa syötetyn vedenlämmön arvon. Asettaa oletuksen jos arvo
     * ei ole oikea.
     *
     * @return vedenlämpö int tyyppisenä.
     */
    public int getVedenLampo() {
        int lampo;
        if (vedenLampoValitsin1.getText().isEmpty()) {
            vedenLampoValitsin1.setText("14");
            lampo = Integer.parseInt(vedenLampoValitsin1.getText());
            return lampo;
        }
        if (Integer.parseInt(vedenLampoValitsin1.getText()) > 0 && Integer.parseInt(vedenLampoValitsin1.getText()) < 31) {
            lampo = Integer.parseInt(vedenLampoValitsin1.getText());
            return lampo;
        }
        lampo = 14;
        return lampo;
    }

    /**
     * Metodi muuntaa syötetyn tuulennopeus arvon.
     *
     * @return tuulennopeus int tyyppisenä.
     */
    public int getTuulenNopeus() {
        if (tuulenNopeusValitsin.getText().isEmpty()) {
            tuulenNopeusValitsin.setText("6");
            tuulenNopeus = Integer.parseInt(tuulenNopeusValitsin.getText());
            return tuulenNopeus;
        }
        if (Integer.parseInt(tuulenNopeusValitsin.getText()) > 0 && Integer.parseInt(tuulenNopeusValitsin.getText()) < 25) {
            tuulenNopeus = Integer.parseInt(tuulenNopeusValitsin.getText());
            return tuulenNopeus;
        }
        tuulenNopeus = 6;
        return tuulenNopeus;
    }

    /**
     * Metodi muuntaa Kala vakio arvon String tyyppiseksi.
     *
     * @return Kala vakio arvo String tyyppisenä.
     */
    public String haettuNimi() {
        String haettuNimi = kala.name().toLowerCase();
        return haettuNimi;
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
        jTextArea1Esiintyminen = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2SaalisKalat = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2KalastustapaSaanMukaan = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3KalastusTapaYleinen = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        alue1 = new javax.swing.JPanel();
        alueValitsin1 = new javax.swing.JComboBox<>();
        alueValinta1 = new javax.swing.JLabel();
        vedenLampoValitsin1 = new javax.swing.JTextField();
        vedenKorkeusValitsin1 = new javax.swing.JTextField();
        valitseAlue1 = new javax.swing.JLabel();
        annaVedenLampo1 = new javax.swing.JLabel();
        annaVedenKorkeus1 = new javax.swing.JLabel();
        kalaValinta = new javax.swing.JLabel();
        valitseKalaLaji = new javax.swing.JLabel();
        kalaLajiValitsin = new javax.swing.JComboBox<>();
        tuulensuuntaValitsin = new javax.swing.JComboBox<>();
        tuulensuunta = new javax.swing.JLabel();
        tuulennopeus = new javax.swing.JLabel();
        tuulenNopeusValitsin = new javax.swing.JTextField();
        saaValinta = new javax.swing.JLabel();
        pilvisyys = new javax.swing.JLabel();
        pilvisyysValitsin = new javax.swing.JComboBox<>();
        sadeValitsin = new javax.swing.JComboBox<>();
        sade = new javax.swing.JLabel();
        haeValinta = new javax.swing.JButton();
        jButtonSeuraava = new javax.swing.JButton();
        jButtonEdellinen1 = new javax.swing.JButton();
        jLabelVieheKuva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KalastusApu");
        setBackground(new java.awt.Color(204, 255, 204));

        jTextArea1Esiintyminen.setEditable(false);
        jTextArea1Esiintyminen.setColumns(20);
        jTextArea1Esiintyminen.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Esiintyminen);

        jTextArea2SaalisKalat.setEditable(false);
        jTextArea2SaalisKalat.setColumns(20);
        jTextArea2SaalisKalat.setRows(5);
        jScrollPane4.setViewportView(jTextArea2SaalisKalat);

        jTextArea2KalastustapaSaanMukaan.setEditable(false);
        jTextArea2KalastustapaSaanMukaan.setColumns(20);
        jTextArea2KalastustapaSaanMukaan.setRows(5);
        jScrollPane2.setViewportView(jTextArea2KalastustapaSaanMukaan);

        jTextArea3KalastusTapaYleinen.setEditable(false);
        jTextArea3KalastusTapaYleinen.setColumns(20);
        jTextArea3KalastusTapaYleinen.setRows(5);
        jScrollPane3.setViewportView(jTextArea3KalastusTapaYleinen);

        alue1.setBackground(new java.awt.Color(0, 153, 255));
        alue1.setDoubleBuffered(false);
        alue1.setName("Alue"); // NOI18N

        alueValitsin1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meri", "Jarvi", "Joki" }));

        alueValinta1.setFont(new java.awt.Font("Nadeem", 1, 18)); // NOI18N
        alueValinta1.setForeground(new java.awt.Color(255, 255, 255));
        alueValinta1.setText("Alue");

        valitseAlue1.setForeground(new java.awt.Color(255, 255, 255));
        valitseAlue1.setText("Valitse alue");

        annaVedenLampo1.setForeground(new java.awt.Color(255, 255, 255));
        annaVedenLampo1.setText("Syötä vedenlämpö yli 0");

        annaVedenKorkeus1.setForeground(new java.awt.Color(255, 255, 255));
        annaVedenKorkeus1.setText("Syötä vedenkorkeus");

        kalaValinta.setFont(new java.awt.Font("Nadeem", 1, 18)); // NOI18N
        kalaValinta.setForeground(new java.awt.Color(255, 255, 255));
        kalaValinta.setText("Kala");

        valitseKalaLaji.setForeground(new java.awt.Color(255, 255, 255));
        valitseKalaLaji.setText("Valitse kalalaji");

        kalaLajiValitsin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hauki", "Ahven", "Kuha", "Taimen" }));

        tuulensuuntaValitsin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pohjoinen", "Koillinen", "Ita", "Kaakko", "Etela", "Lounas", "Lansi", "Luode" }));

        tuulensuunta.setForeground(new java.awt.Color(255, 255, 255));
        tuulensuunta.setText("Tuulensuunta");

        tuulennopeus.setForeground(new java.awt.Color(255, 255, 255));
        tuulennopeus.setText("Tuulennopeus");

        saaValinta.setFont(new java.awt.Font("Nadeem", 1, 18)); // NOI18N
        saaValinta.setForeground(new java.awt.Color(255, 255, 255));
        saaValinta.setText("Sää");

        pilvisyys.setForeground(new java.awt.Color(255, 255, 255));
        pilvisyys.setText("Pilvisyys");

        pilvisyysValitsin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aurinkoinen", "Pilvinen", "PuoliPilvinen", "Sumuinen" }));

        sadeValitsin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vesi", "Räntä", "Lumi", "Vesitihku", "Pouta" }));

        sade.setForeground(new java.awt.Color(255, 255, 255));
        sade.setText("Sade");

        haeValinta.setBackground(new java.awt.Color(0, 153, 204));
        haeValinta.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        haeValinta.setForeground(new java.awt.Color(0, 51, 204));
        haeValinta.setText("Hae");
        haeValinta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                haeValintaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout alue1Layout = new javax.swing.GroupLayout(alue1);
        alue1.setLayout(alue1Layout);
        alue1Layout.setHorizontalGroup(
            alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alue1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(alue1Layout.createSequentialGroup()
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addComponent(alueValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(vedenLampoValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(vedenKorkeusValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(kalaLajiValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(valitseAlue1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(annaVedenLampo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(annaVedenKorkeus1)
                                .addGap(127, 127, 127)
                                .addComponent(valitseKalaLaji)))
                        .addGap(50, 50, 50)
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sadeValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pilvisyysValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(pilvisyys)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addComponent(tuulensuuntaValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tuulenNopeusValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addComponent(tuulensuunta)
                                .addGap(24, 24, 24)
                                .addComponent(tuulennopeus))))
                    .addGroup(alue1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(alueValinta1)
                        .addGap(351, 351, 351)
                        .addComponent(kalaValinta)
                        .addGap(371, 371, 371)
                        .addComponent(saaValinta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(195, 195, 195))
            .addGroup(alue1Layout.createSequentialGroup()
                .addGap(547, 547, 547)
                .addComponent(haeValinta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        alue1Layout.setVerticalGroup(
            alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(alue1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(alue1Layout.createSequentialGroup()
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sade)
                            .addComponent(pilvisyys)
                            .addComponent(tuulensuunta)
                            .addComponent(tuulennopeus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pilvisyysValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuulensuuntaValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sadeValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tuulenNopeusValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(alue1Layout.createSequentialGroup()
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(alueValinta1)
                                    .addComponent(kalaValinta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(alue1Layout.createSequentialGroup()
                                .addComponent(saaValinta)
                                .addGap(12, 12, 12)))
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valitseAlue1)
                            .addComponent(annaVedenLampo1)
                            .addComponent(annaVedenKorkeus1)
                            .addComponent(valitseKalaLaji, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(alue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alueValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vedenLampoValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vedenKorkeusValitsin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kalaLajiValitsin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(haeValinta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButtonSeuraava.setBackground(new java.awt.Color(0, 153, 204));
        jButtonSeuraava.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButtonSeuraava.setForeground(new java.awt.Color(0, 102, 204));
        jButtonSeuraava.setText("Seuraava");
        jButtonSeuraava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeuraavaActionPerformed(evt);
            }
        });

        jButtonEdellinen1.setBackground(new java.awt.Color(0, 153, 204));
        jButtonEdellinen1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jButtonEdellinen1.setForeground(new java.awt.Color(0, 102, 204));
        jButtonEdellinen1.setText("Edellinen");
        jButtonEdellinen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdellinen1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonEdellinen1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(412, 412, 412)
                                .addComponent(jButtonSeuraava, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabelVieheKuva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alue1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alue1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelVieheKuva, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEdellinen1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSeuraava, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(335, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void haeValintaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_haeValintaActionPerformed
        // TODO add your handling code here:
        getVedenKorkeus();
        getVedenLampo();

        jTextArea1Esiintyminen.append(kala.esiintyySesonginMukaan());
        jTextArea2KalastustapaSaanMukaan.append(kala.kalastustapaSaanMukaan(tuuli, getVedenKorkeus()));
        jTextArea2SaalisKalat.append(kala.saalisKalatSesonginMukaan());
        jTextArea3KalastusTapaYleinen.append(kala.kalastustapaSesonginMukaan());
        viehe.naytaKuvat(kuvaIndeksi,
                jLabelVieheKuva,
                pilvisyysValitsin.getSelectedItem().toString().toLowerCase(),
                sadeValitsin.getSelectedItem().toString().toLowerCase(),
                haettuNimi());
    }//GEN-LAST:event_haeValintaActionPerformed

    private void jButtonSeuraavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeuraavaActionPerformed
        kuvaIndeksi = kuvaIndeksi + 1;
        if (kuvaIndeksi >= viehe.kuvatSaanMukaan(
                pilvisyysValitsin.getSelectedItem().toString().toLowerCase(),
                sadeValitsin.getSelectedItem().toString().toLowerCase(),
                haettuNimi()).size()) {

            kuvaIndeksi = viehe.kuvatSaanMukaan(
                    pilvisyysValitsin.getSelectedItem().toString().toLowerCase(),
                    sadeValitsin.getSelectedItem().toString().toLowerCase(),
                    haettuNimi()).size() - 1;
        }
        viehe.naytaKuvat(kuvaIndeksi,
                jLabelVieheKuva,
                pilvisyysValitsin.getSelectedItem().toString().toLowerCase(),
                sadeValitsin.getSelectedItem().toString().toLowerCase(),
                haettuNimi());
    }//GEN-LAST:event_jButtonSeuraavaActionPerformed

    private void jButtonEdellinen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdellinen1ActionPerformed
        kuvaIndeksi = kuvaIndeksi - 1;
        if (kuvaIndeksi < 0) {
            kuvaIndeksi = 0;
        }
        viehe.naytaKuvat(kuvaIndeksi,
                jLabelVieheKuva,
                pilvisyysValitsin.getSelectedItem().toString().toLowerCase(),
                sadeValitsin.getSelectedItem().toString().toLowerCase(),
                haettuNimi());
    }//GEN-LAST:event_jButtonEdellinen1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ui ui = new Ui();
                ui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alue1;
    private javax.swing.JLabel alueValinta1;
    private javax.swing.JComboBox<String> alueValitsin1;
    private javax.swing.JLabel annaVedenKorkeus1;
    private javax.swing.JLabel annaVedenLampo1;
    private javax.swing.JButton haeValinta;
    private javax.swing.JButton jButtonEdellinen1;
    private javax.swing.JButton jButtonSeuraava;
    private javax.swing.JLabel jLabelVieheKuva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1Esiintyminen;
    private javax.swing.JTextArea jTextArea2KalastustapaSaanMukaan;
    private javax.swing.JTextArea jTextArea2SaalisKalat;
    private javax.swing.JTextArea jTextArea3KalastusTapaYleinen;
    public javax.swing.JComboBox<String> kalaLajiValitsin;
    private javax.swing.JLabel kalaValinta;
    private javax.swing.JLabel pilvisyys;
    public javax.swing.JComboBox<String> pilvisyysValitsin;
    private javax.swing.JLabel saaValinta;
    private javax.swing.JLabel sade;
    public javax.swing.JComboBox<String> sadeValitsin;
    private javax.swing.JTextField tuulenNopeusValitsin;
    private javax.swing.JLabel tuulennopeus;
    private javax.swing.JLabel tuulensuunta;
    public javax.swing.JComboBox<String> tuulensuuntaValitsin;
    private javax.swing.JLabel valitseAlue1;
    private javax.swing.JLabel valitseKalaLaji;
    private javax.swing.JTextField vedenKorkeusValitsin1;
    private javax.swing.JTextField vedenLampoValitsin1;
    // End of variables declaration//GEN-END:variables
}
