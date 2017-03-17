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
}
