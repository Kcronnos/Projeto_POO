package com.mycompany.views;

import com.mycompany.components.PeriodoCardPanel;
import com.mycompany.controllers.GerenciadorPeriodos;
import com.mycompany.entidades.Periodo;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author leog4
 */
public final class GerenciadorGrade extends javax.swing.JInternalFrame {

    public GerenciadorGrade() {
        initComponents();
        carregarPeriodos();
        setTitle("Gerenciador De Periodos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelPeriodo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelPeriodos = new javax.swing.JPanel();
        jButtonAdicionarPeriodo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("GERENCIADOR DE GRADE");

        jLabelPeriodo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPeriodo.setText("PERIODOS");

        javax.swing.GroupLayout jPanelPeriodosLayout = new javax.swing.GroupLayout(jPanelPeriodos);
        jPanelPeriodos.setLayout(jPanelPeriodosLayout);
        jPanelPeriodosLayout.setHorizontalGroup(
            jPanelPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        jPanelPeriodosLayout.setVerticalGroup(
            jPanelPeriodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelPeriodos);

        jButtonAdicionarPeriodo.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButtonAdicionarPeriodo.setText("+");
        jButtonAdicionarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdicionarPeriodo)
                .addGap(409, 409, 409))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdicionarPeriodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarPeriodoActionPerformed
        AdicionarPeriodo adicionarPeriodo = new AdicionarPeriodo((JFrame) SwingUtilities.getWindowAncestor(this), jPanelPeriodos);
        adicionarPeriodo.setLocationRelativeTo(this);
        adicionarPeriodo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        adicionarPeriodo.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarPeriodoActionPerformed

    public static void carregarPeriodosFora(JPanel painel){
        ArrayList<Periodo> periodos = GerenciadorPeriodos.listarPeriodos();
        painel.setLayout(new MigLayout("insets 0, wrap 1", "[grow]", ""));
        painel.removeAll();
        
        for(Periodo periodo: periodos){
            PeriodoCardPanel card = new PeriodoCardPanel(periodo);
            painel.add(card, "growx");
        }
        
        painel.revalidate();
        painel.repaint();
    }
    
    public void carregarPeriodos(){
        ArrayList<Periodo> periodos = GerenciadorPeriodos.listarPeriodos();
        jPanelPeriodos.removeAll();
        jPanelPeriodos.setLayout(new MigLayout("insets 0, wrap 1", "[grow]", ""));

        for (Periodo periodo : periodos) {
            PeriodoCardPanel card = new PeriodoCardPanel(periodo);
            jPanelPeriodos.add(card, "growx");
        }

        jPanelPeriodos.revalidate();
        jPanelPeriodos.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionarPeriodo;
    private javax.swing.JLabel jLabelPeriodo;
    private javax.swing.JPanel jPanelPeriodos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
