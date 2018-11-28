package commanders.of.jogoddar.classes;

public class Arma extends Carta {
    int durabilidade;
    int modArma;

    Arma(String nome, int efeito, int durabilidade, int modArma, String imagem){
        super(nome, efeito,imagem);
        this.durabilidade = durabilidade;
        this.modArma = modArma;
    }

    public void ativar(Jogador caster){
        caster.equiparArma(this);
        System.out.println(caster.getNome() + " equipou " + this.nome);
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public void perdeDurabilidade(){
        durabilidade--;
    }
}
