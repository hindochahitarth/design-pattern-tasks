package Day_3;

public class MediaAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer=advancedMediaPlayer;
    }
    @Override
    public void play(String filename){
        advancedMediaPlayer.playVlc(filename);
    }
}
