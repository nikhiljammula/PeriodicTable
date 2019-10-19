package Periodic_Table;

import java.io.IOException;
import java.util.Vector;

public class CricketDataManagement {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        System.out.println("Cricket data MAnagemet");
        Player p = new Player(5, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p1 = new Player(19, "dun dun", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p2 = new Player(92, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p3 = new Player(3, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p4 = new Player(4, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p5 = new Player(35, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);

//        addPlayer.addplayer(p);
//        addPlayer.addplayer(p1);
//        addPlayer.addplayer(p2);
//        addPlayer.addplayer(p3);
//        addPlayer.addplayer(p4);
//        addPlayer.addplayer(p5);
//        removePlayer.removeplayer(13);
        
       Player play=searchName.searchname("dun dun");
        System.out.println(play);
    }

}
