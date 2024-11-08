/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Admin;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Suban
 */
public class edit_product extends javax.swing.JPanel {

    private int productId = -1;

    public edit_product() {
        initComponents();
        tampilkanDataUser("", jTable);

    }

    public void editProduk(int productId, String nama, double price, String category, int available) {

        String url = "jdbc:mysql://localhost:3306/warungm"; // Ganti sesuai database
        String user = "root";
        String pass = "";

        String query = "UPDATE menu_items SET name = ?, price = ?, category = ?, available = ? WHERE item_id = ?";

        try (Connection con = DriverManager.getConnection(url, user, pass); PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, nama);
            pst.setDouble(2, price);
            pst.setString(3, category);
            pst.setInt(4, available);
            pst.setInt(5, productId); // ID produk

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Produk berhasil diperbarui!");
                Date d = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s z");
                String tanggal = sdf.format(d);
                LOGGING.logActivity("\n[" + tanggal + "] Berhasil Memperbarui Data ");
                tampilkanDataUser("", jTable);
            } else {
                JOptionPane.showMessageDialog(null, "Gagal memperbarui produk.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        txtNama = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtCategory = new javax.swing.JTextField();
        Edit = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chkAvailable = new java.awt.Checkbox();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Edit Product");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 40, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jTable.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.setGridColor(new java.awt.Color(153, 153, 153));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 787;
        gridBagConstraints.ipady = 290;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 151;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        jPanel1.add(txtNama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 132;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 12, 0, 0);
        jPanel1.add(txtPrice, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 18, 0, 0);
        jPanel1.add(txtCategory, gridBagConstraints);

        Edit.setLabel("Edit");
        Edit.setPreferredSize(new java.awt.Dimension(5, 19));
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 47;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 116, 0, 0);
        jPanel1.add(Edit, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 12, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Price");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 15, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Category");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 17, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        chkAvailable.setLabel("Available");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 0, 0);
        jPanel1.add(chkAvailable, gridBagConstraints);

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:

        if (productId == -1) {
            JOptionPane.showMessageDialog(null, "Pilih produk yang ingin diedit terlebih dahulu.");
            return;
        }

        String nama = txtNama.getText();
        double price;
        try {
            price = Double.parseDouble(txtPrice.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Harga harus berupa angka.");
            return;
        }

        String category = txtCategory.getText();
        int available = chkAvailable.getState() ? 1 : 0;

        // Memanggil fungsi edit produk
        editProduk(productId, nama, price, category, available);


    }//GEN-LAST:event_EditActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable.getSelectedRow();

        // Mengambil data dari tabel yang dipilih
        productId = Integer.parseInt(jTable.getValueAt(selectedRow, 0).toString());
        String nama = jTable.getValueAt(selectedRow, 1).toString();
        String price = jTable.getValueAt(selectedRow, 2).toString();
        String category = jTable.getValueAt(selectedRow, 3).toString();
        boolean available = jTable.getValueAt(selectedRow, 4).toString().equals("1");

        // Menampilkan data ke JTextField
        txtNama.setText(nama);
        txtPrice.setText(price);
        txtCategory.setText(category);
        chkAvailable.setState(available);

    }//GEN-LAST:event_jTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button Edit;
    private java.awt.Checkbox chkAvailable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
    private void tampilkanDataUser(String whereClause, javax.swing.JTable targetTable) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Price");
        model.addColumn("Category");
        model.addColumn("Available");

        String Surl = "jdbc:mysql://localhost:3306/warungm";
        String Suser = "root";
        String Spass = "";

        try {
            Connection con = DriverManager.getConnection(Surl, Suser, Spass);
            Statement st = con.createStatement();
            String query = "SELECT item_id, name, price, category, available FROM menu_items " + whereClause;
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("item_id"),
                    rs.getString("name"),
                    rs.getString("price"),
                    rs.getString("category"),
                    rs.getString("available")
                });
            }

            targetTable.setModel(model); // Mengisi tabel yang ditentukan dengan hasil query
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
