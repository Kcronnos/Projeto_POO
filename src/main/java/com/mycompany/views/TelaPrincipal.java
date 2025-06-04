/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.views;

import com.mycompany.components.BotaoRedondo;
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
        painelBaixo = new javax.swing.JPanel();
        botaoCalendario = new BotaoRedondo("AGENDA");
        jToolBar1 = new javax.swing.JToolBar();
        botaoGerenciadorDeGrade = new javax.swing.JButton();
        botaoBaralhosFlash = new javax.swing.JButton();
        botaoPomodoro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EStudando");

        desktopPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        painelBaixo.setBackground(new java.awt.Color(255, 255, 255));
        painelBaixo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoCalendario.setText("AGENDA");
        botaoCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCalendarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBaixoLayout = new javax.swing.GroupLayout(painelBaixo);
        painelBaixo.setLayout(painelBaixoLayout);
        painelBaixoLayout.setHorizontalGroup(
            painelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBaixoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCalendario)
                .addContainerGap())
        );
        painelBaixoLayout.setVerticalGroup(
            painelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        jToolBar1.add(botaoPomodoro);

        desktopPrincipal.setLayer(painelBaixo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPrincipal.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPrincipalLayout = new javax.swing.GroupLayout(desktopPrincipal);
        desktopPrincipal.setLayout(desktopPrincipalLayout);
        desktopPrincipalLayout.setHorizontalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        desktopPrincipalLayout.setVerticalGroup(
            desktopPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPrincipalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                .addComponent(painelBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void botaoCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalendarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCalendarioActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBaralhosFlash;
    private javax.swing.JButton botaoCalendario;
    private javax.swing.JButton botaoGerenciadorDeGrade;
    private javax.swing.JButton botaoPomodoro;
    private javax.swing.JDesktopPane desktopPrincipal;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel painelBaixo;
    // End of variables declaration//GEN-END:variables
}
