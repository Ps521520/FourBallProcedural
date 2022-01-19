package com.tw.java;

import processing.core.PApplet;

public class TryProcessing extends PApplet {
    private int firstBallX =0;
    private int secondBallX =0;
    private int thirdBallX =0;
    private int fourthBallX =0;

    public static void main(String args[]){
        PApplet.main("com.tw.java.TryProcessing",args);
    }

    @Override
    public void settings(){
      super.settings();
      size(800,600);
    }

    @Override
    public void draw() {
        ellipse(firstBallX,200,10,10);
        firstBallX++;
        ellipse(secondBallX,300,10,10);
        secondBallX+=2;
        ellipse(thirdBallX,400,10,10);
        thirdBallX+=3;
        ellipse(fourthBallX,500,10,10);
        fourthBallX+=4;
    }
}
