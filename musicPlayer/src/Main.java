import java.io.*;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Main
{
    public static Music music;

    public static void main(String[] args)
    {
        music = new Music();
        MusicGUI gui = new MusicGUI();
        Playlist playlist = new Playlist();
        playlist.musicPlaylist.add("Katyusha.wav");
        try
        {
            for (int i = 0; i < playlist.musicPlaylist.size(); i++)
            {
                System.out.println("Now Playing: "+playlist.musicPlaylist.get(i));
                Clip currentClip = music.playMusic(playlist.musicPlaylist.get(i));
                while(currentClip.getMicrosecondLength() != currentClip.getMicrosecondPosition())
                {
                }
            }



        }catch (Exception e) {
            System.out.println(e);
        }


    }
}