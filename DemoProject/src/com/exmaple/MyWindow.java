package com.exmaple;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindow  extends Frame {

    public MyWindow(String title) {
        super(title);
        setSize(500,140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
               System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 20);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 14);
        g.setFont(sansSerifLarge);
        g.drawString("Press Play Event", 60,60);
        g.setFont(sansSerifSmall);
        g.drawString("by Emmanuel Gyan-Amoah", 60, 100);
    }
}
 // Standard Mechanism to allow us to pop up something on the screen.