package commanders.of.jogoddar.classes;

import java.util.Scanner;

public class Buff extends Carta {
    private int duracao;
    //private Jogador alvo;

    Buff(String nome, int efeito, int duracao,String imagem){
        super(nome, efeito,imagem);
        this.duracao = duracao;
    }

    public int getDuracao(){
        return duracao;
    }

    public void ativar(Jogador caster){

        Jogador alvo = escolherAlvo(Main.jogadores);
        alvo.buffar(this);
        System.out.println(caster.getNome() + " aumentou o dano de " +alvo.getNome() + " em " + this.getEfeito() + " por " +
                this.getDuracao() + " turnos!");

    }

}
