/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.Paciente;
import java.awt.BorderLayout;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

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
    
    public static void generarListado(List<Paciente> pacientes, String nomMed){
        try {
            InputStream reportPath = new FileInputStream("src/main/resources/listado.jasper");

            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(pacientes);

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("setListado", dataSource);
            parameters.put("nombreMedico", nomMed);

            JasperPrint jasperPrint = JasperFillManager.fillReport(reportPath, parameters, new JREmptyDataSource());

            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
