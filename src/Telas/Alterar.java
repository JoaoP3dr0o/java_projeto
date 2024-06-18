package Telas;

import Banco.PessoaBD;
import java.sql.*;
import javax.swing.JOptionPane;

public class Alterar extends javax.swing.JFrame {

    private String nomeAtual, enderecoAtual, telefoneAtual, emailAtual,pesoAtual,planoAtual;
    private String novoNome;
    private String novoEndereco;
    private String novoTelefone;
    private String novoEmail;
    private String novoPeso;
    private String novoPlano;
    private String nomeConsulta = "";
	
    public Alterar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNovoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoNovoEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNovoTelefone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoNovoEmail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoNomeConsulta = new javax.swing.JTextField();
        campoNovoPlano = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoNovoPeso = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 145, -1));
        getContentPane().add(campoNovoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 384, -1));

        jLabel2.setText("Endereço");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 145, -1));

        campoNovoEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNovoEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(campoNovoEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 384, -1));

        jLabel3.setText("Telefone");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 145, -1));
        getContentPane().add(campoNovoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 226, 384, -1));

        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 256, 145, -1));
        getContentPane().add(campoNovoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 276, 384, -1));

        jButton2.setText("Limpa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 379, 81, 30));

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 379, 86, 30));

        jLabel5.setText("Informe o nome a alterar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 175, -1));
        getContentPane().add(campoNomeConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 58, 384, -1));

        campoNovoPlano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----", "Anual", "Mensal", "Semestral" }));
        getContentPane().add(campoNovoPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 326, -1, -1));

        jLabel6.setText("Plano");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 306, -1, -1));

        jLabel7.setText("Peso");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 356, -1, -1));
        getContentPane().add(campoNovoPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 376, 100, -1));

        jPanel1.setBackground(new java.awt.Color(140, 49, 49));
        jPanel1.setPreferredSize(new java.awt.Dimension(724, 436));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 97, 30));

        jButton1.setText("Confirma");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 720, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNovoEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNovoEnderecoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      int status;

				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/agenda","root","");
					Statement stm = con.createStatement();
					ResultSet res = stm.executeQuery("SELECT * from dados");

					nomeConsulta = campoNomeConsulta.getText();
					status = 0;
					while(res.next())
					{
					   nomeAtual = res.getString("nome");
					   if(nomeAtual.compareTo(nomeConsulta)==0)
					   {
						  enderecoAtual = res.getString("endereco");
						  telefoneAtual = res.getString("telefone");
						  emailAtual = res.getString("email");
                                                  planoAtual = res.getString("plano");
                                                  pesoAtual = res.getString("peso");
						  status = 1;						  
					   }					   			   
				    }
					if(status == 1)
					{
						campoNovoEndereco.setText(enderecoAtual);
						campoNovoTelefone.setText(telefoneAtual);
						campoNovoEmail.setText(emailAtual);
                                                campoNovoPlano.setSelectedItem(planoAtual);
                                                campoNovoPeso.setText(pesoAtual);
					}
					if(status == 0)
					{
						JOptionPane.showMessageDialog(null,"Nome: "+nomeConsulta+" não encontrado!!!","Erro",JOptionPane.ERROR_MESSAGE);
					}
				}
				catch(ClassNotFoundException ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage(),"Erro",JOptionPane.ERROR_MESSAGE);
				}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        atualizarDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            campoNomeConsulta.setText("");
            campoNovoNome.setText("");
            campoNovoEmail.setText("");
            campoNovoEndereco.setText("");
            campoNovoPeso.setText("");
            campoNovoTelefone.setText("");
            campoNovoPlano.setSelectedItem("----");
            
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

       
    private void atualizarDados() {

        // URL de conexão com o banco de dados

        String url = "jdbc:mysql://localhost:3306/agenda?user=root&password=";
 
    

        try {

            // Estabelecendo conexão com o banco de dados

            Connection connection = DriverManager.getConnection(url);
 
            // Query SQL para atualizar os dados

            String sql = "UPDATE dados SET nome=?, endereco=?, telefone=?, email=?, peso=?, plano=? WHERE nome=?";
 
            // Preparando a declaração SQL

            PreparedStatement statement = connection.prepareStatement(sql);
 
            // Preenchendo os parâmetros da declaração SQL com os novos valores dos campos

            statement.setString(1, campoNovoNome.getText());

            statement.setString(2, campoNovoEndereco.getText());

            statement.setString(3, campoNovoTelefone.getText());

            statement.setString(4, campoNovoEmail.getText());

            statement.setString(5, campoNovoPeso.getText());

            statement.setString(6, (String) campoNovoPlano.getSelectedItem());

            statement.setString(7, campoNomeConsulta.getText()); 
 
            // Executando a atualização

            int rowsAffected = statement.executeUpdate();
 
            // Verificando se houve sucesso na atualização

            if (rowsAffected > 0) {

                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");

            } else {

                JOptionPane.showMessageDialog(this, "Falha ao atualizar dados!");

            }
 
            // Fechando a conexão com o banco de dados

            connection.close();

        } catch (SQLException ex) {

            ex.printStackTrace();

            JOptionPane.showMessageDialog(this, "Erro ao tentar alterar dados: " + ex.getMessage());

        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoNomeConsulta;
    private javax.swing.JTextField campoNovoEmail;
    private javax.swing.JTextField campoNovoEndereco;
    private javax.swing.JTextField campoNovoNome;
    private javax.swing.JTextField campoNovoPeso;
    private javax.swing.JComboBox<String> campoNovoPlano;
    private javax.swing.JTextField campoNovoTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
