/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conversor_doble;

import javax.swing.JOptionPane;

/**
 *
 * @author Jox
 */
public class Conversor_Longi extends javax.swing.JFrame {

    /**
     * Creates new form Conversor_Longi
     */
    public Conversor_Longi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtResul = new javax.swing.JTextField();
        btnConver = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbnLista1 = new javax.swing.JComboBox<>();
        lbnLista2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setText("Convertidor de Longitud");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("Resulta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 100, 30));

        txtResul.setEditable(false);
        txtResul.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        getContentPane().add(txtResul, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 100, -1));

        btnConver.setBackground(new java.awt.Color(0, 102, 0));
        btnConver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConver.setForeground(new java.awt.Color(255, 255, 255));
        btnConver.setText("Convertir");
        btnConver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConverActionPerformed(evt);
            }
        });
        getContentPane().add(btnConver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        btnAtras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        lbnLista1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Metros", "Centimetros", "Kilometros" }));
        getContentPane().add(lbnLista1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        lbnLista2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Metros", "Centimetros", "Kilometros" }));
        getContentPane().add(lbnLista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setText("De:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setText("A:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/regla.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fondo.PNG"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
      this.setVisible(false);
      Vist_Inicio v = new Vist_Inicio();
      v.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnConverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConverActionPerformed
        
        
        try {
            int index1 = lbnLista1.getSelectedIndex();
            int index2 = lbnLista2.getSelectedIndex();
            double valor = Double.parseDouble(txtCantidad.getText());
            Convertir_longi l = new Convertir_longi(index1, index2, valor);
            double resultado = l.conversion_medida();
            txtResul.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ingrese una cantida validad");
            txtCantidad.setText("");
        } catch (AssertionError ex) {
            JOptionPane.showMessageDialog(null,"Escoga el tipo de cambio");
        }
    }//GEN-LAST:event_btnConverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Conversor_Longi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor_Longi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor_Longi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor_Longi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor_Longi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnConver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> lbnLista1;
    private javax.swing.JComboBox<String> lbnLista2;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtResul;
    // End of variables declaration//GEN-END:variables
}
