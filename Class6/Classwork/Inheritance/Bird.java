class Bird{
  public String reproductive="egg";
  public String outerCovering = "feathers";
  public void flyup(){
    System.out.println("Flying up");
  }
  public void flydown(){
    System.out.println("Flying down");
  }
}
class Eagle extends Bird{
  public String name = "Eagle";
  public int lifespan = 15;
  public String outerCovering = "bald";
}
