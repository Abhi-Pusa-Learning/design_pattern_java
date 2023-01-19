package adapterpattern.mediaplayer;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Mp3 player is playing");
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,filename);
        }else{
            System.out.println("Invalid media type "+audioType+" format not supported");
        }
    }
}
