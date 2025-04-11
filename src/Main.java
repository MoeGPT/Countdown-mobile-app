import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.*;
import java.time.*;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    Scanner sc = new Scanner(System.in);
    ArrayList<CountdownEvent> events = new ArrayList<>();
    int i;
   /*
    private JFormattedTextField textField;
    private JLabel label;
    private JFrame hudUI;
*/

    public static void main(String[] args) {
    //MAIN MAIN MAIN MAIN!
        Main main = new Main();
        main.start();

    }
    public void start() {
        //test case
        System.out.println(java.time.LocalDate.now());
        System.out.println(java.time.LocalTime.now());
/*
        // Creates basic window
        hudUI = new JFrame();
        hudUI.setSize(500, 500);
        hudUI.setTitle("COUNTDOWN APP");
        hudUI.setResizable(true);
        hudUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hudUI.setVisible(true);
        GridBagConstraints c = new GridBagConstraints();
        //Creates text field and label for input/output


        label = new JLabel();
        label.setText("How many countdown events would you like to start?");
        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 10, 10);
        add(label, c);

        textField = new JFormattedTextField();
        textField.setEditable(true);
        textField.addActionListener(this);

        c.gridx = 1;
        c.gridy = 1;
        c.insets = new Insets(10, 20, 10, 20);


        String text = textField.getText();
        Scanner sc = new Scanner(text);
        */

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
            else if(answer.equalsIgnoreCase("N")) {
                System.out.println("Goodbye!");
                break;
            }
        }


}
   /* @Override
    public void actionPerformed(ActionEvent event){
        String input;
        input = textField.getText();
        Integer max = Integer.parseInt(input);


        for (i = 0; i < max; i++) {
            this.createCountdownEvent();
        }

    } */
    //Creates a countdown event and stores it in the ArrayList as an object
    public void createCountdownEvent() {

        System.out.println("Enter count down event name: ");

        String countdownName = sc.nextLine();
        //seperated the create date into its own method for easier modifications
        LocalDate date = this.createDate(sc);

        System.out.print("Enter hours (0-23): ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();
        sc.nextLine();

        LocalTime timer = LocalTime.of(hours, minutes);

        events.add(new CountdownEvent(countdownName, date, timer));

    }

    public LocalDate createDate(Scanner sc){
        System.out.println("Enter alarm date(yyyy-mm-dd):  ");
        LocalDate date = LocalDate.parse(sc.nextLine());
        while(date.isBefore(LocalDate.now())) {
            System.out.println("Enter a date that has not past.");
            System.out.println("Enter alarm date(yyyy-mm-dd):  ");
            date = LocalDate.parse(sc.nextLine());
        }
        return date;

    }
    }



