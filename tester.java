public class tester{
  public static void main(String[] args){
    System.out.println("TESTING Nth METHOD");

    System.out.println(Radix.nth(123,1));  //2
    System.out.println(Radix.nth(-123,1)); //2
    System.out.println(Radix.nth(123,2));  //1
    System.out.println(Radix.nth(-123,2)); //1

    System.out.println("TESTING LENGTH METHOD");
    System.out.println(Radix.length(0));    //1
    System.out.println(Radix.length(15));   //2
    System.out.println(Radix.length(-10));  //2
    System.out.println(Radix.length(5112)); //4

    System.out.println("TESTING SORT");
    SortableLinkedList messed = new SortableLinkedList ();
    messed.add(10);
    messed.add(52);
    messed.add(209);
    messed.add(19);
    messed.add(44);
    Radix.radixSortSimple(messed);
    System.out.println(messed.toString());
  }
}
