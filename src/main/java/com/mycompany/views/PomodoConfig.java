/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import java.awt.Frame;
import javax.swing.Box;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author leog4
 */
public class PomodoConfig extends javax.swing.JDialog {

    private int horaDef;
    private int minDef;
    private int curta;
    private int longa;
    
    public PomodoConfig(int horaDef, int minDef, int curta, int longa) {
        super((Frame) null, "Configurar Pomodoro", true);
        initComponents();
        this.horaDef = horaDef;
        this.minDef = minDef;
        this.curta = curta;
        this.longa = longa;
        setarComponentes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        curtaBotao = new javax.swing.JButton();
        longaBotao = new javax.swing.JButton();
        pomodoroBotao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        salvarBotao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(160, 241, 234));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEFINIÇÃO DOS RELOGIOS");

        curtaBotao.setText("jButton1");
        curtaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curtaBotaoActionPerformed(evt);
            }
        });

        longaBotao.setText("jButton1");
        longaBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                longaBotaoActionPerformed(evt);
            }
        });

        pomodoroBotao.setText("jButton1");
        pomodoroBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pomodoroBotaoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("POMODORO");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PAUSA CURTA");

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PAUSA LONGA");

        salvarBotao.setText("SALVAR");
        salvarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBotaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pomodoroBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(curtaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(longaBotao, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(105, 105, 105))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salvarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(311, 311, 311))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curtaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(longaBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pomodoroBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(salvarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pomodoroBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pomodoroBotaoActionPerformed
        JTextField campoHoras = new JTextField(5);
        JTextField campoMinutos = new JTextField(5);

        JPanel painel = new JPanel();
        painel.add(new JLabel("Horas:"));
        painel.add(campoHoras);
        painel.add(Box.createHorizontalStrut(15));
        painel.add(new JLabel("Minutos:"));
        painel.add(campoMinutos);

        int resultado = JOptionPane.showConfirmDialog(null, painel, 
                 "Definir Tempo", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String horasTexto = campoHoras.getText();
            String minutosTexto = campoMinutos.getText();

            try {
                int hora = Integer.parseInt(horasTexto);
                int min = Integer.parseInt(minutosTexto);
                horaDef = hora;
                minDef = min;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valores inválidos!");
            }
        }
        
        setarComponentes();
    }//GEN-LAST:event_pomodoroBotaoActionPerformed

    private void curtaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curtaBotaoActionPerformed
        JTextField campoHoras = new JTextField(5);
        JTextField campoMinutos = new JTextField(5);

        JPanel painel = new JPanel();
        painel.add(new JLabel("Horas:"));
        painel.add(campoHoras);
        painel.add(Box.createHorizontalStrut(15));
        painel.add(new JLabel("Minutos:"));
        painel.add(campoMinutos);

        int resultado = JOptionPane.showConfirmDialog(null, painel, 
                 "Definir Tempo", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String horasTexto = campoHoras.getText();
            String minutosTexto = campoMinutos.getText();

            try {
                int mili = 0;
                mili += 3600000 * Integer.parseInt(horasTexto);
                mili += 60000 * Integer.parseInt(minutosTexto);
                curta = mili;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valores inválidos!");
            }
        }
        
        setarComponentes();
    }//GEN-LAST:event_curtaBotaoActionPerformed

    private void longaBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_longaBotaoActionPerformed
        JTextField campoHoras = new JTextField(5);
        JTextField campoMinutos = new JTextField(5);

        JPanel painel = new JPanel();
        painel.add(new JLabel("Horas:"));
        painel.add(campoHoras);
        painel.add(Box.createHorizontalStrut(15));
        painel.add(new JLabel("Minutos:"));
        painel.add(campoMinutos);

        int resultado = JOptionPane.showConfirmDialog(null, painel, 
                 "Definir Tempo", JOptionPane.OK_CANCEL_OPTION);

        if (resultado == JOptionPane.OK_OPTION) {
            String horasTexto = campoHoras.getText();
            String minutosTexto = campoMinutos.getText();

            try {
                int mili = 0;
                mili += 3600000 * Integer.parseInt(horasTexto);
                mili += 60000 * Integer.parseInt(minutosTexto);
                longa = mili;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valores inválidos!");
            }
        }
        setarComponentes();
    }//GEN-LAST:event_longaBotaoActionPerformed

    private void salvarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBotaoActionPerformed
        dispose();
    }//GEN-LAST:event_salvarBotaoActionPerformed

    private void setarComponentes(){
        pomodoroBotao.setText(String.format("%02d:%02d", horaDef, minDef));
        int min = (curta / 60000) % 60;
        int hor = (curta / 3600000);
        curtaBotao.setText(String.format("%02d:%02d", hor, min));
        min = (longa / 60000) % 60;
        hor = (longa / 3600000);
        longaBotao.setText(String.format("%02d:%02d", hor, min));
    }
    
    public int getHoraDef(){
        return horaDef;
    }
    
    public int getMinDef(){
        return minDef;
    }
    
    public int getCurta(){
        return curta;
    }
    
    public int getLonga(){
        return longa;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton curtaBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton longaBotao;
    private javax.swing.JButton pomodoroBotao;
    private javax.swing.JButton salvarBotao;
    // End of variables declaration//GEN-END:variables
}
