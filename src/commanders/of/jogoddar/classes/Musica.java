/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commanders.of.jogoddar.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author natha
 */
public class Musica {
    private AudioStream audio;
    public Musica(String caminho){
            try{
            InputStream musica = new FileInputStream(new File(caminho));
            this.audio = new AudioStream(musica);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Erro ao localizar o arquivo de audio");
        }
    }
    public void iniciarmusica(){
        AudioPlayer.player.start(this.audio);
    }
    public void pararmusica(){
       AudioPlayer.player.stop(this.audio);
    }

}
