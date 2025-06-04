/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.components.AvaliacaoCardPanel;
import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.dal.ModuloConexao;
import com.mycompany.entidades.Avaliacao;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author leog4
 */
public class AdicionarAvaliacao extends javax.swing.JDialog {

    private int idDisciplina;
    private JPanel painel;
    
    public AdicionarAvaliacao(int idDisciplina, JPanel painel) {
        this.idDisciplina = idDisciplina;
        this.painel = painel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        notaLabel = new javax.swing.JLabel();
        dataDeAvaliacaoLabel = new javax.swing.JLabel();
        jDateChooserAvaliacao = new com.toedter.calendar.JDateChooser();
        jTextFieldNotaAvaliacao = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        nomeAvaliacaoLabel = new javax.swing.JLabel();
        jTextFieldNomeAvaliacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(160, 241, 234));

        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        tituloLabel.setBackground(new java.awt.Color(255, 255, 255));
        tituloLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("ADICINONAR NOVA AVALIAÇÃO");

        notaLabel.setBackground(new java.awt.Color(255, 255, 255));
        notaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        notaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notaLabel.setText("NOTA DA AVALIAÇÃO");

        dataDeAvaliacaoLabel.setBackground(new java.awt.Color(255, 255, 255));
        dataDeAvaliacaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dataDeAvaliacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataDeAvaliacaoLabel.setText("DATA DA AVALIAÇÃO");

        jDateChooserAvaliacao.setMaxSelectableDate(new java.util.Date(253370779269000L));

        botaoAdicionar.setText("ADICIONAR");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        nomeAvaliacaoLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomeAvaliacaoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nomeAvaliacaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeAvaliacaoLabel.setText("NOME DA AVALIAÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar)
                        .addGap(33, 33, 33)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataDeAvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeAvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldNotaAvaliacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoVoltar)
                        .addGap(45, 45, 45))
                    .addComponent(tituloLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeAvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dataDeAvaliacaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jDateChooserAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNotaAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarActionPerformed
        int resposta;

        if (jTextFieldNomeAvaliacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Uma Avaliação\n"
                + "Pois o Nome da Avaliação Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        java.util.Date dataUtilAvaliacao = jDateChooserAvaliacao.getDate();
        Double nota = null;

        if (dataUtilAvaliacao == null) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Criar Uma Avaliação Sem Atribuir Data?", 
                                        "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        }

        String notaTexto = jTextFieldNotaAvaliacao.getText().trim();
        if (notaTexto.isEmpty()) {
            resposta = JOptionPane.showConfirmDialog(this, "Quer Criar Uma Avaliação Sem Atribuir Nota?", 
                                        "CONFIRMAÇÃO", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
            if (resposta != JOptionPane.YES_OPTION) {
                return;
            }
        } else {
            try {
                nota = Double.parseDouble(notaTexto);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nota inválida. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int idAvaliacao = GerenciadorPeriodos.criarAvaliacao(idDisciplina, jTextFieldNomeAvaliacao.getText(), dataUtilAvaliacao, nota != null ? nota : -1);

        if (idAvaliacao > 0) {
            Avaliacao avaliacao = GerenciadorPeriodos.buscarAvaliacao(idAvaliacao);
            AvaliacaoCardPanel card = new AvaliacaoCardPanel(avaliacao);
            painel.add(card);
            painel.revalidate();
            painel.repaint();
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao criar avaliação", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoAdicionarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel dataDeAvaliacaoLabel;
    private com.toedter.calendar.JDateChooser jDateChooserAvaliacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomeAvaliacao;
    private javax.swing.JTextField jTextFieldNotaAvaliacao;
    private javax.swing.JLabel nomeAvaliacaoLabel;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
