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
    int maxdigits = 0;
    int len=data.size();

		SortableLinkedList[] buckets = new SortableLinkedList[10];
		for (int i = 0; i < 10; i++){
      buckets[i] = new SortableLinkedList();
    }

		for(int i=0;i<len;i++) {
			int current = data.get(0);
			if (maxdigits <length(current)){
        maxdigits=current;
      }
			buckets[nth(current, 0)].add(current);
			data.remove(0);
		}
		merge(data, buckets);

		for (int i = 1; i < maxdigit; i++) {
			buckets = new SortableLinkedList[10];
			for (int j = 0; j < 10; j++){
        buckets[j] = new SortableLinkedList();
      }

			for (int z=0;z<len;z++) {
				int current = data.get(0);
				buckets[nth(current, i)].add(current);
				data.remove(0);
			}
			merge(data, buckets);
		}
  }
  public static void radixSort(SortableLinkedList data){

  }
}
