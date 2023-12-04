import javax.swing.*;
import java.text.DecimalFormat;

public class Calculator extends javax.swing.JFrame {

  public Calculator() {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    no1 = new javax.swing.JTextField();
    no2 = new javax.swing.JTextField();
    lblCalc = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    txtResult = new javax.swing.JTextField();
    calSum = new javax.swing.JButton();
    calcSub = new javax.swing.JButton();
    calcMulti = new javax.swing.JButton();
    calcDiv = new javax.swing.JButton();
    btnClear = new javax.swing.JButton();
    btnExit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Calculator");
    setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
    });

    no1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    no1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    no2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    no2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    lblCalc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lblCalc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("=");

    txtResult.setEditable(false);
    txtResult.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    txtResult.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    calSum.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    calSum.setText("+");
    calSum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    calSum.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calSumActionPerformed(evt);
      }
    });

    calcSub.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    calcSub.setText("-");
    calcSub.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    calcSub.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcSubActionPerformed(evt);
      }
    });

    calcMulti.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    calcMulti.setText("*");
    calcMulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    calcMulti.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcMultiActionPerformed(evt);
      }
    });

    calcDiv.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    calcDiv.setText("/");
    calcDiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    calcDiv.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        calcDivActionPerformed(evt);
      }
    });

    btnClear.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    btnClear.setText("Clear");
    btnClear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnClear.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnClearActionPerformed(evt);
      }
    });

    btnExit.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    btnExit.setText("Exit");
    btnExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(151, 151, 151)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtResult)
          .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addGap(64, 64, 64)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(52, 52, 52)
            .addComponent(lblCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
            .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(calSum)
                .addGap(42, 42, 42)
                .addComponent(calcSub))
              .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(39, 39, 39)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addComponent(calcMulti)
                .addGap(46, 46, 46)
                .addComponent(calcDiv)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(84, 84, 84)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblCalc))
        .addGap(43, 43, 43)
        .addComponent(jLabel2)
        .addGap(18, 18, 18)
        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(43, 43, 43)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(calSum, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(calcSub, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(calcMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(calcDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnClear)
          .addComponent(btnExit))
        .addContainerGap())
    );

    setSize(new java.awt.Dimension(497, 512));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void calSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calSumActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double num1, num2, result;
    
    num1 = Double.parseDouble(no1.getText());
    num2 = Double.parseDouble(no2.getText());
    result = num1 + num2;
    lblCalc.setText("+");
    txtResult.setText("" + decimalFormat.format(result));
  }//GEN-LAST:event_calSumActionPerformed

  private void calcSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcSubActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double num1, num2, result;
    
    num1 = Double.parseDouble(no1.getText());
    num2 = Double.parseDouble(no2.getText());
    result = num1 - num2;
    lblCalc.setText("-");
    txtResult.setText("" + decimalFormat.format(result));
  }//GEN-LAST:event_calcSubActionPerformed

  private void calcMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcMultiActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double num1, num2, result;
    
    num1 = Double.parseDouble(no1.getText());
    num2 = Double.parseDouble(no2.getText());
    result = num1 * num2;
    lblCalc.setText("*");
    txtResult.setText("" + decimalFormat.format(result));
  }//GEN-LAST:event_calcMultiActionPerformed

  private void calcDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcDivActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double num1, num2, result;
    
    num1 = Double.parseDouble(no1.getText());
    num2 = Double.parseDouble(no2.getText());
    lblCalc.setText("/");
    if (num2 != 0) {
      result = num1 / num2;
      txtResult.setText("" + decimalFormat.format(result));
    }
  }//GEN-LAST:event_calcDivActionPerformed

  private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
    no1.setText("");
    no2.setText("");
    lblCalc.setText("");
    txtResult.setText("");
  }//GEN-LAST:event_btnClearActionPerformed

  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to exit the program?", "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
      System.out.println("Exiting the program...");
      System.exit(0);
    } else {
      System.out.println("User chose not to exit.");
    }
  }//GEN-LAST:event_btnExitActionPerformed

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to exit the program?", "Exit Confirmation",
                JOptionPane.YES_NO_OPTION);

    if (choice == JOptionPane.YES_OPTION) {
      System.out.println("Exiting the program...");
      System.exit(0);
    } else {
      System.out.println("User chose not to exit.");
    }
  }//GEN-LAST:event_formWindowClosed

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Calculator().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnClear;
  private javax.swing.JButton btnExit;
  private javax.swing.JButton calSum;
  private javax.swing.JButton calcDiv;
  private javax.swing.JButton calcMulti;
  private javax.swing.JButton calcSub;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel lblCalc;
  private javax.swing.JTextField no1;
  private javax.swing.JTextField no2;
  private javax.swing.JTextField txtResult;
  // End of variables declaration//GEN-END:variables
}
