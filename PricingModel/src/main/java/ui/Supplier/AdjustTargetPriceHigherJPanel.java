package ui.Supplier;

import java.awt.CardLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.ProductManagement.Product;
import model.Supplier.Supplier;

public class AdjustTargetPriceHigherJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private Supplier supplier;
    /**
     * Creates new form AdjustTargetPriceHigherJPanel
     */
    public AdjustTargetPriceHigherJPanel(JPanel upc, Supplier supplier) {
        initComponents();
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = supplier;
        populateTable();
    }
    private void populateTable() {
DefaultTableModel model = (DefaultTableModel) tblProductsAboveTarget.getModel();
    model.setRowCount(0); // Clear existing rows

    for (Product product : supplier.getProductCatalog().getProductList()) {
        int aboveTargetSales = product.getNumberOfProductSalesAboveTarget();

        if (aboveTargetSales > 0) {
            Object[] row = new Object[3];
            row[0] = product.getName();
            row[1] = aboveTargetSales; // Number of sales below target
            row[2] = product.getTargetPrice(); // Original target price

            model.addRow(row);
        }
    }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductsAboveTarget = new javax.swing.JTable();
        btnIncrease = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));

        btnBack.setText("<<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Adjust Target Price");

        tblProductsAboveTarget.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Above Target", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblProductsAboveTarget);
        if (tblProductsAboveTarget.getColumnModel().getColumnCount() > 0) {
            tblProductsAboveTarget.getColumnModel().getColumn(2).setResizable(false);
        }

        btnIncrease.setBackground(new java.awt.Color(255, 204, 204));
        btnIncrease.setText("Increase");
        btnIncrease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnBack)
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIncrease)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnIncrease)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIncreaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreaseActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tblProductsAboveTarget.getModel();

    // Iterate through each row in the table
    for (int i = 0; i < model.getRowCount(); i++) {
        Product product = supplier.getProductCatalog().getProductList().get(i); // Find product by index
        double currentPrice = product.getTargetPrice();
        double newPrice = currentPrice * 1.1; // Increase price by 10%

        BigDecimal roundedPrice = new BigDecimal(newPrice).setScale(2, RoundingMode.HALF_UP);

        product.setTargetPrice((int) roundedPrice.doubleValue());

        model.setValueAt(roundedPrice.doubleValue(), i, 2);
    }
    JOptionPane.showMessageDialog(this, "Prices have been increased by 10% for below-target products.");
    }//GEN-LAST:event_btnIncreaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnIncrease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductsAboveTarget;
    // End of variables declaration//GEN-END:variables
}
