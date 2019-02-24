
//Main Functions
public class lesson{
  public static void main(String args[]){

  //  printEvenNumbers(5);
  //  instructDriver("red");
  //  chooseNum(6);
  //  chooseIceCream("vanilla", 3);
  modifyString("alabama");



  }

// = <- assigning variables
// == <- equivalent to
// if (x == 2) checks to see if value of x is 2
// != <- means not equal
//&& <- means and
//% <- remainder whem its divided by the number
//||<-means or

//Helper Functions:
public static void printEvenNumbers(int a){

  for (int i = 0; i <= a; i+=1){
    if ( i % 2 == 0){
      System.out.println(i);

    }
    else{
      System.out.println("This is odd");
    }
  }
}


public static void instructDriver(String color){

  if (color.equals("red")){
    System.out.println("STOP");
  }
  else if (color.equals("green")){
    System.out.println("GO");
  }
  else{
    System.out.println("SLOW DOWN");
  }
}
public static void chooseNum(int a){
  if (a<6 && a>0){
    System.out.println (a);
  }
  else{
    System.out.println ("error");
  }
}


public static void chooseIceCream(String flavor, int money){
  if(money>7){
    System.out.println("I will buy chocolate and vanilla");
  }
  else if(flavor.equals("mango")){
    System.out.println("I will not buy");
  }
  else if(money>2 && money<8){
    System.out.println("I will buy chocolate");
  }
  else if(money<3){
    System.out.println("Im broke");
  }
}





  public static void modifyString(String str){

for(int i = 0; i < str.length(); i++){
  if((str.substring(i,i+1 )).equals("a")){
    System.out.print("z");
  }
  else{
    System.out.print((str.substring(i,i+1)));
  }
}




}











































































































}
