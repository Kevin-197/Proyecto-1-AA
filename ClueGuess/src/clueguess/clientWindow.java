/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueguess;

/**
 *
 * @author eidur
 */
public class clientWindow extends javax.swing.JFrame {

    /**
     * Creates new form clientWindow
     */
    public clientWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel2 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gameBackground = new javax.swing.JLabel();
        MainPanel1 = new javax.swing.JPanel();
        numberVariables = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        menuBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 920));
        setMinimumSize(new java.awt.Dimension(1500, 920));
        setPreferredSize(new java.awt.Dimension(1500, 880));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel2.setMaximumSize(new java.awt.Dimension(1500, 920));
        MainPanel2.setMinimumSize(new java.awt.Dimension(1500, 920));
        MainPanel2.setPreferredSize(new java.awt.Dimension(1500, 920));
        MainPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        MainPanel2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 790, 310));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Armas/botella.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);

        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);

        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5);

        MainPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 790, 250));

        gameBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.png"))); // NOI18N
        MainPanel2.add(gameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        getContentPane().add(MainPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        MainPanel1.setMaximumSize(new java.awt.Dimension(1500, 920));
        MainPanel1.setMinimumSize(new java.awt.Dimension(1500, 920));
        MainPanel1.setPreferredSize(new java.awt.Dimension(1500, 920));
        MainPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        numberVariables.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        numberVariables.setText("0");
        numberVariables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberVariablesActionPerformed(evt);
            }
        });
        MainPanel1.add(numberVariables, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 810, 50, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("N° de restricciones:");
        MainPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 800, 210, 60));

        startButton.setBackground(new java.awt.Color(0, 102, 0));
        startButton.setFont(new java.awt.Font("Cookie", 0, 24)); // NOI18N
        startButton.setForeground(new java.awt.Color(240, 240, 240));
        startButton.setText("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        MainPanel1.add(startButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 660, 190, 80));

        menuBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/title.png"))); // NOI18N
        MainPanel1.add(menuBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, -1, -1));

        getContentPane().add(MainPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
        this.MainPanel1.setVisible(false);
        this.MainPanel2.setVisible(true);
        
    }//GEN-LAST:event_startButtonActionPerformed

    private void numberVariablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberVariablesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberVariablesActionPerformed

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
            java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel1;
    private javax.swing.JPanel MainPanel2;
    private javax.swing.JLabel gameBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel menuBackground;
    private javax.swing.JTextField numberVariables;
    private javax.swing.JButton startButton;
    // End of variables declaration//GEN-END:variables
}
