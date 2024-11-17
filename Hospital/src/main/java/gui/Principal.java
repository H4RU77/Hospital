/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author Keloc
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        initStyles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        bg = new javax.swing.JPanel();
        bienvenidoL = new javax.swing.JLabel();
        ayudaL = new javax.swing.JLabel();
        descL = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setMinimumSize(new java.awt.Dimension(607, 347));
        setPreferredSize(new java.awt.Dimension(607, 347));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(607, 347));
        bg.setPreferredSize(new java.awt.Dimension(607, 347));

        bienvenidoL.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bienvenidoL.setText("¡Bienvenido!");

        ayudaL.setText("<html>\nOperaciones:\n<ul>\n<li>Préstamos</li>\n<li>Devoluciones</li>\n<li>Registro y Edición de Miembros</li>\n<li>Registro y Edición de Libros</li>\n<li>Eliminar todo tipo de Registros</li>\n<li>Registrar y Consultar logs</li>\n</ul>\n</html>");

        descL.setText("<html> Biblioteca \"Biblioteca de Alejandría\" presenta sus sistema de gestion, que facilita el proceso de prestamo <br></br> y devolución de libros y su registro en una base de datos. <br></br> <br></br> Este Sistema permite el manejo del catalogo en una manera óptima y sencilla,  con una interfaz <br></br> llamativa y amigable con el usuario. </html>");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descL, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(ayudaL)
                        .addGap(215, 215, 215)))
                .addGap(18, 18, 18))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bienvenidoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(bienvenidoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(descL)
                .addGap(31, 31, 31)
                .addComponent(ayudaL)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void initStyles(){
        bienvenidoL.putClientProperty( "FlatLaf.style", "font: h1 $h1.font" );
        descL.putClientProperty( "FlatLaf.style", "font: $defaultFont" );
        ayudaL.putClientProperty( "FlatLaf.style", "font: $defaultFont" );
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ayudaL;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel bienvenidoL;
    private javax.swing.JLabel descL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
