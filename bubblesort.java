import java.util.*;

public class bubblesort {
    public static void main(String args[]){
        String X[] = new String[5];
        int n, i;
        String aux;
        Scanner scan = new Scanner(System.in);

        for(i = 0; i <= 4; i++){
            System.out.println("Digite o " + (i+1) + " Nome: ");
            X[i] = scan.nextLine();
        }

        for(n = 1; n <= 5; n++){
            for(i = 0; i <= 3; i++){
                if(X[i].compareTo(X[i+1]) > 0){
                    aux = X[i];
                    X[i] = X[i+1];
                    X[i+1] = aux;
                }
            }
        }
        System.out.println("");
        System.out.println("Ordenado: ");
        for(i = 0; i <= 4; i++){
            System.out.println((i+1) + " Nome: " + X[i]);
        }
    }
}