
import javax.swing.*;

public class bmr extends javax.swing.JFrame {

  public bmr() {
    initComponents();
  }


  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    buttonGroup1 = new javax.swing.ButtonGroup();
    jLabel1 = new javax.swing.JLabel();
    female = new javax.swing.JRadioButton();
    male = new javax.swing.JRadioButton();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    txtAge = new javax.swing.JTextField();
    txtHeight = new javax.swing.JTextField();
    txtWeight = new javax.swing.JTextField();
    active = new javax.swing.JComboBox<>();
    jButton1 = new javax.swing.JButton();
    txtResult = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(51, 0, 51));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("حاسبة السعرات الحرارية");

    buttonGroup1.add(female);
    female.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    female.setForeground(new java.awt.Color(51, 0, 51));
    female.setText("  انثي");
    female.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    female.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    buttonGroup1.add(male);
    male.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
    male.setForeground(new java.awt.Color(51, 0, 51));
    male.setSelected(true);
    male.setText("  ذكر");
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

    jButton1.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    jButton1.setForeground(new java.awt.Color(51, 0, 51));
    jButton1.setText("احسب");
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton1MouseClicked(evt);
      }
    });

    txtResult.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
    txtResult.setForeground(new java.awt.Color(51, 0, 51));
    txtResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    txtResult.setText("السعرات الحرارية لديك = ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 30, Short.MAX_VALUE))
          .addComponent(txtResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(txtAge)
              .addComponent(txtHeight)
              .addComponent(txtWeight)
              .addComponent(active, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(108, 108, 108))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(216, 216, 216))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
        .addComponent(txtResult)
        .addGap(22, 22, 22)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    setBounds(0, 0, 588, 656);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    double age, height, weight, result = 0;
    
    if (txtAge.getText().trim().isEmpty() || txtHeight.getText().trim().isEmpty() || txtWeight.getText().trim().isEmpty()) {
      
      JOptionPane.showMessageDialog(null, "من فضلت املئ البيانات");
      
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

      JOptionPane.showMessageDialog(null, "السعرات الحرارية لديك = " + result + " سعرة حرارية/يوم");
      txtResult.setText("السعرات الحرارية لديك = " + result + " سعرة حرارية/يوم");
    }
    
    
  }//GEN-LAST:event_jButton1MouseClicked


  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new bmr().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> active;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JRadioButton female;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JRadioButton male;
  private javax.swing.JTextField txtAge;
  private javax.swing.JTextField txtHeight;
  private javax.swing.JLabel txtResult;
  private javax.swing.JTextField txtWeight;
  // End of variables declaration//GEN-END:variables
}
