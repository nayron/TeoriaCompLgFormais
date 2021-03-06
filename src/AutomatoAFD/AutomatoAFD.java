/*
 * AutomatoAFD.java
 *
 * Created on 07 de Janeiro de 2016, 14:52
 */

package AutomatoAFD;

/**
 *
 * @author  N�yron dos Anjos Seilert
 *          Idnilson 
 */
public class AutomatoAFD extends javax.swing.JFrame {
    
    /**
     * Creates new form AutomatoAFD
     */
    public AutomatoAFD() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonExecutar = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEstados = new javax.swing.JTextField();
        jTextFieldAlfabeto = new javax.swing.JTextField();
        jTextFieldEstadoInicial = new javax.swing.JTextField();
        jTextFieldEstadosFinais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEntrada = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelaTransicao = new javax.swing.JTable();
        buttonSair1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AFD - Aut�mato Finito Determin�stico - Nayron dos Anjos - 2016");

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Par�metros e Resultados"));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Tabela com a Fun��o de Transi��o (?)");

        buttonExecutar.setText("Executar");
        buttonExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExecutarActionPerformed(evt);
            }
        });

        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Estados do Aut�mato");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Alfabeto do Aut�mato");

        jLabel6.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Estados Finais (*)");

        jLabel7.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Estado Inicial (->)");

        jLabel8.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Entre com a linguagem que deseja verificar");

        tabelaTransicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {"", "", ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "q", "\u03c3", "\u03b4(\u03c3,q)"
            }
        ));
        jScrollPane4.setViewportView(tabelaTransicao);

        buttonSair1.setText("limpar");
        buttonSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSair1ActionPerformed(evt);
            }
        });

        jTextAreaResultados.setColumns(40);
        jTextAreaResultados.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextAreaResultados.setRows(10);
        jScrollPane1.setViewportView(jTextAreaResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(buttonExecutar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonSair1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jTextFieldAlfabeto, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEstados))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldEstadoInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEstadosFinais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel6))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldEntrada)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstadosFinais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExecutar)
                    .addComponent(buttonSair)
                    .addComponent(buttonSair1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("Par�metros");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExecutarActionPerformed
// TODO adicione seu c�digo de manipula��o aqui:

        jTextAreaResultados.setText("");    // Limpa os resultados

        int i,j,qtdLinhas=0;

        // Conta a quantidade de linhas efetivamente utilizadas
        for (i=0; (i<tabelaTransicao.getRowCount() && tabelaTransicao.getValueAt(i,0)!=null); i++) {
            if (!tabelaTransicao.getValueAt(i,0).toString().isEmpty())
                qtdLinhas++;
            else
                break;
        }

        // Aut�mato executando
        jTextAreaResultados.append("Aut�mato percorrendo a seq��ncia de entrada, aguarde..." + "\n\n");

        String p = jTextFieldEstadoInicial.getText().toString();    // Seleciona o estado inicial
       
        for (i=0; i<jTextFieldEntrada.getText().length(); i++) {
            // Encontra o pr�ximo estado
            p = proximoEstado(p, jTextFieldEntrada.getText().substring(i,i+1), qtdLinhas);            
        }
        
        if (estadoFinal(p))
            jTextAreaResultados.append("\n\n" + "Entrada aceita!");
        else
            jTextAreaResultados.append("\n\n" + "Entrada rejeitada!");

        // Fim da execu��o do aut�mato
    }//GEN-LAST:event_buttonExecutarActionPerformed

    private String proximoEstado(String p1, String p2, int qtdLinhas) {
        int i;
        String s = null;
        
        // Encontra uma entrada na tabela de transi��o de estados
        for (i=0; i<qtdLinhas; i++) {
            if (tabelaTransicao.getValueAt(i,0).toString().equals(p1) &&
                tabelaTransicao.getValueAt(i,1).toString().equals(p2)) {
                 s = (String) tabelaTransicao.getValueAt(i,2);
                break;
            }
        }
            
        return s;
    }

    private boolean estadoFinal(String s) {
        int i;     
        String estadosFinais[] = jTextFieldEstadosFinais.getText().split(",");
        
        // Verifica se o estado final � um dos estados finais do aut�mato
        for (i=0; i<estadosFinais.length; i++)
            if (estadosFinais[i].equals(s))
                return true;
        
        return false;
    }

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
// TODO adicione seu c�digo de manipula��o aqui:
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSair1ActionPerformed
            jTextAreaResultados.setText("");
            jTextFieldAlfabeto.setText("");
            jTextFieldEntrada.setText("");
            jTextFieldEstadoInicial.setText("");
            jTextFieldEstados.setText("");
            jTextFieldEstadosFinais.setText("");
          
    }//GEN-LAST:event_buttonSair1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AutomatoAFD().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExecutar;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonSair1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextAreaResultados;
    private javax.swing.JTextField jTextFieldAlfabeto;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldEstadoInicial;
    private javax.swing.JTextField jTextFieldEstados;
    private javax.swing.JTextField jTextFieldEstadosFinais;
    private javax.swing.JTable tabelaTransicao;
    // End of variables declaration//GEN-END:variables
    
}
