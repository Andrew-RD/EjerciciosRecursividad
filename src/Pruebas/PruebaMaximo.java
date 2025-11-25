package Pruebas;

import Ejercicios.Maximo;
import java.util.Random;
import java.util.Scanner;

public class PruebaMaximo {

    public static void probar() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("\n=== PRUEBA EJERCICIO 2: MÁXIMO (DIVIDE Y VENCERÁS) ===");
        System.out.print("Cantidad de elementos aleatorios (N): ");
        int n = sc.nextInt();
        sc.nextLine(); // Limpiar buffer

        if (n <= 0) {
            System.out.println("El arreglo debe tener al menos un elemento.");
            return;
        }

        int[] arreglo = new int[n];
        System.out.print("Arreglo: [ ");
        for (int i = 0; i < n; i++) {
            arreglo[i] = rand.nextInt(100);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("]");

        int maxIterativo = Maximo.maximoIterativo(arreglo);
        int maxRecursivo = Maximo.maximoRecursivo(arreglo, 0, arreglo.length - 1);

        System.out.println("-> Max Iterativo: " + maxIterativo);
        System.out.println("-> Max Recursivo: " + maxRecursivo);
    }
}