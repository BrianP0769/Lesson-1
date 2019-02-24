public class hw{
  public static void main(String args[]){

    int c = returnAverage(1, 1, 1);
    System.out.println(c);

    int cc = sumNum(1, 5);
     System.out.println(cc);

     int ccc = computeAlternating(5);
      System.out.println(ccc);
  }





  public static int returnAverage(int a, int b, int c){
    int x = a+b+c;
    return x/3;
  }


  public static int sumNum(int a, int b){
    int total = 0;
    for(int x = a; x<b+1; x++){
      total += x;
    }
    return total;

  }

  public static int computeAlternating(int a){
    int total = 0;
    for(int x = 1; x<a+1; x++){

    total += x;
    x++;
    total -= x;
    }
    return total;

  }









}
