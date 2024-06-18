
package Telas;

import java.text.DecimalFormat;


public class PesoIdeal extends javax.swing.JFrame {

    private String peso,altura;
    private float Peso,Altura,imc;
    public PesoIdeal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 108, 169, 49));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 170, 60));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 200, 60));

        jButton1.setText("calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jButton2.setText("limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        jLabel1.setText("Peso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel2.setText("Altura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel3.setText("IMC");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 240, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
            // Obtém os valores de peso e altura dos campos de texto e converte para float
            Peso = Float.parseFloat(jTextField1.getText());
            Altura = Float.parseFloat(jTextField2.getText());
            
            Altura=Altura/100;
            // Calcula o IMC
            imc = Peso / (Altura * Altura);
            
            DecimalFormat df = new DecimalFormat("#.#");
            String imcFormatado = df.format(imc);
            
            
            if(imc<18.5)
            {
             jTextField4.setText("Magreza");
            }
            
            else if(imc>=18.5 && imc<24.9)
            {
             jTextField4.setText("Normal");
            }
            
            else if(imc>=25 && imc<=29.9)
            {
             jTextField4.setText("Sobrepeso");
            }
            
            else if(imc>=30 && imc<=34.9)
            {
             jTextField4.setText("Obesidade 1");
            }
            
            else if(imc>34.9 && imc<=39.9)
            {
             jTextField4.setText("Obesidade 2");
            }
            
            else if(imc>39.9)
            {
            jTextField4.setText("Obesidade 3");
            }
          
            jTextField3.setText(String.valueOf(imcFormatado));
        } catch (NumberFormatException e) {
            // Trate o erro de conversão caso os valores não sejam válidos
            jTextField3.setText("Erro: valores inválidos");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
