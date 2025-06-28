package com.mycompany.views;

import com.mycompany.components.BaralhosCard;
import com.mycompany.controllers.GerenciadorFlashCard;
import com.mycompany.entidades.Baralho;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author leog4
 */
public class FlashCardsTela extends javax.swing.JInternalFrame {
  
    public FlashCardsTela() {
        initComponents();
        carregarBaralhos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        panelBaralhos = new javax.swing.JPanel();
        botaoCriarBaralho = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();

        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("BARALHOS");

        panelBaralhos.setLayout(new javax.swing.BoxLayout(panelBaralhos, javax.swing.BoxLayout.LINE_AXIS));
        ScrollPane.setViewportView(panelBaralhos);

        botaoCriarBaralho.setText("CRIAR BARALHO");
        botaoCriarBaralho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarBaralhoActionPerformed(evt);
            }
        });

        botaoVoltar.setText("VOLTAR");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoVoltar)
                        .addGap(259, 259, 259)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCriarBaralho)
                .addGap(340, 340, 340))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoVoltar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoCriarBaralho, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCriarBaralhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarBaralhoActionPerformed
        AdicionarBaralho adcionarBaralho = new AdicionarBaralho(this);
        adcionarBaralho.setLocationRelativeTo(this);
        adcionarBaralho.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        adcionarBaralho.setVisible(true);
    }//GEN-LAST:event_botaoCriarBaralhoActionPerformed

    public void carregarBaralhos(){
        ArrayList<Baralho> baralhos = GerenciadorFlashCard.listarBaralhos();
        panelBaralhos.removeAll();
        panelBaralhos.setLayout(new MigLayout("insets 0, wrap 1", "[grow]", ""));
        
        for(Baralho baralho: baralhos){
            BaralhosCard baralhoCard = new BaralhosCard(baralho);
            panelBaralhos.add(baralhoCard, "growx");
        }

        revalidate();
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton botaoCriarBaralho;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JPanel panelBaralhos;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}
