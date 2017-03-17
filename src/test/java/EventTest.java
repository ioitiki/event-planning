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
}
