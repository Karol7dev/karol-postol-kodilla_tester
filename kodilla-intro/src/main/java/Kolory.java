import java.util.Scanner;

enum NazwaKolorów {
    Z,  /* Zielony */
    N,  /* Niebieski */
    P,  /* Pomarańczowy */
    C   /* Czerwony */
}
public class Kolory {
    public static void main(String[] args) {
           NazwaKolorów Kolory = NazwaKolorów.valueOf(getLiterka());

        switch(Kolory) {
            case Z:
                System.out.println("Zielony");
                break;
            case N:
                System.out.println("Niebieski");
                break;
            case P:
                System.out.println("Pomarańczowy");
                break;
            case C:
                System.out.println("Czerwony");
                break;
            default:
                System.out.println("Wrong literka. Try again ^^");
        }
    }

    public static String getLiterka() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Wciśnij pierwszą literę koloru :");
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        String Kolory = scanner.nextLine().trim().toUpperCase(); //TUTAJ COS NIE GRA?
        return Kolory;
    }
}