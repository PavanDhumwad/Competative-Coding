package Sorting;

import java.util.*;

public class SortingComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        for(int i = 0; i < n; i++)
            player[i] = new Player(scan.next(), scan.nextInt());

        scan.close();
        Checker checker = new Checker();
        Arrays.sort(player,checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

class Player
{
    String name;
    int score;
    Player(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player>
{
    public int compare(Player a, Player b)
    {
        if(a.score == b.score)
            return a.name.compareTo(b.name);
        else
            return ((Integer)b.score).compareTo(a.score);
    }

}