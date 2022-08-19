import java.util.Scanner;

public class BubbleSort {
    public static void main(String []args) {

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
     
     System.out.println("");
     System.out.println("Strings ordenadas: ");
     
     for (int j = 0; j < str.length; j++) {
           for (int i = j + 1; i < str.length; i++) {
         if (str[i].compareTo(str[j]) < 0) {
             temp = str[j];
             str[j] = str[i];
             str[i] = temp;
         }
        }
        System.out.println(str[j]);
     }
    }
 }