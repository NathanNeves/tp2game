package commanders.of.jogoddar.classes;

public class Armadura extends Carta {

    Armadura(String nome, int efeito,String imagem){
        super(nome, efeito, imagem);
    }

    public void ativar(Jogador caster){
        caster.defender(this);
        System.out.println(caster.getNome() + " ganhou " + this.getEfeito() + " de armadura!");
    }
}
