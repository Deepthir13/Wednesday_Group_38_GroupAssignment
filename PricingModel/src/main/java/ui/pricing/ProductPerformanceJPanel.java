/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.pricing;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.HTMLEditorKit;
import model.OrderManagement.OrderItem;
import model.ProductManagement.Product;
import model.ProductManagement.ProductSummary;
import model.ProductManagement.ProductsReport;
import model.Supplier.Supplier;

/**
 *
 * @author deepthiramesh
 */
public class ProductPerformanceJPanel extends javax.swing.JPanel {
     private JPanel userProcessContainer;
    private Supplier supplier;
    private SupplierWorkAreaJPanel supplierPanel;
    private boolean isProfitMaximized = false; 
    /**
     * Creates new form ProductPerformanceJPanel
     */
    public ProductPerformanceJPanel(JPanel upc, Supplier supplier, SupplierWorkAreaJPanel supplierPanel) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = supplier;
        this.supplierPanel = supplierPanel;
        populateTable();
    }
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblProductPerf.getModel();
        model.setRowCount(0); // Clear existing rows

        // Create a list of ProductSummary objects and sort by Sales Above Target frequency in descending order
        ArrayList<ProductSummary> productSummaries = new ArrayList<>();
        for (Product product : supplier.getProductCatalog().getProductList()) {
            productSummaries.add(new ProductSummary(product));
        }
        productSummaries.sort((p1, p2) -> Integer.compare(p2.getNumberAboveTarget(), p1.getNumberAboveTarget()));

        // Populate table with each product's details, including rank based on Sales Above Target
        int rank = 1;
        for (ProductSummary productSummary : productSummaries) {
            Product product = productSummary.getSubjectProduct();

            Object[] row = new Object[7]; // Adjust row size for added "Rank" column
            row[0] = rank++; // Rank column
            row[1] = product.getProductName();
            row[2] = product.getTargetPrice(); // Target Price column
            row[3] = productSummary.getSalesRevenues();
            row[4] = productSummary.getNumberAboveTarget(); // Frequency of Sales Above Target
            row[5] = productSummary.getNumberBelowTarget();
            row[6] = productSummary.getProductPricePerformance();

            model.addRow(row);
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

        btnBack = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductPerf = new javax.swing.JTable();
        btnReduceTargetPrice = new javax.swing.JButton();
        btnIncreaseTargetPrice = new javax.swing.JButton();
        btnRunSimulation = new javax.swing.JButton();
        btnMaximizeProfitMargins = new javax.swing.JButton();
        btnGenerateReport = new javax.swing.JButton();

        setBackground(new java.awt.Color(244, 237, 198));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(255, 204, 204));
        btnBack.setText("<<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 36, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 204, 204));
        jTextField1.setText("PRODUCT PERFORMANCE METRICS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 36, -1, -1));

        tblProductPerf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "S.NO", "Product Name", "Target price", "Sales Revnue", "Above-Sales Target", "Below-Sales Target", "Price Performance"
            }
        ));
        jScrollPane1.setViewportView(tblProductPerf);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 880, 270));

        btnReduceTargetPrice.setBackground(new java.awt.Color(255, 204, 204));
        btnReduceTargetPrice.setText("Reduce Target Price");
        btnReduceTargetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReduceTargetPriceActionPerformed(evt);
            }
        });
        add(btnReduceTargetPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        btnIncreaseTargetPrice.setBackground(new java.awt.Color(255, 204, 204));
        btnIncreaseTargetPrice.setText("Increase Tagret Price");
        btnIncreaseTargetPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncreaseTargetPriceActionPerformed(evt);
            }
        });
        add(btnIncreaseTargetPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        btnRunSimulation.setBackground(new java.awt.Color(255, 204, 204));
        btnRunSimulation.setText("Run Simulation");
        btnRunSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunSimulationActionPerformed(evt);
            }
        });
        add(btnRunSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        btnMaximizeProfitMargins.setBackground(new java.awt.Color(255, 204, 204));
        btnMaximizeProfitMargins.setText("Maximize profit Margins");
        btnMaximizeProfitMargins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizeProfitMarginsActionPerformed(evt);
            }
        });
        add(btnMaximizeProfitMargins, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        btnGenerateReport.setBackground(new java.awt.Color(255, 204, 204));
        btnGenerateReport.setText("Generate Report");
        btnGenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateReportActionPerformed(evt);
            }
        });
        add(btnGenerateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnReduceTargetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReduceTargetPriceActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        boolean adjusted = false; // Track if any product had its price adjusted

        // Iterate through all products
        for (Product product : supplier.getProductCatalog().getProductList()) {
            ProductSummary productSummary = new ProductSummary(product);

            // Lower target price for products with sales below target
            if (productSummary.getNumberBelowTarget() > 0) {
                int currentTargetPrice = product.getTargetPrice();
                int adjustmentAmount = 5; // Adjust by a fixed amount (can be customized)
                product.setTargetPrice(currentTargetPrice - adjustmentAmount);
                adjusted = true;
            }
        }

        // Refresh tables and display a message if adjustments were made
        if (adjusted) {
            populateTable();
            supplierPanel.refreshTable();
            JOptionPane.showMessageDialog(this, "Pricing lowered for products not meeting sales targets.");
        } else {
            JOptionPane.showMessageDialog(this, "No products required a lower target price adjustment.");
        }
    }//GEN-LAST:event_btnReduceTargetPriceActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }                                       

    private ProductSummary getProductSummaryFromTable(int row) {
        // Get the list of product summaries, which matches the order of table rows
        ArrayList<Product> productList = supplier.getProductCatalog().getProductList();
        Product product = productList.get(row); // Assumes table row order matches product list order
        return new ProductSummary(product);
    
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnIncreaseTargetPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncreaseTargetPriceActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        boolean adjusted = false; // Track if any product had its price adjusted

        // Iterate through all products
        for (Product product : supplier.getProductCatalog().getProductList()) {
            ProductSummary productSummary = new ProductSummary(product);

            // Raise target price for products with sales above target
            if (productSummary.getNumberAboveTarget() > 0) {
                int currentTargetPrice = product.getTargetPrice();
                int adjustmentAmount = 5; // Adjust by a fixed amount (can be customized)
                product.setTargetPrice(currentTargetPrice + adjustmentAmount);
                adjusted = true;
            }
        }

        // Refresh tables and display a message if adjustments were made
        if (adjusted) {
            populateTable();
            supplierPanel.refreshTable();
            JOptionPane.showMessageDialog(this, "Pricing Increased for products not meeting sales targets.");
        } else {
            JOptionPane.showMessageDialog(this, "No products required a higher target price adjustment.");
        }
    }//GEN-LAST:event_btnIncreaseTargetPriceActionPerformed

    private void btnRunSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunSimulationActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int totalRevenueImpact = 0;
        int highestImpact = Integer.MIN_VALUE;
        Product highestImpactProduct = null;

        // Loop through each product to calculate revenue impact with adjusted target prices
        for (Product product : supplier.getProductCatalog().getProductList()) {
            int originalTargetPrice = product.getTargetPrice();
            int initialRevenue = simulateRevenue(product, originalTargetPrice);

            // Adjust the target price temporarily
            int adjustmentAmount = determineAdjustmentAmount(product);
            product.setTargetPrice(originalTargetPrice + adjustmentAmount);

            // Calculate adjusted revenue based on new target price
            int adjustedRevenue = simulateRevenue(product, product.getTargetPrice());
            int revenueImpact = adjustedRevenue - initialRevenue;

            // Accumulate total revenue impact
            totalRevenueImpact += revenueImpact;

            // Track the product with the highest revenue impact
            if (revenueImpact > highestImpact) {
                highestImpact = revenueImpact;
                highestImpactProduct = product;
            }

            // Reset target price after simulation
            product.setTargetPrice(originalTargetPrice);
        }

        // Display simulation results
        JOptionPane.showMessageDialog(this, "Total Revenue Impact: " + totalRevenueImpact
                + "\nHighest Impact Product: " + (highestImpactProduct != null ? highestImpactProduct.getProductName() : "None")
                + " with impact of " + highestImpact);
        populateTable();
    }//GEN-LAST:event_btnRunSimulationActionPerformed

    private void btnMaximizeProfitMarginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizeProfitMarginsActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (isProfitMaximized) {
            JOptionPane.showMessageDialog(this, "Profit margins are already maximized. No further adjustments are necessary.");
            return;
        }
         
        boolean profitIncreased;
        int iterationCount = 0;
        int maxIterations = 10; // Cap the maximum number of iterations to avoid infinite loops

        do {
            profitIncreased = false;
            int previousTotalProfit = calculateTotalProfit();

            // Adjust target prices for all products to maximize profit margins
            for (Product product : supplier.getProductCatalog().getProductList()) {
                int currentTargetPrice = product.getTargetPrice();
                int adjustmentAmount = determineAdjustmentAmount(product);
                product.setTargetPrice(currentTargetPrice + adjustmentAmount);
            }

            int newTotalProfit = calculateTotalProfit();
            if (newTotalProfit > previousTotalProfit) {
                profitIncreased = true; // Profit increased, so continue adjusting
            }

            iterationCount++;
        } while (profitIncreased && iterationCount < maxIterations);
        isProfitMaximized = true;
        JOptionPane.showMessageDialog(this, "Profit Margins Maximized after " + iterationCount + " iterations.");
        populateTable();
        supplierPanel.refreshTable();
    }//GEN-LAST:event_btnMaximizeProfitMarginsActionPerformed

    private void btnGenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateReportActionPerformed
        // TODO add your handling code here:
