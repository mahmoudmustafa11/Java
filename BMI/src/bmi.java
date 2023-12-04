
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
    buttonGroup2 = new javax.swing.ButtonGroup();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    txtAge = new javax.swing.JTextField();
    txtHeight = new javax.swing.JTextField();
    txtWeight = new javax.swing.JTextField();
    lblStatus = new javax.swing.JLabel();
    lblResult = new javax.swing.JLabel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("حاسبة مؤشر كتلة الجسم");
    setAlwaysOnTop(true);

    jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(204, 0, 0));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("الطول");

    jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(204, 0, 0));
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("الوزن");

    jLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(204, 0, 0));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("السن");

    jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(204, 0, 0));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("حاسبة مؤشر كتلة الجسم");

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
    jRadioButton1.setText("ذكر");
    jRadioButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jRadioButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
    jRadioButton2.setText("انثي");
    jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(151, 151, 151)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(119, 119, 119)
            .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(55, 55, 55)
            .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(40, Short.MAX_VALUE)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(45, 45, 45))
      .addGroup(layout.createSequentialGroup()
        .addGap(157, 157, 157)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jRadioButton1)
          .addComponent(jRadioButton2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
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
        .addGap(27, 27, 27)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(21, 21, 21))
    );

    setSize(new java.awt.Dimension(564, 572));
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    DecimalFormat decimalFormat = new DecimalFormat("#.##");
    double height, weight, bmi_c;
    
    height = Integer.parseInt(txtHeight.getText());
    weight = Integer.parseInt(txtWeight.getText());
    bmi_c = weight / (Math.pow((height / 100.0), 2));
//    decimalFormat.format(bmi_c);
    lblResult.setText("مؤشر كتلة الجسم = " + decimalFormat.format(bmi_c) + " كجم/م2");
    
    if (bmi_c < 18.5) {
        lblStatus.setText("(وزن ناقص)");
        
    }else if (bmi_c >= 18.5 && bmi_c < 25) {
        lblStatus.setText("(وزن صحي ومثالي)");
      
    }else if (bmi_c >= 25 && bmi_c < 30) {
        lblStatus.setText("(وزن زائد)");
      
    }else if (bmi_c >= 30 && bmi_c < 40) {
        lblStatus.setText("(سمنة)");
      
    }else if (bmi_c >= 40) {
        lblStatus.setText("(سمنة مفرطة)");
      
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
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.ButtonGroup buttonGroup2;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JLabel lblResult;
  private javax.swing.JLabel lblStatus;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtHeight;
  private javax.swing.JTextField txtWeight;
  // End of variables declaration//GEN-END:variables
}
