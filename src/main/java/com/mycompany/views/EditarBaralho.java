/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.components.FlashCardPanel;
import com.mycompany.controllers.GerenciadorFlashCard;
import com.mycompany.entidades.Baralho;
import com.mycompany.entidades.FlashCard;
import com.mycompany.interfaces.FlashCardPanelInterface;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author leog4
 */
public class EditarBaralho extends javax.swing.JDialog implements FlashCardPanelInterface {

    private JPanel jPanel;
    private ArrayList<FlashCard> flashCards = new ArrayList<>();
    private Baralho baralho;
    
    public EditarBaralho(Baralho baralho) {
        initComponents();
        GerenciadorFlashCard gerenciador = new GerenciadorFlashCard();
        this.flashCards = gerenciador.buscarFlashCards(baralho.getId());
        this.baralho = baralho;
        jPanel = jPanelFlashCard;
        
        carregarFlashCards();
        carregarDadosBaralho();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelFlashCard = new javax.swing.JPanel();
        tituloFlashCardsLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        botaoSalvarEPraticar = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();
        jTextFieldValorDescricao = new javax.swing.JTextField();
        tituloBaralhoLabel = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(160, 241, 234));

        javax.swing.GroupLayout jPanelFlashCardLayout = new javax.swing.GroupLayout(jPanelFlashCard);
        jPanelFlashCard.setLayout(jPanelFlashCardLayout);
        jPanelFlashCardLayout.setHorizontalGroup(
            jPanelFlashCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 774, Short.MAX_VALUE)
        );
        jPanelFlashCardLayout.setVerticalGroup(
            jPanelFlashCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelFlashCard);

        tituloFlashCardsLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloFlashCardsLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloFlashCardsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFlashCardsLabel.setText("FLASHCARDS");

        jButton2.setText("+ FLASHCARD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        botaoSalvarEPraticar.setText("SALVAR E PRATICAR");

        descricaoLabel.setBackground(new java.awt.Color(255, 255, 255));
        descricaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descricaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaoLabel.setText("DESCRIÇÃO");

        tituloBaralhoLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloBaralhoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloBaralhoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBaralhoLabel.setText("TITULO");

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("EDITAR BARALHO");

        jButton1.setText("VOLTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloBaralhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSalvarEPraticar)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloFlashCardsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1)
                .addGap(10, 10, 10)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloBaralhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValorDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSalvarEPraticar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloFlashCardsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        int resposta;

        if (jTextFieldTitulo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não é Possível Salvar o Baralho\n"
                + "Pois o Titulo Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jTextFieldValorDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não é Possível Salvar o Baralho\n"
                + "Pois a Descrição Não Foi Definida", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (flashCards.isEmpty()) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Deixar o Baralho Sem FlashCard?",
                "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        }
        
        flashCards.clear();
        dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdicionarFlashCard addFlashCard = new AdicionarFlashCard(this);
        addFlashCard.setLocationRelativeTo(this);
        addFlashCard.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        addFlashCard.setVisible(true);
        
        FlashCard fc = addFlashCard.getFlashCard();
            if (fc != null) {
            adicionarFlashCard(fc);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void deletarFlashCard(FlashCard flashCard){
        flashCards.remove(flashCard);
        GerenciadorFlashCard.deletarFlashCard(flashCard);
        carregarFlashCards();
    }
    
    public void adicionarFlashCard(FlashCard flashCard){
        if(flashCard != null){
            GerenciadorFlashCard.criarFlashCard(flashCard.getPergunta(), flashCard.getResposta(), baralho.getId());
            flashCards.add(flashCard);
            carregarFlashCards();
        }
    }
    public  void carregarFlashCards(){
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
            jPanel.removeAll();

            for(FlashCard flashCard: flashCards){
                FlashCardPanel card = new FlashCardPanel(flashCard, this);
                card.setPreferredSize(new Dimension(card.getPreferredSize().width, card.getPreferredSize().height));
                jPanel.add(card);
            }

            jPanel.revalidate();
            jPanel.repaint();
    }
    
    private void carregarDadosBaralho() {
        if (baralho != null) {
            jTextFieldTitulo.setText(baralho.getTitulo());
            jTextFieldValorDescricao.setText(baralho.getDescricao());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSalvarEPraticar;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFlashCard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldValorDescricao;
    private javax.swing.JLabel tituloBaralhoLabel;
    private javax.swing.JLabel tituloFlashCardsLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
