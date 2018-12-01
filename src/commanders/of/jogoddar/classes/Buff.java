package commanders.of.jogoddar.classes;

import commanders.of.jogoddar.Battle;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Buff extends Carta {
    private int duracao;
    //private Jogador alvo;

    public Buff(String nome, int efeito, int duracao,String imagem,String miniatura,String musica){
        super(nome, efeito,imagem,miniatura,musica);
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public void ativar(Jogador caster){
       Jogador alvo = escolherAlvo(Battle.getjogadores());
        alvo.buffar(this);
        JOptionPane.showMessageDialog(null,caster.getNome() + " aumentou o dano de " +alvo.getNome() + " em " + this.getEfeito() + " por " +
                this.getDuracao() + " turnos!");
                this.getsfx().iniciarmusica();


    }

}