//        ProductsReport productsReport = new ProductsReport();
//
//        // Generate ProductSummary for each product and add to ProductsReport
//        for (Product product : supplier.getProductCatalog().getProductList()) {
//            ProductSummary summary = new ProductSummary(product);
//            productsReport.addProductSummary(summary);
//        }
//
//        // Prepare the report with updated HTML formatting
//        StringBuilder report = new StringBuilder();
//        report.append("<html><body style='font-family: \"Segoe UI\", Tahoma, Geneva, Verdana, sans-serif; line-height: 1.6;'>");
//        report.append("<h2 style='color: #5D6D7E; text-align: center;'>Final Product Performance Report</h2>");
//        report.append("<table border='1' cellpadding='8' cellspacing='0' style='border-collapse: collapse; width: 100%;'>");
//        report.append("<tr style='background-color: #EAEDED; text-align: left;'>");
//        report.append("<th>Product Name</th><th>Initial Target Price</th><th>Adjusted Target Price</th>");
//        report.append("<th>Sales Revenue</th><th>Sales Above Target</th><th>Sales Below Target</th></tr>");
//
//        // Iterate over all products and gather the required details
//        for (Product product : supplier.getProductCatalog().getProductList()) {
//            int initialTargetPrice = product.getTargetPrice();
//            int adjustmentAmount = determineAdjustmentAmount(product);
//            int adjustedTargetPrice = initialTargetPrice + adjustmentAmount;
//            product.setTargetPrice(adjustedTargetPrice);
//
//            // Get product summary for performance data
//            ProductSummary summary = new ProductSummary(product);
//
//            // Append product data as a table row
//            report.append("<tr style='background-color: #FDFEFE;'>");
//            report.append("<td>").append(product.getProductName()).append("</td>");
//            report.append("<td style='text-align: right;'>").append(initialTargetPrice).append("</td>");
//            report.append("<td style='text-align: right;'>").append(adjustedTargetPrice).append("</td>");
//            report.append("<td style='text-align: right;'>").append(summary.getSalesRevenues()).append("</td>");
//            report.append("<td style='text-align: right;'>").append(summary.getNumberAboveTarget()).append("</td>");
//            report.append("<td style='text-align: right;'>").append(summary.getNumberBelowTarget()).append("</td>");
//            report.append("</tr>");
//
//            // Reset the target price if necessary after generating report
//            product.setTargetPrice(initialTargetPrice);
//        }
//        report.append("</table>");
//
//        // Add the top product above target to the report
//        ProductSummary topProduct = productsReport.getTopProductAboveTarget();
//        if (topProduct != null) {
//            report.append("<h3 style='color: #239B56; margin-top: 20px;'>Top Product Above Target</h3>");
//            report.append("<p>Product: <b>").append(topProduct.getSubjectProduct().getProductName())
//                  .append("</b>, Sales Above Target: <b>").append(topProduct.getNumberAboveTarget()).append("</b></p>");
//        } else {
//            report.append("<h3 style='color: #239B56; margin-top: 20px;'>Top Product Above Target</h3>");
//            report.append("<p><i>None</i></p>");
//        }
//
//        // Add the list of products always above target to the report
//        ArrayList<ProductSummary> productsAlwaysAboveTarget = productsReport.getProductsAlwaysAboveTarget();
//        if (!productsAlwaysAboveTarget.isEmpty()) {
//            report.append("<h3 style='color: #239B56; margin-top: 20px;'>Products Always Above Target</h3><ul>");
//            for (ProductSummary ps : productsAlwaysAboveTarget) {
//                report.append("<li>Product: <b>").append(ps.getSubjectProduct().getProductName())
//                      .append("</b>, Sales Revenue: <b>").append(ps.getSalesRevenues()).append("</b></li>");
//            }
//            report.append("</ul>");
//        } else {
//            report.append("<h3 style='color: #239B56; margin-top: 20px;'>Products Always Above Target</h3>");
//            report.append("<p><i>None</i></p>");
//        }
//
//        report.append("</body></html>");
//
//        // Display the report in a JEditorPane within a JScrollPane
//        JEditorPane editorPane = new JEditorPane();
//        editorPane.setEditable(false);
//        editorPane.setEditorKit(new HTMLEditorKit());
//        editorPane.setText(report.toString());
//
//        JScrollPane scrollPane = new JScrollPane(editorPane);
//        scrollPane.setPreferredSize(new Dimension(700, 500));
//
//
//        JOptionPane.showMessageDialog(null, scrollPane, "Final Product Performance Report", JOptionPane.INFORMATION_MESSAGE);
    }                                                 

    private int calculateTotalProfit() {
        int totalProfit = 0;
        for (Product product : supplier.getProductCatalog().getProductList()) {
            ProductSummary summary = new ProductSummary(product);
            totalProfit += summary.getProductPricePerformance(); // Accumulate each product's price performance
        }
        return totalProfit;
    }
    
    private int determineAdjustmentAmount(Product product) {
        int adjustmentAmount = 0;
        int salesAboveTarget = product.getNumberOfProductSalesAboveTarget();
        int salesBelowTarget = product.getNumberOfProductSalesBelowTarget();
        int totalSales = salesAboveTarget + salesBelowTarget;

        if (totalSales == 0) return adjustmentAmount;

        double aboveTargetPercentage = (double) salesAboveTarget / totalSales * 100;
        double belowTargetPercentage = (double) salesBelowTarget / totalSales * 100;

        // Apply a larger adjustment based on performance to see clearer impact
        if (aboveTargetPercentage > 50) {
            adjustmentAmount = (int) (product.getTargetPrice() * 0.1); // Increase by 10%
        } else if (belowTargetPercentage > 50) {
            adjustmentAmount = (int) (-product.getTargetPrice() * 0.1); // Decrease by 10%
        }

        return adjustmentAmount;
    }
    
    private int simulateRevenue(Product product, int targetPrice) {
        int revenue = 0;
        for (OrderItem item : product.getOrderItems()) {  // Assuming getOrderItems() retrieves all items for this product
            int quantity = item.getQuantity();
            revenue += quantity * targetPrice;
        }
        return revenue;
    }//GEN-LAST:event_btnGenerateReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGenerateReport;
    private javax.swing.JButton btnIncreaseTargetPrice;
    private javax.swing.JButton btnMaximizeProfitMargins;
    private javax.swing.JButton btnReduceTargetPrice;
    private javax.swing.JButton btnRunSimulation;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblProductPerf;
    // End of variables declaration//GEN-END:variables
}