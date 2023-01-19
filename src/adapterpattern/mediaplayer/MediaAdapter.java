package adapterpattern.mediaplayer;

import adapterpattern.advancedmediaplayer.AdvancedMediaPlayer;
import adapterpattern.advancedmediaplayer.Mp4Player;
import adapterpattern.advancedmediaplayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc();
        }
    }
}
