
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
    setTitle("حاسبة BMI و BMR");
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

    calcBMI.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
    calcBMI.setText("حاسبة مؤشر كتلة الجسم BMI");
    calcBMI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    calcBMI.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcBMIActionPerformed(evt);
      }
    });

    calcBMR.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
    calcBMR.setText("حاسبة السعرات الحرارية BMR");
    calcBMR.setActionCommand("حاسبة السعرات الحرارية BMR");
    calcBMR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        .addGap(50, 50, 50)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(calcBMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(calcBMR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(65, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(100, 100, 100)
        .addComponent(calcBMI, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
        .addComponent(calcBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(95, 95, 95))
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
