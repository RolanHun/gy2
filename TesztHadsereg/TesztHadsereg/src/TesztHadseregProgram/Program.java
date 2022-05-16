package TesztHadseregProgram;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        List<String> sorok = Files.readAllLines(Paths.get("hadsereg.txt"));
        ArrayList<Katona> hadseregLista = new ArrayList<>();
        for (String sor : sorok) {
            String[] adat = sor.split(";");
            hadseregLista.add(new Katona(adat[0], parseInt(adat[1]), adat[2], parseInt(adat[3])));
        }
        
        Collections.sort(hadseregLista);
        for (Katona katona : hadseregLista) {
            System.out.println(katona);
        }
        
        Collections.sort(hadseregLista, Katona.LovedekRendezo());
        for (Katona katona : hadseregLista) {
            System.out.println(katona);
        }
        
        Katona k1 = new Katona("fekete", 40, "ezredes", 100);
        Katona k2 = (Katona)k1.clone();
        
        k2.setLovedek(30);
        k2.setEletero(50);
        
        System.out.println("k1: " + k1);
        System.out.println("k2: " + k2);
        TesztHadsereg th = new TesztHadsereg();
//        for (Katona katona : hadseregLista) {
//            th.hadsereghezAd(katona);
//        }
//        
//        for (Katona katona : th) {
//            System.out.println(katona);
//        }
        
        //th.serializalas();
        th=TesztHadsereg.deserializalas("hadsereg.dat");
        for (Katona katona : th) {
            System.out.println(katona);
        }

    }
}
