
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * This is the main GUI jframe program that will run everything for the GUI and
 * interface with the database. I should probably separate it all out into 
 * other methods and files because this can get very large otherwise.
 * 
 * 
 * @author dave
 */
public class BaseGUI extends javax.swing.JFrame {
   private EmplEntry empDia;
   private CustEntry custDia;
   private CustHistory custHist;
   private InventoryEntry invDia;
   
   /**
    * Creates new form BaseGUI
    */
   public BaseGUI() {
      initComponents();
      //initialize dialog boxes
      empDia = new EmplEntry(this, true); 
      custDia = new CustEntry(this, true);
      custHist = new CustHistory(this, true);
      invDia = new InventoryEntry(this, true);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jDialog1 = new javax.swing.JDialog();
      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel1 = new javax.swing.JPanel();
      newEmployee = new javax.swing.JButton();
      jScrollPane4 = new javax.swing.JScrollPane();
      jScrollPane1 = new javax.swing.JScrollPane();
      empTable = new javax.swing.JTable();
      jPanel2 = new javax.swing.JPanel();
      newCust = new javax.swing.JButton();
      jScrollPane3 = new javax.swing.JScrollPane();
      jScrollPane2 = new javax.swing.JScrollPane();
      custTable = new javax.swing.JTable();
      getCustHist = new javax.swing.JButton();
      label2 = new java.awt.Label();
      jPanel3 = new javax.swing.JPanel();
      jScrollPane5 = new javax.swing.JScrollPane();
      invTable = new javax.swing.JTable();
      newInventory = new javax.swing.JButton();
      jPanel4 = new javax.swing.JPanel();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();
      jMenuItem1 = new javax.swing.JMenuItem();
      jMenu2 = new javax.swing.JMenu();

      javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
      jDialog1.getContentPane().setLayout(jDialog1Layout);
      jDialog1Layout.setHorizontalGroup(
         jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 400, Short.MAX_VALUE)
      );
      jDialog1Layout.setVerticalGroup(
         jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 300, Short.MAX_VALUE)
      );

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      newEmployee.setText("Add New Employee");
      newEmployee.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newEmployeeActionPerformed(evt);
         }
      });

      empTable.setAutoCreateRowSorter(true);
      empTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Employee #", "FName", "LName", "Address", "Shift Worked"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      empTable.setEditingRow(-2);
      jScrollPane1.setViewportView(empTable);

      jScrollPane4.setViewportView(jScrollPane1);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addComponent(newEmployee)
            .addContainerGap(738, Short.MAX_VALUE))
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane4)
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(newEmployee)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addContainerGap())
      );

      newEmployee.getAccessibleContext().setAccessibleName("jbutton1");
      newEmployee.getAccessibleContext().setAccessibleDescription("");

      jTabbedPane1.addTab("Employee", jPanel1);

      newCust.setText("New Customer");
      newCust.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newCustActionPerformed(evt);
         }
      });

      custTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Customer Name", "Customer Number", "Most recent order"
         }
      ));
      custTable.setEditingRow(0);
      custTable.setSurrendersFocusOnKeystroke(true);
      jScrollPane2.setViewportView(custTable);
      custTable.getAccessibleContext().setAccessibleName("");
      custTable.getAccessibleContext().setAccessibleDescription("");

      jScrollPane3.setViewportView(jScrollPane2);

      getCustHist.setText("Select Customer");
      getCustHist.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            getCustHistActionPerformed(evt);
         }
      });

      label2.setText("get entire history here");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(13, 13, 13)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
            .addContainerGap())
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(newCust)
            .addGap(100, 100, 100)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(getCustHist))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(newCust)
               .addComponent(getCustHist))
            .addGap(59, 59, 59)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
            .addContainerGap())
      );

      jTabbedPane1.addTab("Customer", jPanel2);

      invTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Item Type", "Item #", "Item Name", "Quantity", "Shelf Life", "Cost", "Total Used"
         }
      ) {
         boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false
         };

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jScrollPane5.setViewportView(invTable);

      newInventory.setText("New Inventory Item");
      newInventory.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            newInventoryActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
               .addGroup(jPanel3Layout.createSequentialGroup()
                  .addComponent(newInventory)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addGap(37, 37, 37)
            .addComponent(newInventory)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
            .addContainerGap())
      );

      jTabbedPane1.addTab("Inventory", jPanel3);

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 896, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 582, Short.MAX_VALUE)
      );

      jTabbedPane1.addTab("Sales", jPanel4);

      jMenu1.setText("File");

      jMenuItem1.setText("Exit");
      jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jMenuItem1ActionPerformed(evt);
         }
      });
      jMenu1.add(jMenuItem1);

      jMenuBar1.add(jMenu1);

      jMenu2.setText("Edit");
      jMenuBar1.add(jMenu2);

      setJMenuBar(jMenuBar1);

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



   private void newEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeActionPerformed
      empDia.setVisible(true);
      String[] empData = empDia.getEmpData();
      //only enter if the number is not empty
      if (!empData[0].equals("")){
         DefaultTableModel empModel = (DefaultTableModel) empTable.getModel();
         empModel.addRow(empData);
         empModel = null;
      }
//      JOptionPane.showInputDialog(
//            null, d, "Output : ");
      
   }//GEN-LAST:event_newEmployeeActionPerformed

   private void getCustHistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getCustHistActionPerformed
      custHist.setVisible(true);
   }//GEN-LAST:event_getCustHistActionPerformed

   private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      System.exit(0);
        // TODO add your handling code here:
   }//GEN-LAST:event_jMenuItem1ActionPerformed

   private void newCustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustActionPerformed
      custDia.setVisible(true);
      String[] custData = custDia.getEmpData();
      //System.out.println(custData.toString());
      //only enter if the number is not empty
      if (!custData[0].equals("")){
         DefaultTableModel custModel = (DefaultTableModel) custTable.getModel();
         custModel.addRow(custData);
         custModel = null;
      }
   }//GEN-LAST:event_newCustActionPerformed

   private void newInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newInventoryActionPerformed
      invDia.setVisible(true);
      String [] invData = invDia.getEmpData();
      //only enter if the number is not empty
      if (!invData[0].equals("")){
         DefaultTableModel invModel = (DefaultTableModel) invTable.getModel();
         invModel.addRow(invData);
         invModel = null;
      }
   }//GEN-LAST:event_newInventoryActionPerformed

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
         java.util.logging.Logger.getLogger(BaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(BaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(BaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(BaseGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new BaseGUI().setVisible(true);
         }
      });
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTable custTable;
   private javax.swing.JTable empTable;
   private javax.swing.JButton getCustHist;
   private javax.swing.JTable invTable;
   private javax.swing.JDialog jDialog1;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenu jMenu2;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JTabbedPane jTabbedPane1;
   private java.awt.Label label2;
   private javax.swing.JButton newCust;
   private javax.swing.JButton newEmployee;
   private javax.swing.JButton newInventory;
   // End of variables declaration//GEN-END:variables
}
