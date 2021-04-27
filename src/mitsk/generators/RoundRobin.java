package mitsk.generators;


import static java.lang.Thread.sleep;

public class RoundRobin implements Generator{
    int zmienna = 0;
    double[] zmienne;

    public RoundRobin(double[] lista){
    zmienne = lista;
    }

    @Override
    public double getNext() throws InterruptedException {
        while (1 == 1){
            for (double i : zmienne) {
                System.out.println(i);
                sleep(333);
            }

        }
    }
}
