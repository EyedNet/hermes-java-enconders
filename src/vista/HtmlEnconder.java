
package vista;

import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.SwingBrowser;

/**


      __________        __                
______\______   \ _____/  |_  ___________ 
\_  __ \     ___// __ \   __\/ __ \_  __ \
 |  | \/    |   \  ___/|  | \  ___/|  | \/
 |__|  |____|    \___  >__|  \___  >__|   
                     \/          \/       


 */
public class HtmlEnconder extends javax.swing.JFrame {

   private int x,y;
    public HtmlEnconder() {
        setUndecorated(true);
        setResizable(false);
        setBackground(new Color(0,0,0,0));
        //setExtendedState(this.MAXIMIZED_BOTH);
        initComponents();
        this.setLocationRelativeTo(null);
        SwingBrowser browser = new SwingBrowser();
        String url =getClass().getResource("/html/rt/rt.html").toExternalForm();
        
        browser.loadURL(url);
        browser.setBounds(1, 1, jPanelHtml.getWidth() - 1, jPanelHtml.getHeight() - 1);
        jPanelHtml.add(browser);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelbanner = new javax.swing.JPanel();
        jLabelExit = new javax.swing.JLabel();
        jLabelminimize = new javax.swing.JLabel();
        jLabelHelp = new javax.swing.JLabel();
        jPanelHtml = new javax.swing.JPanel();

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
        jLabel1.setText("Html Encoder");

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
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 360, 120));

        jPanelbanner.setBackground(new java.awt.Color(255, 255, 255));
        jPanelbanner.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelbannerMouseDragged(evt);
            }
        });
        jPanelbanner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelbannerMousePressed(evt);
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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelHelpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanelbannerLayout = new javax.swing.GroupLayout(jPanelbanner);
        jPanelbanner.setLayout(jPanelbannerLayout);
        jPanelbannerLayout.setHorizontalGroup(
            jPanelbannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbannerLayout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(jLabelHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelminimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelExit)
                .addGap(23, 23, 23))
        );
        jPanelbannerLayout.setVerticalGroup(
            jPanelbannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelbannerLayout.createSequentialGroup()
                .addGroup(jPanelbannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelExit)
                    .addComponent(jLabelminimize)
                    .addComponent(jLabelHelp))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelbanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 690, 40));

        jPanelHtml.setFocusable(false);

        javax.swing.GroupLayout jPanelHtmlLayout = new javax.swing.GroupLayout(jPanelHtml);
        jPanelHtml.setLayout(jPanelHtmlLayout);
        jPanelHtmlLayout.setHorizontalGroup(
            jPanelHtmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanelHtmlLayout.setVerticalGroup(
            jPanelHtmlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelHtml, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 690, 570));

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

    private void jPanelbannerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelbannerMousePressed
        x = evt.getX  ()  ;
        y = evt.getY ()  ;
    }//GEN-LAST:event_jPanelbannerMousePressed

    private void jPanelbannerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelbannerMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation()   ;
        setLocation(point.x - x, point.y - y)   ;
    }//GEN-LAST:event_jPanelbannerMouseDragged

    private void jLabelHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHelpMouseClicked
      JOptionPane.showMessageDialog
        (null,"Inserte el Código javascript ó html después haga click en el botón \n"
             + "\n"
             + "Insert your code javascript or html after that click on botton\n"
              ,"Información",JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jLabelHelpMouseClicked

    private void jLabelminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminimizeMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelminimizeMouseClicked

    private void jLabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExitMouseClicked
        this.setVisible(false);
        new MenuEncoders().setVisible(true);
    }//GEN-LAST:event_jLabelExitMouseClicked

    private void jLabelHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHelpMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelHelpMousePressed
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
            java.util.logging.Logger.getLogger(HtmlEnconder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HtmlEnconder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HtmlEnconder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HtmlEnconder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HtmlEnconder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelExit;
    private javax.swing.JLabel jLabelHelp;
    private javax.swing.JLabel jLabelminimize;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelHtml;
    private javax.swing.JPanel jPanelbanner;
    // End of variables declaration//GEN-END:variables
}
