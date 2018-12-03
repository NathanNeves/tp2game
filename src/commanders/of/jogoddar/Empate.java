/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanders.of.jogoddar;

import commanders.of.jogoddar.classes.Jogador;

/**
 *
 * @author natha
 */
public class Empate extends javax.swing.JFrame {

    /**
     * Creates new form Empate
     */
    public Empate(Jogador player1,Jogador player2,Jogador player3,Jogador player4) {
        initComponents();
        vida1.setText(Integer.toString(player1.getVida()));
        vida2.setText(Integer.toString(player2.getVida()));
        vida3.setText(Integer.toString(player3.getVida()));
        vida4.setText(Integer.toString(player4.getVida()));
        this.setResizable(false);
    }

    private Empate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        vida4 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empate");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(480, 10, 190, 90);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player2:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(470, 210, 170, 60);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Player3:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 280, 170, 60);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Player4:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 350, 170, 60);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Player1:");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 140, 170, 60);

        vida2.setForeground(new java.awt.Color(255, 255, 255));
        vida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/commanders/of/jogoddar/vidamaispequena.png"))); // NOI18N
        vida2.setText("jLabel7");
        vida2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(vida2);
        vida2.setBounds(610, 220, 60, 50);

        vida4.setForeground(new java.awt.Color(255, 255, 255));
        vida4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/commanders/of/jogoddar/vidamaispequena.png"))); // NOI18N
        vida4.setText("jLabel7");
        vida4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(vida4);
        vida4.setBounds(610, 360, 60, 50);

        vida3.setForeground(new java.awt.Color(255, 255, 255));
        vida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/commanders/of/jogoddar/vidamaispequena.png"))); // NOI18N
        vida3.setText("jLabel7");
        vida3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(vida3);
        vida3.setBounds(610, 290, 60, 50);

        vida1.setForeground(new java.awt.Color(255, 255, 255));
        vida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/commanders/of/jogoddar/vidamaispequena.png"))); // NOI18N
        vida1.setText("jLabel7");
        vida1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vida1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(vida1);
        vida1.setBounds(610, 150, 60, 50);

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setToolTipText("");
        jPanel1.add(jButton1);
        jButton1.setBounds(1000, 530, 140, 110);

        jButton2.setBackground(new java.awt.Color(0, 153, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Fechar");
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 530, 140, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\Commanders of Jogoddar\\icons\\empate.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(-690, -110, 2170, 900);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Empate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    private javax.swing.JLabel vida4;
    // End of variables declaration//GEN-END:variables
}
