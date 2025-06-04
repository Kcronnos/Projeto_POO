/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.components;

import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Disciplina;
import com.mycompany.entidades.Periodo;
import com.mycompany.views.AdicionarDisciplina;
import com.mycompany.views.EditarPeriodo;
import java.awt.Color;
import java.awt.Container;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author leog4
 */
public class PeriodoCardPanel extends javax.swing.JPanel {
    
    private Periodo periodo;
    private final JPanel disciplinasPanel;
    private boolean expanded = false;
    
    public PeriodoCardPanel(Periodo periodo) {
        this.periodo = periodo;
        initComponents();
        removeAll();
        setLayout(new MigLayout("insets 10, fillx, wrap 4", "[left]10[left]10[center, grow]10[right]", ""));
        setBackground(new Color(240,248,255));
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        
        add(botaoEditar);
        add(botaoExcluir);
        add(nomePeriodo, "gaptop 5, align center");
        add(botaoExpandir, "wrap");
        add(Box.createVerticalStrut(20), "wrap");

        add(dataInicioLabel,"gapleft 100, skip 1, split 2, gapx 1");
        add(valorDataInicioLabel);
        add(dataFinalLabel, "skip 1,split 2, gapx 1, right");
        add(valorDataFinalLabel, "gapright 100");

        add(Box.createVerticalStrut(20), "wrap");
        add(botaoAddDisciplina, "skip 3, wrap");


        disciplinasPanel = new JPanel();
        disciplinasPanel.removeAll();
        disciplinasPanel.setLayout(new MigLayout("insets 0, wrap 1", "[]", ""));
        disciplinasPanel.setBackground(Color.WHITE);
        disciplinasPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        
        JLabel titulo = new JLabel();
        titulo.setText("DISCIPLINAS");
        disciplinasPanel.add(titulo, "wrap, align center");

        for (Disciplina d : periodo.getDisciplinas()) {
            DisciplinaCardPanel card = new DisciplinaCardPanel(d);
            disciplinasPanel.add(card, "align center, growx, pushx");
        }
        
        revalidate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        valorDataInicioLabel = new javax.swing.JLabel();
        dataInicioLabel = new javax.swing.JLabel();
        nomePeriodo = new javax.swing.JLabel();
        dataFinalLabel = new javax.swing.JLabel();
        valorDataFinalLabel = new javax.swing.JLabel();
        botaoAddDisciplina = new javax.swing.JButton();
        botaoExpandir = new javax.swing.JButton();

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

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        valorDataInicioLabel.setText(sdf.format(periodo.getInicioPeriodo()));

        dataInicioLabel.setText("DATA DE INICIO:");

        nomePeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePeriodo.setText(periodo.getNome());

        dataFinalLabel.setText("DATA DE TERMINO:");

        valorDataFinalLabel.setText(sdf.format(periodo.getFinalPeriodo()));

        botaoAddDisciplina.setText("+  Disciplina");
        botaoAddDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAddDisciplinaActionPerformed(evt);
            }
        });

        botaoExpandir.setText("▼");
        botaoExpandir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExpandirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(botaoEditar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir)
                        .addGap(153, 153, 153)
                        .addComponent(nomePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExpandir))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoAddDisciplina)))
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(dataInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valorDataInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(dataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir)
                    .addComponent(nomePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoExpandir))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorDataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valorDataInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(botaoAddDisciplina)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int removido = GerenciadorPeriodos.DeletarPeriodo(periodo);
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
        Container parent = getParent();
        if (parent != null) {
            EditarPeriodo Eperiodo = new EditarPeriodo(periodo, (JPanel) parent);
            Eperiodo.setLocationRelativeTo(this);
            Eperiodo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            Eperiodo.setVisible(true);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExpandirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExpandirActionPerformed
        expanded = !expanded;
        botaoExpandir.setText(expanded ? "▲" : "▼");
        if (expanded) {
            add(disciplinasPanel,"span, growx, wrap");
        } else {
            remove(disciplinasPanel);
        }
        revalidate();
        repaint();
    }//GEN-LAST:event_botaoExpandirActionPerformed

    private void botaoAddDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAddDisciplinaActionPerformed
        AdicionarDisciplina adicionarDisciplina = new AdicionarDisciplina(periodo, this);
        adicionarDisciplina.setLocationRelativeTo(this);
        adicionarDisciplina.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        adicionarDisciplina.setVisible(true);
    }//GEN-LAST:event_botaoAddDisciplinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAddDisciplina;
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoExpandir;
    private javax.swing.JLabel dataFinalLabel;
    private javax.swing.JLabel dataInicioLabel;
    private javax.swing.JLabel nomePeriodo;
    private javax.swing.JLabel valorDataFinalLabel;
    private javax.swing.JLabel valorDataInicioLabel;
    // End of variables declaration//GEN-END:variables
}
