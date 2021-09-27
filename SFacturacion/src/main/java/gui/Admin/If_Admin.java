
package gui.Admin;
/**
 *
 * @author Bryan Vicente <>
 */
public class If_Admin extends javax.swing.JFrame {

    /**
     * Creates new form If_ManagePeople
     */
    public If_Admin() {
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

        btn_clients = new javax.swing.JButton();
        btn_products = new javax.swing.JButton();
        btn_invoices = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        menu_Start = new javax.swing.JButton();
        menu_CashierIf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btn_clients.setText("Clientes");
        btn_clients.setMinimumSize(new java.awt.Dimension(120, 45));
        btn_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientsActionPerformed(evt);
            }
        });

        btn_products.setText("Productos");
        btn_products.setMinimumSize(new java.awt.Dimension(120, 45));
        btn_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_productsActionPerformed(evt);
            }
        });

        btn_invoices.setText("Facturas");
        btn_invoices.setMinimumSize(new java.awt.Dimension(120, 45));
        btn_invoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invoicesActionPerformed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        menu_Start.setText("Inicio");
        menu_Start.setFocusable(false);
        menu_Start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_Start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_StartActionPerformed(evt);
            }
        });
        jToolBar1.add(menu_Start);

        menu_CashierIf.setText("Caja");
        menu_CashierIf.setFocusable(false);
        menu_CashierIf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_CashierIf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_CashierIf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_CashierIfActionPerformed(evt);
            }
        });
        jToolBar1.add(menu_CashierIf);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_products, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_invoices, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_products, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_invoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invoicesActionPerformed
        // TODO add your handling code here:

        If_ManageInvoices men = new If_ManageInvoices();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_invoicesActionPerformed

    private void btn_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientsActionPerformed
        If_ManageClients men = new If_ManageClients();
        men.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_clientsActionPerformed

    private void btn_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_productsActionPerformed
        If_ManageProducts men = new If_ManageProducts();
        men.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_productsActionPerformed

    private void menu_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_StartActionPerformed
        gui.If_Start men = new gui.If_Start();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_StartActionPerformed

    private void menu_CashierIfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_CashierIfActionPerformed

        gui.cashier.If_CashierInvoices men = new gui.cashier.If_CashierInvoices();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_CashierIfActionPerformed

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
            java.util.logging.Logger.getLogger(If_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(If_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(If_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(If_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new If_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clients;
    private javax.swing.JButton btn_invoices;
    private javax.swing.JButton btn_products;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton menu_CashierIf;
    private javax.swing.JButton menu_Start;
    // End of variables declaration//GEN-END:variables
}