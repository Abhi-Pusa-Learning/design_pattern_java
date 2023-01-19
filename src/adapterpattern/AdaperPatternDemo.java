package adapterpattern;

import adapterpattern.mediaplayer.AudioPlayer;
import adapterpattern.mediaplayer.MediaPlayer;

public class AdaperPatternDemo {
    public void execute(){
        MediaPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","dekhajotumko.mp3");
        audioPlayer.play("mp4","darddedisko.mp4");
        audioPlayer.play("vlc","ekpalkajeena.vlc");
    }
}
