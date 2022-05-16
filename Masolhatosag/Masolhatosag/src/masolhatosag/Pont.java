package masolhatosag;

import java.util.UUID;

class PontLeiro{
    public String leiras;
    public UUID id;

    public PontLeiro() {
        this("nincs leírás");
    }
    
    public PontLeiro(String leiras) {
        this.leiras = leiras;
        id = UUID.randomUUID();
    }
}

public class Pont implements Cloneable{
    public int x, y;
    public String nev;

    public PontLeiro leiro;

    public Pont(int x, int y, String nev, PontLeiro leiro) {
        this.x = x;
        this.y = y;
        this.nev = nev;
        this.leiro = leiro;
    }
    
    public Pont(int x, int y, String nev) {
        this(x,y,nev, new PontLeiro());
        //this.x = x;
        //this.y = y;
        //this.nev = nev;
    }

    @Override
    public String toString() {
        String s = "Pont{" + "x=" + x + ", y=" + y + ", nev=" + nev;
        s += "\n\tleíró: leírás=" + leiro.leiras + ", id=" + leiro.id;
        s += "\n}";
        
        return s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /* sekély másolat, csak az érték típusokat másolja
         * a renferenciák áltla mutatott értéket nem, 
         * csak magát a referenciát
        */
        //return super.clone(); //<-- minden érték típusú adattagot lemásol
        
        
        /* mély másolat: a referencia típusokat is átmásolja
         * de ezt "kézzel" kell megírni
        */
        PontLeiro leiro = new PontLeiro(this.leiro.leiras);
        return new Pont(this.x, this.y, this.nev, leiro);
    }
    
    
}
