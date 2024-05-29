package view;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Gabriel
 */
public class Errore extends javax.swing.JFrame {

    /**
     * Creates new form Errore
     * @param messaggioDiErrore
     */
    public Errore(String messaggioDiErrore) {
        initComponents();
        this.messaggioDiErrore.setText(messaggioDiErrore);
        this.messaggioDiErrore.setHorizontalAlignment(SwingConstants.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sfondoErrore = new view.Sfondo3();
        pulsanteOk = new javax.swing.JButton();
        etichettaErrore = new javax.swing.JLabel();
        messaggioDiErrore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(300, 200));

        pulsanteOk.setBackground(new java.awt.Color(255, 255, 254));
        pulsanteOk.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pulsanteOk.setText("Ok");
        pulsanteOk.setBorderPainted(false);
        pulsanteOk.setFocusPainted(false);
        pulsanteOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsanteOkActionPerformed(evt);
            }
        });

        etichettaErrore.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        etichettaErrore.setForeground(new java.awt.Color(255, 255, 255));
        etichettaErrore.setText("ERRORE");

        messaggioDiErrore.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        messaggioDiErrore.setForeground(new java.awt.Color(255, 255, 255));
        messaggioDiErrore.setText("nessun errore");
        messaggioDiErrore.setToolTipText("");

        javax.swing.GroupLayout sfondoErroreLayout = new javax.swing.GroupLayout(sfondoErrore);
        sfondoErrore.setLayout(sfondoErroreLayout);
        sfondoErroreLayout.setHorizontalGroup(
            sfondoErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messaggioDiErrore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfondoErroreLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(etichettaErrore)
                .addGap(99, 99, 99))
            .addGroup(sfondoErroreLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(pulsanteOk)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sfondoErroreLayout.setVerticalGroup(
            sfondoErroreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sfondoErroreLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etichettaErrore)
                .addGap(18, 18, 18)
                .addComponent(messaggioDiErrore)
                .addGap(26, 26, 26)
                .addComponent(pulsanteOk)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondoErrore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondoErrore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pulsanteOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulsanteOkActionPerformed
        this.dispose();
    }//GEN-LAST:event_pulsanteOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etichettaErrore;
    private javax.swing.JLabel messaggioDiErrore;
    private javax.swing.JButton pulsanteOk;
    private view.Sfondo3 sfondoErrore;
    // End of variables declaration//GEN-END:variables
}
