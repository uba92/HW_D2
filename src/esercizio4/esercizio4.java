package esercizio4;

import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero e premi invio: ");
        int x = scan.nextInt();

        for (int i=0; i<x; i++) {
            System.out.println(x-i);
        }
    }
}
