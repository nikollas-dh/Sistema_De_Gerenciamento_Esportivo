/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.mycompany.projetofinal.FuncoesJogador; 


public class CadastroDeJogador extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastroDeJogador.class.getName());
    private  DefaultListModel<Jogador> listModel = new DefaultListModel<>();
    private final FuncoesJogador funcoes = new FuncoesJogador();

   
    public CadastroDeJogador() {
        initComponents();
        comboBoxTimes = funcoes.preencherComboBox(comboBoxTimes);
        comboBoxTimes2 = funcoes.preencherComboBox(comboBoxTimes2);
        
        listJogador.setModel(listModel);
        listModel = funcoes.preencherListBox(listModel);

    }

//    private static final String URL = "jdbc:mariadb://localhost:3306/projeto_final";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "senai";

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtPosicao = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comboBoxTimes2 = new javax.swing.JComboBox<>();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listJogador = new javax.swing.JList<>();
        comboBoxTimes = new javax.swing.JComboBox<>();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Idade");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Posição");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("CADASTRAR JOGADOR");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Time");

        comboBoxTimes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTimes2ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        listJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listJogadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listJogador);

        comboBoxTimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTimesActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel6.setText("Editar jogadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCadastrar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(comboBoxTimes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(txtPosicao, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(txtIdade))))
                        .addGap(243, 243, 243)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxTimes2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addContainerGap(63, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxTimes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxTimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditar)
                            .addComponent(btnExcluir))))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        try {
        String nome = txtNome.getText();
        String posicao = txtPosicao.getText();
        int idade = Integer.parseInt(txtIdade.getText());

        
        Time selecionado = (Time) comboBoxTimes.getSelectedItem();
        if (selecionado == null) {
            JOptionPane.showMessageDialog(this, "Selecione um time!");
            return;
        }

        int idTime = selecionado.getId(); 
        System.out.println("ID selecionado: " + idTime);

        funcoes.insertJogador(nome, posicao, idade, idTime);
       

        JOptionPane.showMessageDialog(this, "Jogador cadastrado com sucesso!");
        limparCampos();
        comboBoxTimes = funcoes.preencherComboBox(comboBoxTimes);
        comboBoxTimes2 = funcoes.preencherComboBox(comboBoxTimes2);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao cadastrar jogador: " + e.getMessage());
        e.printStackTrace();
    }


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void comboBoxTimes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTimes2ActionPerformed

        Time selecionado = (Time) comboBoxTimes2.getSelectedItem();
        
        if (selecionado != null) {
            DefaultListModel rs = funcoes.preencherListBox(selecionado.getId(), listModel);
            //System.out.println(selecionado.getId());
        } else if (selecionado == null) {
          listModel = funcoes.preencherListBox(listModel);
          limparCampos();
            
        }
        
        //comboBoxTimes.add(sql)
        
    }//GEN-LAST:event_comboBoxTimes2ActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String nome = txtNome.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String posicao = txtPosicao.getText();
        Jogador selecionado = (Jogador) listJogador.getSelectedValue();
        limparCampos();
        funcoes.editarJogador(nome, posicao, idade, selecionado.getId());
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void comboBoxTimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTimesActionPerformed
       
    }//GEN-LAST:event_comboBoxTimesActionPerformed

    private void listJogadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listJogadorMouseClicked
         Jogador selecionado = listJogador.getSelectedValue();
         
        if (selecionado != null) {
           ResultSet rs = funcoes.pesquisarPorIdJogador(selecionado.getId(), comboBoxTimes);
            
            try {
                if(rs.next()){
               //int idJogador = rs.getInt("id_jogador");
               txtNome.setText(rs.getString("nome"));
               txtIdade.setText(rs.getString("idade"));
               txtPosicao.setText(rs.getString("posicao"));
               comboBoxTimes.setSelectedIndex(rs.getInt("id_time"));
               
                
                
            }
            } catch (Exception e) {
                System.out.println("aaa");
            }
        } else if (listJogador.getSelectedIndex() == -1) {
            limparCampos();
        }

            

         else if (listJogador.getSelectedIndex() == -1) {
            limparCampos();
        }
    }//GEN-LAST:event_listJogadorMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
//        String nome = txtNome.getText();
//        int idade = Integer.parseInt(txtIdade.getText());
//        String posicao = txtPosicao.getText();
        Jogador selecionado = (Jogador) listJogador.getSelectedValue();
        funcoes.ExcluirJogador(selecionado.getId());
        limparCampos();
    }//GEN-LAST:event_btnExcluirActionPerformed
    
    public void limparCampos() {
        txtNome.setText("");
        txtIdade.setText("");
        txtPosicao.setText("");
        comboBoxTimes.setSelectedIndex(0);
        comboBoxTimes2.setSelectedIndex(0);
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> new CadastroDeJogador().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JComboBox<Time> comboBoxTimes;
    private javax.swing.JComboBox<Time> comboBoxTimes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Jogador> listJogador;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPosicao;
    // End of variables declaration//GEN-END:variables
}
