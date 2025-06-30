/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.components.MeuDesktopPaneComImagem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author leog4
 */
public class TelaPrincipal extends javax.swing.JFrame {

    
    public TelaPrincipal() {
        initComponents();
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ImageIcon imagemIcone = new ImageIcon(getClass().getResource("/com/mycompany/icons/logo_estudApp.png"));
        setIconImage(imagemIcone.getImage());
        setTitle("EstudApp");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPrincipal = new MeuDesktopPaneComImagem();
        jToolBar1 = new javax.swing.JToolBar();
        botaoGerenciadorDeGrade = new javax.swing.JButton();
        botaoBaralhosFlash = new javax.swing.JButton();
        botaoPomodoro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EStudando");

        desktopPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jToolBar1.setRollover(true);
        jToolBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);

        botaoGerenciadorDeGrade.setBackground(new Color(70,130,180));
        botaoGerenciadorDeGrade.setText("GERENCIADOR DE GRADE");
        botaoGerenciadorDeGrade.setFont(new Font("Arial", Font.BOLD, 14));
        botaoGerenciadorDeGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciadorDeGradeActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoGerenciadorDeGrade);

        botaoBaralhosFlash.setBackground(new Color(70,130,180));
        botaoBaralhosFlash.setText("FLASH CARDS");
        botaoBaralhosFlash.setFont(new Font("Arial", Font.BOLD, 14));
        botaoBaralhosFlash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBaralhosFlashActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoBaralhosFlash);

        botaoPomodoro.setBackground(new Color(70,130,180));
        botaoPomodoro.setText("TIMER POMODORO");
        botaoPomodoro.setFont(new Font("Arial", Font.BOLD, 14));
        botaoPomodoro.setFocusable(false);
        botaoPomodoro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPomodoro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botaoPomodoro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPomodoroActionPerformed(evt);
            }
        });
        jToolBar1.add(botaoPomodoro);

        desktopPrincipal.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(589, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBaralhosFlashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBaralhosFlashActionPerformed
        FlashCardsTela flashCardsTela = new FlashCardsTela();
        int x = (desktopPrincipal.getWidth() - flashCardsTela.getWidth()) / 2;
        int y = (desktopPrincipal.getHeight() - flashCardsTela.getHeight()) / 2;
        flashCardsTela.setLocation(x, y);
        desktopPrincipal.add(flashCardsTela);
        flashCardsTela.setVisible(true);
    }//GEN-LAST:event_botaoBaralhosFlashActionPerformed

    private void botaoGerenciadorDeGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciadorDeGradeActionPerformed
        GerenciadorGrade gerenciadorGrade = new GerenciadorGrade();
        int x = (desktopPrincipal.getWidth() - gerenciadorGrade.getWidth()) / 2;
        int y = (desktopPrincipal.getHeight() - gerenciadorGrade.getHeight()) / 2;
        gerenciadorGrade.setLocation(x, y);
        desktopPrincipal.add(gerenciadorGrade);
        gerenciadorGrade.carregarPeriodos();
        gerenciadorGrade.setVisible(true);
    }//GEN-LAST:event_botaoGerenciadorDeGradeActionPerformed

    private void botaoPomodoroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPomodoroActionPerformed
        TimerPomodoro timerPomodoro = new TimerPomodoro();
        int x = (desktopPrincipal.getWidth() - timerPomodoro.getWidth()) / 2;
        int y = (desktopPrincipal.getHeight() - timerPomodoro.getHeight()) / 2;
        timerPomodoro.setLocation(x, y);
        desktopPrincipal.add(timerPomodoro);
        timerPomodoro.setVisible(true);
    }//GEN-LAST:event_botaoPomodoroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBaralhosFlash;
    private javax.swing.JButton botaoGerenciadorDeGrade;
    private javax.swing.JButton botaoPomodoro;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
