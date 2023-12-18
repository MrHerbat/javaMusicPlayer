
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import javax.sound.sampled.*;

public class VolumeSlider implements ChangeListener
{
    public JSlider volume;
    public Music music;
    public int x = 50;
    VolumeSlider()
    {
        volume = new JSlider(0,-80,0,0);
        volume.addChangeListener(this);
        volume.setPreferredSize(new Dimension(150,50));
        volume.setPaintTicks(true);
        volume.setMinorTickSpacing(5);
        volume.setMajorTickSpacing(20);
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        music = new Music();
        music.currentVolume = volume.getValue();
        music.fc.setValue(music.currentVolume);
    }
}
