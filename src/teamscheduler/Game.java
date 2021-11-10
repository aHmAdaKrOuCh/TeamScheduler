/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamscheduler;

/**
 *
 * @author SPH_SHSM
 */
public class Game {

    String home;
    String away;
    int homeScore;
    int awayScore;
    String winner;

    public Game(String home, String away, int homeScore, int awayScore) {
        this.home = home;
        this.away = away;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.winner = "";
    }

    public void UpdateScore(int score1, int score2) {
        this.homeScore = score1;
        this.awayScore = score2;
        if (score1 > score2) {
            this.winner = this.home;
        } else {
            this.winner = this.away;
        }
        System.out.println(this.winner + " is the winner!");
    }

}
