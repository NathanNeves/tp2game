package commanders.of.jogoddar.classes;

import java.util.Scanner;

public abstract class Carta {
    protected String nome;
    private String img;
    private int efeito;
    //Personagem tipo;
    String descricao;

    Carta(String nome, int efeito,String img){
        this.nome = nome;
        this.efeito = efeito;
        this.img = img;
        //this.tipo = tipo;
    }

    public String getNome(){
        return nome;
    }

    public int getEfeito(){
        return efeito;
    }
    public String getimagem(){
        return this.img;
    }

    public static Jogador escolherAlvo(Jogador[] jogadores){
        System.out.println("Escolha um alvo");

        for(int i = 0; i < 4; i++){
            System.out.println(i + " " + jogadores[i].getNome());
        }

        Scanner in = new Scanner(System.in);

        int jogador = in.nextInt();

        return jogadores[jogador];
    }

    public abstract void ativar(Jogador caster);

}