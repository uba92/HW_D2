package esercizio3;

import java.util.Objects;
import java.util.Scanner;

public class esercizio3 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una stringa, ':q' per terminare!");
        String str = scan.nextLine();

        while (!Objects.equals(str, ":q")) {
            String newStr = "";
            for (int i=0; i<str.length(); i++){
                newStr += str.charAt(i);

                if(i < str.length()-1){
                    newStr += ",";
                }
            }
            System.out.println(newStr);
            str = scan.nextLine();
        }

        scan.close();
    }
}
