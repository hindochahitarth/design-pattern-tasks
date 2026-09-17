package Day_3.Adapter;

public class Main {
    public static void main(String[] args) {
        AdvancedMediaPlayer vlcPlayer=new AdvancedMediaPlayer();

        MediaPlayer adapter=new MediaAdapter(vlcPlayer);

        adapter.play("song.vlc");
    }
}
