package commanders.of.jogoddar.classes;

public enum Personagem {

    /**
     *
     */
    MAGO("Mago",2,"icons\\\\wizard.png"), GUERREIRO("Guerreiro",1,"icons\\\\knight.png"), PALADINO("Paladino",5,"icons\\\\clerigo.png"), CLERIGO("Clerigo",2,"icons\\\\anao.png");

    
    private String linkimagem;
    private String nomeClasse;
    private int modificador;

    Personagem(String nome,int modificador,String linkimagem){
        this.nomeClasse = nome;
        this.modificador = modificador;
        this.linkimagem = linkimagem;
    }
    public String getnome(){
        return this.nomeClasse;
    }
    public String geticon(){
        return linkimagem;
    }

}
