package view;

import controller.Controller;

/**
 *
 * @author Gabriel
 */
public class ColoreJolly extends javax.swing.JFrame {

    private Controller controller;
    
    /**
     * Creates new form ColoreJolly
     */
    public ColoreJolly(Controller controller) {
        initComponents();
        this.controller = controller;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sfondo = new view.Sfondo2();
        pulsanteRosso = new javax.swing.JButton();
        etichettaScegliColore = new javax.swing.JLabel();
        pulsanteBlu = new javax.swing.JButton();
        pulsanteGiallo = new javax.swing.JButton();
        pulsanteVerde = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pulsanteRosso.setBackground(new java.awt.Color(247, 227, 89));
        pulsanteRosso.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pulsanteRosso.setText("Rosso");
        pulsanteRosso.setBorderPainted(false);
        pulsanteRosso.setFocusPainted(false);
        pulsanteRosso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteRossoActionPerformed(evt);
            }
        });

        etichettaScegliColore.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etichettaScegliColore.setText("Scegli il colore");

        pulsanteBlu.setBackground(new java.awt.Color(247, 227, 89));
        pulsanteBlu.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pulsanteBlu.setText("Blu");
        pulsanteBlu.setBorderPainted(false);
        pulsanteBlu.setFocusPainted(false);
        pulsanteBlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteBluActionPerformed(evt);
            }
        });

        pulsanteGiallo.setBackground(new java.awt.Color(247, 227, 89));
        pulsanteGiallo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pulsanteGiallo.setText("Giallo");
        pulsanteGiallo.setBorderPainted(false);
        pulsanteGiallo.setFocusPainted(false);
        pulsanteGiallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteGialloActionPerformed(evt);
            }
        });

        pulsanteVerde.setBackground(new java.awt.Color(247, 227, 89));
        pulsanteVerde.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        pulsanteVerde.setText("Verde");
        pulsanteVerde.setBorderPainted(false);
        pulsanteVerde.setFocusPainted(false);
        pulsanteVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteVerdeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sfondoLayout = new javax.swing.GroupLayout(sfondo);
        sfondo.setLayout(sfondoLayout);
        sfondoLayout.setHorizontalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sfondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etichettaScegliColore)
                .addGap(175, 175, 175))
            .addGroup(sfondoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pulsanteVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulsanteBlu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pulsanteGiallo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulsanteRosso, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        sfondoLayout.setVerticalGroup(
            sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfondoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(etichettaScegliColore)
                .addGap(36, 36, 36)
                .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulsanteBlu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulsanteRosso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(sfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pulsanteGiallo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pulsanteVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pulsanteRossoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteRossoActionPerformed
        controller.setColoreJolly("Rosso");
        this.dispose();
    }//GEN-LAST:event_pulsanteRossoActionPerformed

    private void pulsanteBluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteBluActionPerformed
        controller.setColoreJolly("Blu");
        this.dispose();
    }//GEN-LAST:event_pulsanteBluActionPerformed

    private void pulsanteGialloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteGialloActionPerformed
        controller.setColoreJolly("Giallo");
        this.dispose();
    }//GEN-LAST:event_pulsanteGialloActionPerformed

    private void pulsanteVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteVerdeActionPerformed
        controller.setColoreJolly("Verde");
        this.dispose();
    }//GEN-LAST:event_pulsanteVerdeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etichettaScegliColore;
    private javax.swing.JButton pulsanteBlu;
    private javax.swing.JButton pulsanteGiallo;
    private javax.swing.JButton pulsanteRosso;
    private javax.swing.JButton pulsanteVerde;
    private view.Sfondo2 sfondo;
    // End of variables declaration//GEN-END:variables
}
