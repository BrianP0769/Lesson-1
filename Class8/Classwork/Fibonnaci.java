public int fibonacci(n){

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
