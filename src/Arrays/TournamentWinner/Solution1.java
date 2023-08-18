package Arrays.TournamentWinner;

import java.util.*;

public class Solution1 {


    static ArrayList<ArrayList<String>> teams = new ArrayList<>();

    static ArrayList<String> team1 = new ArrayList<>();
    static ArrayList<String> team2 = new ArrayList<>();

    static ArrayList<String> team3 = new ArrayList<>();

    static ArrayList<String> team4 = new ArrayList<>();

    static ArrayList<Integer> results = new ArrayList<>();


    public static void main(String[] args) {

        team1.add("HTML");
        team1.add("C#");

        team2.add("C#");
        team2.add("Python");

        team3.add("Python");
        team3.add("HTML");

        team4.add("Python");
        team4.add("HTML");

        teams.add(team1);
        teams.add(team2);
        teams.add(team3);
        teams.add(team4);

        results.add(0);
        results.add(0);
        results.add(1);
        results.add(1);

        System.out.println(tournamentWinner(teams, results));


    }

    public static String tournamentWinner(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {

        Hashtable<String, Integer> resultsOfEachCompetition = new Hashtable<>();
        int homeTeam = 0;
        int awayTeam = 1;
        int highestValue = 0;


        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> teams = competitions.get(i);
            if (results.get(i) == 1 && resultsOfEachCompetition.containsKey(teams.get(homeTeam))){
                resultsOfEachCompetition.compute(teams.get(homeTeam), (key, oldValue)-> oldValue + 3);}
            else if (results.get(i) == 1) resultsOfEachCompetition.put(teams.get(homeTeam), 3);

            if (results.get(i) == 0 && resultsOfEachCompetition.containsKey(teams.get(awayTeam))){
                resultsOfEachCompetition.compute(teams.get(awayTeam), (key, oldValue)-> oldValue + 3);}
            else if (results.get(i) == 0) resultsOfEachCompetition.put(teams.get(awayTeam), 3);
        }
        System.out.println(resultsOfEachCompetition);
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(resultsOfEachCompetition.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        return entryList.get(entryList.size()-1).getKey();
    }

}
