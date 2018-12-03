package commanders.of.jogoddar.classes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public abstract class Carta {
    protected String nome;
    private ImageIcon img;
    private int efeito;
    protected Musica som;
    private ImageIcon miniatura;
    //Personagem tipo;
    String descricao;

    Carta(String nome, int efeito,String img,String miniatura,String som){
        this.nome = nome;
        this.efeito = efeito;
        this.img = new ImageIcon(img);
        this.som = new Musica(som);
        this.miniatura = new ImageIcon(miniatura);
    }
    public ImageIcon getminiatura(){
        return miniatura;
    }

    public String getNome(){
        return nome;
    }
    public Musica getsfx(){
        return this.som;
    }
    public int getEfeito(){
        return efeito;
    }
    public ImageIcon getimagem(){
        return this.img;
    }
    public Jogador escolherAlvo(ArrayList<Jogador> jogadores){
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
        return vivos.get(n);
       }
    

    

    public abstract void ativar(Jogador caster);

}