/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamscheduler;

/**
 *
 * @author SPH_SHSM
 */
public class TeamScheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Team t1=new Team("Team 1");
        Team t2=new Team("Team 2");
        
        Team[] teams={t1,t2};
        Game g1=new Game(t1.name,t2.name,3,5);
        Calendar schedule = new Calendar();
        schedule.games.add(g1);
        for (Team t:teams){
            if (t.name.equals(g1.away)||t.name.equals(g1.home)){
                t.addGame(g1);
            }
        } 
        Stats(teams);
    }
    
    public static void Stats(Team[] teamList){
        for (Team t:teamList){
            System.out.println(t.name);
            System.out.println("Wins: "+t.wins+"\tLosses: "+t.losses+"\tTies: "+t.ties);
            System.out.println("Goals For: "+t.goalsFor+"\tGoals Against: "+t.goalsAgainst+"\n");
        }
    }
    
}
