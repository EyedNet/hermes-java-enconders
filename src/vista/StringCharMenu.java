
package vista;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.*;

/**


      __________        __                
______\______   \ _____/  |_  ___________ 
\_  __ \     ___// __ \   __\/ __ \_  __ \
 |  | \/    |   \  ___/|  | \  ___/|  | \/
 |__|  |____|    \___  >__|  \___  >__|   
                     \/          \/       


 */
public class StringCharMenu extends javax.swing.JFrame {

   private int x,y;
    public StringCharMenu() {
        setUndecorated(true);
        setResizable(false);
        setBackground(new Color(0,0,0,0));
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelminimize = new javax.swing.JLabel();
        jLabelHelp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaOut = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaIn = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelcleanGreen = new javax.swing.JLabel();
        jLabelStartGreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("String Char Code");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ufo-icon.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hermes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 506, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 810, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabelExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salir-32.png"))); // NOI18N
        jLabelExit.setToolTipText("Exit");
        jLabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExitMouseClicked(evt);
            }
        });

        jLabelminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minimizar-32.png"))); // NOI18N
        jLabelminimize.setToolTipText("Minimize");
        jLabelminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminimizeMouseClicked(evt);
            }
        });

        jLabelHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help-32.png"))); // NOI18N
        jLabelHelp.setToolTipText("Como || How");
        jLabelHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHelpMouseClicked(evt);
            }
        });

        jTextAreaOut.setColumns(20);
        jTextAreaOut.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jTextAreaOut.setForeground(new java.awt.Color(0, 102, 255));
        jTextAreaOut.setRows(5);
        jTextAreaOut.setBorder(null);
        jTextAreaOut.setCaretColor(new java.awt.Color(0, 102, 255));
        jScrollPane1.setViewportView(jTextAreaOut);

        jTextAreaIn.setColumns(20);
        jTextAreaIn.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jTextAreaIn.setForeground(new java.awt.Color(0, 102, 255));
        jTextAreaIn.setRows(5);
        jTextAreaIn.setBorder(null);
        jTextAreaIn.setCaretColor(new java.awt.Color(0, 102, 255));
        jScrollPane2.setViewportView(jTextAreaIn);

        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Inserte el Texto para codificar en Ascii");

        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Salida texto ascii");

        jLabelcleanGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean-blue-64.png"))); // NOI18N
        jLabelcleanGreen.setToolTipText("Limpiar || Clean");
        jLabelcleanGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcleanGreenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelcleanGreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelcleanGreenMouseExited(evt);
            }
        });

        jLabelStartGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start-64_1.png"))); // NOI18N
        jLabelStartGreen.setToolTipText("Start ");
        jLabelStartGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelStartGreenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelStartGreenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelStartGreenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelHelp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelminimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelExit)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelStartGreen)
                                    .addComponent(jLabelcleanGreen))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelStartGreen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelcleanGreen)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelExit)
                            .addComponent(jLabelminimize)
                            .addComponent(jLabelHelp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1010, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
           x = evt.getX  ()  ;
           y = evt.getY ()  ; 
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         Point point = MouseInfo.getPointerInfo().getLocation()   ;
         setLocation(point.x - x, point.y - y)   ; 
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX  ()  ;
        y = evt.getY ()  ;
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation()   ;
        setLocation(point.x - x, point.y - y)   ;
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jLabelHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHelpMouseClicked
      JOptionPane.showMessageDialog
        (null,"Introduzca el código en el TextArea de la izquierda y click Start \n"
                + "\n"
             + "Insert text inside left TextArea and then click Start \n"
              ,"Información",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jLabelHelpMouseClicked

    private void jLabelminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminimizeMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelminimizeMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        this.setVisible(false);
        new MenuEncoders().setVisible(true);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelStartGreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStartGreenMouseEntered
       jLabelStartGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start-green-64.png")));
    }//GEN-LAST:event_jLabelStartGreenMouseEntered

    private void jLabelStartGreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStartGreenMouseExited
       jLabelStartGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/start-64_1.png")));
    }//GEN-LAST:event_jLabelStartGreenMouseExited

    private void jLabelcleanGreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcleanGreenMouseEntered
       jLabelcleanGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean-green-64.png")));
    }//GEN-LAST:event_jLabelcleanGreenMouseEntered

    private void jLabelcleanGreenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcleanGreenMouseExited
       jLabelcleanGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clean-blue-64.png")));
    }//GEN-LAST:event_jLabelcleanGreenMouseExited

    private void jLabelStartGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelStartGreenMouseClicked
       jTextAreaOut.setText("");
       //Recojemos el área de texto en una variable
       String txtareain=jTextAreaIn.getText().trim();
               if(txtareain.equals("")){
                JOptionPane.showMessageDialog
        (null,"El Campo de texto no puede estar vacío \n"
             + "The Text Area cann't be empty\n"
              ,"Error",JOptionPane.ERROR_MESSAGE);}
               else{
                   StringCharCode scrc= new StringCharCode();
                   String outstringchar=scrc.getStringCharCode(txtareain);
                   
                   jTextAreaOut.append("===================================");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("Ascii convertion");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("===================================");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append(outstringchar);
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("===================================");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("Code to by_pass javascript security");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("===================================");
                   jTextAreaOut.append("\n");
                   jTextAreaOut.append("(String.fromCharCode("+"\""+outstringchar+"\"))\"");
                    
                   
                   }
    }//GEN-LAST:event_jLabelStartGreenMouseClicked

    private void jLabelcleanGreenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcleanGreenMouseClicked
        jTextAreaIn.setText("");
        jTextAreaOut.setText("");
    }//GEN-LAST:event_jLabelcleanGreenMouseClicked
      
       
      public void setcolorPaneHover (JPanel jp){
      jp.setBackground(new java.awt.Color(93,173,255));}
      
      public void resetcolorPaneHover (JPanel jp){
      jp.setBackground(new java.awt.Color(240,240,240));}
      
      
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
            java.util.logging.Logger.getLogger(StringCharMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StringCharMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StringCharMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StringCharMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StringCharMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelHelp;
    private javax.swing.JLabel jLabelStartGreen;
    private javax.swing.JLabel jLabelcleanGreen;
    private javax.swing.JLabel jLabelminimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaIn;
    private javax.swing.JTextArea jTextAreaOut;
    // End of variables declaration//GEN-END:variables
}
