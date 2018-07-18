import java.util.Locale;
import java.util.Scanner;

public class SporTest {
    public static void main(String[] args) {

        Sport[] sporty = new Sport[3];
        //sporty[0] = new Sport(, , )
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);





        System.out.println("Wprowadź informacje dotyczące dyscyplin sportowych");
        for (int i = 0; i < sporty.length; i++) {
            sporty[i] = new Sport(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
            scanner.nextLine();
            while(i > 0) {
                if (sporty[i].equals(sporty[(i- 1)])) {
                    System.out.println("Duplikat, powtórz");
                    i--;
                }
                else if (sporty[i].equals(sporty[(i - i)])) {
                    System.out.println("Duplikat, powtórz");
                    i--;
                }
                break;
            }
            //System.out.println(sporty[i].getName() + " " + sporty[i].getOrigin() + " " + sporty[i].getPopularity());
            System.out.println();
        }
        for (int i = 0; i < sporty.length; i++) {
            System.out.println(sporty[i].toString());
        }

        scanner.close();
    }
}
