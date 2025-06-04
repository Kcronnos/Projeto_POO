/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.util.ArrayList;

/**
 *
 * @author leog4
 */
public class Disciplina {
    
    private int id;
    private String nome;
    private double mediaAprovar;
    private ArrayList<Avaliacao> avaliacoes;
    private int idPeriodo;
    
    public Disciplina(int id, String nome, double mediaAprovar, ArrayList<Avaliacao> avaliacoes, int idPeriodo){
        this.id = id;
        this.nome = nome;
        this.mediaAprovar = mediaAprovar;
        this.avaliacoes = avaliacoes;
        this.idPeriodo = idPeriodo;
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
    
    public void setMediaAprovar(double mediaAprovar){
        this.mediaAprovar = mediaAprovar;
    }
    
    public double getMediaAprovar(){
        return mediaAprovar;
    }
    
    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes){
        this.avaliacoes = avaliacoes;
    }
    
    public ArrayList<Avaliacao> getAvaliacoes(){
        return avaliacoes;
    }
    
    public void setIdPeriodo(int idPeriodo){
        this.idPeriodo = idPeriodo;
    }
    
    public int getIdPeriodo(){
        return idPeriodo;
    }
}
