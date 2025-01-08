import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        if (stringaPariDispari("umberto") ) {
            System.out.println("La stringa inserita ha un numero pari di caratteri!");
        } else {
            System.out.println("La string inserita ha un numero dispari di caratteri!");
        }

        if (strEvenOdd(scan)) {
            System.out.println("La stringa inserita ha un numero pari di caratteri!");
        } else {
            System.out.println("La stringa inserita ha un numero dispari di caratteri!");
        }

        if (otherStrEvenOdd("Ciaoa")) {
            System.out.println("Pari");
        } else {
            System.out.println("Dispari");
        }

        if (bisestile(2025)) {
            System.out.println("L'anno inserito è bisestile!");
        } else {
            System.out.println("L'anno inserito non è bisestile!");

        }

        if (bisestile2(scan)) {
            System.out.println("L'anno inserito è bisestile!");
        } else {
            System.out.println("L'anno inserito non è bisestile!");

        }


        scan.close();
    }

    public static boolean stringaPariDispari (String str) {
        int numChar = str.length();

        if (numChar%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean strEvenOdd (Scanner scan) {

        System.out.println("Inserisci una stringa: ");
        String str = scan.nextLine();

        int numChar = str.length();

        return numChar%2 == 0;
    }

    public static boolean otherStrEvenOdd (String str) {
        int numChar = 0;

        for (int i=0; i<str.length(); i++) {
            numChar++;
        }

        return numChar%2 == 0;
    }

    public static boolean bisestile (int year) {
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean bisestile2 (Scanner scan) {

        System.out.println("Inserisci l'anno: ");
        int year = scan.nextInt();
        if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}