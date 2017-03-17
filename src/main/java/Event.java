import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.Map;

public class Event {
  private int numberOfGuests;
  private String typeOfFood;
  private String typeOfDrink;
  private String typeOfEntertainment;
  private int totalCost;


  public Event(int guests, String food, String drink, String entertainment) {
    numberOfGuests = guests;
    typeOfFood = food;
    typeOfDrink = drink;
    typeOfEntertainment = entertainment;
  }

  public int getNumberOfGuests() {
    return numberOfGuests;
  }

  public String getTypeOfFood() {
    return typeOfFood;
  }

  public String getTypeOfDrink() {
    return typeOfDrink;
  }

  public String getTypeOfEntertainment() {
    return typeOfEntertainment;
  }

  public static int calculateEventCost(int guests, String food, String drink, String entertainment) {
    Map<String, Integer> selectionValue = new HashMap<String, Integer>();
    selectionValue.put("Indian", 9);
    selectionValue.put("Veggie", 6);
    selectionValue.put("Burgers", 5);
    selectionValue.put("Thai", 3);
    selectionValue.put("Beer", 2);
    selectionValue.put("Wine", 3);
    selectionValue.put("Juice", 1);
    selectionValue.put("Live Band", 100);
    selectionValue.put("DJ", 50);
    selectionValue.put("Petting Zoo", 75);
    selectionValue.put("None", 0);

    int totalCost = (guests * selectionValue.get(food)) + (guests * selectionValue.get(drink)) + selectionValue.get(entertainment);

    return 10;
  }

}
