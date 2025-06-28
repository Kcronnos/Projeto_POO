package com.mycompany.controllers;

import com.mycompany.dal.ModuloConexao;
import com.mycompany.entidades.Avaliacao;
import com.mycompany.entidades.Disciplina;
import com.mycompany.entidades.Periodo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author leog4
 */
public class GerenciadorPeriodos {
    
    private static Connection conexao = ModuloConexao.conector();
    
    public static int criarperiodo(String nome, Date inicioPeriodo, Date finalPeriodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        java.sql.Date dataSQLinicioPeriodo = new java.sql.Date(inicioPeriodo.getTime());
        java.sql.Date dataSQLfinalPeriodo = new java.sql.Date(finalPeriodo.getTime());
        String sql = "insert into Periodos(nome, inicioPeriodo, finalPeriodo) values(?,?,?)";
        int idPeriodo = -1;
        
        try {
            pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, nome);
            pst.setDate(2, new java.sql.Date(dataSQLinicioPeriodo.getTime()));
            pst.setDate(3, new java.sql.Date(dataSQLfinalPeriodo.getTime()));
            pst.executeUpdate();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                idPeriodo = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return idPeriodo;
    }
    
    public static Periodo buscarPeriodo(int idPeriodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, nome, inicioPeriodo, finalPeriodo from Periodos where id = ?";
        Periodo periodo = null;
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idPeriodo);
            rs = pst.executeQuery();
            
            if(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date inicioPeriodo = new java.util.Date(rs.getDate("inicioPeriodo").getTime());
                Date finalPeriodo = new java.util.Date(rs.getDate("finalPeriodo").getTime());
                ArrayList<Disciplina> disciplinas = listarDisciplinas(idPeriodo);
                
                periodo = new Periodo(id, nome, inicioPeriodo, finalPeriodo, disciplinas);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return periodo;
    }
    
