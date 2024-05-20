import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Utente inserisci il tuo nome");
        String firstName = sc.nextLine();
        System.out.println("Hai inserito " + firstName);

        System.out.println("Inserici la tua birra prefita");
        String beerName = sc.nextLine();
        System.out.println("Hai inserito " + beerName);

        System.out.println("Inserici la tua via di casa");
        String homeName = sc.nextLine();
        System.out.println("Hai inserito " + homeName);
        System.out.println(  firstName+      beerName + homeName);
        System.out.println(    homeName +  beerName +firstName);
        sc.close();
    }
}
