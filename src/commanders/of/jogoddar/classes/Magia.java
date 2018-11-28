package commanders.of.jogoddar.classes;

import java.util.Scanner;

public class Magia extends Carta {
    Magia(String nome, int efeito, String imagem){
        super(nome, efeito,imagem);
    }

    public void ativar(Jogador caster) {
        Jogador alvo = escolherAlvo(Main.jogadores);
        if(caster.buffado()) {
            System.out.println(caster.getNome() + " deu " + (this.getEfeito()+ caster.getBuff().getEfeito())
                    + " na cara de " + alvo.getNome());

            alvo.tomarDano(this.getEfeito() + caster.getBuff().getEfeito());

        }else{
            System.out.println(caster.getNome() + " deu " + this.getEfeito() + " na cara de " + alvo.getNome());

            alvo.tomarDano(this.getEfeito());
        }
    }
}
