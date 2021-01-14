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

  public static void merge(MyLinkedList original,MyLinkedList[]buckets){
  }
}
