/*
 * addbarang.java
 *
 * Created on March 10, 2008, 4:22 PM
 */

package src;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 *
 * @author  aquwan
 */

public class addperkiraan extends javax.swing.JDialog {
    public static String isikodesubdept="";
    public static String isiperkiraan;
    private String loguser;
    private Connection cnadd;
    private boolean status;
    private Statement stadd;
    private String namadb;
    
    /** Creates new form addbarang */
    public addperkiraan(java.awt.Frame parent,boolean stat,String menu,String judul) {
        super(parent,judul,true);
        try {
            initComponents();
            namadb = Login.namadbase;
            loguser = lib2.LOGuser;
            cnadd = lib2.CNC;
            status = stat;
            stadd = cnadd.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            //System.out.println(MainForm.test);
            if (status) {
                jTextFieldperkiraan.setEditable(true);
                jLabeljudul.setText(judul);                
            } else {
                jLabeljudul.setText(judul);
                jTextFieldperkiraan.setEditable(false);                                
                jTextFieldperkiraan.setText(formok.ATable.getValueAt(formok.ATable.getSelectedRow(), 0).toString().trim());                
                cekmesin();
                jTextFieldnamaperkiraan.requestFocus();
            } 
            
            
        } catch (SQLException ex) {
            Logger.getLogger(addperkiraan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSub = new javax.swing.ButtonGroup();
        buttonGroupNL = new javax.swing.ButtonGroup();
        buttonGroupDK = new javax.swing.ButtonGroup();
        buttonGroupDK1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldperkiraan = new javax.swing.JTextField();
        jTextFieldnamaperkiraan = new javax.swing.JTextField();
        jButtonsimpan =  new javax.swing.JButton(lib2.createImageIcon("24x24/simpan.png"));
        jButtonbatal = new javax.swing.JButton(lib2.createImageIcon("24x24/delete.png"));
        jLabel6 = new javax.swing.JLabel();
        jRadioSubYa = new javax.swing.JRadioButton();
        jRadioSubTidak = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioNeraca = new javax.swing.JRadioButton();
        jRadioLabarugi = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioDebet = new javax.swing.JRadioButton();
        jRadioKredit = new javax.swing.JRadioButton();
        jLabeljudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel1.setText("Sub");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 30));

        jTextFieldperkiraan.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jTextFieldperkiraan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldperkiraanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldperkiraanKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldperkiraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 180, -1));

        jTextFieldnamaperkiraan.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jTextFieldnamaperkiraan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldnamaperkiraanFocusLost(evt);
            }
        });
        jTextFieldnamaperkiraan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldnamaperkiraanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldnamaperkiraanKeyReleased(evt);
            }
        });
        jPanel1.add(jTextFieldnamaperkiraan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 350, -1));

        jButtonsimpan.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonsimpan.setMnemonic('S');
        jButtonsimpan.setText("Simpan");
        jButtonsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsimpanActionPerformed(evt);
            }
        });
        jButtonsimpan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonsimpanKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 140, 40));

        jButtonbatal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonbatal.setMnemonic('B');
        jButtonbatal.setText("Batal");
        jButtonbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbatalActionPerformed(evt);
            }
        });
        jButtonbatal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonbatalKeyPressed(evt);
            }
        });
        jPanel1.add(jButtonbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 140, 40));

        jLabel6.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel6.setText("Nama Perkiraan");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, -1));

        buttonGroupSub.add(jRadioSubYa);
        jRadioSubYa.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioSubYa.setText("Ya");
        jRadioSubYa.setToolTipText("K");
        jRadioSubYa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSubYaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioSubYa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        buttonGroupSub.add(jRadioSubTidak);
        jRadioSubTidak.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioSubTidak.setSelected(true);
        jRadioSubTidak.setText("Tidak");
        jRadioSubTidak.setToolTipText("P");
        jPanel1.add(jRadioSubTidak, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel2.setText("Perkiraan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jLabel3.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel3.setText("Jenis Laporan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 30));

        buttonGroupNL.add(jRadioNeraca);
        jRadioNeraca.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioNeraca.setSelected(true);
        jRadioNeraca.setText("Neraca");
        jRadioNeraca.setToolTipText("K");
        jRadioNeraca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNeracaActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioNeraca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        buttonGroupNL.add(jRadioLabarugi);
        jRadioLabarugi.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioLabarugi.setText("Laba Rugi");
        jRadioLabarugi.setToolTipText("P");
        jPanel1.add(jRadioLabarugi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel4.setText("Kolom");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 30));

        buttonGroupDK.add(jRadioDebet);
        jRadioDebet.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioDebet.setSelected(true);
        jRadioDebet.setText("Debet");
        jRadioDebet.setToolTipText("K");
        jRadioDebet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioDebetActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioDebet, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        buttonGroupDK.add(jRadioKredit);
        jRadioKredit.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jRadioKredit.setText("Kredit");
        jRadioKredit.setToolTipText("P");
        jPanel1.add(jRadioKredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabeljudul.setBackground(new java.awt.Color(37, 126, 197));
        jLabeljudul.setFont(new java.awt.Font("DejaVu LGC Sans", 1, 18)); // NOI18N
        jLabeljudul.setForeground(new java.awt.Color(251, 246, 246));
        jLabeljudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeljudul.setText("Tambah");
        jLabeljudul.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabeljudul, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabeljudul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     private void cekmesin(){        
        String sqlmesin = "SELECT perkiraan,namaperkiraan,sub,nl,dk,ifnull(opr,'T')as opr FROM "+ namadb +".a_perkiraan WHERE perkiraan='" + jTextFieldperkiraan.getText().toString().trim() +"'";
        String[] cekdt = lib1.cekdataarr(sqlmesin, new String[]{"perkiraan", "namaperkiraan", "sub", "nl", "dk","opr"});
        if (cekdt[0] != null) {
            jTextFieldperkiraan.setText(cekdt[0].trim());
            jTextFieldnamaperkiraan.setText(cekdt[1].trim());
            if ((cekdt[2].trim()).equals("Y")){
                jRadioSubYa.setSelected(true);
            } else if ((cekdt[2].trim()).equals("T")) {
                jRadioSubTidak.setSelected(true);
            }
            if ((cekdt[3].trim()).equals("N")){
                jRadioNeraca.setSelected(true);
            } else if ((cekdt[3].trim()).equals("L")) {
                jRadioLabarugi.setSelected(true);           
            }
            if ((cekdt[4].trim()).equals("D")){
                jRadioDebet.setSelected(true);
            } else if ((cekdt[4].trim()).equals("K")) {
                jRadioKredit.setSelected(true);
            }              
        }
    }
     
    private void jTextFieldperkiraanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldperkiraanKeyPressed
        // TODO add your handling code here:
        int ascii = evt.getKeyCode();
        if (ascii == 10) { //jika di tekan enter
            if (cekPerkiraan()) {
                if (lib2.left(jTextFieldperkiraan.getText(), 1).equals("1")) {
                    jRadioNeraca.setSelected(true);
                } else if (lib2.left(jTextFieldperkiraan.getText(), 1).equals("2")) {
                    jRadioNeraca.setSelected(true);
                } else if (lib2.left(jTextFieldperkiraan.getText(), 1).equals("3")) {
                    jRadioNeraca.setSelected(true);
                } else {
                    jRadioLabarugi.setSelected(true);
                }
                jTextFieldnamaperkiraan.requestFocus();
            }            
        } else if (ascii == 27) { //jika di tekan esc
            
        }
    }//GEN-LAST:event_jTextFieldperkiraanKeyPressed

    private void jButtonsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsimpanActionPerformed
        // TODO add your handling code here:
        simpan();
    }//GEN-LAST:event_jButtonsimpanActionPerformed

    private void jButtonbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbatalActionPerformed
               
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonbatalActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:       
    }//GEN-LAST:event_formWindowClosing

    private void jRadioSubYaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSubYaActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jRadioSubYaActionPerformed

    private void jRadioNeracaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNeracaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioNeracaActionPerformed

    private void jRadioDebetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioDebetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioDebetActionPerformed

    private void jTextFieldperkiraanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldperkiraanKeyReleased
        if (!lib2.maxisi(jTextFieldperkiraan, 11)) {
            lib1.msgerr("Kode tidak boleh lebih dari 12 digit, Ulangi !!!");
            jTextFieldperkiraan.setText(lib2.left(jTextFieldperkiraan.getText(), 13));
        }
    }//GEN-LAST:event_jTextFieldperkiraanKeyReleased

    private void jTextFieldnamaperkiraanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnamaperkiraanKeyPressed
        int ascii = evt.getKeyCode();        
        if (ascii == 10) { //jika di tekan enter            
            jButtonsimpan.requestFocus();
        } else if (ascii == 27) { //jika di tekan esc
            jTextFieldperkiraan.requestFocus();
            jTextFieldperkiraan.selectAll();
        }
            
    }//GEN-LAST:event_jTextFieldnamaperkiraanKeyPressed

    private void jTextFieldnamaperkiraanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldnamaperkiraanKeyReleased
        if (lib2.hurufbesar(evt)) {
            //jTextFieldnamaperkiraan.setText(jTextFieldnamaperkiraan.getText().toUpperCase());
        }
    }//GEN-LAST:event_jTextFieldnamaperkiraanKeyReleased

    private void jButtonsimpanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonsimpanKeyPressed
        int ascii = evt.getKeyCode();        
        if (ascii == 10) { //jika di tekan enter            
            simpan();
        } else if (ascii == 27) { //jika di tekan esc
            jTextFieldnamaperkiraan.requestFocus();
            jTextFieldnamaperkiraan.selectAll();
        }
    }//GEN-LAST:event_jButtonsimpanKeyPressed

    private void jButtonbatalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonbatalKeyPressed
        int ascii = evt.getKeyCode();        
        if (ascii == 10) { //jika di tekan enter            
             setVisible(false);
            dispose();
        } 
    }//GEN-LAST:event_jButtonbatalKeyPressed

    private void jTextFieldnamaperkiraanFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldnamaperkiraanFocusLost
        jTextFieldnamaperkiraan.setText(jTextFieldnamaperkiraan.getText().toUpperCase());
    }//GEN-LAST:event_jTextFieldnamaperkiraanFocusLost
    
     private void mati(){ 
         jTextFieldperkiraan.setEditable(false);         
     }
    
    private void bersih() {
        if (status) {
            jTextFieldperkiraan.setText("");            
            jTextFieldnamaperkiraan.setText("");                             
            jTextFieldperkiraan.setEditable(true);            
            jTextFieldnamaperkiraan.setEditable(true);
            jTextFieldperkiraan.requestFocus();
        } else {
            jTextFieldnamaperkiraan.setText(formok.ATable.getValueAt(formok.ATable.getSelectedRow(), 2).toString().trim());
            jTextFieldnamaperkiraan.requestFocus();
        }
    }
    
    private  boolean cekPerkiraan() {
        boolean result = true;
        String sql= "SELECT PERKIRAAN FROM "+ namadb +".a_perkiraan WHERE PERKIRAAN='" +jTextFieldperkiraan.getText().toString().trim() + "'";
        String[] hsl = lib1.cekdataarr(sql, new String[]{"PERKIRAAN"});
        if (hsl[0] != null) {    
           lib1.msgerr("Perkiraan " +jTextFieldperkiraan.getText().toString().trim() +" sudah dipakai, Ulangi !!!");
           result = false;
        } else {
            result = true;
        }
        if (jTextFieldperkiraan.getText().length() > 6) {
            sql = "SELECT PERKIRAAN,SUB FROM " + namadb + ".a_perkiraan WHERE PERKIRAAN='" + lib2.left(jTextFieldperkiraan.getText().toString().trim(),6) + "'";
            hsl = lib1.cekdataarr(sql, new String[]{"PERKIRAAN","SUB"});
            if (hsl[0] != null) {
                result = true;
            } else {                
                lib1.msgerr("Perkiraan " + lib2.left(jTextFieldperkiraan.getText().toString().trim(),6) + " belum terdaftar, Ulangi !!!");
                result = false;
            }
            if (hsl[1].contentEquals("Y")) {
                result = true;
            } else {                
                lib1.msgerr("Perkiraan " + lib2.left(jTextFieldperkiraan.getText().toString().trim(),6) + " tidak diset punya sub, Ulangi !!!");
                result = false;
            }
        }
        
        return result;
    }
    
     private  boolean cekkosong() {
        boolean result = true;
        if (jTextFieldperkiraan.getText().length() < 1) {
            jTextFieldperkiraan.requestFocus();
            result = false;
        }        
        if (jTextFieldnamaperkiraan.getText().length() < 1) {
            jTextFieldnamaperkiraan.requestFocus();
            result = false;
        }        
        return result;
    }
     
    private void simpan() {
        if (cekkosong()) {
            char sub = 0;
            char nl = 0;
            char dk = 0;
            char opr = 0;
            if (jRadioSubYa.isSelected()) {
                sub = 'Y';
            } else if (jRadioSubTidak.isSelected()) {
                sub = 'T';
            }
            if (jRadioNeraca.isSelected()) {
                nl = 'N';
            } else if (jRadioLabarugi.isSelected()) {
                nl = 'L';
            }
            if (jRadioDebet.isSelected()) {
                dk = 'D';
            } else if (jRadioKredit.isSelected()) {
                dk = 'K';
            }          
            if (status) {
                String sql= "SELECT PERKIRAAN FROM "+ namadb +".a_perkiraan WHERE PERKIRAAN='" +jTextFieldperkiraan.getText().toString().trim() + "'";
                String[] hsl = lib1.cekdataarr(sql, new String[]{"PERKIRAAN"});
                if (hsl[0] != null) {                    
                    int mpil = javax.swing.JOptionPane.showOptionDialog(this,
                            "Perkiraan " + jTextFieldperkiraan.getText().trim() + " Sudah Dipakai", "Warning...",
                            -1, 3, null, new Object[]{"OK"}, null);
                    jTextFieldperkiraan.requestFocus();
                } else {                    
                    int mpil = javax.swing.JOptionPane.showOptionDialog(this,
                            "Yakin Data Akan Di Simpan ?", "Simpan...",
                            -1, 3, null, new Object[]{"Tidak", "Simpan"}, null);  
                    
                    
                    
                    String newdept = "INSERT INTO "+ namadb +".a_perkiraan (perkiraan,namaperkiraan,sub,nl,dk,user) " + " VALUES('" +
                            jTextFieldperkiraan.getText().trim() + "','" +                             
                            jTextFieldnamaperkiraan.getText().trim() + "','" + 
                            sub + "','" + nl + "','" + dk + "','" + loguser + "')";
                    if (mpil == 1) {
                        try {
                            stadd.execute(newdept);
                        } catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                        bersih();
                    }
                    setVisible(false);
                    dispose();
                }
            } else {
                int mpil = javax.swing.JOptionPane.showOptionDialog(this,
                        "Yakin Data Akan Di Ubah ?", "Ubah...",
                        -1, 3, null, new Object[]{"Tidak", "Ya"}, null);

                String editdept = "UPDATE "+ namadb +".a_perkiraan SET namaperkiraan" + "='" + jTextFieldnamaperkiraan.getText().trim() + "',"
                        + "sub='" + sub + "',"
                        + "nl='" + nl + "',"
                        + "dk='" + dk + "',"                        
                        + "user='" + loguser + "'"
                        + " WHERE perkiraan='" + jTextFieldperkiraan.getText().trim() + "'";
                if (mpil == 1) {
                    try {
                        stadd.execute(editdept);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                setVisible(false);
                dispose();
            }            
        }
    } 
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDK;
    private javax.swing.ButtonGroup buttonGroupDK1;
    private javax.swing.ButtonGroup buttonGroupNL;
    private javax.swing.ButtonGroup buttonGroupSub;
    private javax.swing.JButton jButtonbatal;
    private javax.swing.JButton jButtonsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabeljudul;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioDebet;
    private javax.swing.JRadioButton jRadioKredit;
    private javax.swing.JRadioButton jRadioLabarugi;
    private javax.swing.JRadioButton jRadioNeraca;
    private javax.swing.JRadioButton jRadioSubTidak;
    private javax.swing.JRadioButton jRadioSubYa;
    private javax.swing.JTextField jTextFieldnamaperkiraan;
    private javax.swing.JTextField jTextFieldperkiraan;
    // End of variables declaration//GEN-END:variables
    
}

class perkiraantools {
    private static addperkiraan frmasal;    
    public perkiraantools() {
    }
    
     public  void ambil(String isi) {       
        addperkiraan.isiperkiraan=isi;       
    }
 
     
    public void tambah(Statement stA, String MXmenu, String Judul, String sql) {
        javax.swing.JDialog JDEdit = new addperkiraan(null, true, MXmenu, Judul);
        JDEdit.setLocationRelativeTo(null);
        JDEdit.setVisible(true);
        formok.reloadRecord();
    }

    public void ubah(Statement stA, String MXmenu, String Judul, String sql) {
        if (formok.ATable.getSelectedRow() >= 0) {
            int x1 = 0;
            int x2 = 0;            
            x2 = formok.ATable.getSelectedRow();
            x1 = formok.ATable.getSelectedColumn()-1; 
            
            javax.swing.JDialog JDEdit = new addperkiraan(null, false, MXmenu, Judul);
            JDEdit.setLocationRelativeTo(null);
            JDEdit.setVisible(true);
            //formok.reloadRecord();
            formok.reloadRecord(x1,x2);
        } else {
            lib1.msgerr("Pilih dulu yg akan di Edit....");
        }
    }
    
    public void cari(Statement stA, String MXmenu, String Judul, String sql) {
        String namadb = Login.namadbase;
        String tglAwal = Login.tglAwal;
        String tglAkhir = Login.tglAkhir;
        String sqlCek = " SELECT INSTR('" + sql + "','namadb') AS CEK";
        String[] ceksql = lib1.cekdataarr(sqlCek, new String[]{"CEK"});
        if (!ceksql[0].contentEquals("0")) {
            String sqlRepl = "SELECT REPLACE(REPLACE(REPLACE('" + sql + "','namadb','" + namadb + "'),'tglAwal','" + tglAwal + "'),'tglAkhir','" + tglAkhir + "') AS MSQL";
            String[] datasql = lib1.cekdataarr(sqlRepl, new String[]{"MSQL"});
            if (datasql[0] != null) {
                sql = datasql[0];
            }
        }        
        javax.swing.JDialog JDEdit = new FrmSearch(null, stA, sql, Judul, "formoktools.formokrefreshsql()");
        JDEdit.setLocationRelativeTo(null);
        JDEdit.setVisible(true);
    }

    public void hapus(Statement stA, String MXmenu, String Judul, String sql) {
        if (formok.ATable.getSelectedRow() >= 0) {
            String perkiraan = formok.ATable.getValueAt(formok.ATable.getSelectedRow(), 0).toString().trim();
            String namadb = Login.namadbase;
            int posawal=formok.ATable.getSelectedRow();
            int mpil = cfunction.msgbox("Data Yakin akan di Hapus? ", "Hapus..", 0, new String[]{"Ya", "Tidak"}, 1);
            if (mpil == 0) {
                try {
                    stA.execute("DELETE FROM "+ namadb +".a_perkiraan WHERE perkiraan='" + perkiraan +"'");                    
                    formok.reloadRecord();
                    formok.ATable.changeSelection(posawal,0, false, false);                                                            
                } catch (SQLException ex) {
                    lib1.msgerr(ex.toString());
                }
            }
        } else {
            lib1.msgerr("Pilih dulu yg akan di Hapus....");
        }
    }
}
