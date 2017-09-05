public class BusStop{
  private String name;
  private Person[] peopleWaiting;

public BusStop(String name){
  this.name = name;
  this.peopleWaiting = new Person[2];
}

public String getName(){
  return this.name;
}

public int peopleWaitingCount(){
  int counter = 0;
  for(Person element: this.peopleWaiting){
    if(element != null){
      counter ++;
    }
  }
  return counter;
}

public void add(Person person){
  if(this.isQueueFull() ){
    return;
  }
  int peopleWaitingCount = peopleWaitingCount();
  peopleWaiting[peopleWaitingCount] = person;
}

public boolean isQueueFull(){
  return this.peopleWaitingCount() == this.peopleWaiting.length;
}

// public int transfer(Bus bus){
//   Person [] passengers = person[peopleWaiting]
//   for (int i = 0; i< peopleWaiting.length; i++){
//     passengers[i] = i;
//   }
// }

public void transfer(Bus bus){
  for(int i = 0; i < peopleWaitingCount(); i++){
    bus.add(this.peopleWaiting[i]);
  }
  this.peopleWaiting = new Person[2];
}


}
