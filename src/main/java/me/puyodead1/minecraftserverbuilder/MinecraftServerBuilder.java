package me.puyodead1.minecraftserverbuilder;

import javax.swing.*;
import java.awt.*;

public class MinecraftServerBuilder {
    public static void main(String[] args) {
        MainForm mainForm = new MainForm();

        JFrame frame = new JFrame("Minecraft Server Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(new Color(32, 34, 37));
        frame.setContentPane(mainForm.mainPanel);
        frame.pack();
        frame.setVisible(true);
    }
}
