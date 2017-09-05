public class Bus{
  private String name;
  private Person[] passengers;

public Bus(String name){
  this.name = name;
  this.passengers = new Person[10];
}

public String getName(){
  return this.name;
}

public int passengerCount(){
  int counter = 0;
  for(Person element: this.passengers){
    if(element != null){
      counter ++;
    }
  }
  return counter;
}

public void add(Person person){
  if(this.isBusFull() ){
    return;
  }
  int passengerCount = passengerCount();
  passengers[passengerCount] = person;
}

public boolean isBusFull(){
return this.passengerCount() == this.passengers.length;
}

}
