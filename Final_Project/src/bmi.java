import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class bmi extends javax.swing.JFrame {

  public bmi() {
    initComponents();
  }
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jLabel1 = new javax.swing.JLabel();
    jRadioButton2 = new javax.swing.JRadioButton();
    jLabel2 = new javax.swing.JLabel();
    btnClear = new javax.swing.JButton();
    jLabel3 = new javax.swing.JLabel();
    btnExit = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    txtAge = new javax.swing.JTextField();
    txtHeight = new javax.swing.JTextField();
    txtWeight = new javax.swing.JTextField();
    lblStatus = new javax.swing.JLabel();
    lblResult = new javax.swing.JLabel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jLabel5 = new javax.swing.JLabel();
    lbl8 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    lbl2 = new javax.swing.JLabel();
    lbl3 = new javax.swing.JLabel();
    lbl4 = new javax.swing.JLabel();
    lbl5 = new javax.swing.JLabel();
    lbl6 = new javax.swing.JLabel();
    lbl1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("حاسبة مؤشر كتلة الجسم BMI");
    setPreferredSize(new java.awt.Dimension(1000, 720));
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(204, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("الطول");

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jRadioButton2.setText(" انثي");
    jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(204, 0, 0));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("الوزن");

    btnClear.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    btnClear.setText("جديد");
    btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnClearMouseClicked(evt);
      }
    });

    jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(204, 0, 0));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("السن");

    btnExit.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    btnExit.setText("خروج");
    btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnExitMouseClicked(evt);
      }
    });

    jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(204, 0, 0));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("حاسبة مؤشر كتلة الجسم   BMI");

    jButton1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jButton1.setText("احسب");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    txtAge.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtHeight.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    txtHeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    txtWeight.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
    txtWeight.setHorizontalAlignment(javax.swing.JTextField.CENTER);

    lblStatus.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lblStatus.setForeground(new java.awt.Color(153, 0, 0));
    lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblStatus.setToolTipText("");

    lblResult.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    lblResult.setForeground(new java.awt.Color(153, 0, 0));
    lblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblResult.setToolTipText("");

    buttonGroup1.add(jRadioButton1);
    jRadioButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jRadioButton1.setSelected(true);
    jRadioButton1.setText(" ذكر");
    jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    jLabel5.setBackground(new java.awt.Color(204, 204, 204));
    jLabel5.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(51, 0, 51));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("نتائج القياسات الشخصية");

    lbl8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl8.setForeground(new java.awt.Color(102, 102, 102));
    lbl8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    jPanel1.setBackground(new java.awt.Color(204, 204, 204));

    jLabel8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(51, 0, 51));
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel8.setText("مؤشر كتلة الجسم الحالي                           ");

    jLabel9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(51, 0, 51));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel9.setText("معدل مؤشر كتلة الجسم الصحي                      ");

    jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(51, 0, 51));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel10.setText("الوزن الصحي");

    jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(51, 0, 51));
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel11.setText("يفضل ان يكون وزنك بين");

    jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(51, 0, 51));
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel12.setText("المؤشر الوزني");

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

    lbl6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    lbl6.setForeground(new java.awt.Color(51, 0, 51));
    lbl6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(29, 29, 29)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(65, 65, 65)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(42, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    lbl1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    lbl1.setForeground(new java.awt.Color(51, 0, 51));
    lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(115, 115, 115)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lbl8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(190, 190, 190))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(45, 45, 45))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(55, 55, 55))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(184, 184, 184))))
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(52, 52, 52)
          .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(557, Short.MAX_VALUE)))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(76, 76, 76)
            .addComponent(lbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 7, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jRadioButton1)
              .addComponent(jRadioButton2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
      .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
          .addGap(30, 30, 30)
          .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(498, Short.MAX_VALUE)))
    );

    setSize(new java.awt.Dimension(1295, 623));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
    txtAge.setText("");
    txtHeight.setText("");
    txtWeight.setText("");
    lblResult.setText("");
    lblStatus.setText("");
    lbl1.setText("");
    lbl2.setText("");
    lbl3.setText("");
    lbl4.setText("");
    lbl5.setText("");
    lbl6.setText("");
    lbl8.setText("");
  }//GEN-LAST:event_btnClearMouseClicked

  private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
    dispose();
  }//GEN-LAST:event_btnExitMouseClicked

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double height, weight, bmi_c, w_index ,weight_rate;
    
    
    if (txtAge.getText().trim().isEmpty() || txtHeight.getText().trim().isEmpty() || txtWeight.getText().trim().isEmpty()) {
      JOptionPane.showMessageDialog(null, "من فضلت املئ البيانات");
      
    }else {
      
      height = Integer.parseInt(txtHeight.getText());
      weight = Integer.parseInt(txtWeight.getText());
      bmi_c = weight / (Math.pow((height / 100.0), 2));
      w_index = weight / (Math.pow((height / 100), 3));

      lbl5.setText("53.46كجم - 72.25كجم");
      lbl3.setText("18.5 كجم/م2 - 22.5كجم/م2");
      lbl6.setText(decimalFormat.format(w_index) + " كجم/م3");
      lbl2.setText(decimalFormat.format(bmi_c) + " كجم/م2");

      if (bmi_c < 18.5) {
        lbl1.setText(" كتلة الجسم  " + decimalFormat.format(bmi_c) + " كجم/م2" + " - " + "وزن ناقص");
        weight_rate = 53.46 - weight;
        lbl4.setText("وزن ناقص");
        lbl8.setText("تحتاج لزيادة " + decimalFormat.format(weight_rate) + "  كجم من أجل الوصول الى الوزن الطبيعى");

      }else if (bmi_c >= 18.5 && bmi_c < 25) {
        lbl1.setText(" كتلة الجسم  " + decimalFormat.format(bmi_c) + " كجم/م2" + " - " + "وزن صحي ومثالي");
        lbl4.setText("وزن صحي ومثالي");
        lbl8.setText("");

      }else if (bmi_c >= 25 && bmi_c < 30) {
        lbl1.setText(" كتلة الجسم  " + decimalFormat.format(bmi_c) + " كجم/م2" + " - " + "وزن زائد");
        lbl4.setText("وزن زائد");
        weight_rate = weight - 72.25;
        lbl8.setText("تحتاج لانقاص " + decimalFormat.format(weight_rate) + "  كجم من أجل الوصول الى الوزن الطبيعى");

      }else if (bmi_c >= 30 && bmi_c < 40) {
        lbl1.setText(" كتلة الجسم  " + decimalFormat.format(bmi_c) + " كجم/م2" + " - " + "سمنة");
        lbl4.setText("سمنة");
        weight_rate = weight - 72.25;
        lbl8.setText("تحتاج لانقاص " + decimalFormat.format(weight_rate) + "  كجم من أجل الوصول الى الوزن الطبيعى");

      }else if (bmi_c >= 40) {
        lbl1.setText(" كتلة الجسم  " + decimalFormat.format(bmi_c) + " كجم/م2" + " - " + "سمنة مفرطة");
        lbl4.setText("سمنة مفرطة");
        weight_rate = weight - 72.25;
        lbl8.setText("تحتاج لانقاص  " + decimalFormat.format(weight_rate) + "  كجم من أجل الوصول الى الوزن الطبيعى");

      }
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new bmi().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnClear;
  private javax.swing.JButton btnExit;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JLabel lbl1;
  private javax.swing.JLabel lbl2;
  private javax.swing.JLabel lbl3;
  private javax.swing.JLabel lbl4;
  private javax.swing.JLabel lbl5;
  private javax.swing.JLabel lbl6;
  private javax.swing.JLabel lbl8;
  private javax.swing.JLabel lblResult;
  private javax.swing.JLabel lblStatus;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtHeight;
  private javax.swing.JTextField txtWeight;
  // End of variables declaration//GEN-END:variables
}
