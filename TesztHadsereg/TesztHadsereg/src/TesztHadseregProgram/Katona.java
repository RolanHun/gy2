package TesztHadseregProgram;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.UUID;

class FokozatComparator implements Comparator<Katona>{

    @Override
    public int compare(Katona egyik, Katona masik) {
        Collator col = Collator.getInstance();
        return col.compare(egyik.getFokozat(), masik.getFokozat());
    }
}

class EleteroComparator implements Comparator<Katona>{

    @Override
    public int compare(Katona egyik, Katona masik) {
        return Integer.compare(egyik.getEletero(), masik.getEletero());
    }
}

class LovedekComparator implements Comparator<Katona>{

    @Override
    public int compare(Katona egyik, Katona masik) {
        return Integer.compare(egyik.getLovedek(), masik.getLovedek());
    }
}

public class Katona implements Comparable<Katona>, Cloneable, Serializable{
    private String szin, fokozat;
    private int eletero, lovedek;
    private transient UUID id;

    public Katona(String szin, int eletero, String fokozat, int lovedek) {
        this.szin = szin;
        this.eletero = eletero;
        this.fokozat = fokozat;
        this.lovedek = lovedek;
        this.id=UUID.randomUUID();
    }

    public String getSzin() {
        return szin;
    }

    public String getFokozat() {
        return fokozat;
    }

    public int getEletero() {
        return eletero;
    }

    public int getLovedek() {
        return lovedek;
    }

    public UUID getId() {
        return id;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setFokozat(String fokozat) {
        this.fokozat = fokozat;
    }

    public void setEletero(int eletero) {
        this.eletero = eletero;
    }

    public void setLovedek(int lovedek) {
        this.lovedek = lovedek;
    }
    
    public static FokozatComparator FokozatRendezo(){
        return new FokozatComparator();
    }
    
    public static EleteroComparator EleteroRendezo(){
        return new EleteroComparator();
    }
    
    public static LovedekComparator LovedekRendezo(){
        return new LovedekComparator();
    }
    
    
    @Override
    public int compareTo(Katona k) {
        Collator col = Collator.getInstance();
        return col.compare(this.szin, k.szin);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Katona katona = new Katona(szin, eletero, fokozat, lovedek);
        return katona;
    }

    @Override
    public String toString() {
        return "TesztHadsereg{" + "szin=" + szin + ", fokozat=" + fokozat + ", eletero=" + eletero + ", lovedek=" + lovedek + ", id="+id+'}';
    }
}
