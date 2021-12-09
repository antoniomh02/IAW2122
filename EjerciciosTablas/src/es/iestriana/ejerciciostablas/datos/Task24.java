package es.iestriana.ejerciciostablas.datos;
import java.util.Arrays;
import java.util.Random;
public class Task24 {
    public static final int ocupado = 10;
    public static void main(String[] args) {
    	int i;
        int[] total = new int[ocupado];
        for (i = 0; i < ocupado; i++) {
            total[i] =  new Random().nextInt(20)+1;
        }
        System.out.println(Arrays.toString(total));
        for (i = 0; i < ocupado - 1; i++) {
            for (int n = i + 1; n < ocupado; n++) {
                 if (total[i] == total[n]) {
                    System.out.println("Mas Repetidos:" + total[i]);
                }
            }
        }
    }

}