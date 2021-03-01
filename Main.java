import java.util.*;
class Main {
  public static void main(String[] args)  {
    Student student1 = new Student();
    Student student2 = new Student();


  ArrayList<Double> gpas = new ArrayList<Double>();
  double sum =0;
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    gpas.add(student1.gpa);

    student2.setName("Jake Hartman");
    student2.setGPA(3.2);
    student2.setMajor("Information Systems");
    gpas.add(student2.gpa);

    for(double i : gpas){
      sum = sum + i;
    }

  student1.print();
  student2.print();
  System.out.println("The Average GPA is" + sum/gpas.size());

  }
}