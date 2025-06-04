package com.ali;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        // WHat do I want my finch to do?
        myFinch.setTurn("R",360,100);
        myFinch.setTurn("L",360,100);
        myFinch.playNote(32,1);
        while (i < 3) {
        myFinch.print("A");
        myFinch.print("B");
        myFinch.print("C");
        i++;
    }
    


        myFinch.stopAll();
        myFinch.disconnect();
    }
}