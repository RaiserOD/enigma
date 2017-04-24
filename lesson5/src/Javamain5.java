public class Javamain5 {
  public static void main(String[] args){
    System.out.println("Lesson5");

    Javamain5 Javamain = new Javamain5();

    Student student = new Student();
    System.out.println(student.name);
    System.out.println(student.age);

    Student student2 = new Student("Jonh", 18);
    System.out.println(student2.name);
    System.out.println(student2.age);

    Student student3 = new Student("Jane");
    System.out.println(student3.name);
    System.out.println(student3.age);

    int a = 2;
    int b = 45;

    Javamain.swap(a, b);

    System.out.println(a);
    System.out.println(b);

    Integer aa = new Integer(10);
    Integer bb = new Integer(20);

    Javamain.swap2(aa, bb);

    System.out.println(aa);
    System.out.println(bb);
}
    void swap(int x, int y) {
      int z = x;
      x = y;
      y = z;
    }

    void swap2(Integer x, Integer y) {
      Integer z = x;
      x = y;
      y = z;
    }
}

class Student {
  String name;
  int age;


  Student(){
    this("NONE", -1);
  }

  Student(String n){
    this(n, 20);
  }

  Student(String name, int age){
    this.name = name;
    this.age = age;

    this.foo();
    foo();
  }
  void foo(){}
  void bar(){}
  void bar(int i){}
  void bar(int i, int j){}
  void bar(int i, float f){}



}
