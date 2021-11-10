/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teamscheduler;

import java.util.*;

/**
 *
 * @author SPH_SHSM
 */
public class TeamScheduler {

    /**
     * @param args the command line arguments
     */
    static Scanner in;
    public static void main(String[] args) {
        // TODO code application logic here
        in = new Scanner(System.in);
        System.out.println("Welcome to the Champions league");
        choices();
        System.out.println("Give me the first team");
        String input = in.nextLine();
        Team t1 = new Team(input);
        System.out.println("Give me the second team");
        input = in.nextLine();
        Team t2 = new Team(input);
        System.out.println("Give me the third team");
        input = in.nextLine();
        Team t3 = new Team(input);
        System.out.println("Give me the fourth team");
        input = in.nextLine();
        Team t4 = new Team(input);

        Team[] teams = {t1, t2, t3, t4};

        Calendar schedule = new Calendar();
        schedule.games.add(new Game(t2.name, t1.name, 0, 0));
        schedule.games.add(new Game(t3.name, t4.name, 0, 0));
        schedule.games.add(new Game(t4.name, t2.name, 0, 0));
        schedule.games.add(new Game(t4.name, t1.name, 0, 0));
        schedule.games.add(new Game(t3.name, t1.name, 0, 0));
        schedule.games.add(new Game(t4.name, t2.name, 0, 0));
        schedule.games.add(new Game(t3.name, t2.name, 0, 0));
        int choice;
        do {
            int counter = 1;
            for (Game g : schedule.games) {
                System.out.println(counter + ") " + g.home + " vs " + g.away);
                counter++;
            }
            System.out.println("Which game do you want to enter scores for? -1 to quit");
            choice = in.nextInt();
            if (choice != -1) {
                System.out.println("Enter the score for " + schedule.games.get(choice - 1).home);
                int score = in.nextInt();
                System.out.println("Enter the score for " + schedule.games.get(choice - 1).away);
                int score2 = in.nextInt();
                schedule.games.get(choice - 1).UpdateScore(score, score2);

            }
        } while (choice != -1);
        Stats(teams);
//        if (t1score > t2score){
//            System.out.println("Team 1 wins");
//        }else{
//            if (t1score < t2score)
//                System.out.println("Team 2 wins");
//        }
//         if (t3score > t4score){
//            System.out.println("Team 1 wins");
//        }else{
//            if (t3score < t4score)
//                System.out.println("Team 2 wins");
//    }
    }

    public static void Stats(Team[] teamList) {
        for (Team t : teamList) {
            System.out.println(t.name);
            System.out.println("Wins: " + t.wins + "\tLosses: " + t.losses + "\tTies: " + t.ties);
            System.out.println("Goals For: " + t.goalsFor + "\tGoals Against: " + t.goalsAgainst + "\n");

        }
    }

    public static void choices() {
        //Print out games without a winner
        
        int choice;
        do {
            System.out.println("Pick your choice");

            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("How many teams are you going to have?");
                int teamNumber=in.nextInt();
                scheduleGames(teamNumber);

            } else if (choice == 2) {
                updateScore();

            } else if (choice == 4) {
                System.out.println("Goodbye");
            }
        } while (choice!=4);

    }
    
    
    public static void scheduleGames(int teams){
        
    }
    
    public static void updateScore(){
    
    }
}
