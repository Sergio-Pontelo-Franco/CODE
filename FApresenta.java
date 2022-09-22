package jogo_poo;

public class FApresenta extends javax.swing.JFrame {

    public FApresenta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Desenv = new javax.swing.JMenuItem();
        Regras = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cadjog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JOGO SOBRE PROGRAMAÇAO ORIENTA A OBJETO");

        jMenu1.setText("Sobre");

        Desenv.setText("Desenvolvedor");
        Desenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesenvActionPerformed(evt);
            }
        });
        jMenu1.add(Desenv);

        Regras.setText("Regras do Jogo");
        Regras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegrasActionPerformed(evt);
            }
        });
        jMenu1.add(Regras);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jMenu1.add(Sair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cadastro");

        cadjog.setText("Jogadores");
        cadjog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadjogActionPerformed(evt);
            }
        });
        jMenu2.add(cadjog);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 841, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(857, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void DesenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesenvActionPerformed
        new FRegras().setVisible(false);
        new FBatalha().setVisible(false);
        new FDesenv().setVisible(true);
                
    }//GEN-LAST:event_DesenvActionPerformed

    private void RegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegrasActionPerformed
        new FBatalha().setVisible(false);
        new FDesenv().setVisible(false);
        new FRegras().setVisible(true);
        
    }//GEN-LAST:event_RegrasActionPerformed

    private void cadjogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadjogActionPerformed
        new FRegras().setVisible(false);
        new FDesenv().setVisible(false);
        new FBatalha().setVisible(true);

    }//GEN-LAST:event_cadjogActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FApresenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Desenv;
    private javax.swing.JMenuItem Regras;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem cadjog;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
