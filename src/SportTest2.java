import java.util.Locale;
import java.util.Scanner;

public class SportTest2 {
    public static void main(String[] args) {

        Sport[] sporty = new Sport[3];
        //sporty[0] = new Sport(, , )
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);



        int result = 0;

        //System.out.println("Wprowadź informacje dotyczące dyscyplin sportowych");
        do{
            System.out.println("Wprowadź informacje dotyczące dyscyplin sportowych");
            for (int i = 0; i < sporty.length; i++) {
                sporty[i] = new Sport(scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
                scanner.nextLine();
                //System.out.println(sporty[i].getName() + " " + sporty[i].getOrigin() + " " + sporty[i].getPopularity());
                System.out.println("Wprowadź informacje dotyczące dyscyplin sportowych");
            }
            result++;
        }while(result <3);

        System.out.println(sporty[0].getName() + " " + sporty[0].getOrigin() + " " + sporty[0].getPopularity());
        System.out.println(sporty[1].getName() + " " + sporty[1].getOrigin() + " " + sporty[1].getPopularity());
        System.out.println(sporty[2].getName() + " " + sporty[2].getOrigin() + " " + sporty[2].getPopularity());
        scanner.close();
    }

}
