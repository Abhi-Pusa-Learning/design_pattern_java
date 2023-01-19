package adapterpattern.advancedmediaplayer;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc() {
        System.out.println("vlc media player");
    }

    @Override
    public void playMp4() {
        //do nothing
    }
}
