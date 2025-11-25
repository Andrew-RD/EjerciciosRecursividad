package Pruebas;

import Ejercicios.Suma;
import java.util.Scanner;

public class PruebaSuma {

    public static void probar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n=== PRUEBA EJERCICIO 1: SUMA DE ARREGLO ===");
        System.out.println("Ingrese números separados por espacio (ej: 1 5 10):");

        try {
            String entrada = sc.nextLine();
            String[] partes = entrada.split(" ");

            int[] numeros = new int[partes.length];
            for (int i = 0; i < partes.length; i++) {
                numeros[i] = Integer.parseInt(partes[i]);
            }

            int resIterativo = Suma.sumarIterativo(numeros);
            int resRecursivo = Suma.sumarRecursivo(numeros, 0);

            System.out.println("-> Iterativo: " + resIterativo);
            System.out.println("-> Recursivo: " + resRecursivo);

        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese solo números enteros.");
        }
    }
}