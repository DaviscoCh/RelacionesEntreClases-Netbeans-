/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog5_R.E.C_Formularios;

import Prog5_R.E.C_Clases.Agencia_de_Taxis;
import Prog5_R.E.C_Clases.Carreras;
import Prog5_R.E.C_Clases.Choferes;
import Prog5_R.E.C_Clases.Gasolina;
import Prog5_R.E.C_Clases.Persona;
import Prog5_R.E.C_Clases.Taxis;
import Prog5_R.E.C_Clases.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Charlie Cordova
 */
public class frm_Agencia_de_Taxis_E extends javax.swing.JFrame {

    /**
     * Creates new form frm_Agencia_de_Taxis_E
     */
    private Agencia_de_Taxis Contacto1;
    private Agencia_de_Taxis Contacto2;
    private Agencia_de_Taxis Contacto3;
    private Agencia_de_Taxis Contacto4;
    private Agencia_de_Taxis Contacto5;
    private Agencia_de_Taxis Contacto6;

    public frm_Agencia_de_Taxis_E() {
        initComponents();
        setSize(380,360);
        setLocationRelativeTo(this);
    }

    public void Con1() {
        Choferes chofer1 = new Choferes("123", 5, "Fernando", "Jaya", "456", "Masculino");
        Taxis taxi1 = new Taxis(new Gasolina("Ecopais", 19, 2.40));
        Carreras carrera1 = new Carreras(chofer1, taxi1);
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "HJP-927");
        Gasolina gasolina1 = new Gasolina("Ecopais", 19, 2.40);
        Persona persona1 = new Persona("Fernando", "Jaya", "456", "Masculino");

        carrera1.setLocacion("Nivel Local");
        carrera1.setUbicacion("Parque Central");
        carrera1.proced_CalcularCostoCarrera();
        gasolina1.TotalPagarGasolina();

        Contacto1 = new Agencia_de_Taxis(chofer1, taxi1, carrera1);

