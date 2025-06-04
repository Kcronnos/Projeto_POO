package com.mycompany.components;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class BotaoRedondo extends JButton {

    public BotaoRedondo(String label) {
        super(label);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.BOLD, 14));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        // Habilita anti-aliasing para bordas suaves
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Gradiente do fundo (efeito 3D)
        GradientPaint gradiente = new GradientPaint(
            0, 0, new Color(100, 149, 237), // Topo mais claro
            0, height, new Color(70, 130, 180) // Base mais escura
        );
        g2.setPaint(gradiente);
        g2.fill(new RoundRectangle2D.Float(0, 0, width, height, 30, 30));

        // Brilho superior (efeito de luz)
        GradientPaint brilho = new GradientPaint(
            0, 0, new Color(255, 255, 255, 100),
            0, height / 2, new Color(255, 255, 255, 0)
        );
        g2.setPaint(brilho);
        g2.fill(new RoundRectangle2D.Float(0, 0, width, height / 2, 30, 30));

        // Chama o desenho do texto (sem o fundo padrão)
        super.paintComponent(g2);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(60, 110, 160));
        g2.setStroke(new BasicStroke(2));
        g2.drawRoundRect(1, 1, getWidth() - 3, getHeight() - 3, 30, 30);
        g2.dispose();
    }

    @Override
    public boolean contains(int x, int y) {
        Shape shape = new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30);
        return shape.contains(x, y);
    }
}
