
package Periodic_Table;

import java.io.Serializable;

public class Schedule implements Serializable{
    String team_a;
    String team_b;

    public Schedule(String team_a, String team_b) {
        this.team_a = team_a;
        this.team_b = team_b;
    }
    
}
