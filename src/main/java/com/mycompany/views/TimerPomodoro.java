/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.Timer;

/**
 *
 * @author leog4
 */
public class TimerPomodoro extends javax.swing.JInternalFrame {

    private int segundos = 0;
    private int horas;
    private int minutos;
    private int horasDef = 02;
    private int minutosDef = 30;
    private int curta = 100000;
    private int longa = 600000;
    private boolean pausado = true;
    private boolean iniciado = false;
    private Timer timer;
    private Timer pausaCurtaTimer;
    private Timer pausaLongaTimer;
    
    public TimerPomodoro() {
        initComponents();
        timer = new Timer(1000, e -> {
            if (!pausado) {
                pausaLabel.setVisible(false);
                minutosLabel.setForeground(Color.BLACK);
                horasLabael.setForeground(Color.BLACK);
                comecarTimer();
            }
        });
        
        pausaCurtaTimer = new Timer(curta, e -> {
                pausado = false;
                if (!timer.isRunning() && iniciado) {
                    timer.start();
                }
                ((Timer) e.getSource()).stop();
            });
        
        pausaLongaTimer = new Timer(longa, e -> {
                pausado = false;
                if (!timer.isRunning() && iniciado) {
                    timer.start();
                }
                ((Timer) e.getSource()).stop();
            });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        horasLabael = new javax.swing.JLabel();
        doisPontosLabel = new javax.swing.JLabel();
        minutosLabel = new javax.swing.JLabel();
        pausaLabel = new javax.swing.JLabel();
        botaoPausaCurta = new javax.swing.JButton();
        botaoIniciar = new javax.swing.JButton();
        botaoPausaLonga = new javax.swing.JButton();
        botaoVolatar = new javax.swing.JButton();
        botaoConfig = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(160, 241, 234));

        horasLabael.setBackground(new java.awt.Color(255, 255, 255));
        horasLabael.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        horasLabael.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        horasLabael.setText("02");

        doisPontosLabel.setFont(new java.awt.Font("Wide Latin", 1, 48)); // NOI18N
        doisPontosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doisPontosLabel.setText(":");

        minutosLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 48)); // NOI18N
        minutosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minutosLabel.setText("30");

        pausaLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        pausaLabel.setForeground(new java.awt.Color(255, 0, 0));
        pausaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pausaLabel.setText("PAUSADO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(horasLabael, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doisPontosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(minutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pausaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pausaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doisPontosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horasLabael, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        botaoPausaCurta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPausaCurta.setText("PAUSA CURTA");
        botaoPausaCurta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPausaCurtaActionPerformed(evt);
            }
        });

        botaoIniciar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoIniciar.setText("INICIAR");
        botaoIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIniciarActionPerformed(evt);
            }
        });

        botaoPausaLonga.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPausaLonga.setText("PAUSA LONGA");
        botaoPausaLonga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPausaLongaActionPerformed(evt);
            }
        });

        botaoVolatar.setText("VOLTAR");
        botaoVolatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVolatarActionPerformed(evt);
            }
        });

        botaoConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/icons/iconeconfig.png"))); // NOI18N
        botaoConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfigActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("config");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 182, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(botaoPausaCurta, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoPausaLonga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(364, 364, 364))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoVolatar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConfig)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoVolatar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoPausaCurta, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoPausaLonga, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botaoIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoConfig)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

    private void botaoVolatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVolatarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVolatarActionPerformed

    private void botaoConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfigActionPerformed
        PomodoConfig pomodoroConfig = new PomodoConfig(horasDef, minutosDef, curta, longa);
        pomodoroConfig.setLocationRelativeTo(this);
        pomodoroConfig.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        pomodoroConfig.setVisible(true);
        horasDef = pomodoroConfig.getHoraDef();
        minutosDef = pomodoroConfig.getMinDef();
        curta = pomodoroConfig.getCurta();
        longa = pomodoroConfig.getLonga();
        minutosLabel.setText(String.format("%02d", minutosDef));
        horasLabael.setText(String.format("%02d",horasDef));
          
    }//GEN-LAST:event_botaoConfigActionPerformed

    private void botaoIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIniciarActionPerformed
        if(!iniciado){
            botaoIniciar.setText("REINICIAR");
            pausado = false;
            horas = horasDef;
            minutos = minutosDef;
            iniciado = true;
            timer.start();
        }else{
            if (pausaLongaTimer != null && pausaLongaTimer.isRunning()) {
                pausaLongaTimer.stop();
            }
            if (pausaCurtaTimer != null && pausaCurtaTimer.isRunning()) {
                pausaCurtaTimer.stop();
            }
            botaoIniciar.setText("INICIAR");
            iniciado = false;
            pausado = true;
            timer.stop();
            segundos = 0;
            minutosLabel.setText(String.format("%02d", minutosDef));
            horasLabael.setText(String.format("%02d",horasDef));
            minutosLabel.setForeground(Color.BLACK);
            horasLabael.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_botaoIniciarActionPerformed

    private void botaoPausaCurtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPausaCurtaActionPerformed
        if (timer != null && timer.isRunning()) {
            pausaLabel.setVisible(true);
            pausado = true;
            timer.stop();

            pausaCurtaTimer.setRepeats(false);
            int min = (curta / 60000) % 60;
            int hor = (curta / 3600000); 
            horasLabael.setText(String.format("%02d", hor));
            minutosLabel.setText(String.format("%02d", min));
            minutosLabel.setForeground(Color.RED);
            horasLabael.setForeground(Color.RED);
            pausaCurtaTimer.start();
        }
    }//GEN-LAST:event_botaoPausaCurtaActionPerformed

    private void botaoPausaLongaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPausaLongaActionPerformed
        if (timer != null && timer.isRunning()) {
            pausaLabel.setVisible(true);
            pausado = true;
            timer.stop();

            pausaLongaTimer.setRepeats(false);
            int min = (longa / 60000) % 60;
            int hor = (longa / 3600000);
            horasLabael.setText(String.format("%02d", hor));
            minutosLabel.setText(String.format("%02d", min));
            minutosLabel.setForeground(Color.RED);
            horasLabael.setForeground(Color.RED);
            pausaLongaTimer.start();
        }
    }//GEN-LAST:event_botaoPausaLongaActionPerformed

    private void comecarTimer(){
        segundos++;
        if(segundos == 60){
            minutos--;
            segundos = 0;
            if(minutos < 0){
                horas--;
                if(horas < 0){
                    pausado = true;
                }else{
                    minutos = 59;
                }
            }
        }
        minutosLabel.setText(String.format("%02d", minutos));
        horasLabael.setText(String.format("%02d",horas));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoConfig;
    private javax.swing.JButton botaoIniciar;
    private javax.swing.JButton botaoPausaCurta;
    private javax.swing.JButton botaoPausaLonga;
    private javax.swing.JButton botaoVolatar;
    private javax.swing.JLabel doisPontosLabel;
    private javax.swing.JLabel horasLabael;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minutosLabel;
    private javax.swing.JLabel pausaLabel;
    // End of variables declaration//GEN-END:variables
}
