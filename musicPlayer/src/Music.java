import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import java.io.File;

public class Music
{
    public static Clip clip;
    public static boolean mute = false;
    public static float currentVolume, previousVolume;
    public static FloatControl fc;
    public static Clip playMusic(String location)
    {
        try {
            File musicPath = new File(location);

            if (musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                clip = AudioSystem.getClip();
                clip.open(audioInput);
                fc = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                clip.start();
                return clip;
            }
            else
            {
                System.out.println("Does not exist");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
