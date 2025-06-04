/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.util.Date;

/**
 *
 * @author leog4
 */
public class Avaliacao {
    
    private int id;
    private String nome;
    private Date dataAvaliacao;
    private double notaAvaliacao;
    private int idDisciplina;
    
    public Avaliacao(int id, String nome, Date dataAvaliacao, double notaAvaliacao, int idDisciplina){
        this.id = id;
        this.nome = nome;
        this.dataAvaliacao = dataAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
        this.idDisciplina = idDisciplina;
    }
    
    public Avaliacao(String nome, Date dataAvaliacao, double notaAvaliacao){
        this.nome = nome;
        this.dataAvaliacao = dataAvaliacao;
        this.notaAvaliacao = notaAvaliacao;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setDataAvaliacao(Date dataAvaliacao){
        this.dataAvaliacao = dataAvaliacao;
    }
    
    public Date getDataAvaliacao(){
        return dataAvaliacao;
    }
    
    public void setNotaAvaliacao(double NotaAvaliacao){
        this.notaAvaliacao = notaAvaliacao;
    }
    
    public double getNotaAvaliacao(){
        return notaAvaliacao;
    }
    
    public void setIdDisciplina(int idDisciplina){
        this.idDisciplina = idDisciplina;
    }
    
    public int getIdDisciplina(){
        return idDisciplina;
    }
}
