/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Suban
 */
public class create extends javax.swing.JPanel {

    /**
     * Creates new form create
     */
    public create() {
        initComponents();
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Admin", "Kasir", "Owner"}));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        combo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Full Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 63, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 63, -1));

        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        jPanel3.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 270, 30));
        jPanel3.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 270, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Role");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 63, -1));

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Kasir", "Owner" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel3.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 270, 30));

        jButton1.setText("Create ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 150, 70));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Create New Account");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));
        jPanel3.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 270, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Username");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 63, -1));

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String FullName, Username, Password, Role, query;
        FullName = txtFullName.getText();
        Username = txtusername.getText();
        Password = new String(txtpassword.getPassword());
        Role = combo.getSelectedItem().toString();
        String Surl = "jdbc:mysql://localhost:3306/warungm";
        String Suser = "root";
        String Spass = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(Surl, Suser, Spass);
            Statement st = con.createStatement();

            // Validasi input
            if (Username.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Username is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Password is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (Role.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Role is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (FullName.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Full Name is required", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Query untuk menambahkan data ke tabel users
                query = "INSERT INTO users(FullName,username, password, role) VALUES('" + FullName + "','" + Username + "', '" + Password + "', '" + Role + "')";
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Account created successfully");

                // Bersihkan field input setelah menambahkan data
                txtFullName.setText("");
                txtusername.setText("");
                txtpassword.setText("");
                combo.setSelectedIndex(0);

                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s z");
                String tanggal = sdf.format(d);
                LOGGING.logActivity("\n[" + tanggal + "] Berhasil Membuat Akun ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}