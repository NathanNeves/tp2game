package commanders.of.jogoddar.classes;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<Carta> baralho = new ArrayList<>();
    static int turno = 0;
    static int cont = 0;
    static Jogador jogadores[] = new Jogador[4];
    static boolean jogo = true;

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        comecarJogadores();
        ordenarJogadores();
        embaralhar();

        for(int i = 0; i < 4; i++){
            jogadores[i].comprarCarta(baralho);
            jogadores[i].comprarCarta(baralho);

        }

        while(jogo){
            if(jogadores[0].getVida() <= 0 || jogadores[1].getVida() <= 0
            || jogadores[2].getVida() <= 0 || jogadores[3].getVida() <= 0 ){
                jogo = false;
            }

            jogadores[turno].comprarCarta(baralho);

            System.out.println("Turno de " + jogadores[turno].getNome() +". Escolha sua ação!");

            for(int i = 0; i < jogadores[turno].getMao().size(); i++){
                System.out.println(i + " - " + jogadores[turno].getMao().get(i).getNome());
            }
            System.out.println("3 - Soco");

            int escolha = in.nextInt();

            switch(escolha){
                case 0:
                    Carta carta = jogadores[turno].getMao().get(0);

                    jogadores[turno].usarCarta(carta);

                    break;

                case 1:
                    carta = jogadores[turno].getMao().get(1);
                    //Jogador alvo = escolherAlvo();
                    jogadores[turno].usarCarta(carta);


                    break;

                case 2:
                    carta = jogadores[turno].getMao().get(2);
                    //Jogador alvo = escolherAlvo();
                    jogadores[turno].usarCarta(carta);


                    break;

                case 3:
                    Jogador alvo = Carta.escolherAlvo(jogadores);

                    jogadores[turno].socar(alvo);

                    break;

                //default:
               //     passarVez();
            }

            jogadores[turno].checaDurabilidade();
            jogadores[turno].checarBuff();


            passarVez();
        }
    }

   // public static Jogador escolherAlvo(){
       // System.out.println("Escolha um alvo");

       // for(int i = 0; i < 4; i++){
      //      System.out.println(i + " " + jogadores[i].getNome());
       // }

      //  Scanner in = new Scanner(System.in);

     //   int jogador = in.nextInt();

   //     return jogadores[jogador];
 //   }

    public static void embaralhar(){
        Collections.shuffle(baralho);
    }

    public static void passarVez(){
        turno++;
        if(turno > 3 ){
            turno = 0;
        }
    }

    public static void ordenarJogadores(){
        Random primeiro = new Random();
        turno = primeiro.nextInt(4);

        System.out.println("Primeiro a jogar é o Jogador " + jogadores[turno].getNome());
    }


    public static void comecarJogadores() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bem vindos, jogadores! Choose your class wisely");

        for (int i = 0; i < 4; i++) {
            System.out.println("Jogador " + i + ", qual o seu nome?");

            String nome = in.next();

            System.out.println("e sua classe de escolha?");
            System.out.println("Classe 1: MAGO! Bonus com magia e ataques a distancia\n" +
                    "Classe 2: GUERREIRO! Manuseio de armas\n" +
                    "Classe 3: Paladino! Manuseio de escudos\n" +
                    "Classe 4: Clerigo! Manuseio de coisa");

            int pers = in.nextInt();
            Personagem valor;

            if(pers == 1){
                valor = Personagem.MAGO;

            }else if(pers == 2) {
                valor = Personagem.GUERREIRO;

            }else if(pers == 3){
                valor = Personagem.PALADINO;

            }else if(pers == 4){
                valor = Personagem.CLERIGO;

            }else{
                valor = Personagem.MAGO;
            }

            jogadores[i] = new Jogador(nome, valor);

        }
    }
}

