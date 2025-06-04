package com.ali;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch thumper = new Finch();

        // What do I want my finch to do?

        // Spin Around 3 Times 
        thumper.setTurn("R",1080,100);

        // Play Note
        thumper.playNote(60,1);

        // Display Colors On All Lights
        thumper.setTail("all",10,10,10);
        thumper.setTail(1, 100, 0, 0);
        thumper.setTail(2, 0, 100, 0);
        thumper.setTail(3, 0, 0, 100);
        thumper.setTail(4, 90, 75, 45);

        thumper.setBeak(65, 35, 18);

        // Print Out Name: THUMPER
        thumper.print("THUMPER");
        
        // Play Note And Pause
        thumper.playNote(32, 1);
        thumper.pause(0.4);
        thumper.playNote(42, 1);
        thumper.pause(0.4);
        thumper.playNote(52, 1);
        thumper.pause(0.4);
        thumper.playNote(62, 1);
        thumper.pause(0.4);
        thumper.playNote(72, 1);
        thumper.pause(0.4);
        thumper.playNote(82, 1);
        thumper.pause(0.4);
        thumper.playNote(92, 1);
        thumper.pause(0.4);
        thumper.playNote(102, 1);
        thumper.pause(0.4);
        thumper.playNote(112, 1);
        thumper.pause(0.4);
        thumper.playNote(122, 1);
        thumper.pause(0.4);
        thumper.playNote(132, 1);
        thumper.pause(0.4);
        thumper.playNote(122, 1);
        thumper.pause(0.4);
        thumper.playNote(112, 1);
        thumper.pause(0.4);
        thumper.playNote(102, 1);
        thumper.pause(0.4);
        thumper.playNote(92, 1);
        thumper.pause(0.4);
        thumper.playNote(82, 1);
        thumper.pause(0.4);
        thumper.playNote(72, 1);
        thumper.pause(0.4);
        thumper.playNote(62, 1);
        thumper.pause(0.4);
        thumper.playNote(52, 1);
        thumper.pause(0.4);
        thumper.playNote(42, 1);
        thumper.pause(0.4);
        thumper.playNote(32, 1);
        thumper.pause(0.4);

        // Pause for 2 seconds
        thumper.pause(1);

        // Spin Nack Around 5 Times Left To Reverse First Spin
        thumper.setTurn("L",1080,100);

        // Wiggle And Play Notes
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.playNote(80, 1);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.playNote(80, 1);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.playNote(80, 1);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);
        thumper.setTurn("L",10,75);
        thumper.setTurn("R",10,75);

        // Play Final Note
        thumper.playNote(80, 3);


        thumper.stopAll();
        thumper.disconnect();
    }
}