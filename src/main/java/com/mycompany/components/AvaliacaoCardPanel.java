package com.mycompany.components;

import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Avaliacao;
import com.mycompany.views.EditarAvaliacao;
import java.awt.Color;
import java.awt.Container;
import java.text.SimpleDateFormat;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JDialog;
import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author leog4
 */
public class AvaliacaoCardPanel extends javax.swing.JPanel {

    protected Avaliacao avaliacao;
    
    public AvaliacaoCardPanel(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
        initComponents();
        setLayout(new MigLayout("insets 10, fillx, wrap 4", "[left]10[left]10[center, grow]10[right]", ""));
        setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        setBackground(Color.white);
        
        add(botaoEditar, "split 2, gapx 10");
        add(botaoExcluir);
        add(nomeAvaliacao, "skip 1, gaptop 5, align center");
        add(Box.createVerticalStrut(60), "wrap");

        add(notaLabel,"skip 1, split 2, gapx 1");
        add(valorNotaLabel);
        add(dataLabel, "skip 1, split 2, gapx 1, right");
        add(valorDataLabel1,"gapright 150");

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeAvaliacao = new javax.swing.JLabel();
        notaLabel = new javax.swing.JLabel();
        valorNotaLabel = new javax.swing.JLabel();
        dataLabel = new javax.swing.JLabel();
        valorDataLabel1 = new javax.swing.JLabel();
        botaoEditar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();

        nomeAvaliacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeAvaliacao.setText(avaliacao.getNome());

        notaLabel.setText("NOTA:");

        if(avaliacao.getNotaAvaliacao() == -1){
            valorNotaLabel.setText("Nota não informada");
        }else{
            valorNotaLabel.setText(Double.toString(avaliacao.getNotaAvaliacao()));
        }

        dataLabel.setText("DATA:");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        valorDataLabel1.setText(sdf.format(avaliacao.getDataAvaliacao()));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorNotaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(nomeAvaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(botaoEditar)
                        .addGap(68, 68, 68)
                        .addComponent(botaoExcluir)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeAvaliacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorNotaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorDataLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar)
                    .addComponent(botaoExcluir))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        Container parent = getParent();
        if (parent != null) {
            EditarAvaliacao EAvaliacao = new EditarAvaliacao(avaliacao, (JPanel) parent);
            EAvaliacao.setLocationRelativeTo(this);
            EAvaliacao.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            EAvaliacao.setVisible(true);
        }
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        int removido = GerenciadorPeriodos.DeletarAvaliacao(avaliacao);
        if(removido > 0){
            Container parent = getParent();
            if (parent != null) {
                parent.remove(this);
                parent.revalidate();
                parent.repaint();
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JLabel dataLabel;
    private javax.swing.JLabel nomeAvaliacao;
    private javax.swing.JLabel notaLabel;
    private javax.swing.JLabel valorDataLabel1;
    private javax.swing.JLabel valorNotaLabel;
    // End of variables declaration//GEN-END:variables
}
