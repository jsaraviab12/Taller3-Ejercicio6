/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
      
        initComponents();
          cmdAgregar.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdServir.setEnabled(false);
        cmdVaciar.setEnabled(false);
        txtServir.setEditable(false);
        txtAgregar.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtServir = new javax.swing.JTextField();
        txtAgregar = new javax.swing.JTextField();
        cmdVaciar = new javax.swing.JButton();
        cmdAgregar = new javax.swing.JButton();
        cmdServir = new javax.swing.JButton();
        cmdLlenar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtActual = new javax.swing.JTextField();
        txtCapmax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmdSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cantidad a Agregar");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel2.setText("Cantidad a Servir");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        txtServir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtServirKeyTyped(evt);
            }
        });
        jPanel2.add(txtServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 100, -1));

        txtAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgregarKeyTyped(evt);
            }
        });
        jPanel2.add(txtAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        cmdVaciar.setForeground(new java.awt.Color(153, 0, 0));
        cmdVaciar.setText("Vaciar");
        cmdVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdVaciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        cmdAgregar.setText("Agregar");
        cmdAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        cmdServir.setText("Servir");
        cmdServir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirActionPerformed(evt);
            }
        });
        jPanel2.add(cmdServir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        cmdLlenar.setForeground(new java.awt.Color(51, 153, 0));
        cmdLlenar.setText("Llenar");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 310, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtArea.setEditable(false);
        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 310, 150));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 36)); // NOI18N
        jLabel3.setText("Saravia's");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(145, 60, 24));
        jLabel4.setText("Coffe");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, 20));

        jLabel5.setText("Capacidad Maxima");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 90, -1));

        txtCapmax.setEditable(false);
        txtCapmax.setText("1000");
        jPanel1.add(txtCapmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 90, -1));

        jLabel6.setText("Capacidad Actual");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        cmdSiguiente.setText("Siguiente");
        cmdSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(691, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarActionPerformed
        Cafetera c;
        int agregar,capactual,capmax;
        String aux;
        
        if (txtAgregar.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la cantidad a agregar", "error", JOptionPane.ERROR_MESSAGE);
            txtAgregar.requestFocusInWindow();
        }else{
            capmax=capactual=Integer.parseInt(txtCapmax.getText());
        capactual=Integer.parseInt(txtActual.getText());
       agregar = Integer.parseInt(txtAgregar.getText());
         c = new Cafetera( capmax,capactual);
          c.agregar(agregar);
          txtArea.setText(c.mostrar()); 
          txtActual.setText(c.renovar());
        }
        txtActual.setEditable(false);
    }//GEN-LAST:event_cmdAgregarActionPerformed

    private void cmdServirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirActionPerformed
          Cafetera c;
        int servir,capactual,capmax;
        String aux;
        
        if (txtServir.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la cantidad a servir", "error", JOptionPane.ERROR_MESSAGE);
            txtServir.requestFocusInWindow();
        }else{
            capmax=capactual=Integer.parseInt(txtCapmax.getText());
        capactual=Integer.parseInt(txtActual.getText());
       servir = Integer.parseInt(txtServir.getText());
         c = new Cafetera( capmax,capactual);
          c.servir(servir);
          txtArea.setText(c.mostrar()); 
          txtActual.setText(c.renovar());
        }
        
    }//GEN-LAST:event_cmdServirActionPerformed

    private void cmdSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSiguienteActionPerformed
        String aux;
        int actual; 
        if (txtActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la cantidad actual", "error", JOptionPane.ERROR_MESSAGE);
            txtActual.requestFocusInWindow();
         } else{
           actual=Integer.parseInt(txtActual.getText());
           if(actual>1000){
           JOptionPane.showMessageDialog(this,"La capacida maxima es de mil","error",JOptionPane.ERROR_MESSAGE);
           aux=String.valueOf(1000);
           txtActual.setText(aux);
           }
             
         }
        cmdAgregar.setEnabled(true);
        cmdLlenar.setEnabled(true);
        cmdServir.setEnabled(true);
        cmdVaciar.setEnabled(true);
        txtServir.setEditable(true);
        txtAgregar.setEditable(true);
    }//GEN-LAST:event_cmdSiguienteActionPerformed

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed
       Cafetera c;
        c = new Cafetera( 1000,1000);
          c.llenar();
          txtArea.setText(c.mostrar()); 
          txtActual.setText(c.renovar());  
    }//GEN-LAST:event_cmdLlenarActionPerformed

    private void cmdVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarActionPerformed
       Cafetera c;
        c = new Cafetera( 1000,0);
          c.vaciar();
          txtArea.setText(c.mostrar()); 
          txtActual.setText(c.renovar()); 
    }//GEN-LAST:event_cmdVaciarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
       txtArea.setText("");
       txtActual.setText("");
       txtAgregar.setText("");
       txtServir.setText("");
        cmdAgregar.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdServir.setEnabled(false);
        cmdVaciar.setEnabled(false);
        txtServir.setEditable(false);
        txtAgregar.setEditable(false);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtActualKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtActualKeyTyped

    private void txtAgregarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgregarKeyTyped
 char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgregarKeyTyped

    private void txtServirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtServirKeyTyped
 char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar())) { 
              getToolkit().beep(); 
               
              evt.consume(); 
          }        // TODO add your handling code here:
    }//GEN-LAST:event_txtServirKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregar;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdServir;
    private javax.swing.JButton cmdSiguiente;
    private javax.swing.JButton cmdVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtActual;
    private javax.swing.JTextField txtAgregar;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCapmax;
    private javax.swing.JTextField txtServir;
    // End of variables declaration//GEN-END:variables
}
