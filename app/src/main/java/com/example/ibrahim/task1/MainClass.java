package com.example.ibrahim.task1;

public class MainClass {
    public static void main(String args[]) {
        PlayGround playGround = new PlayGround();
        playGround.PlayGroundMethod();
        int[] score = playGround.getScoreFromScoreBoard();
        System.out.println("The First Score Board From MainClass is : " + score[0]);
        System.out.println("The Second Score Board From MainClass is : " + score[1]);
        System.out.println("The Third Score Board From MainClass is : " + score[2]);
    }
}
