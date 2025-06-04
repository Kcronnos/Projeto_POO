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
public class Baralho {
    
    private int id;
    private String titulo;
    private String descricao;
    private ArrayList<FlashCard> flashCards;
    
    public Baralho(int id, String titulo, String descricao, ArrayList flashCards){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.flashCards = flashCards;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setFlashCards(ArrayList<FlashCard> flashCards){
        this.flashCards = flashCards;
    }
    
    public ArrayList<FlashCard> getFlashCards(){
        return flashCards;
    }
}
