package View;

import Controller.SIGActionListener;
import Controller.SIGTableSelection;
import Model.Invoices;
import Model.InvoicesItemsTable;
import Model.InvoicesTable;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class AppGUI extends javax.swing.JFrame {

    public AppGUI() {
        actionController = new SIGActionListener(this);
        tableController = new SIGTableSelection(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        newInvoiceButton = new javax.swing.JButton();
        newInvoiceButton.addActionListener(actionController);
        deleteInvoiceButton = new javax.swing.JButton();
        deleteInvoiceButton.addActionListener(actionController);
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        InvoiceTotalText = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        InvoiceNumberText = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        InvoiceDateText = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        CustomerNameText = new javax.swing.JTextPane();
        newItemButton = new javax.swing.JButton();
        newItemButton.addActionListener(actionController);
        deleteItemButton = new javax.swing.JButton();
        deleteItemButton.addActionListener(actionController);
        jScrollPane2 = new javax.swing.JScrollPane();
        InvoiceTable = new javax.swing.JTable();
        InvoiceTable.getSelectionModel().addListSelectionListener(tableController);
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        ItemsTable.getSelectionModel().addListSelectionListener(tableController);
        jMenuBar1 = new javax.swing.JMenuBar();
        SaveInvoice = new javax.swing.JMenu();
        LoadInvoiceMenuItem = new javax.swing.JMenuItem();
        SaveInvoiceMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        ExitMenuItem.addActionListener(actionController);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Invoice Generator");
        setMaximumSize(new java.awt.Dimension(1200, 550));
        setMinimumSize(new java.awt.Dimension(1020, 550));
        setPreferredSize(new java.awt.Dimension(1020, 550));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Invoices Table");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Invoices Items");

        newInvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        newInvoiceButton.setText("Create New Invoice");

        deleteInvoiceButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deleteInvoiceButton.setText("Delete Invoice");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Invoice Total");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Customer Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Invoices Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Invoice Number");

        InvoiceTotalText.setEditable(false);
        InvoiceTotalText.setBorder(null);
        InvoiceTotalText.setAutoscrolls(false);
        InvoiceTotalText.setEnabled(false);
        InvoiceTotalText.setPreferredSize(new java.awt.Dimension(150, 22));
        jScrollPane3.setViewportView(InvoiceTotalText);

        InvoiceNumberText.setEditable(false);
        InvoiceNumberText.setBorder(null);
        InvoiceNumberText.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        InvoiceNumberText.setAutoscrolls(false);
        InvoiceNumberText.setEnabled(false);
        InvoiceNumberText.setPreferredSize(new java.awt.Dimension(150, 22));
        jScrollPane4.setViewportView(InvoiceNumberText);

        InvoiceDateText.setEditable(false);
        InvoiceDateText.setBorder(null);
        InvoiceDateText.setAutoscrolls(false);
        InvoiceDateText.setEnabled(false);
        InvoiceDateText.setPreferredSize(new java.awt.Dimension(150, 22));
        jScrollPane5.setViewportView(InvoiceDateText);

        CustomerNameText.setEditable(false);
        CustomerNameText.setBorder(null);
        CustomerNameText.setAutoscrolls(false);
        CustomerNameText.setEnabled(false);
        CustomerNameText.setPreferredSize(new java.awt.Dimension(150, 22));
        jScrollPane6.setViewportView(CustomerNameText);

        newItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        newItemButton.setText("Add New Item");

        deleteItemButton.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        deleteItemButton.setText("Delete Item");

        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Date", "Customer", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        InvoiceTable.setNextFocusableComponent(ItemsTable);
        InvoiceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(InvoiceTable);

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice No.", "Item Name", "Price", "Count", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ItemsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ItemsTable);

        SaveInvoice.setText("File");
        SaveInvoice.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        LoadInvoiceMenuItem.setText("Load Invoice");
        LoadInvoiceMenuItem.addActionListener(actionController);
        SaveInvoice.add(LoadInvoiceMenuItem);

        SaveInvoiceMenuItem.setText("Save Invoice");
        SaveInvoiceMenuItem.addActionListener(actionController);
        SaveInvoice.add(SaveInvoiceMenuItem);

        ExitMenuItem.setText("Exit");
        SaveInvoice.add(ExitMenuItem);

        jMenuBar1.add(SaveInvoice);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(newInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(deleteInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newItemButton)
                .addGap(73, 73, 73)
                .addComponent(deleteItemButton)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteInvoiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane CustomerNameText;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JTextPane InvoiceDateText;
    private javax.swing.JTextPane InvoiceNumberText;
    private javax.swing.JTable InvoiceTable;
    private javax.swing.JTextPane InvoiceTotalText;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JMenuItem LoadInvoiceMenuItem;
    private javax.swing.JMenu SaveInvoice;
    private javax.swing.JMenuItem SaveInvoiceMenuItem;
    private javax.swing.JButton deleteInvoiceButton;
    private javax.swing.JButton deleteItemButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton newInvoiceButton;
    private javax.swing.JButton newItemButton;
    // End of variables declaration//GEN-END:variables
    private SIGActionListener actionController;
    private SIGTableSelection tableController;
    private ArrayList<Invoices> invoice;
    private InvoicesTable invTable;
    private InvoicesItemsTable itTable;

    public ArrayList<Invoices> getInvoice() {
        return invoice;
    }

    public void setInvoice(ArrayList<Invoices> invoice) {
        this.invoice = invoice;
    }
   

    public InvoicesTable getInvTable() {
        return invTable;
    }

    public void setInvTable(InvoicesTable invTable) {
        this.invTable = invTable;
    }

    public InvoicesItemsTable getItemTable() {
        return itTable;
    }

    public void setItemTable(InvoicesItemsTable itTable) {
        this.itTable = itTable;
    }

    public JTable getInvoiceTable() {
        return InvoiceTable;
    }

    public JTable getItemsTable() {
        return ItemsTable;
    }

    public JTextPane getCustomerNameText() {
        return CustomerNameText;
    }

    public JTextPane getInvoiceDateText() {
        return InvoiceDateText;
    }

    public JTextPane getInvoiceNumberText() {
        return InvoiceNumberText;
    }

    public JTextPane getInvoiceTotalText() {
        return InvoiceTotalText;
    }
}
