import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.text.DecimalFormat;

public class App {
  public static void main(String[] args){
    Console console = System.console();

    String couponCode1 = "coupon1";
    String couponCode2 = "coupon2";
    Boolean running = true;

    DecimalFormat df = new DecimalFormat("#.00");

    System.out.println("-----------------------------------------------------");
    System.out.println("How many guests are you expecting?");
    int userNumberOfGuests = Integer.parseInt(console.readLine());

    System.out.println("-----------------------------------------------------");
    System.out.println("What type of food would you like to serve at your event? Choose from the following: Indian, Veggie, Burgers, or Thai.");
    String userTypeOfFood = console.readLine();

    System.out.println("-----------------------------------------------------");
    System.out.println("What type of drinks would you like to serve at your event? Choose from the following: Beer, Wine, or Juice.");
    String userTypeOfDrink = console.readLine();

    System.out.println("-----------------------------------------------------");
    System.out.println("What type of entertainment would you like to provide at yor event? Choose from the following: Live Band, DJ, Petting Zoo, or None");
    String userTypeOfEntertainment = console.readLine();

    Event userEvent = new Event(userNumberOfGuests, userTypeOfFood, userTypeOfDrink, userTypeOfEntertainment);

    int eventCost = Event.calculateEventCost(userEvent.getNumberOfGuests(), userEvent.getTypeOfFood(), userEvent.getTypeOfDrink(), userEvent.getTypeOfEntertainment());

    System.out.println("-----------------------------------------------------");
    System.out.println("\nYour total cost is $" + eventCost + ".00.\n");

    System.out.println("__________________________________________________");

    while (running) {
      System.out.println("If you have a coupon code please enter it now to see your discounted price. Or type 'Done' if you do not have a coupon.");
      String couponResponse = console.readLine();

      if (couponResponse.equals(couponCode1)) {
        double eventCostWithCoupon1 = (eventCost * .8);
        System.out.println("\nYour updated total cost is $" + df.format(eventCostWithCoupon1));
        System.out.println("");
        running = false;
      } else if (couponResponse.equals(couponCode2)) {
        int eventCostWithCoupon2 = eventCost - 50;
        System.out.println("\nYour updated total cost is $" + eventCostWithCoupon2 + ".00.\n");
        running = false;
      } else if (couponResponse.equals("Done")) {
        System.out.println("Thank you for using our Event Planning program. Your total cost is: $" + eventCost);
        running = false;
      } else {
        System.out.println("-----------------------------------------------------");
        System.out.println("That does not match any coupon code available.");
        System.out.println("-----------------------------------------------------");
      }
    }
  }
}
