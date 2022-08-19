import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
        int tamanho;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma quantidade:");
        tamanho = scan.nextInt();

        String values[] = new String[tamanho];

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite uma string por vez:");
        for(int i = 0; i < tamanho; i++) {
            values[i] = scan2.nextLine();
        }

        mergeSort(values, 0, values.length - 1);
        System.out.println("Strings ordenadas: " + Arrays.toString(values));
    }

    public static void mergeSort(String[] a, int from, int to) {
        if (from == to) {
            return;
        }
        int mid = (from + to) / 2;
        mergeSort(a, from, mid);
        mergeSort(a, mid + 1, to);
        merge(a, from, mid, to);
    }

    public static void merge(String[] a, int from, int mid, int to) {
        int n = to - from + 1;       
        String[] b = new String[n];   
        int i1 = from;               
        int i2 = mid + 1;            
        int j = 0;                  

        while (i1 <= mid && i2 <= to) {
            if (a[i1].compareTo(a[i2]) < 0) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j++;
        }

        while (i1 <= mid) {
            b[j] = a[i1];
            i1++;
            j++;
        }

        while (i2 <= to) {
            b[j] = a[i2];
            i2++;
            j++;
        }

        for (j = 0; j < n; j++) {
            a[from + j] = b[j];
        }
    }
}