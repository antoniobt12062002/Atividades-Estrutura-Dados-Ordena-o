import java.util.*;

public class insertion {
    public static void main(String args[]){
        String X[] = new String[5];
        String eleito, menor;
        int i, j, pos;
        Scanner scan = new Scanner(System.in);

        for(i = 0; i <= 4; i++){
            System.out.println("Digite o " + (i+1) + " Nome: ");
            X[i] = scan.nextLine();
        }

        for(i = 0; i <= 3; i++){
            eleito = X[i];
            menor = X[i+1];
            pos = i + 1;

            for(j = i + 2; j <= 4; j++){
                if(X[j].compareTo(menor) < 0){
                    menor = X[j];
                    pos = j;
                }
            }
            if(menor.compareTo(eleito) < 0){
                X[i] = X[pos];
                X[pos] = eleito;
            }
        }

        System.out.println("");
        System.out.println("Ordenado: ");
        for(i = 0; i <= 4; i++){
            System.out.println((i+1) + " Nome: " + X[i]);
        }
    }
}
