package masolhatosag;
public class Masolhatosag {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pont p1 = new Pont(0, 0, "P-1");
        Pont p2 = p1;
        p2.x = 20;
        p2.nev = "P-2";
        
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);

        Pont p3 = new Pont(30, 30, "P-3");
        Pont p4 = (Pont)p3.clone();
        p4.x = 40;
        p4.nev = "P-4";
        
        System.out.println("p3: " + p3);
        System.out.println("p4: " + p4);
        
        Pont p5 = new Pont(50, 50, "P-5", new PontLeiro("Ez a p5, de p6-ra is jó"));
        Pont p6 = (Pont)p5.clone();
        p6.x = 60;
        p6.nev = "P-6";
        p6.leiro.leiras = "Ez a p6";
        
        System.out.println("p5: " + p5);
        System.out.println("p6: " + p6);
        
    }
    
}
