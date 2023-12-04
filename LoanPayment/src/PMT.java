import java.text.DecimalFormat;

public class PMT extends javax.swing.JFrame {

  public PMT() {
    initComponents();
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtAmount = new javax.swing.JTextField();
    txtDuration = new javax.swing.JTextField();
    txtRate = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtPayment = new javax.swing.JTextField();
    btnCalc = new javax.swing.JButton();
    btnExit = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("قيمة القرض");

    jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("معدل الفائدة");

    jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("عدد السنين");

    txtAmount.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
    txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtDuration.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
    txtDuration.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtRate.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
    txtRate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("القسط الشهري");

    txtPayment.setEditable(false);
    txtPayment.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
    txtPayment.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    btnCalc.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    btnCalc.setText("حساب القسط الشهري");
    btnCalc.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnCalcMouseClicked(evt);
      }
    });

    btnExit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    btnExit.setText("انهاء");
    btnExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnExitActionPerformed(evt);
      }
    });

    jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("%");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(32, 32, 32)
        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(70, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(36, 36, 36)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
          .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtDuration, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtRate, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(87, 87, 87)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtPayment, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
        .addGap(38, 38, 38)
        .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(8, 8, 8))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnCalcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcMouseClicked
    DecimalFormat decimalFormat = new DecimalFormat("#.###");
    double loan_Rate, loan_Duration, loan_Amount, monthlyInterestRate, numberOfPayments, payment;
    
    loan_Amount = Double.parseDouble(txtAmount.getText());
    loan_Duration = Double.parseDouble(txtDuration.getText());
    loan_Rate = Double.parseDouble(txtRate.getText());
    monthlyInterestRate = (loan_Rate/100) / 12;
    numberOfPayments = loan_Duration * 12;
    
    payment = (loan_Amount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
    
    txtPayment.setText("" + decimalFormat.format(payment));
  }//GEN-LAST:event_btnCalcMouseClicked

  private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    System.exit(0);
  }//GEN-LAST:event_btnExitActionPerformed


  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new PMT().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCalc;
  private javax.swing.JButton btnExit;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JTextField txtAmount;
  private javax.swing.JTextField txtDuration;
  private javax.swing.JTextField txtPayment;
  private javax.swing.JTextField txtRate;
  // End of variables declaration//GEN-END:variables
}
