package commanders.of.jogoddar.classes;


import commanders.of.jogoddar.Battle;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Jogador {
    private String nome;
    private int vida = 20;
    private int armadura = 0;
    private int dano = 2;
    private int modBase =  0;
    private int turnosBuffado = 0;
    private Buff buff;
    private Personagem personagem;
    private ArrayList<Carta> mao = new ArrayList<>();
    private Arma item = null;
    private boolean proxTurno = true;
    private boolean vivo = true;
    public Jogador(String nome, Personagem personagem){
        this.nome = nome;
        this.personagem = personagem;
    }

    public String getNome(){
        return nome;
    }
    public boolean estaVivo(){
        if(vida <= 0){
            this.vivo = false;
            return false;
        }
        return true;
    }
    public boolean getTurno(){
        return proxTurno;
    }
    public void setproximoturno(){
        proxTurno = true;
        }
    public int getVida(){
        return vida;
    }
    public Personagem getpersonagem(){
        return this.personagem;
        }

    public Arma getItem(){ return item; }

    public Buff getBuff(){ return buff; }

    public void socar(Jogador alvo) {
        if (item != null) {
            alvo.tomarDano(this.dano + item.getEfeito());
        }else{
            alvo.tomarDano(this.dano);
        }
    }
     public boolean verificarindex(int index){
        if(index >=this.mao.size()){
            return false;
        }
        else{
            return true;
        }
    }

     
    
    public void comprarCarta(ArrayList<Carta> baralho){
        
        Carta carta = baralho.get(baralho.size() - 1);
        baralho.remove(baralho.size() - 1);
        this.mao.add(carta);
        if(mao.size() > 3){
            mao.remove(0);
            
        }
    }

    public void equiparArma(Arma arma){
        this.item = arma;
    }

    public void tomarDano(int dano){
        if(armadura > 0) {
            armadura -= dano;
            if(armadura < 0){
                armadura = 0;
            }
        }else{
            this.vida -= dano;
        }
        JOptionPane.showMessageDialog(null,"A vida atual do "+this.nome+" e de: "+this.vida);
        
        
    }

    public void buffar(Buff buff){
        this.buff = buff;
        this.turnosBuffado = buff.getDuracao();
    }

    public void defender(Armadura armadura){
        this.armadura = armadura.getEfeito();
    }

    public ArrayList<Carta> getMao(){
        return mao;
    }

    public void usarCarta(Carta carta){
        carta.ativar(this);
        mao.remove(carta);
    }

    public void checarDurabilidade(){
        if(item != null && item.getDurabilidade() == 0){
            item = null;
        }else if(item != null){
            item.perdeDurabilidade();
        }
    }

    public void checarBuff(){
        if(buff != null && turnosBuffado == 0){
            buff = null;
        }else if(buff != null){
            turnosBuffado--;
        }
    }

    public boolean buffado(){
        if(this.buff != null){
            return true;
        }else{
            return false;
        }
    }
    
}
