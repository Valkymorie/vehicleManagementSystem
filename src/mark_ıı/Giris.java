package mark_ıı;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import jdk.jfr.events.FileWriteEvent;

/**
 *
 * @author mus_e
 */
public class Giris extends javax.swing.JFrame {

    /**
     * Creates new form Giris
     */
    public Giris() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        ana_sayfa = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        veri_girisi = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        arac_secim = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        marka_kayit = new javax.swing.JTextField();
        hiz_kayit = new javax.swing.JTextField();
        teker_kayit = new javax.swing.JTextField();
        fiyat_kayit = new javax.swing.JTextField();
        uretim_kayit = new javax.swing.JTextField();
        renk_kayit = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        kayit_kayit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        yolcu_kayit = new javax.swing.JTextField();
        giris_hiz_artir = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        veri_listele = new javax.swing.JPanel();
        tasit_liste = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        liste_tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        veri_guncelle = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        guncel_ID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        Guncel_marka = new javax.swing.JTextField();
        Guncel_yıl = new javax.swing.JTextField();
        Guncel_hız = new javax.swing.JTextField();
        Guncel_teker = new javax.swing.JTextField();
        Guncel_renk = new javax.swing.JTextField();
        guncel_fiyat = new javax.swing.JTextField();
        guncel_motorlu = new javax.swing.JRadioButton();
        guncel_motorsuz = new javax.swing.JRadioButton();
        Veri_Guncelle = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        guncel_yolcu = new javax.swing.JTextField();
        guncel_hiz_artir = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S.H.I.E.L.D.");

        jButton1.setText("Veri Girişi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setText("Yapmak istediğiniz işlemi seçiniz:");

        jButton3.setText("Verileri Güncelle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Verileri Listele");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ana_sayfaLayout = new javax.swing.GroupLayout(ana_sayfa);
        ana_sayfa.setLayout(ana_sayfaLayout);
        ana_sayfaLayout.setHorizontalGroup(
            ana_sayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ana_sayfaLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(ana_sayfaLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ana_sayfaLayout.setVerticalGroup(
            ana_sayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ana_sayfaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(ana_sayfaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(128, 128, 128))
        );

        jTabbedPane1.addTab("Ana Sayfa", ana_sayfa);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel2.setText("Markası:");

        arac_secim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Otomobil", "Bisiklet", "Uçak", "Gemi", "Uçan Gemi" }));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel3.setText("Bilgilerini giriceğiniz aracın türünü seçiniz:");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel4.setText("Yakıt Türü:");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel5.setText("Tekerlek Sayısı:");

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel6.setText("Fiyatı:");

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel7.setText("Maksimum Hızı:");

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel8.setText("Rengi:");

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel9.setText("Üretim Yılı:");

        marka_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marka_kayitActionPerformed(evt);
            }
        });

