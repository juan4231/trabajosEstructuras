import java.util.ArrayList;
import java.util.Vector;

public class ComparacionRendimiento {

    public static void main(String[] args) {
        int elementos = 1_000_000;

        Vector<Integer> vector = new Vector<>();
        long inicioVector = System.currentTimeMillis();
        for (int i = 0; i < elementos; i++) {
            vector.add(i);
        }
        long finVector = System.currentTimeMillis();

        ArrayList<Integer> arrayList = new ArrayList<>();
        long inicioArray = System.currentTimeMillis();
        for (int i = 0; i < elementos; i++) {
            arrayList.add(i);
        }
        long finArray = System.currentTimeMillis();

        System.out.println("Tiempo Vector: " + (finVector - inicioVector) + " ms");
        System.out.println("Tiempo ArrayList: " + (finArray - inicioArray) + " ms");
    }
}
