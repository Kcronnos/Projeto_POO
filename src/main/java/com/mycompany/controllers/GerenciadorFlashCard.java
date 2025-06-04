package com.mycompany.controllers;

import com.mycompany.dal.ModuloConexao;
import com.mycompany.entidades.Baralho;
import com.mycompany.entidades.FlashCard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author leog4
 */
public class GerenciadorFlashCard {
    
    static Connection conexao = ModuloConexao.conector();
    
    public static void criarFlashCard(String pergunta, String resposta, int idBaralho){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "insert into FlashCards(pergunta, resposta, idBaralho) values(?,?,?)";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, pergunta);
            pst.setString(2, resposta);
            pst.setInt(3, idBaralho);
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static ArrayList<FlashCard> buscarFlashCards(int idBaralho){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, pergunta, resposta from FlashCards where idBaralho = ?";
        ArrayList<FlashCard> flashCards = new ArrayList<>();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idBaralho);
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String pergunta = rs.getString("pergunta");
                String resposta = rs.getString("resposta");

                FlashCard flashCard = new FlashCard(id, pergunta, resposta, idBaralho);
                flashCards.add(flashCard);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return flashCards;
    }
    
    public static void deletarFlashCard(FlashCard flashCard){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "delete from FlashCards where id=?";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, flashCard.getId());
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static int criarBaralho(String titulo, String descricao, ArrayList<FlashCard> flashCards){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "insert into Baralhos(titulo, descricao) values(?,?)";
        int idBaralho = -1;
        
        try{
            pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, titulo);
            pst.setString(2, descricao);
            pst.executeUpdate();
            
            rs = pst.getGeneratedKeys();
            
            if(rs.next()){
                idBaralho = rs.getInt(1);
            }
            for(FlashCard flashCard: flashCards){
                criarFlashCard(flashCard.getPergunta(), flashCard.getResposta(),idBaralho);
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return idBaralho;
    }
    
    public static ArrayList<Baralho> listarBaralhos(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, titulo, descricao from Baralhos";
        ArrayList<Baralho> baralhos = new ArrayList();
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                ArrayList<FlashCard> flashCards = new ArrayList<>();
                flashCards = buscarFlashCards(id);
                
                Baralho baralho = new Baralho(id, titulo, descricao, flashCards);
                baralhos.add(baralho);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return baralhos;
    }
    
    public static int deletarBaralho(Baralho baralho){
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "delete from Baralhos where id=?";
        int resultado = -1;
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, baralho.getId());
            resultado = pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return resultado;
    }
    
    public static void adicionarCardBaralho(Baralho baralho, ArrayList<FlashCard> flashCars){
        
    }
}
