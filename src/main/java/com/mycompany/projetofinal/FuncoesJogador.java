/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import com.mycompany.projetofinal.Conexoes;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author 25163093
 */
public class FuncoesJogador {
    
  public static Conexoes conect = new Conexoes();
  //private final DefaultListModel<Jogador> listModel = new DefaultListModel<>();
    public void ExcluirJogador(int idJogador){
       
        String sql = "DELETE FROM jogador WHERE id_jogador = ?";
        try (Connection conn = conect.getConnection(); 
         PreparedStatement pst = conn.prepareStatement(sql)) {
      
        pst.setInt(1, idJogador);
        int linhasAfetadas = pst.executeUpdate(); 
        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Jogador removido com sucesso!");
        } else {
            System.out.println("Nenhum jogador encontrado com esse ID.");
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir jogador: " + e.getMessage());
        }
    }
    
    public void insertJogador(String nome, String posicao, int idade, int idTime) {
        String sql = "INSERT INTO jogador (nome, posicao, idade, id_time) VALUES (?, ?, ?, ?)";

        try (Connection conn = conect.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, nome);
            pstmt.setString(2, posicao);
            pstmt.setInt(3, idade);
            pstmt.setInt(4, idTime);

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        long id = generatedKeys.getLong(1);
                        System.out.println("User inserted with ID: " + id);
                    }
                }
            }

        } catch (SQLException e) {
            System.err.println("Error inserting user: " + e.getMessage());
        }
    }
    
    
    protected JComboBox preencherComboBox(JComboBox comboBoxTimes) {
        String sql = "SELECT id_time, nome FROM time"; 
        try (Connection conn = conect.getConnection(); 
            PreparedStatement pst = conn.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery()) {

            comboBoxTimes.removeAllItems(); 
           // comboBoxTimes2.removeAllItems();

            comboBoxTimes.addItem(null);   
//            comboBoxTimes2.addItem(null);

            while (rs.next()) {

                int id = rs.getInt("id_time");
                String nome = rs.getString("nome");

                Time time = new Time(id, nome);

                comboBoxTimes.addItem(time);
//                comboBoxTimes2.addItem(time);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar times: " + e.getMessage());
        }
        return comboBoxTimes;
    }
    
    protected DefaultListModel preencherListBox(int idTime, DefaultListModel<Jogador> listModel) {
        String sql = "SELECT id_jogador, nome FROM jogador WHERE id_time = ?";
        System.out.println("aaa");
        try (Connection conn = conect.getConnection(); 
            PreparedStatement pst = conn.prepareStatement(sql); 
            ) {
            pst.setInt(1, idTime);
            ResultSet rs = pst.executeQuery();
            listModel.clear(); 
            while (rs.next()) {
                int id = rs.getInt("id_jogador");
                String nome = rs.getString("nome");
                listModel.addElement(new Jogador(id, nome));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar times: " + e.getMessage());
        }
        return listModel;
    }

    protected DefaultListModel preencherListBox( DefaultListModel<Jogador> listModel) {
        String sql = "SELECT id_jogador, nome FROM jogador";
        
        try (Connection conn = conect.getConnection(); 
            PreparedStatement pst = conn.prepareStatement(sql); 
            ResultSet rs = pst.executeQuery()) {

            listModel.clear(); 
            while (rs.next()) {
                int id = rs.getInt("id_jogador");
                String nome = rs.getString("nome");
                listModel.addElement(new Jogador(id, nome));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar times: " + e.getMessage());
        }
        return listModel;
    }

    public void editarJogador(String nome, String posicao, int idade, int idJogador) {
        String sql = "UPDATE jogador SET nome = ?, posicao = ?, idade = ? WHERE id_jogador = ?";
        try (Connection conn = conect.getConnection(); 
            PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, nome);
            pst.setString(2, posicao);
            pst.setInt(3, idade);
            pst.setInt(4, idJogador);

            int linhasAfetadas = pst.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Jogador atualizado com sucesso!");
            } else {
                System.out.println("Nenhum jogador encontrado com esse ID.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar jogadores: " + e.getMessage());
        }
    }

    public ResultSet pesquisarPorIdTime(int idTime, DefaultListModel<Jogador> listModel) {
    String sql = "SELECT id_jogador, nome, posicao, idade FROM jogador WHERE id_time = ?";
    try (Connection conn = conect.getConnection();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setInt(1, idTime);
        ResultSet rs = pst.executeQuery();

        listModel.clear();
        while (rs.next()) {
            int idJogador = rs.getInt("id_jogador");
            String nome = rs.getString("nome");
            String posicao = rs.getString("posicao");
            int idade = rs.getInt("idade");

            
            listModel.addElement(new Jogador(idJogador, nome));
        }
      return rs;
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao carregar jogadores: " + e.getMessage());
    }
    return null;
}

    public ResultSet pesquisarPorIdJogador(int id,JComboBox comboBoxTimes) {
        String sql = "SELECT nome, posicao, idade, id_time FROM jogador WHERE id_jogador = ?";
        try (Connection conn = conect.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            System.out.println(id);
//            if (rs.next()) {
//                int idTime = rs.getInt("id_time"); 
//                for (int i = 0; i < comboBoxTimes.getItemCount(); i++) {
//                    Time t = (Time)comboBoxTimes.getItemAt(i);
//                    if (t != null && t.getId() == idTime) {
//                        comboBoxTimes.setSelectedIndex(i);
//                        break;
//                    }
//                }
//                
//                //comboBoxTimes.setSelectedIndex(rs.getString("idade"));
//                return rs;
//            }
          return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar times: " + e.getMessage());
        }
        return null;
    }
    
}
