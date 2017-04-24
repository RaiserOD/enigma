#### Домашнее задание:

* Переменные

  Создайте три переменных с типами `int`, `float` и `String` и присвойте им любые значения. Вывести из значения используя вызов ```System.out.println()```


* Создание и вызов метода класса (функции). Цикл for.
  * Создайте метод, который выводит строку `*****` и сделайте его вызов в методе main 5 раз
  * Перепишите вызов метода так, чтобы использовался цикл for. Результат должен быть одинаков с предыдущим - 5 строк `*****`


* Операторы ветвления If-else. Цикл while

  Напишите функцию определения високосного года. Используя цикл while сделайте вызов этой функции для периода 2001-2017гг.
  
  > Год високосный, если делится на 4 без остатка.
  > Но если год делится на 100 без остатка - он не високосный.
  > При этом если год делится на 400 без остатка - он високосный.

* Цикл do-while. Выход из цикла break
  * Напишите бесконечный цикл do-while в котором сделайте вызов метода ```System.out.println("It seems that I'm here forever")```
  * Используя if и break сделайте выход из цикла. Условие выхода из цикла на ваше усмотрение. Например - вывод строки 5 раз.


#### Дополнительные задачи:

  * Напишите метод, который конвертирует строку, содержащую целое число в **двоичной** системе счисления, в целое число в **десятичной** системе счисления используя [Positional Notation](http://www.wikihow.com/Convert-from-Binary-to-Decimal#Using_Positional_Notation_sub)

```java
  public static int convertBinToDec1(String binary) {
    // your code here
    return 0;
  }
```

  * Напишите метод, который конвертирует строку, содержащую целое число в **двоичной** системе счисления, в целое число в **десятичной системе** счисления используя [Doubling](http://www.wikihow.com/Convert-from-Binary-to-Decimal#Using_Doubling_sub)

```java
  public static int convertBinToDec2(String binary) {
    // your code here
    return 0;
  }
```

  * Напишите метод, который конвертирует строку, содержащую целое число в **десятичной** системе счисления, в целое число в **двоичной** системе счисления используя [Short Division by Two with Remainder](http://www.wikihow.com/Convert-from-Decimal-to-Binary#Short_Division_by_Two_with_Remainder_sub)

```java
  public static String convertDecToBin1(int decimal) {
    // your code here
    return "";
  }
```

  * Напишите метод, который конвертирует строку, содержащую целое число в **десятичной** системе счисления, в целое число в **двоичной** системе счисления используя [Descending Powers of Two and Subtraction](http://www.wikihow.com/Convert-from-Decimal-to-Binary#Descending_Powers_of_Two_and_Subtraction_sub)

```java
  public static String convertDecToBin2(int decimal) {
    // your code here
    return "";
  }
  ```


* Напишите метод "калькулятор целых чисел"
  * "упрощенная"" версия использует арифметические операторы `+` и(или) `-`
  * "продвинутая" версия может использовать `*` в комбинации с `+` и `-`

```java
   public static int calc(String expression) {
     // your code here
     return 0;
   }
```

Примеры использования
```java
calc("2+2+2"); // =6
calc("2-2+2"); // =2
calc("2*2*2"); // =8
calc("2+2*2"); // =6
```
----
**Подсказки:**

Для получения нужного символа (char) из строки используйте следующие методы класса String: `charAt` и `length`
  * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#charAt(int)
  * http://docs.oracle.com/javase/7/docs/api/java/lang/String.html#length()

Для получения степени числа напишите функцию возведения числа в степень
  ```java
  public static int power(int a, int b) {
    // вызов power(2, 8) вернет 256
    return 0;
  }
  ```
Для получения из `char` целого числа, можно использовать `Character.getNumericValue(char ch)`
   * http://docs.oracle.com/javase/7/docs/api/java/lang/Character.html#getNumericValue(char)

Для того, чтобы определить является ли символ (char) цифрой, напишите функцию
```java
  public static boolean isDigit(char ch) {
    // вызов isDigit('1') вернет true
    // вызов isDigit('a') вернет false
    return false;
  }
```

