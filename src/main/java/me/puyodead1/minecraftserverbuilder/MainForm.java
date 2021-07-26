package me.puyodead1.minecraftserverbuilder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

public class MainForm {
    public JPanel mainPanel;
    private JPanel softwareSelectionRadioPanel;
    private JRadioButton softwareSelectionRadioSpigot;
    private JRadioButton softwareSelectionRadioPaper;
    private JRadioButton softwareSelectionRadioBungeecord;
    private JRadioButton softwareSelectionRadioPurpur;
    private JLabel softwareSelectionLabel;
    private JPanel softwareSelectionPanel;
    private JPanel contentWrapper;
    private JPanel eulaPanel;
    private JLabel eulaLabel;
    private JPanel eulaInnerPanel;
    private JCheckBox eulaCheckBox;
    private JButton moreInformationButton;

    public MainForm() {
        moreInformationButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e event
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                // Check if desktop is supported
                if(!Desktop.isDesktopSupported()) return;

                // Get desktop
                Desktop desktop = Desktop.getDesktop();

                // Check if browsing to a url is supported
                if(!desktop.isSupported(Desktop.Action.BROWSE)) return;

                try {
                    desktop.browse(URI.create("https://account.mojang.com/documents/minecraft_eula"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), ex.getLocalizedMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }
}