    public static void atualizarPeriodo(Periodo periodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "update Periodos set nome = ?, inicioPeriodo = ?, finalPeriodo = ? where id = ?";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, periodo.getNome());
            pst.setDate(2, new java.sql.Date(periodo.getInicioPeriodo().getTime()));
            pst.setDate(3, new java.sql.Date(periodo.getFinalPeriodo().getTime()));
            pst.setInt(4, periodo.getId());
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Periodo> listarPeriodos(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, nome, inicioPeriodo, finalPeriodo from Periodos";
        ArrayList<Periodo> periodos = new ArrayList();
        
        try{
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date inicioPeriodo = new java.util.Date(rs.getDate("inicioPeriodo").getTime());
                Date finalPeriodo = new java.util.Date(rs.getDate("finalPeriodo").getTime());
                ArrayList<Disciplina> Disciplinas = new ArrayList<>();
                Disciplinas = listarDisciplinas(id);
                
                Periodo periodo = new Periodo(id, nome, inicioPeriodo, finalPeriodo, Disciplinas);
                periodos.add(periodo);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return periodos;
    }
    
    public static int DeletarPeriodo(Periodo periodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        int removido = -1;
        
        String sql = "delete from Periodos where id = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, periodo.getId());
                removido = pst.executeUpdate();
                if (removido > 0) {
                    JOptionPane.showMessageDialog(null, "Periodo: " + periodo.getNome() + " Deletado com Sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            return removido;
    }
    
    public static int criarDisciplina(String nome, double mediaAprovar, ArrayList<Avaliacao> avaliacoes, int idPeriodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        int idDisciplina = -1;
        
        String sql;
        
        if(avaliacoes.isEmpty()){
            
            sql = "insert into Disciplinas(nome, mediaAprovar, idPeriodo) values(?,?,?)";
        
            try {
            pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, nome);
            pst.setDouble(2, mediaAprovar);
            pst.setInt(3, idPeriodo);
            pst.executeUpdate();
            
            rs = pst.getGeneratedKeys();
            if(rs.next()){
                idDisciplina = rs.getInt(1);
            }
            
            } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
        }else{
            
            sql = "insert into Disciplinas(nome, mediaAprovar, idPeriodo) values(?,?,?)";
        
            try {
            pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, nome);
            pst.setDouble(2, mediaAprovar);
            pst.setInt(3, idPeriodo);
            pst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            try {
                rs = pst.getGeneratedKeys();
                if(rs.next()){
                    idDisciplina = rs.getInt(1);
                    criarAvaliacoes(idDisciplina, avaliacoes);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        }
        
        return idDisciplina;
    }
    
    public static void atualizarDisciplina(Disciplina disciplina){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "update Disciplinas set nome = ?, mediaAprovar = ? where id = ?";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, disciplina.getNome());
            pst.setDouble(2, disciplina.getMediaAprovar());
            pst.setInt(3, disciplina.getId());
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Disciplina> listarDisciplinas(int idPeriodo){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, nome, mediaAprovar from Disciplinas where idPeriodo = ?";
        ArrayList<Disciplina> disciplinas = new ArrayList();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idPeriodo);
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double mediaAprovar = rs.getDouble("mediaAprovar");
                ArrayList<Avaliacao> avaliacoes = new ArrayList();
                avaliacoes = buscarAvaliacaoDaDisciplina(id);
                
                Disciplina disciplina = new Disciplina(id, nome, mediaAprovar, avaliacoes, idPeriodo);
                disciplinas.add(disciplina);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
            return disciplinas;
    }
    
    public static int DeletarDisciplina(Disciplina disciplina){
        PreparedStatement pst = null;
        ResultSet rs = null;
        int removido = -1;
        
        String sql = "delete from Disciplinas where id = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, disciplina.getId());
                removido = pst.executeUpdate();
                if (removido > 0) {
                    JOptionPane.showMessageDialog(null, "Periodo: " + disciplina.getNome() + " Deletado com Sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            return removido;
    }
    
    public static void criarAvaliacoes(int idDisciplina, ArrayList<Avaliacao> avaliacoes){

        for(Avaliacao avaliacao: avaliacoes){
            int idAvaliacao = criarAvaliacao(idDisciplina, avaliacao.getNome(), avaliacao.getDataAvaliacao(), avaliacao.getNotaAvaliacao());
        }   
    }
    
    public static int criarAvaliacao(int idDisciplina, String nome, Date dataAvaliacao, double notaAvaliacao){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        int idAvaliacao = -1;
        
        if(notaAvaliacao == -1){
            String sql = "insert into Avaliacoes(nome, dataAvaliacao, idDisciplina) values(?,?,?)";

            try {
                pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, nome);
                pst.setDate(2, new java.sql.Date(dataAvaliacao.getTime()));
                pst.setInt(3, idDisciplina);
                pst.executeUpdate();
                rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    idAvaliacao = rs.getInt(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }else{
            String sql = "insert into Avaliacoes(nome, dataAvaliacao, notaAvaliacao, idDisciplina) values(?,?,?,?)";

            try {
                pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pst.setString(1, nome);
                pst.setDate(2, new java.sql.Date(dataAvaliacao.getTime()));
                pst.setDouble(3, notaAvaliacao);
                pst.setInt(4, idDisciplina);
                pst.executeUpdate();
                rs = pst.getGeneratedKeys();
                if (rs.next()) {
                    idAvaliacao = rs.getInt(1);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        return idAvaliacao;
    }
    
    public static void atualizarAvaliacao(Avaliacao avaliacao){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "update Avaliacoes set nome = ?, dataAvaliacao = ?, notaAvaliacao = ? where id = ?";
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, avaliacao.getNome());
            if (avaliacao.getDataAvaliacao() != null) {
                pst.setDate(2, new java.sql.Date(avaliacao.getDataAvaliacao().getTime()));
            } else {
                pst.setNull(2, java.sql.Types.DATE);
            }
            pst.setDouble(3, avaliacao.getNotaAvaliacao());
            pst.setInt(4, avaliacao.getId());
            pst.executeUpdate();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public static Avaliacao buscarAvaliacao(int idAvaliacao){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, nome, dataAvaliacao, notaAvaliacao, idDisciplina from Avaliacoes where id = ?";
        Avaliacao avaliacao = null;
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idAvaliacao);
            rs = pst.executeQuery();
            
            if(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date dataAvaliacao = new java.util.Date(rs.getDate("dataAvaliacao").getTime());
                double notaAvaliacao = rs.getDouble("notaAvaliacao");
                int idDisciplina = rs.getInt("idDisciplina");

                avaliacao = new Avaliacao(id, nome, dataAvaliacao, notaAvaliacao, idDisciplina);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return avaliacao;
    }
    
    public static ArrayList<Avaliacao> buscarAvaliacaoDaDisciplina(int idDisciplina){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        String sql = "Select id, nome, dataAvaliacao, notaAvaliacao from Avaliacoes where idDisciplina = ?";
        ArrayList<Avaliacao> avaliacoes = new ArrayList();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, idDisciplina);
            rs = pst.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                Date dataAvaliacao = new java.util.Date(rs.getDate("dataAvaliacao").getTime());
                double notaAvaliacao = rs.getDouble("notaAvaliacao");
                
                Avaliacao avaliacao = new Avaliacao(id, nome, dataAvaliacao, notaAvaliacao, idDisciplina);
                
                avaliacoes.add(avaliacao);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return avaliacoes;
    }
    
    public static int DeletarAvaliacao(Avaliacao avaliacao){
        PreparedStatement pst = null;
        ResultSet rs = null;
        int removido = -1;
        
        String sql = "delete from Avaliacoes where id = ?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, avaliacao.getId());
                removido = pst.executeUpdate();
                if (removido > 0) {
                    JOptionPane.showMessageDialog(null, "Periodo: " + avaliacao.getNome() + " Deletado com Sucesso");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
            return removido;
    }
}
