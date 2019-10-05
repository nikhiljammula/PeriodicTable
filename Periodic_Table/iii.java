/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Periodic_Table;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

/**
 *
 * @author Rishabh Khemka
 */
public class iii {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {   Player p=null;
            Vector<Index> v=new Vector<>();
         FileInputStream fin = new FileInputStream("index.txt");
                ObjectInputStream obj = new ObjectInputStream(fin);
                
                 v  =  (Vector<Index>)obj.readObject(); 
                 for(int i=0;i<v.size();i++)
                 {
                   System.out.println(v.elementAt(i).p.name);  
                 }
                 
                 }
                 
    }
               