        uretim_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uretim_kayitActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Motorsuz");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Motorlu");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        kayit_kayit.setText("Kayıt");
        kayit_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayit_kayitActionPerformed(evt);
            }
        });

        jButton5.setText("Geri Dön");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel18.setText("Yolcu Sayısı:");

        giris_hiz_artir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        giris_hiz_artir.setText("0");

        jButton7.setText("+");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("-");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel21.setText("Hızı Ayarlayın:");

        javax.swing.GroupLayout veri_girisiLayout = new javax.swing.GroupLayout(veri_girisi);
        veri_girisi.setLayout(veri_girisiLayout);
        veri_girisiLayout.setHorizontalGroup(
            veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_girisiLayout.createSequentialGroup()
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veri_girisiLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)))
                    .addGroup(veri_girisiLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, veri_girisiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(veri_girisiLayout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giris_hiz_artir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(kayit_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fiyat_kayit)
                            .addComponent(teker_kayit)
                            .addComponent(hiz_kayit)
                            .addComponent(renk_kayit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(arac_secim, 0, 169, Short.MAX_VALUE)
                            .addComponent(marka_kayit)
                            .addComponent(uretim_kayit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(veri_girisiLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2))
                            .addComponent(yolcu_kayit))))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        veri_girisiLayout.setVerticalGroup(
            veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_girisiLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arac_secim, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marka_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiz_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teker_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fiyat_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uretim_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(renk_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yolcu_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(giris_hiz_artir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8)
                        .addComponent(jButton7))
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(veri_girisiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kayit_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Veri Girişi", veri_girisi);

        tasit_liste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kara Taşıtları", "Deniz Taşıtarı", "Hava Taşıtları" }));
        tasit_liste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tasit_listeActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel19.setText("Listelemek İstediğiniz Taşıt Kategorisini Seçiniz:");

        jButton2.setText("Geri Dön");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        liste_tab.addTab("Kara Taşıtları", jPanel1);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Araç ID", "Marka", "Renk", "Hız", "Fiyat", "Yolcu Kapasitesi", "Üretim Yılı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        liste_tab.addTab("Deniz Taşıtları", jPanel2);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Araç ID", "Marka", "Renk", "Hız", "Fiyat", "Yolcu Kapasitesi", "Üretim Yılı"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        liste_tab.addTab("Hava Taşıtları", jPanel3);

        javax.swing.GroupLayout veri_listeleLayout = new javax.swing.GroupLayout(veri_listele);
        veri_listele.setLayout(veri_listeleLayout);
        veri_listeleLayout.setHorizontalGroup(
            veri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_listeleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tasit_liste, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addComponent(liste_tab)
        );
        veri_listeleLayout.setVerticalGroup(
            veri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_listeleLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(veri_listeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tasit_liste, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(liste_tab, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Veri Listele", veri_listele);

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel10.setText("Kaydını Güncelliyceğiniz Aracın ID numarasını giriniz:");

        guncel_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncel_IDActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel11.setText("Yakıt Türü:");

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel12.setText("Tekerlek Sayısı:");

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel13.setText("Fiyatı:");

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel14.setText("Maksimum Hızı:");

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel15.setText("Rengi:");

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel16.setText("Üretim Yılı:");

        jButton6.setText("Geri Dön");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel17.setText("Markası:");

        guncel_motorlu.setText("Motorlu");
        guncel_motorlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncel_motorluActionPerformed(evt);
            }
        });

        guncel_motorsuz.setText("Motorsuz");
        guncel_motorsuz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncel_motorsuzActionPerformed(evt);
            }
        });

        Veri_Guncelle.setText("Verileri Güncelle");
        Veri_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Veri_GuncelleActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel20.setText("Yolcu Sayısı:");

        guncel_hiz_artir.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        guncel_hiz_artir.setText("0");

        jButton9.setText("+");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("-");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel22.setText("Hızı Ayarlayın:");

        javax.swing.GroupLayout veri_guncelleLayout = new javax.swing.GroupLayout(veri_guncelle);
        veri_guncelle.setLayout(veri_guncelleLayout);
        veri_guncelleLayout.setHorizontalGroup(
            veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_guncelleLayout.createSequentialGroup()
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veri_guncelleLayout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(veri_guncelleLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(veri_guncelleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(veri_guncelleLayout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(guncel_hiz_artir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(guncel_yolcu, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(Guncel_yıl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(guncel_ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(Guncel_marka, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Guncel_hız, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Guncel_renk)
                                .addComponent(Guncel_teker, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(guncel_fiyat, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, veri_guncelleLayout.createSequentialGroup()
                                    .addComponent(guncel_motorlu, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(guncel_motorsuz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, veri_guncelleLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Veri_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        veri_guncelleLayout.setVerticalGroup(
            veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(veri_guncelleLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncel_marka, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncel_motorlu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guncel_motorsuz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncel_hız, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncel_teker, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncel_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncel_yıl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Guncel_renk, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guncel_yolcu, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guncel_hiz_artir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10)
                    .addComponent(jButton9)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(veri_guncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Veri_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Veri Güncelle", veri_guncelle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void uretim_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uretim_kayitActionPerformed
        
    }//GEN-LAST:event_uretim_kayitActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void kayit_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayit_kayitActionPerformed
        try {
            int secim;
            secim = arac_secim.getSelectedIndex();
            switch(secim){
                case 0:
                    //otomobil üretilcek
                    String marka = marka_kayit.getText();
                    String renk = renk_kayit.getText();
                    boolean motor = true;
                    int hiz,teker,fiyat,yolcu,yil;
                    hiz = Integer.parseInt(hiz_kayit.getText());
                    teker = Integer.parseInt(teker_kayit.getText());
                    fiyat = Integer.parseInt(fiyat_kayit.getText());
                    yolcu = Integer.parseInt(yolcu_kayit.getText());
                    yil = Integer.parseInt(uretim_kayit.getText());
                    
                    otomobil oto = new otomobil(motor,teker,marka,hiz,yolcu,fiyat,renk,yil);
                    String dosya = "AracKayit.txt";
                    int sayac = 0;
                    hiz += Integer.parseInt(giris_hiz_artir.getText());
                    oto.setHiz(hiz);
                    try {
                        BufferedReader bfr = new BufferedReader(new FileReader(dosya));
                        String[] metin = new String[200];
                        //dosyada ki bilgiler kaydedilcek
                        if(bfr.ready())
                            metin[sayac++] = bfr.readLine();
                        while(bfr.ready()){
                            metin[sayac++] = bfr.readLine();
                        }
                        //kaydedile bilgilerin üzerine yazılcak yeni eklenen bilgiler
                        PrintWriter pw = new PrintWriter(dosya);
                        metin[sayac] = String.valueOf(oto.getArac_ID())+",";
                        metin[sayac] += oto.getMarka()+",";
                        metin[sayac] += oto.getRenk()+",";
                        metin[sayac] += "motorlu,";
                        metin[sayac] += String.valueOf(oto.getHiz())+",";
                        metin[sayac] += String.valueOf(oto.getTekerlek_sayisi())+",";
                        metin[sayac] += String.valueOf(oto.getFiyat())+",";
                        metin[sayac] += String.valueOf(oto.getYolcu_sayisi())+",";
                        metin[sayac] += String.valueOf(oto.getUretim())+",";
                        metin[sayac] += "1";
                        
                        //hepsi sırasıyla dosyaya geri yaılcak
                        for(int i=0;i<=sayac;i++){
                            pw.print(metin[i]);
                            pw.println();
                            //System.out.println(metin[i]);
                        }
                        pw.close();
                        
                     } 
                    catch (IOException ex) {
                        
                    }
                    
                    break;
                case 1:
                    //bisiklet
                   marka = marka_kayit.getText();
                   renk = renk_kayit.getText();
                    motor = false;
                    //int hiz,teker,fiyat,yolcu,yil;
                    hiz = Integer.parseInt(hiz_kayit.getText());
                    teker = Integer.parseInt(teker_kayit.getText());
                    fiyat = Integer.parseInt(fiyat_kayit.getText());
                    yolcu = Integer.parseInt(yolcu_kayit.getText());
                    yil = Integer.parseInt(uretim_kayit.getText());
                    
                    bisiklet bis = new bisiklet(motor,teker,marka,hiz,yolcu,fiyat,renk,yil);
                    dosya = "AracKayit.txt";
                    sayac = 0;
                    
                    try {
                        BufferedReader bfr1 = new BufferedReader(new FileReader(dosya));
                        String[] metin = new String[200];
                        //dosyada ki bilgiler kaydedilcek
                        if(bfr1.ready())
                            metin[sayac++] = bfr1.readLine();
                        while(bfr1.ready()){
                            metin[sayac++] = bfr1.readLine();
                        }
                        //kaydedile bilgilerin üzerine yazılcak yeni eklenen bilgiler
                        PrintWriter pw = new PrintWriter(dosya);
                        metin[sayac] = String.valueOf(bis.getArac_ID())+",";
                        metin[sayac] += bis.getMarka()+",";
                        metin[sayac] += bis.getRenk()+",";
                        metin[sayac] += "motorsuz,";
                        metin[sayac] += String.valueOf(bis.getHiz())+",";
                        metin[sayac] += String.valueOf(bis.getTekerlek_sayisi())+",";
                        metin[sayac] += String.valueOf(bis.getFiyat())+",";
                        metin[sayac] += String.valueOf(bis.getYolcu_sayisi())+",";
                        metin[sayac] += String.valueOf(bis.getUretim())+",";
                        metin[sayac] += "1";
                        
                        //hepsi sırasıyla dosyaya geri yaılcak
                        for(int i=0;i<=sayac;i++){
                            pw.print(metin[i]);
                            pw.println();
                            //System.out.println(metin[i]);
                        }
                        pw.close();
                        
                     } 
                    catch (IOException ex) {
                        
                    }
                    
                    break;
                case 2:
                    //uçak
                    marka = marka_kayit.getText();
                    renk = renk_kayit.getText();
                    hiz = Integer.parseInt(hiz_kayit.getText());
                    fiyat = Integer.parseInt(fiyat_kayit.getText());
                    yolcu = Integer.parseInt(yolcu_kayit.getText());
                    yil = Integer.parseInt(uretim_kayit.getText());
                    
                    ucak uc = new ucak(marka, hiz, yolcu, fiyat, renk, yil);
                    
                    dosya = "AracKayit.txt";
                    sayac = 0;
                    
                    try {
                        BufferedReader bfr1 = new BufferedReader(new FileReader(dosya));
                        String[] metin = new String[200];
                        //dosyada ki bilgiler kaydedilcek
                        if(bfr1.ready())
                            metin[sayac++] = bfr1.readLine();
                        while(bfr1.ready()){
                            metin[sayac++] = bfr1.readLine();
                        }
                        //kaydedile bilgilerin üzerine yazılcak yeni eklenen bilgiler
                        PrintWriter pw = new PrintWriter(dosya);
                        metin[sayac] = String.valueOf(uc.getArac_ID())+",";
                        metin[sayac] += uc.getMarka()+",";
                        metin[sayac] += uc.getRenk()+",";
                        metin[sayac] += String.valueOf(uc.getHiz())+",";
                        metin[sayac] += String.valueOf(uc.getFiyat())+",";
                        metin[sayac] += String.valueOf(uc.getYolcu_sayisi())+",";
                        metin[sayac] += String.valueOf(uc.getUretim())+",";
                        metin[sayac] += "2";
                        
                        //hepsi sırasıyla dosyaya geri yaılcak
                        for(int i=0;i<=sayac;i++){
                            pw.print(metin[i]);
                            pw.println();
                            //System.out.println(metin[i]);
                        }
                        pw.close();
                        
                     } 
                    catch (IOException ex) {
                        
                    }
                    
                    break;
                case 3:
                    //gemi
                    marka = marka_kayit.getText();
                    renk = renk_kayit.getText();
                    hiz = Integer.parseInt(hiz_kayit.getText());
                    fiyat = Integer.parseInt(fiyat_kayit.getText());
                    yolcu = Integer.parseInt(yolcu_kayit.getText());
                    yil = Integer.parseInt(uretim_kayit.getText());
                    
                    gemi gem = new gemi(marka, hiz, yolcu, fiyat, renk, yil);
                    
                    dosya = "AracKayit.txt";
                    sayac = 0;
                    
                    try {
                        BufferedReader bfr1 = new BufferedReader(new FileReader(dosya));
                        String[] metin = new String[200];
                        //dosyada ki bilgiler kaydedilcek
                        if(bfr1.ready())
                            metin[sayac++] = bfr1.readLine();
                        while(bfr1.ready()){
                            metin[sayac++] = bfr1.readLine();
                        }
                        //kaydedile bilgilerin üzerine yazılcak yeni eklenen bilgiler
                        PrintWriter pw = new PrintWriter(dosya);
                        metin[sayac] = String.valueOf(gem.getArac_ID())+",";
                        metin[sayac] += gem.getMarka()+",";
                        metin[sayac] += gem.getRenk()+",";
                        metin[sayac] += String.valueOf(gem.getHiz())+",";
                        metin[sayac] += String.valueOf(gem.getFiyat())+",";
                        metin[sayac] += String.valueOf(gem.getYolcu_sayisi())+",";
                        metin[sayac] += String.valueOf(gem.getUretim())+",";
                        metin[sayac] += "3";
                        
                        //hepsi sırasıyla dosyaya geri yaılcak
                        for(int i=0;i<=sayac;i++){
                            pw.print(metin[i]);
                            pw.println();
                            //System.out.println(metin[i]);
                        }
                        pw.close();
                        
                     } 
                    catch (IOException ex) {
                        
                    }
                    
                    break;
                case 4:
                    //uçan gemi
                    marka = marka_kayit.getText();
                    renk = renk_kayit.getText();
                    hiz = Integer.parseInt(hiz_kayit.getText());
                    fiyat = Integer.parseInt(fiyat_kayit.getText());
                    yolcu = Integer.parseInt(yolcu_kayit.getText());
                    yil = Integer.parseInt(uretim_kayit.getText());
                    
                    ucan_gemi ucgem = new ucan_gemi(marka, hiz, yolcu, fiyat, renk, yil);
                    
                    dosya = "AracKayit.txt";
                    sayac = 0;
                    
                    try {
                        BufferedReader bfr1 = new BufferedReader(new FileReader(dosya));
                        String[] metin = new String[200];
                        //dosyada ki bilgiler kaydedilcek
                        if(bfr1.ready())
                            metin[sayac++] = bfr1.readLine();
                        while(bfr1.ready()){
                            metin[sayac++] = bfr1.readLine();
                        }
                        //kaydedile bilgilerin üzerine yazılcak yeni eklenen bilgiler
                        PrintWriter pw = new PrintWriter(dosya);
                        metin[sayac] = String.valueOf(ucgem.getArac_ID())+",";
                        metin[sayac] += ucgem.getMarka()+",";
                        metin[sayac] += ucgem.getRenk()+",";
                        metin[sayac] += String.valueOf(ucgem.getHiz())+",";
                        metin[sayac] += String.valueOf(ucgem.getFiyat())+",";
                        metin[sayac] += String.valueOf(ucgem.getYolcu_sayisi())+",";
                        metin[sayac] += String.valueOf(ucgem.getUretim())+",";
                        metin[sayac] += "23";
                        
                        //hepsi sırasıyla dosyaya geri yazılcak
                        for(int i=0;i<=sayac;i++){
                            pw.print(metin[i]);
                            pw.println();
                            //System.out.println(metin[i]);
                        }
                        pw.close();
                        
                     } 
                    catch (IOException ex) {
                        
                    }
                    
                    break;
                    
            }
        } catch (IOException ex) {
            Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_kayit_kayitActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected())
            jRadioButton2.setSelected(false);
        else
            jRadioButton2.setSelected(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        if(jRadioButton2.isSelected())
            jRadioButton1.setSelected(false);
        else
            jRadioButton1.setSelected(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void guncel_motorluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncel_motorluActionPerformed
        if(guncel_motorlu.isSelected())
            guncel_motorsuz.setSelected(false);
        else
            guncel_motorsuz.setSelected(true);
    }//GEN-LAST:event_guncel_motorluActionPerformed

    private void guncel_motorsuzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncel_motorsuzActionPerformed
        if(guncel_motorsuz.isSelected())
            guncel_motorlu.setSelected(false);
        else
            guncel_motorlu.setSelected(true);
    }//GEN-LAST:event_guncel_motorsuzActionPerformed

    private void Veri_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Veri_GuncelleActionPerformed
        
        String ID = guncel_ID.getText();
        String marka = Guncel_marka.getText();
        String renk = Guncel_renk.getText();
        int hiz,teker,fiyat,yolcu,yil;
        hiz = Integer.parseInt(Guncel_hız.getText());
        teker = Integer.parseInt(Guncel_teker.getText());
        fiyat = Integer.parseInt(guncel_fiyat.getText());
        yolcu = Integer.parseInt(guncel_yolcu.getText());
        yil = Integer.parseInt(Guncel_yıl.getText());
        hiz += Integer.parseInt(guncel_hiz_artir.getText());
        boolean yakıt;
        String motor = null;
        if(guncel_motorlu.isSelected()){
            yakıt = true;
            motor = "motorlu";
        }
        else{
            yakıt = false;
            motor = "motorsuz";
        }
        
        try {
            String dosya ="AracKayit.txt";
            String[] satirlar = new String[200];
            int sayac = 0;
            BufferedReader bfr = new BufferedReader(new FileReader(dosya));
            while(bfr.ready()){
                satirlar[sayac] = bfr.readLine();
                
                String[] parcala = satirlar[sayac].split(",");
                //System.out.println(parcala[0]);
                int arac_turu = Integer.parseInt(parcala[parcala.length-1]);
                if(parcala[0].equals(ID) && arac_turu == 1){
                    satirlar[sayac] = String.valueOf(ID) + ",";
                    satirlar[sayac] += marka + ",";
                    satirlar[sayac] += renk + ",";
                    satirlar[sayac] += motor + ",";
                    satirlar[sayac] += String.valueOf(hiz) + ",";
                    satirlar[sayac] += String.valueOf(teker) + ",";
                    satirlar[sayac] += String.valueOf(fiyat) + ",";
                    satirlar[sayac] += String.valueOf(yolcu) + ",";
                    satirlar[sayac] += String.valueOf(yil) + ",";
                    satirlar[sayac] += String.valueOf(arac_turu);
                }
                else if(parcala[0].equals(ID)){
                    satirlar[sayac] = String.valueOf(ID) + ",";
                    satirlar[sayac] += marka + ",";
                    satirlar[sayac] += renk + ",";
                    satirlar[sayac] += String.valueOf(hiz) + ",";
                    satirlar[sayac] += String.valueOf(fiyat) + ",";
                    satirlar[sayac] += String.valueOf(yolcu) + ",";
                    satirlar[sayac] += String.valueOf(yil) + ",";
                    satirlar[sayac] += String.valueOf(arac_turu);
                    
                }
                sayac++;
            }
            
            PrintWriter pw = new PrintWriter(dosya);
            
            for(int i=0;i<sayac;i++){
                pw.print(satirlar[i]);
                pw.println();
            }
            pw.close();
            
            
        } 
        catch (IOException ex) {
            Logger.getLogger(Giris.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
    }//GEN-LAST:event_Veri_GuncelleActionPerformed

    private void marka_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marka_kayitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marka_kayitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tasit_listeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tasit_listeActionPerformed
        
        int secilen = tasit_liste.getSelectedIndex();
        liste_tab.setSelectedIndex(secilen);
        
        switch(secilen){
            
           case 0:
                //kara
                DefaultTableModel model = new DefaultTableModel(new String [] { "Araç ID", "Marka", "Renk", "Yakıt Türü", "Hız", "Teker Sayısı", "Fiyat", "Yolcu Kapasitesi", "Üretim Yılı"}, 0);
                jTable1.setModel(model);
        
              try {
            
                 String dosya ="AracKayit.txt";
                 String[] satirlar = new String[200];
                 int sayac = 0;
                 BufferedReader bfr = new BufferedReader(new FileReader(dosya));
                 while(bfr.ready()){
                    satirlar[sayac] = bfr.readLine();
                    String[] parcala = satirlar[sayac].split(",");
                    int boyut = parcala.length;
                    int arac = Integer.parseInt(parcala[boyut-1]);
                    if(arac==1){
                        model.addRow(parcala);
                     }
                       sayac++;
                
                  }
            
            } 
            catch (Exception e) {
            
             }
              break;
          
           case 1:
               //deniz
               DefaultTableModel model1 = new DefaultTableModel(new String [] { "Araç ID", "Marka", "Renk", "Hız", "Fiyat", "Yolcu Kapasitesi", "Üretim Yılı"}, 0);
               jTable5.setModel(model1);
               
               try {
            
                 String dosya ="AracKayit.txt";
                 String[] satirlar = new String[200];
                 int sayac = 0;
                 BufferedReader bfr = new BufferedReader(new FileReader(dosya));
                 while(bfr.ready()){
                    satirlar[sayac] = bfr.readLine();
                    String[] parcala = satirlar[sayac].split(",");
                    int boyut = parcala.length;
                    int arac = Integer.parseInt(parcala[boyut-1]);
                    if(arac==3 || arac==23){
                        model1.addRow(parcala);
                     }
                       sayac++;
                  }
            
            } 
            catch (Exception e) {
            
             }
               
               break;
           case 2:
               //hava
               DefaultTableModel model2 = new DefaultTableModel(new String [] { "Araç ID", "Marka", "Renk", "Hız", "Fiyat", "Yolcu Kapasitesi", "Üretim Yılı"}, 0);
               jTable6.setModel(model2);
               
               try {
            
                 String dosya ="AracKayit.txt";
                 String[] satirlar = new String[200];
                 int sayac = 0;
                 BufferedReader bfr = new BufferedReader(new FileReader(dosya));
                 while(bfr.ready()){
                    satirlar[sayac] = bfr.readLine();
                    String[] parcala = satirlar[sayac].split(",");
                    int boyut = parcala.length;
                    int arac = Integer.parseInt(parcala[boyut-1]);
                    if(arac==2 || arac==23){
                        model2.addRow(parcala);
                     }
                       sayac++;
                  }
            
            } 
            catch (Exception e) {
            
             }
             break;
               
        }
    }//GEN-LAST:event_tasit_listeActionPerformed

    private void guncel_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncel_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guncel_IDActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int hiz = Integer.parseInt(giris_hiz_artir.getText());
        hiz++;
        giris_hiz_artir.setText(String.valueOf(hiz));
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int hiz = Integer.parseInt(giris_hiz_artir.getText());
        hiz--;
        giris_hiz_artir.setText(String.valueOf(hiz));
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int hiz = Integer.parseInt(guncel_hiz_artir.getText());
        hiz++;
        guncel_hiz_artir.setText(String.valueOf(hiz));
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       int hiz = Integer.parseInt(guncel_hiz_artir.getText());
        hiz--;
        guncel_hiz_artir.setText(String.valueOf(hiz));
    }//GEN-LAST:event_jButton10ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giris().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Guncel_hız;
    private javax.swing.JTextField Guncel_marka;
    private javax.swing.JTextField Guncel_renk;
    private javax.swing.JTextField Guncel_teker;
    private javax.swing.JTextField Guncel_yıl;
    private javax.swing.JButton Veri_Guncelle;
    private javax.swing.JPanel ana_sayfa;
    private javax.swing.JComboBox<String> arac_secim;
    private javax.swing.JTextField fiyat_kayit;
    private javax.swing.JTextField giris_hiz_artir;
    private javax.swing.JTextField guncel_ID;
    private javax.swing.JTextField guncel_fiyat;
    private javax.swing.JTextField guncel_hiz_artir;
    private javax.swing.JRadioButton guncel_motorlu;
    private javax.swing.JRadioButton guncel_motorsuz;
    private javax.swing.JTextField guncel_yolcu;
    private javax.swing.JTextField hiz_kayit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JButton kayit_kayit;
    private javax.swing.JTabbedPane liste_tab;
    private javax.swing.JTextField marka_kayit;
    private javax.swing.JTextField renk_kayit;
    private javax.swing.JComboBox<String> tasit_liste;
    private javax.swing.JTextField teker_kayit;
    private javax.swing.JTextField uretim_kayit;
    private javax.swing.JPanel veri_girisi;
    private javax.swing.JPanel veri_guncelle;
    private javax.swing.JPanel veri_listele;
    private javax.swing.JTextField yolcu_kayit;
    // End of variables declaration//GEN-END:variables

}
