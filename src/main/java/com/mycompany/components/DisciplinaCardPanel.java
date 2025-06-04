package com.mycompany.components;

import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Avaliacao;
import com.mycompany.entidades.Disciplina;
import com.mycompany.views.AdicionarAvaliacao;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author leog4
 */
public class DisciplinaCardPanel extends javax.swing.JPanel {

    private final JPanel avaliacoesPanel;
    private boolean expanded = false;
    private Disciplina disciplina;
    
    public DisciplinaCardPanel(Disciplina disciplina) {
        this.disciplina = disciplina;
        initComponents();
        removeAll();
        setLayout(new MigLayout("insets 10, fillx, wrap 4", "[left]10[left]10[center, grow]10[right]", ""));
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        setBackground(new Color(240,255,255));
        avaliacoesPanel = new JPanel();
        avaliacoesPanel.setLayout(new MigLayout("insets 0, wrap 1", "[]", ""));
        avaliacoesPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        avaliacoesPanel.setBackground(Color.WHITE);
        JLabel titulo = new JLabel();
        titulo.setText("AVALIAÇÕES");
        avaliacoesPanel.add(titulo, "wrap, align center");
        
        add(botaoEditar, "split 2, gapx 10");
        add(botaoExcluir);
        add(nomeDisciplina, "skip 1, gaptop 5, align center");
        add(botaoExpandir, "wrap");
        add(Box.createVerticalStrut(20), "wrap");

        add(mediaAprovarLabel,"skip 1, split 2, gapx 1");
        add(valorMediaAprovarLabel);
        add(mediaAtualLabel, "skip 1, split 2, gapx 1, right");
        add(valorMediaAtualLabel,"gapright 150");

        add(Box.createVerticalStrut(20), "wrap");
        add(botaoAddAvaliacao, "skip 3");

        for (Avaliacao a : disciplina.getAvaliacoes()) {
            AvaliacaoCardPanel card = new AvaliacaoCardPanel(a);
            avaliacoesPanel.add(card, "growx, pushx");
        }
        
        JScrollPane scroll = new JScrollPane(avaliacoesPanel);
        scroll.setPreferredSize(new Dimension(400, 100));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeDisciplina = new javax.swing.JLabel();
        botaoExpandir = new javax.swing.JButton();
        valorMediaAprovarLabel = new javax.swing.JLabel();
        mediaAprovarLabel = new javax.swing.JLabel();
        valorMediaAtualLabel = new javax.swing.JLabel();
        mediaAtualLabel = new javax.swing.JLabel();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoAddAvaliacao = new javax.swing.JButton();

        nomeDisciplina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeDisciplina.setText(disciplina.getNome());

        botaoExpandir.setText("▼");
        botaoExpandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExpandirActionPerformed(evt);
            }
        });

        valorMediaAprovarLabel.setText(Double.toString(disciplina.getMediaAprovar()));

        mediaAprovarLabel.setText("MÉDIA APROVAÇÃO:");

        valorMediaAtualLabel.setText("0.0");

        mediaAtualLabel.setText("MÉDIA ATUAL:");

        botaoEditar.setText("EDITAR");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoExcluir.setText("EXCLUIR");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoAddAvaliacao.setText("+  Avaliação");
        botaoAddAvaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddAvaliacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(botaoEditar)
                .addGap(21, 21, 21)
                .addComponent(botaoExcluir)
                .addGap(64, 64, 64)
                .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoExpandir)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(mediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valorMediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(mediaAtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valorMediaAtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAddAvaliacao)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoEditar)
                            .addComponent(botaoExcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoExpandir)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorMediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediaAprovarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorMediaAtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mediaAtualLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoAddAvaliacao)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int removido = GerenciadorPeriodos.DeletarDisciplina(disciplina);
        if(removido > 0){
            Container parent = getParent();
                if (parent != null) {
                    parent.remove(this);
                    parent.revalidate();
                    parent.repaint();
                }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        GerenciadorPeriodos.atualizarDisciplina(disciplina);
        Container parent = getParent();
            if (parent != null) {
                parent.revalidate();
                parent.repaint();
            }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExpandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExpandirActionPerformed
            expanded = !expanded;
            if (expanded) {
                add(avaliacoesPanel,"span, growx, wrap");
            } else {
                remove(avaliacoesPanel);
            }
            revalidate();
            repaint();
    }//GEN-LAST:event_botaoExpandirActionPerformed

    private void botaoAddAvaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddAvaliacaoActionPerformed
        AdicionarAvaliacao adicionarAvaliacao = new AdicionarAvaliacao(disciplina.getId(), this);
        adicionarAvaliacao.setLocationRelativeTo(this);
        adicionarAvaliacao.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        adicionarAvaliacao.setVisible(true);
    }//GEN-LAST:event_botaoAddAvaliacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddAvaliacao;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExpandir;
    private javax.swing.JLabel mediaAprovarLabel;
    private javax.swing.JLabel mediaAtualLabel;
    private javax.swing.JLabel nomeDisciplina;
    private javax.swing.JLabel valorMediaAprovarLabel;
    private javax.swing.JLabel valorMediaAtualLabel;
    // End of variables declaration//GEN-END:variables
}