        JOptionPane.showMessageDialog(null, persona1.ToString());
        JOptionPane.showMessageDialog(null, chofer1.ToString());
        JOptionPane.showMessageDialog(null, vehiculo1.ToString());
        JOptionPane.showMessageDialog(null, carrera1.ToString());
        JOptionPane.showMessageDialog(null, gasolina1.ToString());
    }

    public void Con2() {
        Choferes chofer2 = new Choferes("321", 2, "Mario", "Arias", "789", "Masculino");
        Taxis taxi2 = new Taxis(new Gasolina("Diesel", 13, 1.50));
        Carreras carrera2 = new Carreras(chofer2, taxi2);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "IQE-725");
        Gasolina gasolina2 = new Gasolina("Diesel", 13, 1.50);
        Persona persona2 = new Persona("Mario", "Arias", "789", "Masculino");

        carrera2.setLocacion("Nivel Local");
        carrera2.setUbicacion("Museo");
        carrera2.proced_CalcularCostoCarrera();
        gasolina2.TotalPagarGasolina();

        Contacto2 = new Agencia_de_Taxis(chofer2, taxi2, carrera2);

        JOptionPane.showMessageDialog(null, persona2.ToString());
        JOptionPane.showMessageDialog(null, chofer2.ToString());
        JOptionPane.showMessageDialog(null, vehiculo2.ToString());
        JOptionPane.showMessageDialog(null, carrera2.ToString());
        JOptionPane.showMessageDialog(null, gasolina2.ToString());
    }

    public void Con3() {
        Choferes chofer3 = new Choferes("876", 8, "Erika", "Velez", "953", "Femenino");
        Taxis taxi3 = new Taxis(new Gasolina("Extra", 15, 2.40));
        Carreras carrera3 = new Carreras(chofer3, taxi3);
        Vehiculo vehiculo3 = new Vehiculo("Hyundai", "EYW-629");
        Gasolina gasolina3 = new Gasolina("Extra", 15, 2.40);

        carrera3.setLocacion("Nivel Local");
        carrera3.setUbicacion("Aeropuerto");
        carrera3.proced_CalcularCostoCarrera();
        gasolina3.TotalPagarGasolina();

        Contacto3 = new Agencia_de_Taxis(chofer3, taxi3, carrera3);

        JOptionPane.showMessageDialog(null, chofer3.ToString());
        JOptionPane.showMessageDialog(null, vehiculo3.ToString());
        JOptionPane.showMessageDialog(null, carrera3.ToString());
        JOptionPane.showMessageDialog(null, gasolina3.ToString());
    }
    
    public void Con4() {
        Choferes chofer4 = new Choferes("538", 6, "Cristiano", "Ronaldo", "420", "Masculino");
        Taxis taxi4 = new Taxis(new Gasolina("Extra", 18, 2.40));
        Carreras carrera4 = new Carreras(chofer4, taxi4);
        Vehiculo vehiculo4 = new Vehiculo("Mazda", "TEN-944");
        Gasolina gasolina4 = new Gasolina("Extra", 18, 2.40);

        carrera4.setLocacion("Nivel Provincial");
        carrera4.setUbicacion("Chilla");
        carrera4.proced_CalcularCostoCarrera();
        gasolina4.TotalPagarGasolina();

        Contacto4 = new Agencia_de_Taxis(chofer4, taxi4, carrera4);

        JOptionPane.showMessageDialog(null, chofer4.ToString());
        JOptionPane.showMessageDialog(null, vehiculo4.ToString());
        JOptionPane.showMessageDialog(null, carrera4.ToString());
        JOptionPane.showMessageDialog(null, gasolina4.ToString());
    }
    
    public void Con5() {
        Choferes chofer5 = new Choferes("301", 7, "Rafael", "Correa", "275", "Masculino");
        Taxis taxi5 = new Taxis(new Gasolina("Diesel", 10, 1.50));
        Carreras carrera5 = new Carreras(chofer5, taxi5);
        Vehiculo vehiculo5 = new Vehiculo("Honda", "NFW - 495");
        Gasolina gasolina5 = new Gasolina("Diesel", 10, 1.50);
        

        carrera5.setLocacion("Nivel Provincial");
        carrera5.setUbicacion("La Cocha");
        carrera5.proced_CalcularCostoCarrera();
        gasolina5.TotalPagarGasolina();

        Contacto5 = new Agencia_de_Taxis(chofer5, taxi5, carrera5);

        JOptionPane.showMessageDialog(null, chofer5.ToString());
        JOptionPane.showMessageDialog(null, vehiculo5.ToString());
        JOptionPane.showMessageDialog(null, carrera5.ToString());
        JOptionPane.showMessageDialog(null, gasolina5.ToString());
    }
    
    public void Con6() {
        Choferes chofer6 = new Choferes("501", 10, "Emilia", "Madruñero", "491", "Femenino");
        Taxis taxi6 = new Taxis(new Gasolina("Ecopais", 12, 2.40));
        Carreras carrera6 = new Carreras(chofer6, taxi6);
        Vehiculo vehiculo6 = new Vehiculo("Nissan", "NFA-725");
        Gasolina gasolina6 = new Gasolina("Ecopais", 12, 2.40);

        carrera6.setLocacion("Nivel Provincial");
        carrera6.setUbicacion("El Retiro");
        carrera6.proced_CalcularCostoCarrera();
        gasolina6.TotalPagarGasolina();

        Contacto6 = new Agencia_de_Taxis(chofer6 ,taxi6, carrera6);

        JOptionPane.showMessageDialog(null, chofer6.ToString());
        JOptionPane.showMessageDialog(null, vehiculo6.ToString());
        JOptionPane.showMessageDialog(null, carrera6.ToString());
        JOptionPane.showMessageDialog(null, gasolina6.ToString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agencia de Taxis");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el contacto de acuerdo a su destino (Provincial):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seleccione el contacto de acuerdo a su destino (Local):");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Contacto1", "Contacto2", "Contacto3" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 170, 30));

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione uno>", "Contacto4", "Contacto5", "Contacto6" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 170, 30));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccione el tipo de Destino:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Destino Local");
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Destino Provincial");
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Listo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 70, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Taxi83.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String dest1 = "", dest2 = "";

    public void Habilitar(boolean bol) {
        jComboBox1.setEnabled(bol);
    }

    public void Habilitar2(boolean bol) {
        jComboBox2.setEnabled(bol);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dest1 = jComboBox1.getSelectedItem().toString();
        dest2 = jComboBox2.getSelectedItem().toString();
        if (jComboBox1.getSelectedIndex() == 1) {
            Con1();
        } else if (jComboBox1.getSelectedIndex() == 2) {
            Con2();
        } else if (jComboBox1.getSelectedIndex() == 3) {
            Con3();
        }
        
        if (jComboBox2.getSelectedIndex() == 1) {
            Con4();
        } else if (jComboBox2.getSelectedIndex() == 2) {
            Con5();
        } else if (jComboBox2.getSelectedIndex() == 3) {
            Con6();
        }
        
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()) {
            Habilitar2(false);
        }
        if (jRadioButton2.isSelected()) {
            Habilitar(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(frm_Agencia_de_Taxis_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_Agencia_de_Taxis_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_Agencia_de_Taxis_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_Agencia_de_Taxis_E.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Agencia_de_Taxis_E().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
