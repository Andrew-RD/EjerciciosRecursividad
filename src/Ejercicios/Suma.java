package Ejercicios;

// Sumar arreglo de manera recursiva
public class Suma {

    public static int sumarRecursivo(int[] a, int ind){
        if(ind == a.length){
            return 0;
        }
        return a[ind] + sumarRecursivo(a, ind+1);
    }

    public static int sumarIterativo(int[] a){
        int suma = 0;
        for(int i = 0; i < a.length; i++){
            suma += a[i];
        }
        return suma;
    }

}
