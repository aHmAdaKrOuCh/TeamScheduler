/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teamscheduler;
import java.util.*;
/**
 *
 * @author SPH_SHSM
 */
public class Team {
    String name;
    int wins;
    int losses;
    int ties;
    int goalsFor;
    int goalsAgainst;
    ArrayList<Game> history;

    public Team(String name) {
        this.name = name;
        this.wins=0;
        this.losses=0;
        this.ties=0;
        this.goalsFor=0;
        this.goalsAgainst=0;
        history=new ArrayList<>();
    }
    
    public void addGame(Game g){
        history.add(g);
        if (g.home.equals(this.name)){
            this.goalsFor+=g.homeScore;
            this.goalsAgainst+=g.awayScore;
            if (g.homeScore>g.awayScore){
                this.wins++;
            }else if (g.homeScore<g.awayScore){
                this.losses++;
            }else{
                this.ties++;
            }
        }else{
            this.goalsFor+=g.awayScore;
            this.goalsAgainst+=g.homeScore;
            if (g.homeScore>g.awayScore){
                this.losses++;
            }else if (g.homeScore<g.awayScore){
                this.wins++;
            }else{
                this.ties++;
            }
        }
    }
    
    
}
