/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telafuncao;

/**
 *
 * @author arthu_uhkw4r8
 */
public class TelaFuncaoFatoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncaoFatoria
     */
    public TelaFuncaoFatoria() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        txtNum = new javax.swing.JSpinner();
        btnFatorial = new javax.swing.JButton();
        lblFormula = new javax.swing.JLabel();
        lblFatorial = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtNum.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(txtNum);
        txtNum.setBounds(110, 80, 64, 22);

        btnFatorial.setText("!");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });
        jPanel1.add(btnFatorial);
        btnFatorial.setBounds(570, 80, 60, 23);

        lblFormula.setForeground(new java.awt.Color(255, 255, 255));
        lblFormula.setText("Formula");
        jPanel1.add(lblFormula);
        lblFormula.setBounds(210, 170, 210, 16);

        lblFatorial.setForeground(new java.awt.Color(255, 255, 255));
        lblFatorial.setText("Resultado");
        jPanel1.add(lblFatorial);
        lblFatorial.setBounds(440, 170, 190, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Arquivos\\Arthur\\downloads\\Wallpapers\\vecteezy_front-view-dark-silhouette-of-a-modern-sport-black-car_23977559.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 730, 350);

        jLayeredPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed
        // TODO add your handling code here:
        int n = Integer.parseInt(txtNum.getValue().toString());
        Fatorial f = new Fatorial();
        f.setValor(n);
        lblFormula.setText(f.getFormula());
        lblFatorial.setText(Integer.toString(f.getFatorial()));
    }//GEN-LAST:event_btnFatorialActionPerformed

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
            java.util.logging.Logger.getLogger(TelaFuncaoFatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncaoFatoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncaoFatoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFatorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFatorial;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
