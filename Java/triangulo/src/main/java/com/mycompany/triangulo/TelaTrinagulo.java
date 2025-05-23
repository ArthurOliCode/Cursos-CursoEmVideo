/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.triangulo;

/**
 *
 * @author arthu_uhkw4r8
 */
public class TelaTrinagulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTrinagulo
     */
    public TelaTrinagulo() {
        initComponents();
        panRes.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sliderSegmentoC = new javax.swing.JSlider();
        sliderSegmentoB = new javax.swing.JSlider();
        sliderSegmentoA = new javax.swing.JSlider();
        lblValorSegA = new javax.swing.JLabel();
        lblValorSegB = new javax.swing.JLabel();
        lblValorSegC = new javax.swing.JLabel();
        panTitulo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        panRes = new javax.swing.JPanel();
        lblForma = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Forma Ou não?");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Segmento A:  ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 100, 80, 16);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Segmento B: ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 170, 80, 16);

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Segmento C:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 250, 80, 16);

        sliderSegmentoC.setMajorTickSpacing(1);
        sliderSegmentoC.setMaximum(20);
        sliderSegmentoC.setValue(0);
        sliderSegmentoC.setName(""); // NOI18N
        sliderSegmentoC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSegmentoCStateChanged(evt);
            }
        });
        jPanel1.add(sliderSegmentoC);
        sliderSegmentoC.setBounds(130, 250, 200, 20);

        sliderSegmentoB.setMajorTickSpacing(1);
        sliderSegmentoB.setMaximum(20);
        sliderSegmentoB.setValue(0);
        sliderSegmentoB.setName(""); // NOI18N
        sliderSegmentoB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSegmentoBStateChanged(evt);
            }
        });
        jPanel1.add(sliderSegmentoB);
        sliderSegmentoB.setBounds(130, 170, 200, 20);

        sliderSegmentoA.setMajorTickSpacing(1);
        sliderSegmentoA.setMaximum(20);
        sliderSegmentoA.setValue(0);
        sliderSegmentoA.setName(""); // NOI18N
        sliderSegmentoA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderSegmentoAStateChanged(evt);
            }
        });
        jPanel1.add(sliderSegmentoA);
        sliderSegmentoA.setBounds(130, 100, 200, 20);

        lblValorSegA.setBackground(new java.awt.Color(153, 153, 153));
        lblValorSegA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorSegA.setForeground(new java.awt.Color(153, 153, 153));
        lblValorSegA.setText("0");
        jPanel1.add(lblValorSegA);
        lblValorSegA.setBounds(340, 100, 30, 20);

        lblValorSegB.setBackground(new java.awt.Color(153, 153, 153));
        lblValorSegB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorSegB.setForeground(new java.awt.Color(153, 153, 153));
        lblValorSegB.setText("0");
        jPanel1.add(lblValorSegB);
        lblValorSegB.setBounds(340, 170, 30, 20);

        lblValorSegC.setBackground(new java.awt.Color(153, 153, 153));
        lblValorSegC.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorSegC.setForeground(new java.awt.Color(153, 153, 153));
        lblValorSegC.setText("0");
        jPanel1.add(lblValorSegC);
        lblValorSegC.setBounds(340, 250, 30, 20);

        panTitulo.setBackground(new java.awt.Color(29, 28, 28));

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bem vindo ao programa!! Aqui é analisado se um triângulo pode ser formado com as medidas inseridas.");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(panTitulo);
        panTitulo.setBounds(280, 10, 560, 50);

        btnCalc.setBackground(new java.awt.Color(51, 51, 51));
        btnCalc.setForeground(new java.awt.Color(153, 153, 153));
        btnCalc.setText("Calcular");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalc);
        btnCalc.setBounds(490, 410, 80, 23);

        panRes.setBackground(new java.awt.Color(28, 28, 28));
        panRes.setInheritsPopupMenu(true);

        lblForma.setForeground(new java.awt.Color(153, 153, 153));
        lblForma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblForma.setText("Forma Ou não?");

        lblTipo.setForeground(new java.awt.Color(153, 153, 153));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo do triângulo");

        javax.swing.GroupLayout panResLayout = new javax.swing.GroupLayout(panRes);
        panRes.setLayout(panResLayout);
        panResLayout.setHorizontalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        panResLayout.setVerticalGroup(
            panResLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panResLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblForma, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.add(panRes);
        panRes.setBounds(500, 80, 580, 210);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Arquivos\\Arthur\\downloads\\Wallpapers\\670457.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1100, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderSegmentoAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSegmentoAStateChanged
        // TODO add your handling code here:
        // tam é igual ao tamanho da aresta
        int tam = sliderSegmentoA.getValue();
        lblValorSegA.setText(String.valueOf(tam));
    }//GEN-LAST:event_sliderSegmentoAStateChanged

    private void sliderSegmentoBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSegmentoBStateChanged
        // TODO add your handling code here:
        int tam = sliderSegmentoB.getValue();
        lblValorSegB.setText(String.valueOf(tam));
    }//GEN-LAST:event_sliderSegmentoBStateChanged

    private void sliderSegmentoCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderSegmentoCStateChanged
        // TODO add your handling code here:
        int tam = sliderSegmentoC.getValue();
        lblValorSegC.setText(String.valueOf(tam));
    }//GEN-LAST:event_sliderSegmentoCStateChanged

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:
        panTitulo.setVisible(false);
        panRes.setVisible(true);
        int segA = sliderSegmentoA.getValue();
        int segB = sliderSegmentoB.getValue();
        int segC = sliderSegmentoC.getValue();
        if ((((segA + segB) < segC) || ((segB + segC) < segA) || ((segA + segC) < segB))){
            lblForma.setText("Não forma um triângulo!");
            lblTipo.setText("-------");
        }else{
            lblForma.setText("Forma um triângulo!");
            if (segA == segB && segB == segC){
                lblTipo.setText("Triângulo Equilátero");
            }else if ((segA == segB && segB != segC) || (segA != segB && segB == segC) || (segB != segC && segA == segC)){
                lblTipo.setText("Triângulo Isoceles");
            }else if ((segA != segB) && (segC != segA) && (segB != segC)){
                lblTipo.setText("Triângulo Escaleno");
        }
    }//GEN-LAST:event_btnCalcActionPerformed
    }
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
            java.util.logging.Logger.getLogger(TelaTrinagulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTrinagulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTrinagulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTrinagulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTrinagulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblForma;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblValorSegA;
    private javax.swing.JLabel lblValorSegB;
    private javax.swing.JLabel lblValorSegC;
    private javax.swing.JPanel panRes;
    private javax.swing.JPanel panTitulo;
    private javax.swing.JSlider sliderSegmentoA;
    private javax.swing.JSlider sliderSegmentoB;
    private javax.swing.JSlider sliderSegmentoC;
    // End of variables declaration//GEN-END:variables
}
