public class Student{

//Properties of a Student: Grade, Name.

  double grade;
  String first;

  public Student(String f, int g){
    grade = g;
    first = f;
  }
  public int getGrade(){
    return grade;
  }
  public String toString(){
    return "Studentname:" + first;

  }
}
