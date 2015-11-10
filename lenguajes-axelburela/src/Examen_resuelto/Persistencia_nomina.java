//BURELA NAVA AXEL Y.

package Examen_resuelto;


import java.io.*;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class Persistencia_nomina {
    ArrayList<Nomina>nominas;
    
    public Persistencia_nomina(){
        nominas=new ArrayList<Nomina>();
    }
    public void guardar(Nomina nomina) throws Exception{
        File file=new File("nomina");
        if(file.exists())nominas=leertodo();
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
                nominas.add(nomina);
                oos.writeObject(oos);
                oos.close();
    }
    public ArrayList<Nomina> leertodo()throws Exception{
        File file=new File("nomina");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        nominas=(ArrayList<Nomina>)ois.readObject();
        return nominas;
    }
    public Nomina buscarPorid(int id)throws Exception{
        Nomina n=new Nomina();
        nominas= leertodo();
        n=nominas.get(id);
        return n;
        
    }
       
    }
    

