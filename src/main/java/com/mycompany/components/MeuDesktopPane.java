/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.components;

/**
 *
 * @author leog4
 */
import javax.swing.*;
import java.awt.*;

public class MeuDesktopPane extends JDesktopPane {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Fundo branco
        g.setColor(new Color(224,255,255));
        g.fillRect(0, 0, getWidth(), getHeight());
    }
}
