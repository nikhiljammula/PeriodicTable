package Periodic_Table;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class addPlayer {

    public static void addplayer(Player p) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vector<Player> v = null;
        Btree i = null;
        SecBtree s=null;
        File f = new File("player.txt");
        File fi=new File("index.txt");
        File fs=new File("secindex.txt");
        if(!f.exists()){
            f.createNewFile();
        }
        if(!fi.exists()){
            fi.createNewFile();
        }
        if(!fs.exists()){
            fs.createNewFile();
        }
        try {
            //Add player to record
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream obj = new ObjectInputStream(fin);
            v = (Vector<Player>) obj.readObject();
 
            v.add(p);

            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(v);

            
            //Add player to Btree
            FileInputStream finin=new FileInputStream(fi);
            ObjectInputStream objin=new ObjectInputStream(finin);
            i =(Btree)objin.readObject();

            i.insert(new Index(p.id,p));
            
            FileOutputStream ind = new FileOutputStream(fi);
            ObjectOutputStream obj2 = new ObjectOutputStream(ind);
            obj2.writeObject(i);
            
            //Add player to SecBtree
            FileInputStream finsec=new FileInputStream(fs);
            ObjectInputStream objsec=new ObjectInputStream(finsec);
            s=(SecBtree)objsec.readObject();
            
            s.insert(new SecIndex(p.name,p));
            
            FileOutputStream sec = new FileOutputStream(fs);
            ObjectOutputStream obj3 = new ObjectOutputStream(sec);
            obj3.writeObject(s);
            
            
        } catch (EOFException e) {
            
            Vector<Player> z = new Vector<>();
            
            Btree i1 = new Btree(3);
            
            SecBtree s1=new SecBtree(3);
            
            //Add to record
            z.add(p);
            
            FileOutputStream fout = new FileOutputStream(f);
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            obj1.writeObject(z);
            
            
            //Add to index
            i1.insert(new Index(p.id, p));

            FileOutputStream ind = new FileOutputStream(fi);
            ObjectOutputStream obj2 = new ObjectOutputStream(ind);
            obj2.writeObject(i1);
            
            //Add to secIndex
            s1.insert(new SecIndex(p.name,p));
            
            FileOutputStream sec=new FileOutputStream(fs);
            ObjectOutputStream obj3=new ObjectOutputStream(sec);
            obj3.writeObject(s1);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
