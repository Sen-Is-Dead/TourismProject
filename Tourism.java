import java.util.Scanner;

class Attraction{
    String name;
    int opening;
    boolean bankHoliday;
}

public class Tourism {

    public static void main(String[] args){
        AttractionDetails();
    }

    public static void AttractionDetails(){
        Attraction eden = createAttraction("The Eden Project", 9, true);
        Attraction tate = createAttraction("Tate Modern", 10, false);
        Attraction zoo = createAttraction("London Zoo", 10, true);
        Printer(eden, tate, zoo);
    }
    public static Attraction createAttraction(String givenName, int givenOpening, boolean givenBankHoliday){
        Attraction x = new Attraction();
        x.name = givenName;
        x.opening = givenOpening;
        x.bankHoliday = givenBankHoliday;
        return x;
    }
    public static void Printer(Attraction eden, Attraction tate, Attraction zoo){
        Scanner input = new Scanner(System.in);
        System.out.println("How many attractions do you need to know about?");
        int counter = input.nextInt();
        for(int i = 1; i <= counter; i++){
            System.out.println("Name attraction " + i + ":");
            Scanner input1 = new Scanner(System.in);
            String name = input1.nextLine();
            if(name.equals("The Eden Project")){
                printAttraction(eden);
            }
            else if(name.equals("Tate Modern")){
                printAttraction(tate);
            }
            else if(name.equals("London Zoo")){
                printAttraction(zoo);
            }
            else
            {
                System.out.println("I have no information about that attraction.");
                System.out.println();
            }
        }
    }
    public static void printAttraction(Attraction x){
        String bankHoliday;
        if (x.bankHoliday == true)
        {
            bankHoliday = " opens on bank holidays.";
        }
        else
        {
            bankHoliday = " does not open on bank holidays";
        }
        System.out.println(x.name + bankHoliday);
        System.out.println("It opens at " + x.opening + "am.");
        System.out.println();
    }
}
