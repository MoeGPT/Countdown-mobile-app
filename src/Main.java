import java.util.*;
import java.time.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    ArrayList<CountdownEvent> events = new ArrayList<>();
    int i;
    public static void main(String[] args) {
    //MAIN MAIN MAIN MAIN!
        Main main = new Main();
        main.start();

    }
    public void start() {
        System.out.println("How many countdown events would you like to start?");
        int max = sc.nextInt();
        sc.nextLine();

        for (i = 0; i < max; i++) {
            this.createCountdownEvent();
        }
        for(i = 0; i < max; i++) {
            System.out.println("Do you want to see the event? (Y/N)");
            String answer = sc.next();
            if(answer.equalsIgnoreCase("Y")) {
                CountdownEvent thisEvent = events.get(i);
                System.out.print(thisEvent.getCountdownName() + " " + thisEvent.getStartDate() + " " + thisEvent.getStartTime());
                System.out.println(" ");
        }
        }


}
//Creates a countdown event and stores it in the ArrayList as an object
    public void createCountdownEvent() {

        System.out.println("Enter count down event name: ");

        String countdownName = sc.nextLine();

        System.out.println("Enter alarm date(yyyy-mm-dd):  ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        System.out.print("Enter hours (0-23): ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();
        sc.nextLine();

        LocalTime timer = LocalTime.of(hours, minutes);

        events.add(new CountdownEvent(countdownName, date, timer));

    }
    }



