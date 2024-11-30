/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keloc
 */

public class ContentChange {
    public static void changePanel(JPanel origin, JPanel newPanel){
        newPanel.setSize(origin.getWidth(), origin.getHeight());
        newPanel.setLocation(0,0);
        origin.removeAll();
        origin.add(newPanel, BorderLayout.CENTER);
        origin.revalidate();
        origin.repaint();
    }
    
     
}
