/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Banco.PessoaBD;
import Dados.Pessoa;
import javax.swing.JOptionPane;

public class Cadastrar extends javax.swing.JFrame {

    private String nome,endereco,telefone,email,altura,peso,plano,objetivo,sexo,idade;
    
    public Cadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Plano = new javax.swing.JComboBox<>();
        Objetivo = new javax.swing.JComboBox<>();
        Sexo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEndereco = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        campoIdade = new javax.swing.JTextField();
        campoAltura = new javax.swing.JTextField();
        campoPeso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(140, 49, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Plano.setBackground(new java.awt.Color(255, 255, 255));
        Plano.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Plano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Anual", "Mensal", "Semestral" }));
        Plano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlanoActionPerformed(evt);
            }
        });
        jPanel1.add(Plano, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 220, 50));

        Objetivo.setBackground(new java.awt.Color(255, 255, 255));
        Objetivo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Objetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Hipertrofia", "Emagrecimento", "Saúde" }));
        jPanel1.add(Objetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 590, 220, 50));

        Sexo.setBackground(new java.awt.Color(255, 255, 255));
        Sexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Masculino", "Feminino" }));
        jPanel1.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 210, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/cadastrar.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        campoNome.setBackground(new java.awt.Color(255, 255, 255));
        campoNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoNome.setBorder(null);
        campoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeActionPerformed(evt);
            }
        });
        jPanel1.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 350, 50));

        campoEndereco.setBackground(new java.awt.Color(255, 255, 255));
        campoEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEndereco.setBorder(null);
        campoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoActionPerformed(evt);
            }
        });
        jPanel1.add(campoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 252, 350, 60));

        campoTelefone.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoTelefone.setBorder(null);
        jPanel1.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 340, 50));

        campoEmail.setBackground(new java.awt.Color(255, 255, 255));
        campoEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoEmail.setBorder(null);
        jPanel1.add(campoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 340, 50));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Limpa");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 710, 270, 40));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirma");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 710, 260, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Sair");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 260, 40));

        campoIdade.setBackground(new java.awt.Color(255, 255, 255));
        campoIdade.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoIdade.setBorder(null);
        campoIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdadeActionPerformed(evt);
            }
        });
        jPanel1.add(campoIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 250, 50));

        campoAltura.setBackground(new java.awt.Color(255, 255, 255));
        campoAltura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoAltura.setBorder(null);
        jPanel1.add(campoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 370, 200, 50));

        campoPeso.setBackground(new java.awt.Color(255, 255, 255));
        campoPeso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        campoPeso.setBorder(null);
        campoPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesoActionPerformed(evt);
            }
        });
        jPanel1.add(campoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Pessoa pessoa = new Pessoa();
	PessoaBD pessoaBD = new PessoaBD();
				
	nome = campoNome.getText();
	endereco = campoEndereco.getText();
	telefone = campoTelefone.getText();
	email = campoEmail.getText();
        altura = campoAltura.getText();
        peso = campoPeso.getText();
        idade = campoIdade.getText();
        sexo = (String) Sexo.getSelectedItem();
        objetivo = (String) Objetivo.getSelectedItem();
        plano = (String) Plano.getSelectedItem();
			//altura,peso,plano,objetivo,sexo,idade;
    
	pessoa.setNome(nome);
	pessoa.setEndereco(endereco);
	pessoa.setTelefone(telefone);
	pessoa.setEmail(email);
        pessoa.setPeso(peso);
        pessoa.setAltura(altura);
        pessoa.setIdade(idade);
        pessoa.setSexo(sexo);
        pessoa.setObjetivo(objetivo);
        pessoa.setPlano(plano);
        
	if(pessoaBD.inserirPessoa(pessoa) == true)
	{
		JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!", "Cadastro",JOptionPane.INFORMATION_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro",JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        campoNome.setText("");
        campoEndereco.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
        campoAltura.setText("");
        campoPeso.setText("");
        campoIdade.setText("");
        Sexo.setSelectedItem("----");
        Objetivo.setSelectedItem("----");
        Plano.setSelectedItem("----");
        


    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeActionPerformed

    private void PlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlanoActionPerformed

    private void campoPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesoActionPerformed

    private void campoIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdadeActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Objetivo;
    private javax.swing.JComboBox<String> Plano;
    private javax.swing.JComboBox<String> Sexo;
    private javax.swing.JTextField campoAltura;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoIdade;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPeso;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
