/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanders.of.jogoddar;

import commanders.of.jogoddar.classes.Arma;
import commanders.of.jogoddar.classes.Buff;
import commanders.of.jogoddar.classes.Carta;
import commanders.of.jogoddar.classes.Jogador;
import commanders.of.jogoddar.classes.Magia;
import commanders.of.jogoddar.classes.Musica;
import commanders.of.jogoddar.classes.Personagem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Battle extends javax.swing.JFrame {

    /**
     * Creates new form Battle
     */
    private boolean jogo = true;
    private int cont = 0;
    private int turno;
    private ArrayList<Carta> baralho = new ArrayList<Carta>();
    private static ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
    private Musica trilha = new Musica("musicas\\\\batalha.wav");
    private Musica socar = new Musica("musicas\\\\soco.wav");
    private ArrayList<JButton> botoes = new ArrayList<JButton>(); 
    private Jogador jogando;
    public void embaralhar(){
        Collections.shuffle(baralho);
    }
    
 
    public Battle(Jogador Jogador1,Jogador Jogador2,Jogador Jogador3,Jogador Jogador4) {
        
        for(int i=0;i<60;i++){
        baralho.add(new Buff("A grande guerra",2,3,"icons\\\\carta.png","icons\\\\miniatura.png","musicas\\\\cura.wav"));
        baralho.add(new Arma("Machado de Assis",3,2,5,"icons\\\\carta.png","icons\\\\miniatura.png","musicas\\\\espada.wav"));
        }
        
        embaralhar();
       ImageIcon icone = new ImageIcon("icons\\\\icone.png");
        this.setIconImage(icone.getImage());
        botoes.add(carta1);
        botoes.add(carta2);
        botoes.add(carta3);
        jogadores.add(Jogador1);
        jogadores.add(Jogador2);
        jogadores.add(Jogador3);
        jogadores.add(Jogador4);
         for(int i = 0; i < 4; i++){
            jogadores.get(i).comprarCarta(baralho);
            jogadores.get(i).comprarCarta(baralho);
            jogadores.get(i).comprarCarta(baralho);

        }
        initComponents();
        trilha.iniciarmusica();
        ordenarJogadores();
        jogando = jogadores.get(turno);
    }

    private Battle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personagem2 = new javax.swing.JLabel();
        vida3 = new javax.swing.JLabel();
        Personagem3 = new javax.swing.JLabel();
        vida1 = new javax.swing.JLabel();
        Personagem1 = new javax.swing.JLabel();
        Vezde = new javax.swing.JLabel();
        Vidaatual = new javax.swing.JLabel();
        Atual = new javax.swing.JLabel();
        vida2 = new javax.swing.JLabel();
        cartagigante = new javax.swing.JLabel();
        Soco = new javax.swing.JLabel();
        contadordeturno = new javax.swing.JLabel();
        carta1 = new javax.swing.JButton();
        carta2 = new javax.swing.JButton();
        carta3 = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(personagem2);
        personagem2.setBounds(1630, 0, 290, 280);

        vida3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vida3.setForeground(new java.awt.Color(255, 255, 255));
        vida3.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\img\\vidamaispequena.png")); // NOI18N
        vida3.setText("20");
        vida3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vida3);
        vida3.setBounds(1680, 810, 60, 120);

        Personagem3.setText("jLabel7");
        getContentPane().add(Personagem3);
        Personagem3.setBounds(1730, 700, 190, 280);

        vida1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vida1.setForeground(new java.awt.Color(255, 255, 255));
        vida1.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\img\\vidamaispequena.png")); // NOI18N
        vida1.setText("20");
        vida1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vida1);
        vida1.setBounds(290, 10, 60, 120);
        getContentPane().add(Personagem1);
        Personagem1.setBounds(10, 0, 240, 280);

        Vezde.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Vezde.setForeground(new java.awt.Color(255, 255, 255));
        Vezde.setText("Vez de:");
        getContentPane().add(Vezde);
        Vezde.setBounds(990, 0, 340, 150);

        Vidaatual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Vidaatual.setForeground(new java.awt.Color(255, 255, 255));
        Vidaatual.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\img\\vidamaispequena.png")); // NOI18N
        Vidaatual.setText("20");
        Vidaatual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Vidaatual);
        Vidaatual.setBounds(170, 850, 60, 120);

        Atual.setName("Atual"); // NOI18N
        getContentPane().add(Atual);
        Atual.setBounds(230, 670, 240, 300);

        vida2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vida2.setForeground(new java.awt.Color(255, 255, 255));
        vida2.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\img\\vidamaispequena.png")); // NOI18N
        vida2.setText("20");
        vida2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vida2);
        vida2.setBounds(1510, 40, 60, 120);
        getContentPane().add(cartagigante);
        cartagigante.setBounds(630, 130, 500, 600);

        Soco.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\Commanders of Jogoddar\\icons\\fists.png")); // NOI18N
        Soco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SocoMouseClicked(evt);
            }
        });
        getContentPane().add(Soco);
        Soco.setBounds(-30, 800, 150, 90);

        contadordeturno.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        contadordeturno.setForeground(new java.awt.Color(255, 255, 255));
        contadordeturno.setText("Turno:");
        getContentPane().add(contadordeturno);
        contadordeturno.setBounds(490, 0, 340, 150);

        carta1.setText("jButton1");
        carta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carta1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta1MouseExited(evt);
            }
        });
        carta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta1ActionPerformed(evt);
            }
        });
        getContentPane().add(carta1);
        carta1.setBounds(770, 790, 140, 190);

        carta2.setText("jButton1");
        carta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carta2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta2MouseExited(evt);
            }
        });
        carta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta2ActionPerformed(evt);
            }
        });
        getContentPane().add(carta2);
        carta2.setBounds(980, 790, 140, 190);

        carta3.setText("jButton1");
        carta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carta3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carta3MouseExited(evt);
            }
        });
        carta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carta3ActionPerformed(evt);
            }
        });
        getContentPane().add(carta3);
        carta3.setBounds(560, 790, 140, 190);

        fundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\natha\\OneDrive\\Documentos\\img\\colosseum_121736920.jpg")); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1940, 1200);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //metodo para mostrar os dados de cada personagem na interface grafica
  private void vertamanhoBaralho(){
        if(baralho.size() == 1){
            dispose();
            Empate emp = new Empate(jogadores.get(0),jogadores.get(1),jogadores.get(2),jogadores.get(3));
            emp.setVisible(true);
        
        }
    
    } 
   private void checarStatus(){
      for(Jogador jogador : jogadores){
          jogador.checarDurabilidade();
          jogador.checarBuff();
      }
   
   }
    private void passarVez(){
        System.out.println(jogadores.get(turno).getNome()+"-"+jogadores.get(turno).getMao().size()+" Cartas");
        turno++;
        if(turno > 3 ){
            turno = 0;
            cont+=1;
            for(Jogador jogador : jogadores){
                jogador.comprarCarta(baralho);
            
            }
        }
        jogando = jogadores.get(turno);
        if(!jogando.estaVivo()){
            passarVez();
        }
        gameover();
        alterarProximoturno();
        checarcarta(turno);
        contadordeturno.setText("Rodada:"+this.cont);
        Vezde.setText("Vez de:"+jogadores.get(this.turno).getNome());
        jogadores.get(this.turno).checarBuff();
        jogadores.get(this.turno).checarDurabilidade();
        rodartabuleiro();
         
         
         
         
    }
    private void alterarProximoturno(){
        if(!jogando.getTurno()){
            jogando.setproximoturno();
            passarVez();
        }
    
    }
   private void gameover(){
    vertamanhoBaralho();   
    if(!jogadores.get(0).estaVivo() && !jogadores.get(1).estaVivo() && !jogadores.get(2).estaVivo()){
        dispose();
        gameOver go3 = new gameOver(jogadores.get(3));
        go3.setVisible(true);
    
    }
    else if(!jogadores.get(0).estaVivo() && !jogadores.get(1).estaVivo() && !jogadores.get(3).estaVivo()){
        dispose();
        gameOver go2 = new gameOver(jogadores.get(2));
        go2.setVisible(true);
    }
    else if(!jogadores.get(1).estaVivo() && !jogadores.get(2).estaVivo() && !jogadores.get(3).estaVivo()){
        dispose();
        gameOver go0 = new gameOver(jogadores.get(0));
        go0.setVisible(true);
    }
    else if(!jogadores.get(0).estaVivo() && !jogadores.get(2).estaVivo() && !jogadores.get(3).estaVivo()){
        dispose();
        gameOver go1 = new gameOver(jogadores.get(1));
        go1.setVisible(true);
    
    }
   
   }    
    private void checarcarta(int turno){
       /*for(int i = 0;i<jogadores.get(turno).getMao().size();i++){
          visualCartas.get(i).setIcon(new ImageIcon("miniatura.png"));
         //jogadores.get(turno).getMao().get(i).getimagem()
       }*/
      switch(jogadores.get(turno).getMao().size()){
          case 1:
              carta1.setIcon(jogadores.get(turno).getMao().get(0).getimagem());
              carta1.setVisible(true);
              carta1.setEnabled(true);
              carta2.setEnabled(false);
              carta2.setVisible(false);
              carta3.setEnabled(false);
              carta3.setVisible(false);
              break;
          case 2:
              carta1.setIcon(jogadores.get(turno).getMao().get(0).getimagem());
              carta2.setIcon(jogadores.get(turno).getMao().get(1).getimagem());
              carta2.setEnabled(true);
              carta2.setVisible(true);
              carta1.setEnabled(true);
              carta1.setVisible(true);
              carta3.setEnabled(false);
              carta3.setVisible(false);
              break;
          case 3:
              carta1.setIcon(jogadores.get(turno).getMao().get(0).getimagem());
              carta2.setIcon(jogadores.get(turno).getMao().get(1).getimagem());
              carta3.setIcon(jogadores.get(turno).getMao().get(2).getimagem());
              carta3.setVisible(true);
              carta3.setEnabled(true);
              carta2.setVisible(true);
              carta2.setEnabled(true);
              carta1.setVisible(true);
              carta1.setEnabled(true);
              break;
          case 0:
              carta1.setEnabled(false);
              carta2.setEnabled(false);
              carta3.setEnabled(false);
              carta1.setVisible(false);
              carta2.setVisible(false);
              carta3.setVisible(false);
              break;
      }
        }
    //metodo para mostrar os dados de cada personagem na interface grafica
    private void rodartabuleiro(){
        switch(turno){
            case 0:
                ImageIcon avatar00 = new ImageIcon(jogadores.get(0).getpersonagem().geticon());
                Atual.setIcon(avatar00);
                Vidaatual.setText(Integer.toString(jogadores.get(0).getVida()));
                ImageIcon avatar01 = new ImageIcon(jogadores.get(1).getpersonagem().geticon());
                Personagem1.setIcon(avatar01);
                vida1.setText(Integer.toString(jogadores.get(1).getVida()));
                
                ImageIcon avatar02 = new ImageIcon(jogadores.get(2).getpersonagem().geticon());
                personagem2.setIcon(avatar02);
                vida2.setText(Integer.toString(jogadores.get(2).getVida()));
                
                ImageIcon avatar03 = new ImageIcon(jogadores.get(3).getpersonagem().geticon());
                Personagem3.setIcon(avatar03);
                vida3.setText(Integer.toString(jogadores.get(3).getVida()));
                
                
                
                break;
            case 1:
                
                //Carta1.setIcon(carta10);
                //Carta2.setIcon(carta11);
                //Carta3.setIcon(carta12);
                
                ImageIcon avatar10 = new ImageIcon(jogadores.get(1).getpersonagem().geticon());
                Atual.setIcon(avatar10);
                Vidaatual.setText(Integer.toString(jogadores.get(1).getVida()));
                ImageIcon avatar11 = new ImageIcon(jogadores.get(2).getpersonagem().geticon());
                Personagem1.setIcon(avatar11);
                vida1.setText(Integer.toString(jogadores.get(2).getVida()));
                
                ImageIcon avatar12 = new ImageIcon(jogadores.get(3).getpersonagem().geticon());
                personagem2.setIcon(avatar12);
                vida2.setText(Integer.toString(jogadores.get(3).getVida()));
                
                ImageIcon avatar13 = new ImageIcon(jogadores.get(0).getpersonagem().geticon());
                Personagem3.setIcon(avatar13);
                vida3.setText(Integer.toString(jogadores.get(0).getVida()));
                
                
                break;
            case 2:
                
                //Carta1.setIcon(carta20);
                //Carta2.setIcon(carta21);
                //Carta3.setIcon(carta22);
                
                ImageIcon avatar20 = new ImageIcon(jogadores.get(2).getpersonagem().geticon());
                Atual.setIcon(avatar20);
                Vidaatual.setText(Integer.toString(jogadores.get(2).getVida()));
                
                ImageIcon avatar21 = new ImageIcon(jogadores.get(3).getpersonagem().geticon());
                Personagem1.setIcon(avatar21);
                vida1.setText(Integer.toString(jogadores.get(3).getVida()));
                
                ImageIcon avatar22 = new ImageIcon(jogadores.get(0).getpersonagem().geticon());
                personagem2.setIcon(avatar22);
                vida2.setText(Integer.toString(jogadores.get(0).getVida()));
                ImageIcon avatar23 = new ImageIcon(jogadores.get(1).getpersonagem().geticon());
                Personagem3.setIcon(avatar23);
                vida3.setText(Integer.toString(jogadores.get(1).getVida()));
                
                
                break;
            case 3:
               
                //Carta1.setIcon(carta30);
                //Carta2.setIcon(carta31);
                //Carta3.setIcon(carta32);
                
                ImageIcon avatar30 = new ImageIcon(jogadores.get(3).getpersonagem().geticon());
                Atual.setIcon(avatar30);
                Vidaatual.setText(Integer.toString(jogadores.get(3).getVida()));
                
                ImageIcon avatar31 = new ImageIcon(jogadores.get(0).getpersonagem().geticon());
                Personagem1.setIcon(avatar31);
                vida1.setText(Integer.toString(jogadores.get(0).getVida()));
                
                ImageIcon avatar32 = new ImageIcon(jogadores.get(1).getpersonagem().geticon());
                personagem2.setIcon(avatar32);
                vida2.setText(Integer.toString(jogadores.get(1).getVida()));
                ImageIcon avatar33 = new ImageIcon(jogadores.get(2).getpersonagem().geticon());
                Personagem3.setIcon(avatar33);
                vida3.setText(Integer.toString(jogadores.get(2).getVida()));
                
                break;
        }
    }
    public static final ArrayList<Jogador> getjogadores(){
        return jogadores;
    }
    private void SocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SocoMouseClicked
      ArrayList<Jogador> vivos = new ArrayList<Jogador>();
       for(int i=0; i<4;i++){
           if(jogadores.get(i).estaVivo()==true){
            vivos.add(jogadores.get(i));
       }}
           String[] posicaoalvos = new String[vivos.size()];
           for(int i=0; i<vivos.size();i++){
               posicaoalvos[i] = vivos.get(i).getNome();
           }
       
         int n = JOptionPane.showOptionDialog(null, "Escolha o jogador alvo",
                "Escolha o alvo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, posicaoalvos,posicaoalvos[0]);
         jogadores.get(this.turno).socar(vivos.get(n));
         socar.iniciarmusica();
         passarVez();
    }//GEN-LAST:event_SocoMouseClicked

    private void carta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta3ActionPerformed
         if(JOptionPane.showConfirmDialog (null, "Deseja usar a carta ?","Carta",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION ){
                jogadores.get(this.turno).usarCarta(jogadores.get(this.turno).getMao().get(2));
                checarcarta(turno);
                passarVez();
            }else {
            
                JOptionPane.showMessageDialog(null,"Ação Cancelada");
            }
    }//GEN-LAST:event_carta3ActionPerformed

    private void carta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta1ActionPerformed
           if(JOptionPane.showConfirmDialog (null, "Deseja usar a carta ?","Carta",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION ){
                jogadores.get(this.turno).usarCarta(jogadores.get(this.turno).getMao().get(0));
                checarcarta(turno);
                passarVez();
                
            }else{
            
                JOptionPane.showMessageDialog(null,"Ação Cancelada");
            }
    }//GEN-LAST:event_carta1ActionPerformed

    private void carta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carta2ActionPerformed
           if(JOptionPane.showConfirmDialog (null, "Deseja usar a carta ?","Carta",JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION ){

                jogadores.get(this.turno).usarCarta(jogadores.get(this.turno).getMao().get(1));
                checarcarta(turno);
                passarVez();
                
            }else {
            
                JOptionPane.showMessageDialog(null,"Ação Cancelada");
            }
    }//GEN-LAST:event_carta2ActionPerformed

    private void carta3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseEntered
         if(jogadores.get(turno).verificarindex(2)){
            cartagigante.setIcon(jogadores.get(turno).getMao().get(2).getimagem());
        }
    }//GEN-LAST:event_carta3MouseEntered

    private void carta3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta3MouseExited

        cartagigante.setIcon(null);
    }//GEN-LAST:event_carta3MouseExited

    private void carta1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseEntered
        if(jogadores.get(turno).verificarindex(0)){
          cartagigante.setIcon(jogadores.get(this.turno).getMao().get(0).getimagem());
    }//GEN-LAST:event_carta1MouseEntered
    }
    private void carta1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta1MouseExited
                cartagigante.setIcon(null);

    }//GEN-LAST:event_carta1MouseExited

    private void carta2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseEntered
         if(jogadores.get(turno).verificarindex(1)){
          cartagigante.setIcon(jogadores.get(this.turno).getMao().get(1).getimagem());
    }//GEN-LAST:event_carta2MouseEntered
}
    private void carta2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carta2MouseExited
               cartagigante.setIcon(null);

    }//GEN-LAST:event_carta2MouseExited
    
    private void ordenarJogadores(){
        Random primeiro = new Random();
        turno = primeiro.nextInt(4);
     
       JOptionPane.showMessageDialog(null,"Primeiro a jogar é o " + jogadores.get(turno).getNome());
       rodartabuleiro();
       checarcarta(turno);

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
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Battle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Battle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Atual;
    private javax.swing.JLabel Personagem1;
    private javax.swing.JLabel Personagem3;
    private javax.swing.JLabel Soco;
    private javax.swing.JLabel Vezde;
    private javax.swing.JLabel Vidaatual;
    private javax.swing.JButton carta1;
    private javax.swing.JButton carta2;
    private javax.swing.JButton carta3;
    private javax.swing.JLabel cartagigante;
    private javax.swing.JLabel contadordeturno;
    private javax.swing.JLabel fundo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel personagem2;
    private javax.swing.JLabel vida1;
    private javax.swing.JLabel vida2;
    private javax.swing.JLabel vida3;
    // End of variables declaration//GEN-END:variables
}
