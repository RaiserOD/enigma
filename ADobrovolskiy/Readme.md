"Readme.md" created and commited.

...

Empty "Javamain.java" file created in /src folder.

...

"Javamain.java" has been updated. Add code:
'''sh
public class Javamain{
  public static void main(String[] args) {
    System.out.println("WTF!?");
  }
}
'''
...

"Javamain.class" file has bee generated in /out folder. Execute following command:
'''sh
$ javac -d out src/Javamain.java
'''

...

Following command has been executed: $ java -cp out Javamain
Following result has been gotten: WTF!?

...

Following command has been executed: $ jar -cvf app.jar out
Following result has been gotten: 
adding: META-INF/ (in=0) (out=0) (stored 0%)
adding: META-INF/MANIFEST.MF (in=56) (out=56) (stored 0%)
out: No such file or directory
Error adding out to jar archive!

...

Following command has been executed: $jar -cvf app.jar -C out/ .
Following result has been gotten: "app.jar" created

...

Following command has been executed: $ java -jar app.jar
Following result has been gotten: no main manifest attribute, in app.jar

...

Following command has been executed: $ java -cp app.jar Javamain
Following result has been gotten: WTF!?

...


Manifest file has been cretaed: $ echo "Main-Class: SimpleMain">>manifest.txt
Following command has been executed: $ cat manifest.txt
Following result has been gotten: Main-Class: SimpleMain

...

Following command has been executed: $ jar -cvfm app.jar manifest.txt -C out/ .

Following command has been executed: $ java -jar app.jar
Following result has been gotten: "Error: Could not find or load main class SimpleMain"

...

Fix wrong class name: from "SimpleMain" onto "Javamain"

...

Following command has been executed: $ jar -cvfm app.jar manifest.txt -C out/ .
Following result has been gotten:
adding: META-INF/ (in=0) (out=0) (stored 0%)
adding: META-INF/MANIFEST.MF (in=21) (out=21) (deflated 0%)
adding: ./ (in=0) (out=0) (stored 0%)
adding: Javamain.class (in=415) (out=284) (deflated 31%)
Total:
------
(in = 436) (out = 721) (deflated -65%)
...

Following command has been executed: $ java -jar app.jar
Following result has been gotten: WTF!?

