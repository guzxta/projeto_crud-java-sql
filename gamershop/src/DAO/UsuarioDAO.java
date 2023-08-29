/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author gu_si
 */
public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarUsuario(UsuarioDTO novoUsuariodto) {

        String sql = "insert into usuario (email, nome, senha) values (?, ?, ?)";
        conn = new Conexao().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, novoUsuariodto.getEmail());
            pstm.setString(2, novoUsuariodto.getNome());
            pstm.setString(3, novoUsuariodto.getSenha());
            
            pstm.execute();
            pstm.close();
         
            

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAo" + erro);
        }

    }
    
    public void DeletarUSer (UsuarioDTO deleteUserdto){
        
        String sql = "delete from usuario where id = ?;";
        conn = new Conexao().conectaBD();
        
         try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, deleteUserdto.getId());
            pstm.execute();
            pstm.close();
         
            

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAo" + erro);
        }

    }
        

    }


