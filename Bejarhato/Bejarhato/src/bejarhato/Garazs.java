package bejarhato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Garazs implements Iterable<Auto>{
    //private Auto[] autok = new Auto[3];
    private ArrayList<Auto> autok = new ArrayList<>();
    //private HashSet<Auto> autok = new HashSet<>();

    public Garazs() {
        //autok[0] = new Auto("BMW", "ABC-123");
        //autok[1] = new Auto("VW", "QWE-123");
        //autok[2] = new Auto("Suzuki", "ASD-123");
        
        autok.add(new Auto("BMW", "ABC-123"));
        autok.add(new Auto("VW", "QWE-123"));
        autok.add(new Auto("Suzuki", "ASD-123"));
    }

    /* ez a getter egy SETTER */
//    public Auto[] getAutok() {
//        return autok;
//    }

    
    /* HELYES getterek használata: */
    /*1.: használjuk a new kulcsszót: */
    public ArrayList<Auto> getAutokList() {
        //Ha másik kollekcióra váltunk: 
        ArrayList<Auto> a = new ArrayList<>(autok);
        
        //ha tömbből másolunk: 
//        ArrayList<Auto> a = new ArrayList<>();
//        for (Auto auto : autok) {
//            a.add(auto);
//        }

        return a;
        //return autok;
    }
    
    /* 2.: nem módosítható listát adojk vissza */
    public List<Auto> getAutokNemModosithatoLista(){
        return Collections.unmodifiableList(autok);
    }
    
    /* 3.: */

    @Override
    public Iterator<Auto> iterator() {
        return autok.iterator();
    }
    
}
