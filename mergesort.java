import java.util.Arrays;
import java.util.Scanner;

public class mergesort {

    public static void main(String[] args) {
        int i;
        String X[] = new String[5];
        Scanner scan = new Scanner(System.in);
        
        for(i = 0; i < X.length; i++) {
            System.out.println("Digite o " + (i+1) + " Nome: ");
            X[i] = scan.nextLine();
        }

        mergeSort(X, 0, X.length - 1);
        System.out.println("");
        System.out.println("Ordenado: ");
        for(i = 0; i <= 4; i++){
            System.out.println((i+1) + " Nome: " + X[i]);
        }
    }

    public static void mergeSort(String[] a, int inicio, int fim) {
        if (inicio == fim) {
            return;
        }
        int meio = (inicio + fim) / 2;
        mergeSort(a, inicio, meio);
        mergeSort(a, meio + 1, fim);
        merge(a, inicio, meio, fim);
    }

    public static void merge(String[] a, int inicio, int meio, int fim) {
        int n = fim - inicio + 1;       
        String[] b = new String[n];   
        int i1 = inicio;               
        int i2 = meio + 1;            
        int j = 0;                  

        while (i1 <= meio && i2 <= fim) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= meio) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= fim) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[inicio + j] = b[j];
        }
    }
}
