/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Periodo;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author leog4
 */
public class EditarPeriodo extends javax.swing.JDialog {

    private Periodo periodo;
    private JPanel painel;

    public EditarPeriodo(Periodo periodo, JPanel painel) {
        this.periodo = periodo;
        this.painel = painel;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        dataFinalLabel = new javax.swing.JLabel();
        dataDeInicioLabel = new javax.swing.JLabel();
        jDateChooserInicio = new com.toedter.calendar.JDateChooser();
        jDateChooserFinal = new com.toedter.calendar.JDateChooser();
        jTextFieldNomePeriodo = new javax.swing.JTextField();
        botaoAdicionar = new javax.swing.JButton();
        nomePeriodoLabel = new javax.swing.JLabel();

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
        tituloLabel.setText("EDITAR " + periodo.getNome() + " PERIODO");

        dataFinalLabel.setBackground(new java.awt.Color(255, 255, 255));
        dataFinalLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dataFinalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataFinalLabel.setText("DATA DE FINALIZAÇÃO");

        dataDeInicioLabel.setBackground(new java.awt.Color(255, 255, 255));
        dataDeInicioLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        dataDeInicioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataDeInicioLabel.setText("DATA DE INICIO");

        jDateChooserInicio.setMaxSelectableDate(new java.util.Date(253370779269000L));
        jDateChooserInicio.setDate(periodo.getInicioPeriodo());

        jDateChooserFinal.setDate(periodo.getFinalPeriodo());

        jTextFieldNomePeriodo.setText(periodo.getNome());

        botaoAdicionar.setText("EDITAR");
        botaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarActionPerformed(evt);
            }
        });

        nomePeriodoLabel.setBackground(new java.awt.Color(255, 255, 255));
        nomePeriodoLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nomePeriodoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomePeriodoLabel.setText("NOME DO PERIODO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(dataDeInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomePeriodoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldNomePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooserInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(jDateChooserFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoVoltar)
                .addGap(1, 1, 1)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jDateChooserInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomePeriodoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNomePeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(dataDeInicioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(dataFinalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jDateChooserFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(botaoAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
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
        if(jTextFieldNomePeriodo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Não foi possivel editar o Periodo\n"
                + "Nome do periodo não foi definido", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }else if(jDateChooserInicio.getDate() == null || jDateChooserFinal.getDate() == null){
            JOptionPane.showMessageDialog(this, "Não foi possivel editar o Periodo\n"
                + "Pois a data de Inicio ou Final do periodo não foram definidas", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }else{
            java.util.Date dataUtilInicioPeriodo = jDateChooserInicio.getDate();
            java.util.Date dataUtilFinalPeriodo = jDateChooserFinal.getDate();
            periodo.setInicioPeriodo(dataUtilInicioPeriodo);
            periodo.setFinalPeriodo(dataUtilFinalPeriodo);
            periodo.setNome(jTextFieldNomePeriodo.getText());
            GerenciadorPeriodos.atualizarPeriodo(periodo);
            
            GerenciadorGrade.carregarPeriodos(painel);
            dispose();
            }
    }//GEN-LAST:event_botaoAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel dataDeInicioLabel;
    private javax.swing.JLabel dataFinalLabel;
    private com.toedter.calendar.JDateChooser jDateChooserFinal;
    private com.toedter.calendar.JDateChooser jDateChooserInicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNomePeriodo;
    private javax.swing.JLabel nomePeriodoLabel;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
