import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class App {
  public static void main(String[] args){
    Console console = System.console();

    String couponCode1 = "coupon1";
    String couponCode2 = "coupon2";

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
    System.out.println("If you have a coupon code please enter it  now to see your discounted price.");
    String userCoupon = console.readLine();

    if (userCoupon.equals(couponCode1)) {
      double eventCostWithCoupon1 = (eventCost * .8);
      System.out.println("\nYour updated total cost is $" + eventCostWithCoupon1);
    } else if (userCoupon.equals(couponCode2)) {
      int eventCostWithCoupon2 = eventCost - 50;
      System.out.println("\nYour updated total cost is $" + eventCostWithCoupon2 + ".00.\n");
    }

  }
}
