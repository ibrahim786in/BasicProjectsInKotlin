package com.example.ibrahim.task1;

import java.util.Scanner;

public class PlayGround {
    private ScoreBoard1 board1;
    private ScoreBoard2 board2;
    private ScoreBoard3 board3;

    public void PlayGroundMethod() {
        String c;
        int score;

         board1 = new ScoreBoard1();
         board2 = new ScoreBoard2();
         board3 = new ScoreBoard3();

        System.out.println("Initially the score board is 0 :\n Enter First Score: ");
        Scanner scanner = new Scanner(System.in);
        do {
            score = scanner.nextInt();
            board1.UpdateScoreBoard1(score);
            board2.UpdateScoreBoard2(score);
            board3.UpdateScoreBoard3(score);

            System.out.println("Do you want to add more score ? ");
            c = scanner.next();
            System.out.println("Enter next Score: ");

        } while (c.equals("y") || c.equals("Y") || c.equals("Yes") || c.equals("yes"));
        board1.showScoreBoard1();
        board2.showScoreBoard2();
        board3.showScoreBoard3();


    }

    public int[] getScoreFromScoreBoard() {
       return new int[]{board1.getScore1(),board2.getScore2(),board3.getScore3()};


    }
}

class ScoreBoard1 {
    private int scoreBoard1;

    public void UpdateScoreBoard1(int score) {
        scoreBoard1 += score;
    }
public int getScore1(){
        return scoreBoard1;
}
    public void showScoreBoard1() {
        System.out.println("UpdateScoreBoard1 is: " + scoreBoard1);
    }

}

class ScoreBoard2 {
    private int scoreBoard2;


    public void UpdateScoreBoard2(int score) {
        scoreBoard2 += score;
    }
    public int getScore2(){
        return scoreBoard2;
    }
    public void showScoreBoard2() {
        System.out.println("UpdateScoreBoard2 is: " + scoreBoard2);
    }
}

class ScoreBoard3 {
    private int scoreBoard3;

    public void UpdateScoreBoard3(int score) {
        scoreBoard3 += score;
    }
    public int getScore3(){
        return scoreBoard3;
    }
    public void showScoreBoard3() {
        System.out.println("UpdateScoreBoard3 is: " + scoreBoard3);
    }
}