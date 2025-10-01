
package com.mycompany.calc_bolos;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author genesis
 */
public class display extends javax.swing.JFrame {
    
 
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(display.class.getName());

    /**
     * Creates new form display
     */
    public display() {
        
    String nome = JOptionPane.showInputDialog("Digite seu nome!");
    JOptionPane.showMessageDialog(null,"Olá " + nome + " seja bem vindo!");
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFarinha = new javax.swing.JTextField();
        textLeite = new javax.swing.JTextField();
        textFermento = new javax.swing.JTextField();
        textMargarina = new javax.swing.JTextField();
        textAcucar = new javax.swing.JTextField();
        spinnerOvo = new javax.swing.JSpinner();
        farinha = new javax.swing.JCheckBox();
        leite = new javax.swing.JCheckBox();
        ovos = new javax.swing.JCheckBox();
        Saborizante = new javax.swing.JCheckBox();
        margarina = new javax.swing.JCheckBox();
        acucar = new javax.swing.JCheckBox();
        textSaborizante = new javax.swing.JTextField();
        fermento = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        batedeira = new javax.swing.JTextField();
        ButtonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label1.setText("Calculadora para Bolos");

        jLabel1.setText("Ingredientes :");

        jLabel2.setText("Batedeira :");

        jLabel3.setText("Saborizante :");

        textFarinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFarinhaActionPerformed(evt);
            }
        });

        textLeite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLeiteActionPerformed(evt);
            }
        });

        textFermento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFermentoActionPerformed(evt);
            }
        });

        textMargarina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMargarinaActionPerformed(evt);
            }
        });

        textAcucar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAcucarActionPerformed(evt);
            }
        });

        spinnerOvo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 200, 1));
        spinnerOvo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerOvoStateChanged(evt);
            }
        });

        farinha.setText("Farinha");

        leite.setText("Leite");

        ovos.setText("Ovos");
        ovos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ovosMouseClicked(evt);
            }
        });

        Saborizante.setText("Saborizante");

        margarina.setText("Margarina");

        acucar.setText("Acucar");

        textSaborizante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSaborizanteActionPerformed(evt);
            }
        });

        fermento.setText("Fermento");

        jLabel4.setText("Capacidade por Kg :");

        batedeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batedeiraActionPerformed(evt);
            }
        });

        ButtonCalcular.setBackground(new java.awt.Color(102, 153, 255));
        ButtonCalcular.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        ButtonCalcular.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCalcular.setText("Calcular");
        ButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(farinha)
                .addGap(6, 6, 6)
                .addComponent(textFarinha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fermento)
                .addGap(33, 33, 33)
                .addComponent(textFermento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(leite)
                .addGap(24, 24, 24)
                .addComponent(textLeite, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(margarina)
                .addGap(32, 32, 32)
                .addComponent(textMargarina, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(ovos)
                .addGap(20, 20, 20)
                .addComponent(spinnerOvo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acucar)
                .addGap(50, 50, 50)
                .addComponent(textAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(113, 113, 113)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(batedeira, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Saborizante)
                .addGap(9, 9, 9)
                .addComponent(textSaborizante, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(ButtonCalcular))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(farinha))
                    .addComponent(textFarinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fermento)
                    .addComponent(textFermento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textLeite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMargarina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leite)
                            .addComponent(margarina))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerOvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAcucar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ovos)
                            .addComponent(acucar))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(batedeira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Saborizante))
                    .addComponent(textSaborizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(ButtonCalcular))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void textLeiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLeiteActionPerformed
       
        
       if (leite.isSelected()) {
        textLeite.setEnabled(true);  // Habilita o campo de texto
        textLeite.setText("0");      // Opcional: define um valor inicial ou deixa vazio ""
    } else {
        // Se o checkbox 'leite' NÃO estiver selecionado (desmarcado)
        textLeite.setText("");       // Limpa o campo de texto
        textLeite.setEnabled(false); // Desabilita o campo de texto
    }
        
    }//GEN-LAST:event_textLeiteActionPerformed

    private void textFarinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFarinhaActionPerformed
      
        
        if (farinha.isSelected()) {
        textFarinha.setEnabled(true);  
        textFarinha.setText("0");      
    } else {
        
        textFarinha.setText("");      
        textFarinha.setEnabled(false); 
    }
        
    }//GEN-LAST:event_textFarinhaActionPerformed

    private void textFermentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFermentoActionPerformed
        
        if (fermento.isSelected()) {
        textFermento.setEnabled(true); 
        textFermento.setText("0");     
    } else {
        
        textFermento.setText("");      
        textFermento.setEnabled(false); 
    }
    }//GEN-LAST:event_textFermentoActionPerformed

    private void textMargarinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMargarinaActionPerformed
        
        
        if (margarina.isSelected()) {
        textMargarina.setEnabled(true);  
        textMargarina.setText("0");      
    } else {
        
        textMargarina.setText("");       
        textMargarina.setEnabled(false); 
    }
        
    }//GEN-LAST:event_textMargarinaActionPerformed

    private void textAcucarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAcucarActionPerformed
         
        
        if (acucar.isSelected()) {
        textAcucar.setEnabled(true);  
        textAcucar.setText("0");     
    } else {
        
        textAcucar.setText("");       
        textAcucar.setEnabled(false); 
    }
    }//GEN-LAST:event_textAcucarActionPerformed

    private void textSaborizanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSaborizanteActionPerformed
      
        
        if (Saborizante.isSelected()) {
        textSaborizante.setEnabled(true); 
        textSaborizante.setText("0");      
    } else {
        
        textSaborizante.setText("");       
        textSaborizante.setEnabled(false);
    }
    }//GEN-LAST:event_textSaborizanteActionPerformed

    private void batedeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batedeiraActionPerformed
       
        
       
    }//GEN-LAST:event_batedeiraActionPerformed

    private void spinnerOvoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerOvoStateChanged
        
        
       if (ovos.isSelected()) {
        spinnerOvo.setEnabled(true);
      
    } else {
        spinnerOvo.setValue(0);
        spinnerOvo.setEnabled(false);
    } 
        
    }//GEN-LAST:event_spinnerOvoStateChanged

    private void ButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalcularActionPerformed
       
        
  try {
    // Obter os valores dos campos de entrada de Ingredientes
    double Farinha = farinha.isSelected() ? Double.parseDouble(textFarinha.getText()) : 0.0;
    double Leite = leite.isSelected() ? Double.parseDouble(textLeite.getText()) : 0.0;
    double Fermento = fermento.isSelected() ? Double.parseDouble(textFermento.getText()) : 0.0;
    double Margarina = margarina.isSelected() ? Double.parseDouble(textMargarina.getText()) : 0.0;
    double Acucar = acucar.isSelected() ? Double.parseDouble(textAcucar.getText()) : 0.0;
    double saborizante = Saborizante.isSelected() ? Double.parseDouble(textSaborizante.getText()) : 0.0;
    double Ovos = ovos.isSelected() ? ((Number)spinnerOvo.getValue()).doubleValue()* 0.054 : 0.0;
    double capacidadeBatedeira = Double.parseDouble(batedeira.getText());

    // Calcular o peso total dos ingredientes
    double totalIngredientes = Farinha + Leite + Fermento + Margarina + Acucar + saborizante + Ovos;

    // Calcular a capacidade restante da batedeira
    double capacidadeRestante = capacidadeBatedeira - totalIngredientes;

    // Preparar e exibir o resultado
    String resultados;

    if (capacidadeRestante < 0) {
        resultados = "A quantidade de ingredientes (" + String.format("%.3f kg", totalIngredientes) + ") excede a capacidade da batedeira (" + String.format("%.3f kg", capacidadeBatedeira) + ").";
        JOptionPane.showMessageDialog(this, resultados, "Aviso!", JOptionPane.WARNING_MESSAGE);
    } else {
        resultados = "Peso Total dos Ingredientes: " + String.format("%.3f kg", totalIngredientes) + "\n\n";
        resultados += "Capacidade da Batedeira: " + String.format("%.3f kg", capacidadeBatedeira) + "\n";
        resultados += "Capacidade Restante: " + String.format("%.3f kg", capacidadeRestante);
        JOptionPane.showMessageDialog(this, resultados, "Resultado do Cálculo", JOptionPane.INFORMATION_MESSAGE);
    }
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, insira apenas números válidos nos campos de quantidade.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this, "Ocorreu um erro inesperado: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_ButtonCalcularActionPerformed

    private void ovosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovosMouseClicked
                                          
    if (ovos.isSelected()) {
        spinnerOvo.setEnabled(true);
        
    } else {
        spinnerOvo.setValue(0);
        spinnerOvo.setEnabled(false);
    }

    }//GEN-LAST:event_ovosMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new display().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalcular;
    private javax.swing.JCheckBox Saborizante;
    private javax.swing.JCheckBox acucar;
    private javax.swing.JTextField batedeira;
    private javax.swing.JCheckBox farinha;
    private javax.swing.JCheckBox fermento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private javax.swing.JCheckBox leite;
    private javax.swing.JCheckBox margarina;
    private javax.swing.JCheckBox ovos;
    private javax.swing.JSpinner spinnerOvo;
    private javax.swing.JTextField textAcucar;
    private javax.swing.JTextField textFarinha;
    private javax.swing.JTextField textFermento;
    private javax.swing.JTextField textLeite;
    private javax.swing.JTextField textMargarina;
    private javax.swing.JTextField textSaborizante;
    // End of variables declaration//GEN-END:variables
}
