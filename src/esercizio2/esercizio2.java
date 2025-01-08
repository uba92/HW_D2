package esercizio2;

import java.util.Scanner;

public class esercizio2 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero intero e premi invio!");
        int x = scan.nextInt();

        switch (x) {
            case 0:
                System.out.println("Il numero inserito è Zero");
                break;
            case 1:
                System.out.println("Il numero inserito è Uno");
                break;
            case 2:
                System.out.println("Il numero inserito è Due");
                break;
            case 3:
                System.out.println("Il numero inserito è Tre");
                break;
            default:
                System.out.println("---!!!Error!!!---");
        }
    }
}
