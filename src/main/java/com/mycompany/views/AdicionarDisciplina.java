package com.mycompany.views;

import com.mycompany.components.AvaliacaoCardPanelMenor;
import com.mycompany.components.DisciplinaCardPanel;
import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Avaliacao;
import com.mycompany.entidades.Disciplina;
import com.mycompany.entidades.Periodo;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 *
 * @author leog4
 */
public class AdicionarDisciplina extends javax.swing.JDialog {

    private static ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
    private Periodo periodo;
    private JPanel painel;
    private static JPanel jPanel;
    
    public AdicionarDisciplina(Periodo periodo, JPanel painel) {
        this.periodo = periodo;
        this.painel = painel;
        initComponents();
        jPanel = jPanelAvaliacoes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botaoVoltar1 = new javax.swing.JButton();
        mediaAprovarLabel = new javax.swing.JLabel();
        botaoAdicionar = new javax.swing.JButton();
        nomeDisciplinaLabel = new javax.swing.JLabel();
        jTextFieldNomeDisciplina = new javax.swing.JTextField();
        jTextFieldValorMediaAprovar = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelAvaliacoes = new javax.swing.JPanel();
        tituloAvaliacoesLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(160, 241, 234));

        botaoVoltar1.setText("VOLTAR");
        botaoVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar1ActionPerformed(evt);
            }
        });

        mediaAprovarLabel.setBackground(new java.awt.Color(255, 255, 255));
        mediaAprovarLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mediaAprovarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mediaAprovarLabel.setText("MÉDIA PARA APROVAÇÃO");

        botaoAdicionar.setText("ADICIONAR");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        nomeDisciplinaLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomeDisciplinaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nomeDisciplinaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeDisciplinaLabel.setText("NOME DA DISCIPLINA");

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("ADICINONAR NOVA DISCIPLINA");

        javax.swing.GroupLayout jPanelAvaliacoesLayout = new javax.swing.GroupLayout(jPanelAvaliacoes);
        jPanelAvaliacoes.setLayout(jPanelAvaliacoesLayout);
        jPanelAvaliacoesLayout.setHorizontalGroup(
            jPanelAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanelAvaliacoesLayout.setVerticalGroup(
            jPanelAvaliacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelAvaliacoes);

        tituloAvaliacoesLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloAvaliacoesLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloAvaliacoesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloAvaliacoesLabel.setText("AVALIAÇÕES");

        jButton1.setText("+ AVALIAÇÃO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(botaoVoltar1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(nomeDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jTextFieldNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldValorMediaAprovar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(475, Short.MAX_VALUE)
                    .addComponent(tituloAvaliacoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(botaoVoltar1)
                        .addGap(79, 79, 79)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValorMediaAprovar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(tituloAvaliacoesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(360, Short.MAX_VALUE)))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar1ActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltar1ActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        int resposta;

        if (jTextFieldNomeDisciplina.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Uma Disciplina\n"
                + "Pois o Nome da Disciplina Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jTextFieldValorMediaAprovar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Uma Disciplina\n"
                + "Pois o Média da Disciplina Não Foi Definida", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (avaliacoes.isEmpty()) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Criar Uma Disciplina Sem Atribuir Avaliação?",
                "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        }

        Double media = null;
        String mediaTexto = jTextFieldValorMediaAprovar.getText().trim();
        
        try {
            media = Double.parseDouble(mediaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nota inválida. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        int idDisciplina = GerenciadorPeriodos.criarDisciplina(jTextFieldNomeDisciplina.getText(), media, avaliacoes, periodo.getId());

        if (idDisciplina > 0) {
            Disciplina disciplina = new Disciplina(idDisciplina, jTextFieldNomeDisciplina.getText(), media, avaliacoes, periodo.getId());
            DisciplinaCardPanel card = new DisciplinaCardPanel(disciplina);
            painel.add(card);
            painel.revalidate();
            painel.repaint();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao criar avaliação", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AdicionarAvaliacaoComDisciplina addDis = new AdicionarAvaliacaoComDisciplina(this, jPanelAvaliacoes);
        addDis.setLocationRelativeTo(this);
        addDis.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        addDis.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void deletarAvaliacao(Avaliacao avaliacao){
        avaliacoes.remove(avaliacao);
        carregarAvaliacoes();
    }
    
    public static void adicionarAvaliacao(Avaliacao avaliacao){
        if(avaliacao != null){
            avaliacoes.add(avaliacao);
            carregarAvaliacoes();
        }
    }
    
    public static void carregarAvaliacoes(){
            jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
            jPanel.removeAll();

            for(Avaliacao avaliacao: avaliacoes){
                AvaliacaoCardPanelMenor card = new AvaliacaoCardPanelMenor(avaliacao);
                card.setPreferredSize(new Dimension(card.getPreferredSize().width, card.getPreferredSize().height));
                jPanel.add(card);
            }

            jPanel.revalidate();
            jPanel.repaint();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoVoltar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAvaliacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNomeDisciplina;
    private javax.swing.JTextField jTextFieldValorMediaAprovar;
    private javax.swing.JLabel mediaAprovarLabel;
    private javax.swing.JLabel nomeDisciplinaLabel;
    private javax.swing.JLabel tituloAvaliacoesLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
