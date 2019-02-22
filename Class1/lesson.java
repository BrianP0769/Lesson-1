//How to Comment
/* How to comment for multiple lines-
Like this
*/


//Type this before you do anything.
public class lesson{
  public static void main(String args[]){

    sayHello();

    addNum(3, 4);

    int c = getDifference(27, 14);
    System.out.println(c);

    int cc = divideNum(6, 3);
    System.out.println(cc);

    String ccc = addString("YeahAight", "BluefaceBaby");
    System.out.println(ccc);
  }


















  //Helper Function sayHello
  public static void sayHello(){
    System.out.println("Hello");
  }

  //addNum Function Match Number like coordinates x to y
  public static void addNum(int x, int y){
    System.out.println(x + y);
  }
  //Rerturning Suntraction Helpere Function
  public static int getDifference(int a, int b){
    return a-b;
  }
  //Returning Division Helper Function
  public static int divideNum(int x, int xx){
    return x/xx;
  }
  public static String addString(String a, String aa){
    return a+ " " +aa;
  }















}
