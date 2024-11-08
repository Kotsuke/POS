/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.lang.String;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Suban
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard(String fullname, String role) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        execute();
        lb_name.setText(fullname);
        lb_role.setText(role);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        lb_role = new javax.swing.JLabel();
        pn_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        pn_conten = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(0, 51, 204));
        pn_navbar.setPreferredSize(new java.awt.Dimension(1080, 70));

        button1.setBackground(new java.awt.Color(153, 153, 153));
        button1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        button1.setLabel("Log-Out");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Wellcome,");

        lb_name.setBackground(new java.awt.Color(255, 255, 255));
        lb_name.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_name.setText("Name");

        lb_role.setBackground(new java.awt.Color(255, 255, 255));
        lb_role.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        lb_role.setText("Role");

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_role, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 630, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lb_name)
                        .addComponent(lb_role))
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        lb_name.getAccessibleContext().setAccessibleName("lb_name");

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_sidebar.setBackground(new java.awt.Color(51, 204, 255));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 539));

        jScrollPane1.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        pn_conten.setBackground(new java.awt.Color(255, 255, 255));

        pn_utama.setBackground(new java.awt.Color(153, 153, 153));
        pn_utama.setBorder(new javax.swing.border.MatteBorder(null));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contenLayout = new javax.swing.GroupLayout(pn_conten);
        pn_conten.setLayout(pn_contenLayout);
        pn_contenLayout.setHorizontalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_contenLayout.setVerticalGroup(
            pn_contenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(pn_conten, java.awt.BorderLayout.CENTER);

        setBounds(0, 0, 1037, 646);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        pn_utama.add(new conten_bg());
        pn_utama.repaint();
        pn_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        login Login = new login();
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy H:m:s z");
        String tanggal = sdf.format(d);
        LOGGING.logActivity("\n[" + tanggal + "] Berhasil LogOut ");
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard("fullname", "role").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_role;
    private javax.swing.JPanel pn_conten;
    private javax.swing.JPanel pn_menu;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconMaster = new ImageIcon(getClass().getResource("/image/administrator.png"));
        ImageIcon iconAkun = new ImageIcon(getClass().getResource("/image/profile.png"));
        ImageIcon iconProduct = new ImageIcon(getClass().getResource("/image/product-hunt.png"));

        MenuItem menuView = new MenuItem(null, true, iconAkun, "View Account", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new userview());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuAdd = new MenuItem(null, true, iconAkun, "Add Account", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new create());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuEdit = new MenuItem(null, true, iconAkun, "Edit Account", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new edit());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        MenuItem pView = new MenuItem(null, true, iconAkun, "View Product", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new data_produk());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem pAdd = new MenuItem(null, true, iconAkun, "Add Product", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new create_product());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem pEdit = new MenuItem(null, true, iconAkun, "Edit Product", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new edit_product());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });

        MenuItem meu = new MenuItem(iconMaster, false, null, "Home", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pn_utama.removeAll();
                pn_utama.add(new conten_bg());
                pn_utama.repaint();
                pn_utama.revalidate();
            }
        });
        MenuItem menuMaster = new MenuItem(iconMaster, false, null, "User Management", null, menuView, menuAdd, menuEdit);
        MenuItem menuProduct = new MenuItem(iconProduct, false, null, "Product Management", null, pView, pAdd, pEdit);

        addMenu(meu, menuMaster, menuProduct);
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            pn_menu.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        pn_menu.revalidate();
    }
}