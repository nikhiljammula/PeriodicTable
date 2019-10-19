package Periodic_Table;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean leaf = true;
        Player p1 = new Player(1, "dun dun", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p2 = new Player(2, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p3 = new Player(3, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p4 = new Player(4, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p5 = new Player(5, "rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p6 = new Player(6,"rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);
        Player p7 = new Player(7,"rohan", 21, "assam", "batsman", "right", "right medium", "india", 12, 234, 4, 125, 6);

        Btree b = new Btree(3);
        b.insert(new Index(1, p1));
        b.insert(new Index(2, p2));
        b.insert(new Index(3, p3));
        b.insert(new Index(4, p4));
        b.insert(new Index(5, p5));
        b.insert(new Index(6 , p6));
        b.insert(new Index(7 , p7));
        System.out.println("Tree Traversal is: ");
        b.traverse();
        b.remove(new Index(9,p3));
        b.traverse();
        System.out.println("Enter the number to be searched");
        int k = scan.nextInt();

        if (b.search(k) != null) {
            Index[] v=b.search(k).keys.clone();
            for(int i=0;i<v.length;i++)
            {
                if(!(v[i]==null)&&v[i].id==k)
                {
                   Player p=null;
                    System.out.println(b.search(k).keys[i].p);
                }
            }
            
            }
       
    else {
            System.out.println("Not present");
        }

    }

}
