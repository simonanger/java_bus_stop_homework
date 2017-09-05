import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest{
  Bus bus;
  Person person;


  @Before
  public void before() {
    bus = new Bus("Alfred");
    person = new Person();
  }

  @Test
  public void hasName(){
    assertEquals("Alfred", bus.getName() );
  }

  @Test
  public void passengersStartEmpty(){
    assertEquals(0, bus.passengerCount() );
  }

  @Test
  public void canAddPerson(){
    bus.add(person);
    assertEquals(1, bus.passengerCount() );
  }

  @Test
  public void busIsFull(){
    for(int i= 0; i<10; i++){
      bus.add(person);
    }
    assertEquals(true, bus.isBusFull() );
  }

  // @Test
  // public void busIsFull(){
  //   for(int i= 0; i<10; i++){
  //     bus.full(person);
  //   }
  // }
  //   assertEquals(true, bus.full)
}
