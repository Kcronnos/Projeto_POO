package com.mycompany.entidades;

/**
 *
 * @author leog4
 */
public class FlashCard {
    
    private int id;
    private String pergunta;
    private String resposta;
    private int idBaralho;
    
    public FlashCard(int id, String pergunta, String resposta, int idBaralho){
        this.id = id;
        this.pergunta = pergunta;
        this.resposta = resposta;
        this.idBaralho = idBaralho;
    }
    
    public FlashCard(String pergunta, String resposta){
        this.pergunta = pergunta;
        this.resposta = resposta;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
    }
    
    public String getPergunta(){
        return pergunta;
    }
    
    public void setResposta(String resposta){
        this.resposta = resposta;
    }
    
    public String getResposta(){
        return resposta;
    }
    
    public void setIdBaralho(int idBaralho){
        this.idBaralho = idBaralho;
    }
    
    public int getIdBaralho(){
        return idBaralho;
    }
}
