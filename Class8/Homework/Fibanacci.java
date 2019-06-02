public class Fibanacci{
  public static void main(String[]args){
    fibonacci(1);
    fibonacci(2);
    fibonacci(3);
    fibonacci(4);
    fibonacci(5);
    fibonacci(6);
    System.out.println(rFibonacci(1))
    System.out.println(rFibonacci(2))
    System.out.println(rFibonacci(3))
    System.out.println(rFibonacci(4))
    System.out.println(rFibonacci(5))
    System.out.println(rFibonacci(6))
  }
  public static int rFibonacci(int n){
    if(n==1){
      return 0;
    }
    else if (n==2){
      return 1;
    }
    else{
      return rFibonacci(n-1)+rFibonacci(n-2);
    }
  }
}
  public static void fibonacci(int n){
    if(n==1){
      System.out.println(0);
    }
    else if (n==2){
      System.out.println(1);
    }
    else{
      int first = 0;
      int second = 1;
      int third = 0;
      for(int i=2; i<n; i++){
        third = first + second;
        first = second;
        second = third;
      }
      System.out.println(third);
    }
  }
