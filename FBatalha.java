package jogo_poo;

import javax.swing.JOptionPane;

public class FBatalha extends javax.swing.JFrame {

    Posicao posicao = new Posicao();
//  String respcorr = "S";

    public FBatalha() {
        initComponents();
        desativaBatalha();
    }
    private void desativaBatalha() {
        per.setText("");
        btIniciar.setEnabled(false);
        btSalvar.setEnabled(true);
        jog1.setText("");
        jog2.setText("");
        Tnome.requestFocus(true);
    }
    private void ativaBatalha() {
        Tnome.setEditable(false);
        Tapelido.setEditable(false);
        Temail.setEditable(false);
        Cpersonagem.setEnabled(false);
        btSalvar.setEnabled(false);
        btIniciar.setEnabled(true);
        btIniciar.requestFocus();
    }
    private void pergu1() {
        joga.setText(posicao.jogador.get(0).getPersonagem());
        per.setText("Que nome se dá aos atributos privados?");
        alter1.setText("A - Polimorfismo");
        alter2.setText("B - Encapsulamento");
        alter3.setText("C - Composição");
        alter4.setText("D - Agregação");
        jog1.setText(posicao.jogador.get(0).getPersonagem());
        jog2.setText(posicao.jogador.get(1).getPersonagem());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escolha = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tnome = new javax.swing.JTextField();
        Tapelido = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        Cpersonagem = new javax.swing.JComboBox<>();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ApPersona = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nperg = new javax.swing.JLabel();
        per = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        alter1 = new javax.swing.JRadioButton();
        alter2 = new javax.swing.JRadioButton();
        alter3 = new javax.swing.JRadioButton();
        alter4 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jog1 = new javax.swing.JLabel();
        jog2 = new javax.swing.JLabel();
        vida1 = new javax.swing.JProgressBar();
        vida2 = new javax.swing.JProgressBar();
        btIniciar = new javax.swing.JButton();
        limite = new javax.swing.JLabel();
        joga = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO E BATALHA");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("C A D A S T R O   D E   J O G A D O R E S");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Apelido:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("e-mail:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Personagem:");

        Cpersonagem.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Cpersonagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "GLADIADOR", "ARQUEIRO", "SAMURAI", "DEMOLIDOR", "NINJA" }));

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Pergunta para:");

        ApPersona.setText("    ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Pergunta nº");

        nperg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nperg.setText("1");

        per.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        per.setText("P");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nperg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(per)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(nperg)))
                .addGap(25, 25, 25))
        );

        escolha.add(alter1);

        escolha.add(alter2);

        escolha.add(alter3);

        escolha.add(alter4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alter3)
                    .addComponent(alter2)
                    .addComponent(alter1)
                    .addComponent(alter4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alter1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alter2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alter3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alter4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("P L A C A R");

        jog1.setText("JOGADOR 1");

        jog2.setText("JOGADOR 2");

        vida1.setString("100%");
        vida1.setStringPainted(true);

        vida2.setString("100%");
        vida2.setStringPainted(true);

        btIniciar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btIniciar.setText("CONFIRMA");
        btIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIniciarActionPerformed(evt);
            }
        });

        limite.setText("          ");

        joga.setText("   ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(limite)
                        .addGap(162, 162, 162)
                        .addComponent(ApPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(joga, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Tapelido, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cpersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Temail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                .addComponent(Tnome, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btIniciar)
                .addGap(305, 305, 305))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jog1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jog2)
                    .addComponent(vida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(Tnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tapelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cpersonagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ApPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limite))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(joga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jog1)
                    .addComponent(jog2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vida1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(btIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        setSize(new java.awt.Dimension(771, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

    String nome = Tnome.getText();    
    String apelido = Tapelido.getText();
    String email = Temail.getText();
    String personagem = Cpersonagem.getSelectedItem().toString();

    if (Tnome.getText().equals("") ) {
        JOptionPane.showMessageDialog(null, "Informe o Nome.");
        Tnome.requestFocus();
        return;
    }
    if (Tapelido.getText().equals("") ) {
        JOptionPane.showMessageDialog(null, "Informe o Apelido.");
        Tapelido.requestFocus();
        return;
    }
    if (Temail.getText().equals("") ) {
        JOptionPane.showMessageDialog(null, "Informe o e-mail.");
        Temail.requestFocus();
        return;
    }
    if (Cpersonagem.getSelectedItem().equals("<Selecione>")) {
        JOptionPane.showMessageDialog(null, "Informe o Personagem.");
        Cpersonagem.requestFocus();
        return;
    }
    Jogadores j = new Jogadores(nome, apelido, email, personagem);
    
    posicao.cadastro(j);
    
    limite.setText(posicao.numjogadores() + " Jogador(es)");
    
    JOptionPane.showMessageDialog(this, "Jogador Cadastrado.");
    
    Tnome.setText("");
    Tapelido.setText("");
    Temail.setText("");
    Cpersonagem.setSelectedIndex(0);
    Tnome.requestFocus();
    
      if (posicao.numjogadores()==2) {
          ApPersona.setText(posicao.jogador.get(0).getPersonagem() + "    X    " + (posicao.jogador.get(1).getPersonagem()));
          ativaBatalha();
          pergu1();
      }
      Tnome.requestFocus();

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIniciarActionPerformed
    //    joga.setText(posicao.jogador.get(0).getPersonagem());
    //    per.setText("Que nome se dá aos atributos privados?");
    //    alter1.setText("A - Polimorfismo");
    //    alter2.setText("B - Encapsulamento");
    //    alter3.setText("C - Composição");
    //    alter4.setText("D - Agregação");
    //    respcorr = "S";
    //    jog1.setText(posicao.jogador.get(0).getPersonagem());
    //    jog2.setText(posicao.jogador.get(1).getPersonagem());
        
        if (alter2.isSelected()){
        JOptionPane.showMessageDialog(null, "Resposta Correta!");     
        }
        else {
            vida1.setValue(80);
            vida1.setString("80%");
            JOptionPane.showMessageDialog(null, "Resposta Incorreta!");     
        }
    }//GEN-LAST:event_btIniciarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FBatalha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApPersona;
    private javax.swing.JComboBox<String> Cpersonagem;
    private javax.swing.JTextField Tapelido;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tnome;
    private javax.swing.JRadioButton alter1;
    private javax.swing.JRadioButton alter2;
    private javax.swing.JRadioButton alter3;
    private javax.swing.JRadioButton alter4;
    private javax.swing.JButton btIniciar;
    private javax.swing.JButton btSalvar;
    private javax.swing.ButtonGroup escolha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jog1;
    private javax.swing.JLabel jog2;
    private javax.swing.JLabel joga;
    private javax.swing.JLabel limite;
    private javax.swing.JLabel nperg;
    private javax.swing.JLabel per;
    private javax.swing.JProgressBar vida1;
    private javax.swing.JProgressBar vida2;
    // End of variables declaration//GEN-END:variables
}
