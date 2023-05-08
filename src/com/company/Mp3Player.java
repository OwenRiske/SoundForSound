//Owen Riske

package com.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import javazoom.jl.player.Player;


public class Mp3Player {

    private String filename;
    private Player player;


    public Mp3Player(String filename) {
        this.filename = filename;
    }

    public Mp3Player(String fileName, String folderThatTheFileIsIn){
        this.filename=folderThatTheFileIsIn+"\\"+fileName;
    }


    public void play() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream(filename+".mp3"));
            player = new Player(buffer);
            player.play();
        } catch (Exception e) {

            System.out.println(e);
        }

    }



    String getFile(){
        return filename+".mp3";
    }
}