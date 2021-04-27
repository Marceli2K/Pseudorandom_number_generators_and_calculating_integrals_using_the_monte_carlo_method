package mitsk.generators;

import java.util.Random;

public class Weighted implements Generator{
    public static int weight;
    private final double wynik;

    public Weighted(Obiekty a, Obiekty b, Obiekty c){
        weight = a.weight_object+b.weight_object+c.weight_object;
        Random rand = new Random();
        double zmienna;
        zmienna = rand.nextDouble()*(1)+0;
        double przedzial = zmienna * weight;

        if(a.weight_object>= przedzial){
            zmienna = rand.nextDouble()*(1)+0;
            wynik = a.from_object+(a.to_object - a.from_object)* zmienna;
        }else if(a.weight_object< przedzial && (a.weight_object+b.weight_object)>= przedzial){
            zmienna = rand.nextDouble()*(1)+0;
            wynik = b.from_object+(b.to_object - b.from_object)* zmienna;
        }else{
            zmienna = rand.nextDouble()*(1)+0;
            wynik = c.from_object+(c.to_object - c.from_object)* zmienna;
        }
        System.out.println("Wynik koncowy: "+ wynik);
    }

    @Override
    public double getNext() {

        return wynik;
    }

    public static class Obiekty {

        public int from_object;
        public int to_object;
        public int weight_object;

        Obiekty(int a, int b, int c){
            from_object = a;
            to_object = b;
            weight_object = c;

        }
    }
}