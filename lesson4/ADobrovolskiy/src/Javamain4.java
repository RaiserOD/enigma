public class Javamain4{

//#Объявление трех переменных
  static int a = 0;
  static Float fl = 1.0f;
  static String st = "Test";

//# Вывод переменных на экран;
    public static void main(String[] args){
      System.out.println("________________________");
      System.out.println("Создание трех переменных: ");
      System.out.println("Переменная Int = " + a);
      System.out.println("Переменная Float = " + fl);
      System.out.println("Переменная String = " + st);
      System.out.println("__________________");

//#Вызов строки с символами "*****" через вызов метода "strMethod";
      System.out.println("Вызов метода 5 раз: ");
      for (int i = 1; i!=6; i++){
           strMethod("*****", i);}

//#Вызов строки с символами "*****" 5 раз, через вызов метода "strMethodFor";
      System.out.println("____________________________");
      System.out.println("Вывод строки 5 раз через For: ");
      strMethodFor("*****");

//#Вызов функции оределиния <високосного> года в интервале с 2001 - 2017;
      System.out.println("___________________________________________");
      System.out.println("Определение високосного/не високосного года: ");
      leapYear(2001);

//#Вызов функции оределиния <високосного> года в интервале с 2001 - 2017;
      System.out.println("___________________________________________");
      System.out.println("Цикл 'Do - While' с выводом строки : ");
//#Бесконечный цикл 'Do-While' с выходом 'Break' после пяти вроходов;
      funcDoWhileBreak();
}




    public static void strMethod(String star, int count){

        System.out.println("Строка #"+ count +": "  + star);
        }
    public static void strMethodFor(String line){
      for (int i = 1; i !=6; i++){
        System.out.println("Строка #" + i + " " + line);
        }
      }

    public static void leapYear(int year){
         while (year <= 2017){
            if ((year % 4 == 0) || (year % 400 == 0)){
               System.out.println("Год " + year + " Високосный");
            }else { if (year % 100 != 0){
                       System.out.println("Год " + year + " Не високосный");
                                        }
                  }
           year++;
                            }
                                         }
public static void funcDoWhileBreak(){
 int cycle = 0;
 int exit = 1;
 do {
    System.out.println("It seems that I'm here forever!");
 if (exit == 5){
    break;     }
    exit++;
    }
 while (cycle == 0);

}

}
