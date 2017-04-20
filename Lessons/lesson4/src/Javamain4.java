public class Javamain4{
 public static void main(String[] args){

    Static int a;
    Static char c;
    Static double d;
    Static float f = 1.0f;
    Static long l = 1l;
    Static Стринг полеСтринг;

    System.out.println("Wow!");
    System.out.println(a);
    System.out.println(c);
    System.out.println(d);
    System.out.println(f);
    System.out.println(l);

    //double localD;
    double localD = 10.0d;

    System.out.println(localD);

    String str = new String("Hellow string");
    String str2 = "foo bar";
    String строка = "Рррр";
    Стринг строка2 = new Стринг();

    System.out.println(str);
    System.out.println(str2);
    System.out.println(строка);

    Стринг стринг = null;
    System.out.println(стринг);
    System.out.println(полеСтринг);

  //  Main main = null;
  //  main.main(new String[0]);

  Стринг.foo();
  //стринг.foo();
  //стринг.bar(); // it throws NPI



 }

}

class Стринг{
   static void foo(){
     System.out.println("foo");
   }

   static void bar(){
     System.out.println("bar");

   }
}
