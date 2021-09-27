
package gui.Admin;

import back.Manage_Products;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan Vicente
 */
public class If_NewProduct extends javax.swing.JFrame {

    private String IdToEdit = "";
    private boolean updateProduct = false;

    public void PrepareToNewProduct() {
        String newId = String.valueOf(Integer.parseInt(Manage_Products.getUltimateId())+1);
        txt_IdProduct.setText(newId);
    }

    //set into txt boxs data from selected client 
    public void editProduct(String idProduct, String name, String priceU) {
  
        IdToEdit =idProduct;
        txt_IdProduct.setText(idProduct);
        txt_Name.setText(name);
        txt_PriceU.setText(priceU);

        updateProduct = true;

    }

    /**
     * Creates new form If_NewClient
     */
    public If_NewProduct() {

        initComponents();
        lbl_Error.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cedula = new javax.swing.JLabel();
        txt_IdProduct = new javax.swing.JTextField();
        lbl_Name = new javax.swing.JLabel();
        txt_Name = new javax.swing.JTextField();
        lbl_Surname1 = new javax.swing.JLabel();
        txt_PriceU = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        btn_NewProduct = new javax.swing.JButton();
        lbl_Error = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        menu_Start = new javax.swing.JButton();
        txt_stock = new javax.swing.JTextField();
        lbl_Surname2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lbl_Cedula.setText("Id:");

        txt_IdProduct.setEnabled(false);

        lbl_Name.setText("Nombre:");

        lbl_Surname1.setText("Precio Unidad:");

        txt_PriceU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PriceUActionPerformed(evt);
            }
        });

        btn_Save.setText("Guardar");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_NewProduct.setText("Nuevo");
        btn_NewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NewProductActionPerformed(evt);
            }
        });

        lbl_Error.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Error.setText("Ingrese todos los datos correctamente");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        menu_Start.setText("Volver");
        menu_Start.setFocusable(false);
        menu_Start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_Start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_StartActionPerformed(evt);
            }
        });
        jToolBar1.add(menu_Start);

        txt_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stockActionPerformed(evt);
            }
        });

        lbl_Surname2.setText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Error)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_IdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_Save, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Surname1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PriceU, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Surname2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_NewProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbl_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Cedula)
                    .addComponent(txt_IdProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_PriceU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Surname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Name)
                    .addComponent(txt_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Surname2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_NewProduct)
                    .addComponent(btn_Save))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
        try {
            //Check if all txt_field are with data
            if (!txt_IdProduct.getText().equals("") && !txt_Name.getText().equals("")
                    && !txt_PriceU.getText().equals("") && !txt_stock.getText().equals("")) {

                //save data into variables
                int newId = Integer.parseInt(txt_IdProduct.getText());
                String name = txt_Name.getText().toLowerCase().trim();
                float priceU = Float.parseFloat(txt_PriceU.getText().trim());
                int stock = Integer.parseInt(txt_stock.getText());
                //check if the User want to update a Person
                if (updateProduct) {
                    //if the method done incorrectly return a false.
                    if (Manage_Products.updateProduct(IdToEdit, name, priceU, stock)) {
                        JOptionPane.showMessageDialog(rootPane, "Guardado con éxito");
                        this.setVisible(false);
                        return;
                    }else {
                        JOptionPane.showMessageDialog(rootPane, "Ya existe otro producto con el mismo nombre");
                        this.setVisible(false);
                    }
                    
                } else {
                    //Check if the Product alredy exist
                    if (!Manage_Products.existProduct(name)) {

                        if (Manage_Products.addNewProduct(name, priceU, stock, Integer.parseInt(txt_IdProduct.getText()))) {
                            
                            JOptionPane.showMessageDialog(rootPane, "Producto guardado");
                            
                        } else {
                            lbl_Error.setVisible(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "El Producto ya existe.");
                    }
                }
                
                PrepareToNewProduct();             
                txt_Name.setText("");
                txt_PriceU.setText("");

                lbl_Error.setVisible(false);
            } else {
                lbl_Error.setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
            lbl_Error.setVisible(true);
        }


    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_NewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NewProductActionPerformed
        txt_IdProduct.setText("");
        txt_Name.setText("");
        txt_PriceU.setText("");
        txt_stock.setText("");
        PrepareToNewProduct();
    }//GEN-LAST:event_btn_NewProductActionPerformed

    private void txt_PriceUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PriceUActionPerformed
        
    }//GEN-LAST:event_txt_PriceUActionPerformed

    private void menu_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_StartActionPerformed
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_menu_StartActionPerformed

    private void txt_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stockActionPerformed

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
            java.util.logging.Logger.getLogger(If_NewProduct.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(If_NewProduct.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(If_NewProduct.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(If_NewProduct.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new If_NewProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NewProduct;
    private javax.swing.JButton btn_Save;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbl_Cedula;
    private javax.swing.JLabel lbl_Error;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Surname1;
    private javax.swing.JLabel lbl_Surname2;
    private javax.swing.JButton menu_Start;
    private javax.swing.JTextField txt_IdProduct;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_PriceU;
    private javax.swing.JTextField txt_stock;
    // End of variables declaration//GEN-END:variables
}
