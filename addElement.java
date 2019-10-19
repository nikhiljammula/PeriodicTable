import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Vector;

public class addElement {

    public static void addelement(Element e) throws ClassNotFoundException, FileNotFoundException, IOException {
        Vector<Element> v = null;
        
        Btree i = null;
        
        File f = new File("element.txt");
        if(!f.exists()){
                f.createNewFile();
            }
        
        FileInputStream fin = null;
        
        try {
//           f = new File("element.txt");
            
            fin = new FileInputStream(f);
            
            ObjectInputStream obj = new ObjectInputStream(fin);
            
            v = (Vector<Element>) obj.readObject();
            
            Iterator value = v.iterator(); 
            System.out.println("The iterator values are: "); 
            while (value.hasNext()) {  
                Element p1=(Element)value.next();
                System.out.println(p1.Name);
            }   
            v.add(e);

            FileOutputStream fout = new FileOutputStream("element.txt");
            
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            
            obj1.writeObject(v);
            
            i = new Btree(3);
                 
            for (int j = 0; j < v.size(); j++) {
                
                i.insert(new Index(v.elementAt(j).id, v.elementAt(j)));      
            }

            File inde = new File("index.txt");
            
            FileOutputStream ind = new FileOutputStream(inde);
            
            ObjectOutputStream obj2 = new ObjectOutputStream(ind);
            
            obj2.writeObject(i);

            i.traverse();
            
        } catch (EOFException eo) {
            Vector<Element> z = new Vector<>();
            
            
            
            Btree i1 = new Btree(3);

            z.add(e);
            FileOutputStream fout = new FileOutputStream(f);
            
            
            ObjectOutputStream obj1 = new ObjectOutputStream(fout);
            
            obj1.writeObject(z);
            
            i1.insert(new Index(e.id, e));

            File inde = new File("index.txt");
           
            FileOutputStream ind = new FileOutputStream(inde);
            
            ObjectOutputStream obj2 = new ObjectOutputStream(ind);
            
            obj2.writeObject(i1);
            
        } catch (IOException eo) {
            
            System.out.println(eo);
        }
    }

}