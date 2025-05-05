import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Double> lista = new ArrayList<Double>();
        Random rand = new Random();

        lista.add(rand.nextDouble());
        lista.add(rand.nextDouble());
        lista.add(rand.nextDouble());
        lista.add(rand.nextDouble());
        lista.add(rand.nextDouble());

//      Collections.sort(lista, Collections.reverseOrder());

        Collections.sort(lista);

        for(int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }

    }
}