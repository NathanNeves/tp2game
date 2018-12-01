package commanders.of.jogoddar.classes;

import commanders.of.jogoddar.Battle;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Magia extends Carta {
   public Magia(String nome, int efeito, String imagem,String miniatura,String musica){
        super(nome, efeito,imagem,miniatura,musica);
    }

    public void ativar(Jogador caster) {
        this.getsfx().iniciarmusica();
       Jogador alvo = escolherAlvo(Battle.getjogadores());
        if(caster.buffado()) {
            JOptionPane.showMessageDialog(null,caster.getNome() + " deu " + (this.getEfeito()+ caster.getBuff().getEfeito())
                    + " na cara de " + alvo.getNome());

                alvo.tomarDano(this.getEfeito() + caster.getBuff().getEfeito());;

        }else{
            JOptionPane.showMessageDialog(null,caster.getNome() + " deu " + this.getEfeito() + " na cara de " + alvo.getNome());

            alvo.tomarDano(this.getEfeito());
        }
    }
}
