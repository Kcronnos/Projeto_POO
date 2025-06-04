package com.mycompany.components;

/**
 *
 * @author leog4
 */
import javax.swing.*;
import java.awt.*;

public class MeuDesktopPaneComImagem extends JDesktopPane {

    private Image imagemFundo;

    public MeuDesktopPaneComImagem() {
        imagemFundo = new ImageIcon(getClass().getResource("/com/mycompany/icons/logo_estudApp.png")).getImage();
        //imagemFundo = new ImageIcon("C:/UNIVASF/Atividades POO/projetoPOO/mavenproject1/src/main/java/com/mycompany/icons/logo_estudApp.png").getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagemFundo != null) {
            int x = (getWidth() - imagemFundo.getWidth(this)) / 2;
            int y = (getHeight() - imagemFundo.getHeight(this)) / 2;
            g.drawImage(imagemFundo, x, y, this);
        }
    }
}
