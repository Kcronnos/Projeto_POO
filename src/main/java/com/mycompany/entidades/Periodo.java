/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author leog4
 */
public class Periodo {
    
    private int id;
    private String nome;
    private Date inicioPeriodo;
    private Date finalPeriodo;
    private ArrayList<Disciplina> disciplinas;
    
    public Periodo(int id, String nome, Date inicioPeriodo, Date finalPeriodo, ArrayList<Disciplina> disciplinas){
        this.id = id;
        this.nome = nome;
        this.inicioPeriodo = inicioPeriodo;
        this.finalPeriodo = finalPeriodo;
        this.disciplinas = disciplinas;
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
    
    public void setInicioPeriodo(Date inicioPeriodo){
        this.inicioPeriodo = inicioPeriodo;
    }
    
    public Date getInicioPeriodo(){
        return inicioPeriodo;
    }
    
    public void setFinalPeriodo(Date finalPeriodo){
        this.finalPeriodo = finalPeriodo;
    }
    
    public Date getFinalPeriodo(){
        return finalPeriodo;
    }
    
    public void setDisciplinas(ArrayList<Disciplina> disciplinas){
        this.disciplinas = disciplinas;
    }
    
    public ArrayList<Disciplina> getDisciplinas(){
        return disciplinas;
    }
}
