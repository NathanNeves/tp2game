package commanders.of.jogoddar.classes;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public abstract class Carta {
    protected String nome;
    private String img;
    private int efeito;
    private Musica som;
    private String miniatura;
    //Personagem tipo;
    String descricao;

    Carta(String nome, int efeito,String img,String miniatura,String som){
        this.nome = nome;
        this.efeito = efeito;
        this.img = img;
        this.som = new Musica(som);
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
    public String getimagem(){
        return this.img;
    }

    public Jogador escolherAlvo(ArrayList<Jogador> jogadores){
       String[] posicaoalvos = new String[4];
       for(int i=0; i<4;i++){
           posicaoalvos[i] = jogadores.get(i).getNome();
       }
         int n = JOptionPane.showOptionDialog(null, "Escolha o jogador alvo",
                "Escolha o alvo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, posicaoalvos, posicaoalvos[0]);
        return jogadores.get(n);
    }

    public abstract void ativar(Jogador caster);

}