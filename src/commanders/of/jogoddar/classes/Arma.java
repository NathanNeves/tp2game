package commanders.of.jogoddar.classes;

import javax.swing.JOptionPane;

public class Arma extends Carta {
    int durabilidade;
    int modArma;

    Arma(String nome, int efeito, int durabilidade, int modArma, String imagem,String miniatura,String musica){
        super(nome, efeito,imagem,miniatura,musica);
        this.durabilidade = durabilidade;
        this.modArma = modArma;
    }

    public void ativar(Jogador caster){
        caster.equiparArma(this);
        JOptionPane.showInputDialog(caster.getNome() + " equipou " + this.nome);
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public void perdeDurabilidade(){
        durabilidade--;
    }
}
