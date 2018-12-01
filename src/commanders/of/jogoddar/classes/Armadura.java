package commanders.of.jogoddar.classes;

import javax.swing.JOptionPane;

public class Armadura extends Carta {

    Armadura(String nome, int efeito,String imagem,String miniatura,String musica){
        super(nome, efeito, imagem,miniatura,musica);
    }

    public void ativar(Jogador caster){
        caster.defender(this);
        JOptionPane.showInputDialog(caster.getNome() + " ganhou " + this.getEfeito() + " de armadura!");
    }
}
