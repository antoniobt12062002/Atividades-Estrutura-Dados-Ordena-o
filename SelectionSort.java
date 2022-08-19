import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        int tamanho;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma quantidade:");
        tamanho = scan.nextInt();

        String str[] = new String[tamanho];

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite uma string por vez:");
        for(int i = 0; i < tamanho; i++) {
            str[i] = scan2.nextLine();
        }

        for(int i = 0; i < tamanho; i++){
            for(int j = i + 1; j < tamanho; j++){
                if(str[i].compareTo(str[j]) > 0) {

                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.println("");
        System.out.println("Strings ordenadas:");
        for(int i = 0; i <= tamanho -1; i++){
            System.out.println(str[i] + ", ");
        }
    }
}