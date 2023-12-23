import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class bmr extends javax.swing.JFrame {
  public bmr() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtAge = new javax.swing.JTextField();
    txtHeight = new javax.swing.JTextField();
    txtWeight = new javax.swing.JTextField();
    active = new javax.swing.JComboBox<>();
    jButton1 = new javax.swing.JButton();
    female = new javax.swing.JRadioButton();
    male = new javax.swing.JRadioButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    listBMR = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    lbl1 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    lbl2 = new javax.swing.JLabel();
    lbl3 = new javax.swing.JLabel();
    lbl4 = new javax.swing.JLabel();
    lbl5 = new javax.swing.JLabel();
    btnClear = new javax.swing.JButton();
    btnExit = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("حاسبة السعرات الحرارية  BMR");
    setPreferredSize(new java.awt.Dimension(1300, 700));
    setResizable(false);

    jLabel4.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(51, 0, 51));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel4.setText("الوزن");

    jLabel5.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(51, 0, 51));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel5.setText("النشاط");

    txtAge.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtHeight.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    txtHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtWeight.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    txtWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    active.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    active.setForeground(new java.awt.Color(51, 0, 51));
    active.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "خامل", "قليل النشاط", "نشط من حين لاخر", "نشط جدا", "نشط للغاية" }));
    active.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

    jButton1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    jButton1.setForeground(new java.awt.Color(51, 0, 51));
    jButton1.setText("احسب");
    jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton1MouseClicked(evt);
      }
    });
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    buttonGroup1.add(female);
    female.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    female.setForeground(new java.awt.Color(51, 0, 51));
    female.setText("  انثي");
    female.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    female.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    buttonGroup1.add(male);
    male.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    male.setForeground(new java.awt.Color(51, 0, 51));
    male.setSelected(true);
    male.setText("  ذكر");
    male.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    male.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    male.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    jLabel2.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(51, 0, 51));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel2.setText("السن");

    jLabel3.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(51, 0, 51));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel3.setText("الطول");

    listBMR.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    listBMR.setText("قائمة السعرات الحرارية");
    listBMR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    listBMR.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        listBMRMouseClicked(evt);
      }
    });
    listBMR.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        listBMRActionPerformed(evt);
      }
    });

    jLabel6.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(51, 0, 51));
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("نتائج القياسات الشخصية");

    jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(51, 0, 51));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel7.setText("حاسبة السعرات الحرارية BMR");

    lbl1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl1.setForeground(new java.awt.Color(51, 0, 51));
    lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    jPanel1.setBackground(new java.awt.Color(204, 204, 204));

    lbl2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl2.setForeground(new java.awt.Color(51, 0, 51));
    lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    lbl3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl3.setForeground(new java.awt.Color(51, 0, 51));
    lbl3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    lbl4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl4.setForeground(new java.awt.Color(51, 0, 51));
    lbl4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    lbl5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl5.setForeground(new java.awt.Color(51, 0, 51));
    lbl5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(12, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(39, Short.MAX_VALUE))
    );

    btnClear.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    btnClear.setText("جديد");
    btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnClearMouseClicked(evt);
      }
    });

    btnExit.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    btnExit.setText("خروج");
    btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnExitMouseClicked(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(155, 155, 155)
            .addComponent(listBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(txtAge)
                  .addComponent(txtHeight)
                  .addComponent(txtWeight)
                  .addComponent(active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(57, 57, 57))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(49, 49, 49)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(65, 65, 65))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(161, 161, 161))))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(30, 30, 30))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(58, 58, 58)
        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(listBMR, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
          .addComponent(male)
          .addComponent(female))
        .addGap(37, 37, 37)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(35, 35, 35)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(44, 44, 44)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(39, 39, 39)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(active, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1))
          .addGroup(layout.createSequentialGroup()
            .addGap(49, 49, 49)
            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))
        .addGap(23, 23, 23)
        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    setSize(new java.awt.Dimension(1257, 675));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double age, height, weight, result = 0;

    if (txtAge.getText().trim().isEmpty() || txtHeight.getText().trim().isEmpty() || txtWeight.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "من فضلت املئ البيانات", "تنبية", JOptionPane.WARNING_MESSAGE);
    }else {
      age = Double.parseDouble(txtAge.getText());
      weight = Double.parseDouble(txtWeight.getText());
      height = Double.parseDouble(txtHeight.getText());

      if (male.isSelected()) {
        result = (10 * weight) + (6.25 * height) - (5 * age) + 5;
      } else if (female.isSelected()) {
        result = (10 * weight) + (6.25 * height) - (5 * age) - 161;
      }

      if (active.getSelectedItem() == "خامل") {
        result *= 1.2;
      }else if (active.getSelectedItem() == "قليل النشاط") {
        result *= 1.375;
      }else if (active.getSelectedItem() == "نشط من حين لاخر") {
        result *= 1.55;
      }else if (active.getSelectedItem() == "نشط جدا") {
        result *= 1.725;
      }else if (active.getSelectedItem() == "نشط للغاية") {
        result *= 1.9;
      }

      lbl1.setText("احتياجاتك اليومية من السعرات الحرارية هي " + decimalFormat.format(result) + " سعرة حرارية");
    lbl2.setText("انت تحتاج " + decimalFormat.format(result - 500) + " سعرات حرارية / يوم لانقاص وزنك 0.5 كجم");
    lbl3.setText("انت تحتاج " + decimalFormat.format(result - 1000) + " سعرات حرارية / يوم لانقاص وزنك 1 كجم");
    lbl4.setText("انت تحتاج " + decimalFormat.format(result +500) + " سعرات حرارية / يوم لزيادة وزنك 0.5 كجم");
    lbl5.setText("انت تحتاج " + decimalFormat.format(result +500) + " سعرات حرارية / يوم لزيادة وزنك 1 كجم");

    }

  }//GEN-LAST:event_jButton1MouseClicked

  private void listBMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBMRActionPerformed

  }//GEN-LAST:event_listBMRActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton1ActionPerformed

  private void listBMRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBMRMouseClicked
    new notes_bmr().setVisible(true);
  }//GEN-LAST:event_listBMRMouseClicked

  private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
    txtAge.setText("");
    txtHeight.setText("");
    txtWeight.setText("");
    lbl1.setText("");
    lbl2.setText("");
    lbl3.setText("");
    lbl4.setText("");
    lbl5.setText("");
    active.setSelectedItem("خامل");

  }//GEN-LAST:event_btnClearMouseClicked

  private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
    dispose();
  }//GEN-LAST:event_btnExitMouseClicked


  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new bmr().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> active;
  private javax.swing.JButton btnClear;
  private javax.swing.JButton btnExit;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JRadioButton female;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JLabel lbl1;
  private javax.swing.JLabel lbl2;
  private javax.swing.JLabel lbl3;
  private javax.swing.JLabel lbl4;
  private javax.swing.JLabel lbl5;
  private javax.swing.JButton listBMR;
  private javax.swing.JRadioButton male;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtHeight;
  private javax.swing.JTextField txtWeight;
  // End of variables declaration//GEN-END:variables
}
