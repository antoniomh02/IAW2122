package es.iestriana.examennoviembre.datos;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3 {
	private static Scanner sc = new Scanner(System.in);
	private static int [] array1;
	private static int [] array2;
		
	public static void main(String[] args) {
    		System.out.print("Inserte la cantidad: ");
    		int num = sc.nextInt();
    		            System.out.println("Cantidad de números de los Arrays: "+num);
    		 	int[] array1 = new int[num];
    		            int[] array2 = new int[num];
    		                
    		 
    		for(int i=0; i < num; i++) {
    		array1[i] = new Random().nextInt(50);
    		            array2[i] = new Random().nextInt(50);
    		}
    		System.out.println(Arrays.toString(array1));
    		            System.out.println(Arrays.toString(array2));
    		                   	
    		 
    		for(int i=0; i < array1.length; i++) {
    		if(array1[i] % 2 == 1) {
    		array1[i] += 1;
    		}
    		}
    		 
    		for(int i=0; i < array2.length; i++) {
    		if(array2[i] % 2 == 0) {
    		array2[i] -= 1;
    		}
    		}
    		                   	System.out.println(Arrays.toString(array1));
    		                   	System.out.println(Arrays.toString(array2));
}
}