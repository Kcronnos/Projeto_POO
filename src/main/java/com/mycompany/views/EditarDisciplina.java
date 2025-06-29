/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Disciplina;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author leog4
 */
public class EditarDisciplina extends javax.swing.JFrame {

    private Disciplina disciplina;
    private JPanel painel;
    
    public EditarDisciplina(Disciplina disciplina, JPanel painel) {
        this.disciplina = disciplina;
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
        jTextFieldNotaAprovacao = new javax.swing.JTextField();
        botaoEditar = new javax.swing.JButton();
        nomeDisciplinaLabel = new javax.swing.JLabel();
        jTextFieldNomeDisciplina = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        tituloLabel.setText("EDITAR " + disciplina.getNome() + " DISCIPLINA");

        notaLabel.setBackground(new java.awt.Color(255, 255, 255));
        notaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        notaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notaLabel.setText("MÉDIA APROVAÇÃO");

        jTextFieldNotaAprovacao.setText(Double.toString(disciplina.getMediaAprovar()));

        botaoEditar.setText("EDITAR");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        nomeDisciplinaLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomeDisciplinaLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nomeDisciplinaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeDisciplinaLabel.setText("NOME DA DISCIPLINA");

        jTextFieldNomeDisciplina.setText(disciplina.getNome());

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
                            .addComponent(nomeDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldNotaAprovacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
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
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeDisciplinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNotaAprovacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(botaoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        int resposta;

        if (jTextFieldNomeDisciplina.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Atualizar a Disciplina\n"
                + "Pois o Nome da Disciplina Não Foi Definido", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (jTextFieldNotaAprovacao.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não Foi Possível Criar Uma Disciplina\n"
                + "Pois o Média da Disciplina Não Foi Definida", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        

        Double media = null;
        String mediaTexto = jTextFieldNotaAprovacao.getText().trim();
        
        try {
            media = Double.parseDouble(mediaTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Média inválida. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(media != null){
            if(media < 0){
                JOptionPane.showMessageDialog(this, "Média inválida. Digite um número válido.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        disciplina.setNome(jTextFieldNomeDisciplina.getText().trim());
        disciplina.setMediaAprovar(media);
        GerenciadorPeriodos.atualizarDisciplina(disciplina);
        GerenciadorGrade.carregarPeriodosFora((JPanel)painel.getParent().getParent().getParent());
        dispose();
    }//GEN-LAST:event_botaoEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomeDisciplina;
    private javax.swing.JTextField jTextFieldNotaAprovacao;
    private javax.swing.JLabel nomeDisciplinaLabel;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
