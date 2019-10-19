package Periodic_Table;

import java.io.Serializable;
class SecIndex implements Serializable{

    String name;
    Player p;

    SecIndex(String name, Player abc){
        this.name = name;
        this.p = abc;
    }

}