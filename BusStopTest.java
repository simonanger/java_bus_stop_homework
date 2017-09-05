import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest{
  BusStop busStop;
  Bus bus;
  Person person;

  @Before
  public void before() {
    busStop = new BusStop("Leith");
    bus = new Bus("Alfred");
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Leith", busStop.getName() );
  }

  @Test
  public void peopleWaitingStartEmpty(){
    assertEquals(0, busStop.peopleWaitingCount() );
  }

  @Test
  public void canAddPerson(){
    busStop.add(person);
    assertEquals(1, busStop.peopleWaitingCount() );
  }

  @Test
  public void queueFull(){
    for(int i= 0; i<2; i++){
      busStop.add(person);
    }
    assertEquals(true, busStop.isQueueFull()) ;
  }

  @Test
  public void shouldEnterBus(){
    busStop.add(person);
    busStop.add(person);
    busStop.transfer(bus);
    assertEquals(2, bus.passengerCount()) ;
  }
}
