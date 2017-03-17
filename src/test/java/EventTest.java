import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void newEvent_instantiatesCorrectly() {
    Event testEvent = new Event(20, "Indian", "Juice", "Petting Zoo");
    assertEquals(true, testEvent instanceof Event);
  }

  @Test
  public void newEvent_getsNumberOfGuests_Int() {
    Event testEvent = new Event(20, "Indian", "Juice", "Petting Zoo");
    assertEquals(20, testEvent.getNumberOfGuests());
  }

  @Test
  public void newEvent_getsTypeOfFood_String() {
    Event testEvent = new Event(20, "Indian", "Juice", "Petting Zoo");
    assertEquals("Indian", testEvent.getTypeOfFood());
  }

  @Test
  public void newEvent_getsTypeOfDrink_String() {
    Event testEvent = new Event(20, "Indian", "Juice", "Petting Zoo");
    assertEquals("Juice", testEvent.getTypeOfDrink());
  }

  @Test
  public void newEvent_getsTypeOfEntertainment_String() {
    Event testEvent = new Event(20, "Indian", "Juice", "Petting Zoo");
    assertEquals("Petting Zoo", testEvent.getTypeOfEntertainment());
  }


}
