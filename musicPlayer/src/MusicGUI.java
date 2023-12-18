import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MusicGUI extends JFrame
{
    public Color dGray = new Color(85,85,85), purple = new Color(128,12,128), dpink = new Color(221, 34, 187);
    private JTextField musicNameField, playlistName;
    private JButton choose, play, pause, playlistCreate;
    private JCheckBox shuffle, loop;
    private Clip clip;
    private JFileChooser playlistChooser, songChooser;
    private JLabel sound;
    private VolumeSlider volumeSlider;
    private boolean Shuffled, Paused, Looped = false;

    public MusicGUI()
    {
        volumeSlider = new VolumeSlider();

        JFrame jframe = new JFrame("Herbat's Player");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(800,650);
        jframe.setLayout(new BorderLayout());
        jframe.setVisible(true);
        jframe.setResizable(false);

        volumeSlider.volume.setBackground(dGray);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(dGray);
        panel2.setBackground(dpink);
        panel3.setBackground(purple);
        panel4.setBackground(dpink);
        panel5.setBackground(dGray);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        panel5.setLayout(new BorderLayout());
        panel5.add(volumeSlider.volume, BorderLayout.EAST);

        jframe.add(panel1,BorderLayout.NORTH);
        jframe.add(panel2,BorderLayout.WEST);
        jframe.add(panel3,BorderLayout.CENTER);
        jframe.add(panel4,BorderLayout.EAST);
        jframe.add(panel5,BorderLayout.SOUTH);
    }

}
