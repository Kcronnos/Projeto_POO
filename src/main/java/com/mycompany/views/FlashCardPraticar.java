/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.controllers.GerenciadorFlashCard;
import com.mycompany.entidades.Baralho;
import com.mycompany.entidades.FlashCard;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author leog4
 */
public class FlashCardPraticar extends javax.swing.JFrame {

    private ArrayList<FlashCard> flashCards = new ArrayList<>();
    private Baralho baralho;
    private int contador;
    private boolean botaoResposta;
    
    public FlashCardPraticar(Baralho baralho) {
        initComponents();
        this.contador = 0;
        this.botaoResposta = true;
        this.baralho = baralho;
        this.flashCards = GerenciadorFlashCard.buscarFlashCards(baralho.getId());
        tituloBaralhoLabel.setText(baralho.getTitulo());
        descricaoLabel.setText(baralho.getDescricao());
        StyledDocument doc = areaDoTextoCard.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, 1, center, false);
        areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cartaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDoTextoCard = new javax.swing.JTextPane();
        tituloCardLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        butaoVoltar = new javax.swing.JButton();
        tituloBaralhoLabel = new javax.swing.JLabel();
        butaoProximaPergunta = new javax.swing.JButton();
        butaoResposta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(160, 241, 234));

        areaDoTextoCard.setToolTipText("");
        areaDoTextoCard.setEnabled(false);
        jScrollPane1.setViewportView(areaDoTextoCard);

        tituloCardLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tituloCardLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloCardLabel.setText("PERGUNTA");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setToolTipText("");

        javax.swing.GroupLayout cartaPanelLayout = new javax.swing.GroupLayout(cartaPanel);
        cartaPanel.setLayout(cartaPanelLayout);
        cartaPanelLayout.setHorizontalGroup(
            cartaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartaPanelLayout.createSequentialGroup()
                .addGroup(cartaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartaPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(tituloCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cartaPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        cartaPanelLayout.setVerticalGroup(
            cartaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cartaPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tituloCardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        butaoVoltar.setText("VOLTAR");
        butaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoVoltarActionPerformed(evt);
            }
        });

        tituloBaralhoLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        tituloBaralhoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBaralhoLabel.setText("TITULO");

        butaoProximaPergunta.setText("PROXIMA PERGUNTA ->");
        butaoProximaPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoProximaPerguntaActionPerformed(evt);
            }
        });

        butaoResposta.setText("VER RESPOSTA");
        butaoResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaoRespostaActionPerformed(evt);
            }
        });

        jButton1.setText("<- PERGUNTA ANTERIOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        descricaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaoLabel.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(butaoVoltar)
                        .addGap(197, 197, 197)
                        .addComponent(tituloBaralhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butaoResposta)
                                .addGap(106, 106, 106)
                                .addComponent(butaoProximaPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cartaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butaoVoltar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 9, Short.MAX_VALUE)
                                .addComponent(tituloBaralhoLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descricaoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cartaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butaoProximaPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butaoResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_butaoVoltarActionPerformed

    private void butaoProximaPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoProximaPerguntaActionPerformed
        contador++;
        if(contador == flashCards.size()){
            contador = flashCards.size() - 1;
            JOptionPane.showMessageDialog(cartaPanel, "Não há mais FlashCards");
            butaoResposta.setText("VER RESPOSTA");
            areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
            tituloCardLabel.setText("PERGUNTA");
            botaoResposta = true;
        }else{
            butaoResposta.setText("VER RESPOSTA");
            areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
            tituloCardLabel.setText("PERGUNTA");
            botaoResposta = true;
        }
        
    }//GEN-LAST:event_butaoProximaPerguntaActionPerformed

    private void butaoRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butaoRespostaActionPerformed
        if(botaoResposta == true){
            butaoResposta.setText("VER PERGUNTA");
            areaDoTextoCard.setText(flashCards.get(contador).getResposta());
            tituloCardLabel.setText("RESPOSTA");
            botaoResposta = false;
        }else{
            butaoResposta.setText("VER RESPOSTA");
            areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
            tituloCardLabel.setText("PERGUNTA");
            botaoResposta = true;
        }
    }//GEN-LAST:event_butaoRespostaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contador--;
        if(contador < 0){
            contador = 0;
            JOptionPane.showMessageDialog(cartaPanel, "Esse é o primeiro FlashCards");
            butaoResposta.setText("VER RESPOSTA");
            areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
            tituloCardLabel.setText("PERGUNTA");
            botaoResposta = true;
        }else{
            butaoResposta.setText("VER RESPOSTA");
            areaDoTextoCard.setText(flashCards.get(contador).getPergunta());
            tituloCardLabel.setText("PERGUNTA");
            botaoResposta = true;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaDoTextoCard;
    private javax.swing.JButton butaoProximaPergunta;
    private javax.swing.JButton butaoResposta;
    private javax.swing.JButton butaoVoltar;
    private javax.swing.JPanel cartaPanel;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tituloBaralhoLabel;
    private javax.swing.JLabel tituloCardLabel;
    // End of variables declaration//GEN-END:variables
}
