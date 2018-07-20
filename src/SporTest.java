import java.util.Scanner;

public class SporTest {
    public static void main(String[] args) {

        Sport[] sporty = new Sport[3];
        Scanner scanner = new Scanner(System.in);
        int firstEmptyPlace = 0;

        System.out.println("Wprowadź informacje dotyczące dyscyplin sportowych");
        for (int i = 0; i < sporty.length; i++) {
            Sport tempSport = createSport(scanner);
            if(!contains(tempSport, sporty)){
                sporty[firstEmptyPlace] = tempSport;
                firstEmptyPlace++;
            }
            else {
                i--;
                System.out.println("Taka dyscyplina już istnieje");
            }

        }
        for (int i = 0; i < sporty.length; i++) {
            System.out.println(sporty[i].toString());
        }
    }

    private static Sport createSport(Scanner scanner){
        Sport tempSport = new Sport();
        System.out.println("Podaj nazwę dyscypliny:");
        tempSport.setName(scanner.nextLine());
        System.out.println("Podaj kraj pochodzenia");
        tempSport.setOrigin(scanner.nextLine());
        System.out.println("Podaj poziom popularności");
        tempSport.setPopularity(scanner.nextInt());
        scanner.nextLine();
        return tempSport;
    }

    static boolean contains(Sport sport, Sport[] sporty){
        for(Sport sport1 : sporty){
            if (sport.equals(sport1)){
                return true;
            }
        }
        return false;
    }
}

