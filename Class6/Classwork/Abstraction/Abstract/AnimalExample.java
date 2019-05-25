class Bird extends Animal{
  void move(){
    System.out.println("Fly");
  }
  void eat(){
    System.out.println("worms");
  }
  void habitat(){
    System.out.println("sky");
  }
}
class Fish extends Animal{
  void move(){
    System.out.println("Swim");
  }
  void eat(){
      System.out.println("smaller fish");
  }
  void habitat(){
      System.out.println("Water");
  }
}
