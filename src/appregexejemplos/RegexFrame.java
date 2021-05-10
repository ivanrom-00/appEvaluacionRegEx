/*

App con ejemplos de validaciones con expresiones regulares
Las validaciones son de la evaluación vista en clase

1. Validar números enteros positivos y negativos
2. Validar números enteros negativos
3. Validar número de control del Tec Laguna (Validar cantidad)
4. Validar número de control del Tec Laguna de estudiantes ingresados en el 2020
5. Validar identificadores de productos con 4 digitos + 2 letras + 2 digitos

Realizado por: Iván Romero Canaán

*/

package appregexejemplos;

import java.awt.Color;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFrame extends javax.swing.JFrame {

    String evaluar = "";
    String regex = "";
    String validacion = "";
    
    public RegexFrame() {
        initComponents();
        jrd1.setSelected(true);
    }
    
    public void validar() {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(evaluar);
        
        boolean coincidencia = m.find();
        if (coincidencia) {
            jlblResultado.setText("EXPRESIÓN CORRECTA!");
            jlblResultado.setForeground(Color.GREEN);
        } else {
            jlblResultado.setText("EXPRESIÓN INCORRECTA");
            jlblResultado.setForeground(Color.RED);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtxtExpresion = new javax.swing.JTextField();
        jlblResultado = new javax.swing.JLabel();
        jrd1 = new javax.swing.JRadioButton();
        jrd2 = new javax.swing.JRadioButton();
        jrd3 = new javax.swing.JRadioButton();
        jrd4 = new javax.swing.JRadioButton();
        jrd5 = new javax.swing.JRadioButton();
        jbtnValidar = new javax.swing.JButton();
        jbtnRandom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Evaluación RegEx");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jLabel1.setText("Escriba su expresión:");

        jtxtExpresion.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jtxtExpresion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtExpresionFocusGained(evt);
            }
        });

        jlblResultado.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jlblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonGroup1.add(jrd1);
        jrd1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jrd1.setText("1. Números enteros ");

        buttonGroup1.add(jrd2);
        jrd2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jrd2.setText("2. Números enteros negativos");

        buttonGroup1.add(jrd3);
        jrd3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jrd3.setText("3. NC del Tec Laguna (cantidad)");

        buttonGroup1.add(jrd4);
        jrd4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jrd4.setText("4. NC del Tec Laguna (ingresados en 2020)");

        buttonGroup1.add(jrd5);
        jrd5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jrd5.setText("5. Identificador de productos");

        jbtnValidar.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jbtnValidar.setText("VALIDAR");
        jbtnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnValidarActionPerformed(evt);
            }
        });

        jbtnRandom.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        jbtnRandom.setText("RANDOM");
        jbtnRandom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRandomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrd2)
                            .addComponent(jrd1)
                            .addComponent(jrd3)
                            .addComponent(jrd4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrd5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jbtnValidar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtExpresion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jrd1)
                .addGap(18, 18, 18)
                .addComponent(jrd2)
                .addGap(18, 18, 18)
                .addComponent(jrd3)
                .addGap(18, 18, 18)
                .addComponent(jrd4)
                .addGap(18, 18, 18)
                .addComponent(jrd5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnValidar)
                    .addComponent(jbtnRandom))
                .addGap(18, 18, 18)
                .addComponent(jlblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtExpresionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtExpresionFocusGained
        jlblResultado.setText("");
    }//GEN-LAST:event_jtxtExpresionFocusGained

    private void jbtnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnValidarActionPerformed
        
        evaluar = jtxtExpresion.getText();
        
        if (jrd1.isSelected()) {
            regex = "^[+-]?(\\d)+$";
        } else if (jrd2.isSelected()) {
            regex = "^(-)(\\d)+$";
        } else if (jrd3.isSelected()) {
            regex = "^\\d{8}$";
        } else if (jrd4.isSelected()) {
            regex = "^(2013)\\d{4}$";
        } else if (jrd5.isSelected()) {
            regex = "^\\d{4}[a-zA-z]{2}\\d{2}$";
        }
        
        validar();
        
    }//GEN-LAST:event_jbtnValidarActionPerformed

    private void jbtnRandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRandomActionPerformed
        
        jlblResultado.setText("");
        
        String array [] = new String [5];
        Random r = new Random();
        int i = r.nextInt(5);
        
        if (jrd1.isSelected()) {
            array [0]= "5";
            array [1]= "+21";
            array [2]= "-489";
            array [3]= "15.48";
            array [4]= "489";
            
            jtxtExpresion.setText(array[i]);
        } else if (jrd2.isSelected()) {
            array [0]= "-5";
            array [1]= "+21";
            array [2]= "-489";
            array [3]= "15.48";
            array [4]= "-489";
            
            jtxtExpresion.setText(array[i]);
        } else if (jrd3.isSelected()) {
            array [0]= "18131278";
            array [1]= "17131210";
            array [2]= "48597823";
            array [3]= "123456789";
            array [4]= "201345";
            
            jtxtExpresion.setText(array[i]);
        } else if (jrd4.isSelected()) {
            array [0]= "18131278";
            array [1]= "20131278";
            array [2]= "20131210";
            array [3]= "17130478";
            array [4]= "19134568";
            
            jtxtExpresion.setText(array[i]);
        } else if (jrd5.isSelected()) {
            array [0]= "4895as78";
            array [1]= "7812SA01";
            array [2]= "78945s10";
            array [3]= "0259jK89";
            array [4]= "7560saf89";
            
            jtxtExpresion.setText(array[i]);
        }
    }//GEN-LAST:event_jbtnRandomActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegexFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegexFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnRandom;
    private javax.swing.JButton jbtnValidar;
    private javax.swing.JLabel jlblResultado;
    private javax.swing.JRadioButton jrd1;
    private javax.swing.JRadioButton jrd2;
    private javax.swing.JRadioButton jrd3;
    private javax.swing.JRadioButton jrd4;
    private javax.swing.JRadioButton jrd5;
    private javax.swing.JTextField jtxtExpresion;
    // End of variables declaration//GEN-END:variables
}
