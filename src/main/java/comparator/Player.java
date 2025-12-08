package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        if (a.score != b.score) {
            return b.score - a.score;
        }
        return a.name.compareToIgnoreCase(b.name);
    }

}

public class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public static void main(String[] args) {
//        Player[] players = new Player[5];
//        players[0] = new Player("amy", 100);
//        players[1] = new Player("david", 150);
//        players[2] = new Player("heraldo", 50);
//        players[3] = new Player("aakansha", 75);
//        players[4] = new Player("amy", 100);
//
//        Checker checker = new Checker();
//        Arrays.sort(players, checker);
//        for (Player player : players) {
//            System.out.println(player.name + " " + player.score);
//        }

        List<Player> players = Arrays.asList(

                new Player("amy", 100),
                new Player("david", 150),
                new Player("heraldo", 50),
                new Player("aakansha", 75),
                new Player("amy", 100)
        );
        List<String> names = players.stream().sorted((a, b) -> {
                    if (a.score != b.score) {
                        return b.score - a.score;
                    }
                    return a.name.compareToIgnoreCase(b.name);
                })
                .map(player -> player.name)
                .collect(Collectors.toList());
        names.forEach(
                System.out::println
        );
    }


}


