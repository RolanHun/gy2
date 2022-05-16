package TesztHadseregProgram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;


public class TesztHadsereg implements Serializable, Iterable<Katona>{

    private ArrayList<Katona> hadsereg;
    private static final long serialVersionUID=1L;

    public TesztHadsereg() {
        hadsereg = new ArrayList<>();
    }
    
    public void hadsereghezAd(Katona katona){
        hadsereg.add(katona);
    }

    
    public void serializalas(){
        try (ObjectOutputStream objKi = new ObjectOutputStream(new FileOutputStream("hadsereg.dat"))) {
            objKi.writeObject(this);
            objKi.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static TesztHadsereg deserializalas(String fajl){
        TesztHadsereg tesztHadsereg = new TesztHadsereg();
        try(ObjectInputStream objBe = new ObjectInputStream(new FileInputStream(fajl))){
            tesztHadsereg = (TesztHadsereg)objBe.readObject();           
            return tesztHadsereg;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (InvalidClassException ex){
            System.err.println("Kompatibilitási hiba!");
        }catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return tesztHadsereg;
    }

    @Override
    public Iterator<Katona> iterator() {
        return hadsereg.iterator();
    }
    
    
    
}
