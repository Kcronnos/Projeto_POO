package com.mycompany.views;

import com.mycompany.components.FlashCardPanel;
import com.mycompany.controllers.GerenciadorFlashCard;
import com.mycompany.entidades.FlashCard;
import com.mycompany.interfaces.FlashCardPanelInterface;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AdicionarBaralho extends javax.swing.JDialog implements FlashCardPanelInterface{

    private ArrayList<FlashCard> flashCards = new ArrayList<>();
    private JPanel jPanel;
    private FlashCardsTela telaChamou;
    
    public AdicionarBaralho(FlashCardsTela tela) {
        initComponents();
        jPanel = jPanelFlashCard;
        this.telaChamou = tela;
        carregarFlashCards();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoVoltar1 = new javax.swing.JButton();
        descricaoLabel = new javax.swing.JLabel();
        botaoSalvar = new javax.swing.JButton();
        tituloBaralhoLabel = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jTextFieldValorDescricao = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelFlashCard = new javax.swing.JPanel();
        tituloFlashCardsLabel = new javax.swing.JLabel();
        botaoAdicionarFlashcard = new javax.swing.JButton();
        botaoSalvarEPraticar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(160, 241, 234));

        botaoVoltar1.setText("VOLTAR");
        botaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar1ActionPerformed(evt);
            }
        });

        descricaoLabel.setBackground(new java.awt.Color(255, 255, 255));
        descricaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        descricaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        descricaoLabel.setText("DESCRIÇÃO");

        botaoSalvar.setText("SALVAR");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        tituloBaralhoLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloBaralhoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloBaralhoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBaralhoLabel.setText("TITULO");

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("ADICINONAR NOVO BARALHO");

        javax.swing.GroupLayout jPanelFlashCardLayout = new javax.swing.GroupLayout(jPanelFlashCard);
        jPanelFlashCard.setLayout(jPanelFlashCardLayout);
        jPanelFlashCardLayout.setHorizontalGroup(
            jPanelFlashCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
        );
        jPanelFlashCardLayout.setVerticalGroup(
            jPanelFlashCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelFlashCard);

        tituloFlashCardsLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloFlashCardsLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloFlashCardsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloFlashCardsLabel.setText("FLASHCARDS");

        botaoAdicionarFlashcard.setText("+ FLASHCARD");
        botaoAdicionarFlashcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarFlashcardActionPerformed(evt);
            }
        });

        botaoSalvarEPraticar.setText("SALVAR E PRATICAR");
        botaoSalvarEPraticar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarEPraticarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tituloFlashCardsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoVoltar1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(tituloBaralhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldValorDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(59, 59, 59)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(botaoSalvarEPraticar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(184, 184, 184)
                                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 17, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botaoAdicionarFlashcard, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloBaralhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoSalvarEPraticar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tituloFlashCardsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAdicionarFlashcard, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar1ActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltar1ActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        int resposta;

        if (jTextFieldTitulo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Um Baralho\n"
                + "Pois o Titulo Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jTextFieldValorDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Um Baralho\n"
                + "Pois a Descrição Não Foi Definida", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (flashCards.isEmpty()) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Criar Um Baralho Sem adicionar FlashCard?",
                "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        }

        GerenciadorFlashCard.criarBaralho(jTextFieldTitulo.getText(), jTextFieldValorDescricao.getText(), flashCards);
        telaChamou.carregarBaralhos();
        flashCards.clear();
        dispose();
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoAdicionarFlashcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarFlashcardActionPerformed
        AdicionarFlashCard addFlashCard = new AdicionarFlashCard(this);
        addFlashCard.setLocationRelativeTo(this);
        addFlashCard.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        addFlashCard.setVisible(true);
        FlashCard fc = addFlashCard.getFlashCard();
            if (fc != null) {
            adicionarFlashCard(fc);
        }
    }//GEN-LAST:event_botaoAdicionarFlashcardActionPerformed

    private void botaoSalvarEPraticarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarEPraticarActionPerformed
        int resposta;

        if (jTextFieldTitulo.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Um Baralho\n"
                + "Pois o Titulo Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jTextFieldValorDescricao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Um Baralho\n"
                + "Pois a Descrição Não Foi Definida", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (flashCards.isEmpty()) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Criar Um Baralho Sem adicionar FlashCard?",
                "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }else{
                GerenciadorFlashCard.criarBaralho(jTextFieldTitulo.getText(), jTextFieldValorDescricao.getText(), flashCards);
                JOptionPane.showMessageDialog(rootPane, "Não há flashCards Para Praticar");
                telaChamou.carregarBaralhos();
                flashCards.clear();
                dispose();
            }
        }

        int idBaralho = GerenciadorFlashCard.criarBaralho(jTextFieldTitulo.getText(), jTextFieldValorDescricao.getText(), flashCards);
        telaChamou.dispose();
        flashCards.clear();
        FlashCardPraticar pratBaralho = new FlashCardPraticar(GerenciadorFlashCard.procurarBaralho(idBaralho));
        pratBaralho.setLocationRelativeTo(null);
        pratBaralho.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoSalvarEPraticarActionPerformed

    public void deletarFlashCard(FlashCard flashCard){
        flashCards.remove(flashCard);
        carregarFlashCards();
    }
    
    public void adicionarFlashCard(FlashCard flashCard){
        if(flashCard != null){
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionarFlashcard;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSalvarEPraticar;
    private javax.swing.JButton botaoVoltar1;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFlashCard;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldTitulo;
    private javax.swing.JTextField jTextFieldValorDescricao;
    private javax.swing.JLabel tituloBaralhoLabel;
    private javax.swing.JLabel tituloFlashCardsLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
