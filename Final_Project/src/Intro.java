
import javax.swing.JOptionPane;


public class Intro extends javax.swing.JFrame {

  public Intro() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    calcBMI = new javax.swing.JButton();
    calcBMR = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    setBackground(new java.awt.Color(96, 231, 231));
    setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
      public void windowClosing(java.awt.event.WindowEvent evt) {
        formWindowClosing(evt);
      }
    });

    calcBMI.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
    calcBMI.setText("حاسبة مؤشر كتلة الجسم");
    calcBMI.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcBMIActionPerformed(evt);
      }
    });

    calcBMR.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
    calcBMR.setText("حاسبة السعرات الحرارية");
    calcBMR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcBMRActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(82, 82, 82)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(calcBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(calcBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(90, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(99, 99, 99)
        .addComponent(calcBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
        .addComponent(calcBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(97, 97, 97))
    );

    setSize(new java.awt.Dimension(690, 550));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void calcBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBMIActionPerformed
    new bmi().setVisible(true);
  }//GEN-LAST:event_calcBMIActionPerformed

  private void calcBMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcBMRActionPerformed
    new bmr().setVisible(true);
  }//GEN-LAST:event_calcBMRActionPerformed

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    int choice = JOptionPane.showConfirmDialog(null,
                "هل انت متأكد من الخروج من البرنامج", "خروج",
                JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
      System.exit(0);
    }
  }//GEN-LAST:event_formWindowClosed

  private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    int choice = JOptionPane.showConfirmDialog(null,
                "هل انت متأكد من الخروج من البرنامج", "خروج",
                JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
      System.exit(0);
    } 
  }//GEN-LAST:event_formWindowClosing

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Intro().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton calcBMI;
  private javax.swing.JButton calcBMR;
  // End of variables declaration//GEN-END:variables
}
