public class Radix{

  public static int nth(int n, int col){
    double div = Math.pow(10,col);
    n/=div;
    return Math.abs(n %10);
  }

  public static int length(int n){
    if (n==0){
      return 1;
    }
    if (n<0){
      n*=-1;
    }
    return (int) Math.log10(n)+1;
  }

  public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
    for (int i=0;i<buckets.length;i++) {
			original.extend(buckets[i]);
		}
  }

  public static void radixSortSimple(SortableLinkedList data){
    SortableLinkedList[] buckets = new SortableLinkedList[10];
		for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }
  }
  public static void radixSort(SortableLinkedList data){

  }
}
