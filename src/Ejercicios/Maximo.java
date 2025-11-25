package Ejercicios;

// Maximo de un arreglo de manera iterativa
public class Maximo {

    public static int maximoIterativo(int[] a){

        if(a.length == 0){
            return Integer.MIN_VALUE;
        }

        int mx = a[0];

        for(int i = 1; i < a.length; ++i){
            if(a[i] > mx){
                mx = a[i];
            }
        }

        return mx;

    }

    public static int maximoRecursivo(int[] a, int i, int j){

        if(i == j){
            return a[i];
        }

        int mid = (i+j)/2;
        int left = maximoRecursivo(a, i, mid);
        int right = maximoRecursivo(a, mid+1, j);

        return Math.max(left, right);

    }

}
