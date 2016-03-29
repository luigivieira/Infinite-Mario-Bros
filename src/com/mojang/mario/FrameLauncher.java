package com.mojang.mario;

import java.awt.*;
import javax.swing.*;

public class FrameLauncher
{
    public static void main(String[] args)
    {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        MarioComponent mario = new MarioComponent(screenSize.width, screenSize.height);
        JFrame frame = new JFrame("Infinite Mario Bros.");
        frame.setContentPane(mario);
        frame.setUndecorated(true);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(0, 0);
        
        //frame.setLocation((screenSize.width-frame.getWidth())/2, (screenSize.height-frame.getHeight())/2);
        
        frame.setVisible(true);
        
        mario.start();
//        frame.addKeyListener(mario);
//        frame.addFocusListener(mario);
    }
}