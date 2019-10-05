package Periodic_Table;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class showSquad {
    public static Vector<Player> showsquad(String team) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Vector<Player> v=null;
        Vector<Player> n=new Vector<>();
        FileInputStream fin = null;
             try {
                 fin = new FileInputStream("player.txt");
                ObjectInputStream obj = new ObjectInputStream(fin);
                
                 v  =  (Vector<Player>)obj.readObject();
                 
                 for(int i=0;i<v.size();i++)
                 {
                     if(v.elementAt(i).team.equals(team))
                     {
                         n.add(v.elementAt(i));
                     }
                 }
                 
             }
             catch(IOException ex)
             {
                 System.out.println(ex);
             }
        return n;
        
    }
}
